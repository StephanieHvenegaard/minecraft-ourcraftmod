/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.the_nights.ourcraftmod.core.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

/**
 *
 * @author Stephanie
 */
public class ItemCustomSword extends AxeItem{

    public ItemCustomSword(IItemTier itemTier, float dmgModifier, float Speed, Item.Properties props) {
        super(itemTier, dmgModifier, Speed, props);
    }
    
    
}
