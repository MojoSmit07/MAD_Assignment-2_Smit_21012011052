package com.example.mad_assignment_2_smit_21012011052

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class BillActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill)

        val alpha: Intent = intent
        val info: String? = alpha.getStringExtra("info")

        val listViewInfoAboutOrder: ListView = findViewById(R.id.listViewInfoAboutOrder)

        // Create a list of order details (you can format this as needed)
        val orderDetails = info?.split("\n") ?: emptyList()

        // Create an ArrayAdapter to populate the ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, orderDetails)

        listViewInfoAboutOrder.adapter = adapter
    }
}




//package com.example.mad_assignment_2_smit_21012011052
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.TextView
//
//class BillActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_bill)
//
//        val alpha: Intent = intent
//        val info: String? = alpha.getStringExtra("info")
//
//        val textViewInfoAboutOrder: TextView = findViewById(R.id.textViewInfoAboutOrder)
//        textViewInfoAboutOrder.text = info
//    }
//}
