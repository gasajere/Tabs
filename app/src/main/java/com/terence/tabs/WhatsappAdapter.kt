package com.terence.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.terence.tabs.views.CallFragment
import com.terence.tabs.views.ChatsFragment
import com.terence.tabs.views.StatusFragment

class WhatsappAdapter(fm:FragmentManager): FragmentStatePagerAdapter(fm) {
    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0-> return "Chat"
            1-> return "Status"
            2-> return "Call"
            else -> return "Chat"
        }
    }

    override fun getCount(): Int {
       return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return ChatsFragment()
            1 -> return StatusFragment()
            2 ->  return CallFragment()
            else -> return ChatsFragment()
        }
    }

}