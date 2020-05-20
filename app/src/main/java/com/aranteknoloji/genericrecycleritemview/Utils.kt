package com.aranteknoloji.genericrecycleritemview

fun HeaderItem.toRecyclerItem(): RecyclerItem =
    RecyclerItem(this, R.layout.main_header_item, BR.item)

fun ListItem.toRecyclerItem(): RecyclerItem =
    RecyclerItem(this, R.layout.main_list_item, BR.item)

fun FooterItem.toRecyclerItem(): RecyclerItem =
    RecyclerItem(this, R.layout.main_footer_item, BR.item)