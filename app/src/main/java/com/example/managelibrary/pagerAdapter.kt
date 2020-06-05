package com.example.managelibrary

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class pagerAdapter:FragmentPagerAdapter {
    var library:Fragment=findLibraryFragment()
    var book:Fragment=findBookFragment()
    var mFrag= arrayListOf<Fragment>(library,book)
    constructor(fm:FragmentManager):super(fm){

    }

    override fun getItem(position: Int): Fragment {
        return mFrag.get(position)
    }

    override fun getCount(): Int {
        return mFrag.size
    }
}