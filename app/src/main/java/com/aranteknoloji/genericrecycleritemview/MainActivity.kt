package com.aranteknoloji.genericrecycleritemview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aranteknoloji.genericrecycleritemview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val data by lazy { listOf(
        HeaderItem(getDrawable(R.drawable.ic_launcher_background)!!, "MainHeader").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        ListItem("FirstListItem", "FirstListItem subtext").toRecyclerItem(),
        FooterItem("Contact1", "Contact2", "Contact3").toRecyclerItem()
    )}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.adapter = MyAdapter().apply { setData(data) }
        setContentView(binding.root)
    }
}
