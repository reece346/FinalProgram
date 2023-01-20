package com.example.finalprogram

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val displayUser : String = intent.getStringExtra("userName").toString()
        val userTextView : TextView = findViewById(R.id.textView2)
        userTextView.text = displayUser

        val actionBar = supportActionBar
        actionBar!!.title = "Vet Appointments"
        actionBar.setDisplayHomeAsUpEnabled(true)

        // demonstrate scrolling
        val exampleList = generateFakeData(9)
        val rv : RecyclerView = findViewById(R.id.recyclerView)
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
        rv.adapter = myAdapter(exampleList)
    }

    private fun generateFakeData(size: Int): List<myData> {
        val list = ArrayList<myData>()
        var title: String = ""
        var date: String = ""
        var description: String = ""
        for(i in 0 until size) {
            when (i%8) {
                0 -> {
                    title = "Rabies Shot Appointment"
                    date = "06/24/2021"
                    description = "Follow-up Appointment to check Taylor's vitals and administer her second shot."
                }
                1 -> {
                    title = "Regular Check Up"
                    date = "03/17/2021"
                    description = "Check-up appointment to see how Taylor is doing after last appointment."
                }
                2 -> {
                    title = "Turtle Cleaning"
                    date = "01/30/2021"
                    description = "Bi-annual cleaning for Tucker"
                }
                3 -> {
                    title = "Emergency Surgery"
                    date = "11/28/2020"
                    description = "Surgery for Taylor on her Pancreas to remove potential cancerous tumor"
                }
                4 -> {
                    title = "Vaccination Shots for New Puppy"
                    date = "04/06/2020"
                    description = "All 6 vaccinations including rabies for new-born puppy, Lilly"
                }
                5 -> {
                    title = "Male Dog Vasectomy"
                    date = "02/17/2020"
                    description = "Neutering Surgery for Max"
                }
                6 -> {
                    title = "Annual Check Up: Taylor"
                    date = "01/29/2020"
                    description = "Appointment to check Taylor's health and vitals"
                }
                else -> {
                    title = "Annual Check Up: Max"
                    date = "01/29/2020"
                    description = "Appointment to check Max's health and vitals"
                }
            }
            list += myData(title, date, description)
        }
        return list
    }
}