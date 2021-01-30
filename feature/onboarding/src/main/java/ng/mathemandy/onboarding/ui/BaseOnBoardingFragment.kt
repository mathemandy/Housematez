package ng.mathemandy.onboarding.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ng.mathemandy.onboarding.R
import ng.mathemandy.onboarding.databinding.BaseOnBoardingBinding


class BaseOnBoardingFragment  : Fragment() {

    private lateinit var binding: BaseOnBoardingBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BaseOnBoardingBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val numberOfScreens = resources.getStringArray(R.array.on_boarding_description).size
        val onBoardingAdapter = OnBoardingAdapter(this, numberOfScreens)
        binding.onBoardingViewPager.adapter = onBoardingAdapter
        binding.indicator.setViewPager(binding.onBoardingViewPager)
        onBoardingAdapter.registerAdapterDataObserver(binding.indicator.adapterDataObserver)

    }

}