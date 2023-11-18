package com.progmeleon.cafeandfastfood.controller;

import com.progmeleon.cafeandfastfood.model.item.Item;
import com.progmeleon.cafeandfastfood.model.inventory.Order;

public class SalesController<T extends Item> implements UIController<Order<T>> {
}
