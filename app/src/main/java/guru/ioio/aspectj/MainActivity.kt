package guru.ioio.aspectj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        DataBindingUtil.setContentView(this,R.layout.activity_main)
        findViewById<View>(R.id.main_text).setOnClickListener {
            startActivity(Intent(this, JavaActivity::class.java))
        }
    }
}