package com.android.lyqlib

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.lyq_stick.view.*

/**
 * created by renhuan
 * time : 2020/8/4 10:19
 * describe :
 */
class LyqStickView(context: Context, attributeSet: AttributeSet) :
    FrameLayout(context, attributeSet) {

    init {
        View.inflate(context, R.layout.lyq_stick, this)
    }

    /**
     * 添加头部
     */
    fun addHead(headView: View) {
        collapsingToolbar.addView(headView)
    }

    fun setAdapter(
        fragmentManager: FragmentManager,
        mTitleList: ArrayList<String>,
        mFragmentList: ArrayList<Fragment>
    ) {
        vp.adapter = MyFragmentPagerAdapter(fragmentManager, mFragmentList, mTitleList)
        tab.setViewPager(vp)
    }
}