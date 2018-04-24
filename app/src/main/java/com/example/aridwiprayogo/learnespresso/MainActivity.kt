package com.example.aridwiprayogo.learnespresso

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var edtText: EditText?=null
    private var btnChangeText: Button?=null
    private var btnSwitchActivity: Button?=null
    private var tvPrintedText: TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.title="Learn Espresso"
        edtText=findViewById(R.id.edt_text)
        btnChangeText=findViewById(R.id.btn_change_text)
        btnSwitchActivity=findViewById(R.id.btn_swicth_activity)
        tvPrintedText=findViewById(R.id.tv_printed_text)
        btnChangeText!!.setOnClickListener(this)
        btnSwitchActivity!!.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn_change_text -> {
                edtText!!.setText("Lalala")
                val input=edtText!!.text.toString()
                tvPrintedText!!.setText(input)
            }
            R.id.btn_swicth_activity -> {
                val text=edtText!!.text.toString()
                val intent=Intent(this, SecondActivity::class.java)
                intent.putExtra(SecondActivity.EXTRA_INPUT, text)
                startActivity(intent)
            }
        }
    }
}