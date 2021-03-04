import React, { useState }  from 'react'
import { Col, Row } from 'rsuite';

import ItemTooltip from './item_tooltip';
import GearSelector from './gear_selector';
import GemSlot from './gem_slot';

const defaultWidth = '55px';
const bgImages = {
  head: 'head.jpg',
  neck: 'neck.jpg',
  shoulders: 'shoulders.jpg',
  back: 'back.jpg',
  chest: 'chest.jpg',
  wrists: 'wrists.jpg',
  mainHand: 'mainhand.jpg',
  offHand: 'offhand.jpg',
  hands: 'hands.jpg',
  waist: 'waist.jpg',
  legs: 'legs.jpg',
  feet: 'feet.jpg',
  ring1: 'ring.jpg',
  ring2: 'ring.jpg',
  trinket1: 'trinket.jpg',
  trinket2: 'trinket.jpg',
  ranged: 'ranged.jpg',
  ammo: 'ranged.jpg',
};

const titles = {
  head: 'HEAD',
  neck: 'NECK',
  shoulders: 'SHOULDERS',
  back: 'BACK',
  chest: 'CHEST',
  wrists: 'WRISTS',
  mainHand: 'MAIN HAND',
  offHand: 'OFF HAND',
  hands: 'HANDS',
  waist: 'WAIST',
  legs: 'LEGS',
  feet: 'FEET',
  ring1: 'RING 1',
  ring2: 'RING 2',
  trinket1: 'TRINKET 1',
  trinket2: 'TRINKET 2',
  ranged: 'RANGED',
  ammo: 'AMMO',
};

export default function({ character, slotName, inventorySlots, itemClasses, width=defaultWidth, dispatch }) {
  const item = character && character.gear && character.gear[slotName];
  const itemImgStyles = { border: '1px solid #AAA', height: width, width }

  const [selectorVisible, setSelectorVisible] = useState(false);

  function onClick(e) {
    e.stopPropagation();
    e.preventDefault();
    setSelectorVisible(true);
  }

  function onItemSelect(item) {
    // Clean sockets and enchants
    item.sockets.forEach(sk => sk.gem = null);
    item.enchant = null;
    dispatch({ type: 'updateGearSlot', value: { [slotName]: item } })
  }

  function onGemSelect(gem, idx) {
    item.sockets[idx].gem = gem
    dispatch({ type: 'updateGearSlot', value: { [slotName]: item } })
  }

  function renderItemLabel() {
    return (
      <Row>
        <Col xs={7}>
          <span>{titles[slotName]}</span>
        </Col>
      </Row>
    );
  }

  function renderItem() {
    return (
      <Row style={{ padding: '5px' }} onClick={onClick}>
        <Col xs={5}>
          <ItemTooltip item={item} gear={character.gear}>
            <img style={itemImgStyles} src={`icons/${item.icon}`} />
          </ItemTooltip>
        </Col>
        <Col>
          <Row>
            <ItemTooltip item={item} gear={character.gear}>
              <p style={{ fontSize: '16px', fontWeight: 800 }}>{item.name}</p>
            </ItemTooltip>
            {item.sockets.map((sk, idx) => {
              return <GemSlot key={idx} socket={sk} onSelect={(gem) => onGemSelect(gem, idx)} />
            })}
            {!['trinket1', 'trinket2', 'neck'].includes(slotName) ?
              item.enchant ? <p>{item.enchant.name}</p> : <p>No enchant</p>
            : null}
          </Row>
        </Col>
      </Row>
    );
  }

  function renderBlank() {
    return (
      <Row style={{ padding: '5px' }}>
        <Col xs={5} onClick={onClick}>
          <img
            style={itemImgStyles}
            src={`slotbg/${bgImages[slotName]}`}
          />
        </Col>
        {renderItemLabel()}
      </Row>
    );
  }

  return (
    <>
      {item ? renderItem() : renderBlank()}
      <GearSelector
        inventorySlots={inventorySlots}
        itemClasses={itemClasses}
        visible={selectorVisible}
        setVisible={setSelectorVisible}
        onSelect={onItemSelect}
      />
    </>
  );
}
