package com.aranteknoloji.genericrecycleritemview

import android.graphics.drawable.Drawable

data class HeaderItem(
    val icon: Drawable,
    val title: String
)

data class ListItem(
    val text: String,
    val subText: String
)

data class FooterItem(
    val contact1: String,
    val contact2: String,
    val contact3: String
)