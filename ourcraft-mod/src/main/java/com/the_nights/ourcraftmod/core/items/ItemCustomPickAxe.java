/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.the_nights.ourcraftmod.core.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;

/**
 *
 * @author Stephanie
 */
public class ItemCustomPickAxe extends PickaxeItem{

    public ItemCustomPickAxe(IItemTier itemTier, int dmgModifier, float Speed, Item.Properties props) {
        super(itemTier, dmgModifier, Speed, props);
    }
    
    
}
