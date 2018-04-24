package com.example.aridwiprayogo.learnespresso

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private var tvResultView: TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar!!.title="Activity Second"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        tvResultView=findViewById(R.id.tv_result_view)
        val input=intent.getStringExtra(EXTRA_INPUT)
        tvResultView!!.text=input
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        var EXTRA_INPUT="extra_input"
    }

}