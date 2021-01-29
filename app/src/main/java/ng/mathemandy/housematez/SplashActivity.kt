package ng.mathemandy.housematez

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import ng.mathemandy.housematez.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        animateViews()
    }

    private fun animateViews() {
        val a  = getTopAnimation()
        a?.setAnimationListener(object  : Animation.AnimationListener{
            override fun onAnimationEnd(animation: Animation?) {
                startMainActivity()
                finish()
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }

            override fun onAnimationStart(animation: Animation?) {

            }
        })
        binding.logo.startAnimation(a)
        binding.title.animation = getBottomAnimation()

    }
    private fun getTopAnimation(): Animation? {
        return AnimationUtils.loadAnimation(this, R.anim.top_animation)
    }

    private fun getBottomAnimation(): Animation? {
        return AnimationUtils.loadAnimation(this, R.anim.bottom_anim)
    }
    private fun startMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    companion object {
        private val TAG = SplashActivity::class.java.simpleName
    }
}
