package ng.mathemandy.onboarding.ui

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class OnBoardingAdapter(fragment: Fragment, private val itemsCount: Int) :
    FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return itemsCount
    }

    override fun createFragment(position: Int): Fragment {
        return OnBoardingFragment.getInstance(position)
    }
}