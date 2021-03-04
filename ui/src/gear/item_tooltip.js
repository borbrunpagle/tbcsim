import React from 'react';
import _ from 'lodash';

export default function({ gear, item, children }) {
  if(item) {
    gear = gear || {};
    const itemClass = `q${item.quality}`
    const itemGems = 'gems=' + item.sockets.map(sk => sk.gem && sk.gem.id).join(':')
    const itemEnchant = item.enchant ? `ench=${item.enchant.id}` : ''
    const itemSet = 'pcs=' + _.values(gear).map(it => it.id).join(':')

    return (
      <a
        href={`https://70.wowfan.net/en?item=${item.id}`}
        className={itemClass}
        rel={`${itemGems}&amp;${itemEnchant}&amp;${itemSet}`}
        onClick={e => e.preventDefault()}
        style={{ textDecoration: 'none' }}
      >
        {children}
      </a>
    )
  }

  return <>{children}</>
}
