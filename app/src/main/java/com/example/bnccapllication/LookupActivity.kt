package com.example.bnccapllication

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bnccapllication.adapter.LookupAdapter
import com.example.bnccapllication.data.LookupData
import kotlinx.android.synthetic.main.activity_lookup.*

class LookupActivity : AppCompatActivity() {

    private val mockLookupList = mutableListOf(
        LookupData("DKI Jakarta", 2, 4, 5),
        LookupData("Banten", 3, 4, 5)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lookup)

        val lookupAdapter = LookupAdapter(mockLookupList)
        rvLookup.layoutManager = LinearLayoutManager(this)
        rvLookup.adapter = lookupAdapter
    }
}