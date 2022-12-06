package com.bignerdranch.android.cinema


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class CollectionAcrivity : AppCompatActivity() {

    val list: List<String> = emptyList()
    var ar = arrayOf("фильм2","фильм2","фильм2","фильм28")

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collection_acrivity)


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(fillList())
        recyclerView.adapter = CustomRecyclerAdapter(getCatList())

        ar = append(ar,"фильмX")
        recyclerView.adapter = CustomRecyclerAdapter(ar.toList())


    }

    private fun fillList(): List<String> {
        val data = mutableListOf<String>()
        (0..30).forEach { i -> data.add("$i element") }

        return data
    }

    private fun getCatList(): List<String> {
        return this.resources.getStringArray(R.array.film_names).toList()
    }

    fun addElm(view: View) {

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(fillList())
        recyclerView.adapter = CustomRecyclerAdapter(getCatList())

        ar = append(ar,"фильмX")
        recyclerView.adapter = CustomRecyclerAdapter(ar.toList())
    }
    fun append(arr: Array<String>, element: String): Array<String> {
        val list: MutableList<String> = arr.toMutableList()
        list.add(element)
        return list.toTypedArray()
    }

}