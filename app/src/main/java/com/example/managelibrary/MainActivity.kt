package com.example.managelibrary

import android.R.id.edit
import android.R.id.input
import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.util.Log
import android.widget.TableLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject
import org.jsoup.Jsoup
import org.xml.sax.Parser
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.Exception
import java.lang.ref.WeakReference
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.nio.file.WatchEvent


class MainActivity : AppCompatActivity() {
    lateinit var mTabLayout:TabLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        load_intro()
        init()
    }
    fun load_intro(){
        val intro_intent= Intent(applicationContext,intro::class.java)
        startActivity(intro_intent)
    }

    fun init(){

        mTabLayout.addTab(TabLayout.Tab(),0)

        mTabLayout=findViewById(R.id.tabLayout)
        var fragAdapter=pagerAdapter(supportFragmentManager)
        viewPager.adapter=fragAdapter
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener{
            override fun onTabReselected(p0: TabLayout.Tab?) {
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {
            }

            override fun onTabSelected(p0: TabLayout.Tab?) {
            }

        })

    }
}
