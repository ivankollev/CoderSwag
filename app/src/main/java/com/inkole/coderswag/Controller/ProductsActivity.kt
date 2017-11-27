package com.inkole.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.inkole.coderswag.R
import com.inkole.coderswag.Untilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
