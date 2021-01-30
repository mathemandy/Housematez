package ng.mathemandy.onboarding.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import ng.mathemandy.onboarding.R
import ng.mathemandy.onboarding.databinding.FragmentOnboardingBinding

class OnBoardingFragment : Fragment() {
    companion object {
        private const val ARG_POSITION = "ARG_POSITION"

        fun getInstance(position: Int) = OnBoardingFragment().apply {
            arguments = bundleOf(ARG_POSITION to position)
        }
    }


    private lateinit var binding: FragmentOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentOnboardingBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val position = requireArguments().getInt(ARG_POSITION)
       val onBoardingTexts = requireContext().resources.getStringArray(R.array.on_boarding_title)
        val onBoardingSubTexts = requireContext().resources.getStringArray(R.array.on_boarding_description)
        val onBoardingImages = getOnBoardAssetsLocation()
        with(binding) {
            image.setImageResource(onBoardingImages[position])
            title.text = onBoardingTexts[position]
            subtitle.text = onBoardingSubTexts[position]
        }
    }
    private fun getOnBoardAssetsLocation(): List<Int> {
        val onBoardAssets: MutableList<Int> = ArrayList()
        onBoardAssets.add(R.drawable.ic_onboarding_one)
        onBoardAssets.add(R.drawable.ic_onboarding_2)
        return onBoardAssets
    }
}
