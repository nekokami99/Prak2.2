package com.xbach.prak22


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this@MainActivity, "Activity CREATED", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        var toast= Toast.makeText(this@MainActivity, "Activity STARTED", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.LEFT,0,0);
        toast.show();
    }

    override fun onPause() {
        super.onPause()
        var toast= Toast.makeText(this@MainActivity, "Activity PAUSE", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.RIGHT,0,0);
        toast.show();
    }

    override fun onResume() {
        super.onResume()
        var toast= Toast.makeText(this@MainActivity, "Activity RESUME", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP,0,0);
        toast.show();
    }

    override fun onStop() {
        super.onStop()
        var toast= Toast.makeText(this@MainActivity, "Activity STOP", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    override fun onRestart() {
        super.onRestart()
        var toast= Toast.makeText(this@MainActivity, "Activity RESTART", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.FILL_HORIZONTAL,0,0);
        toast.show();
    }

    override fun onDestroy() {
        super.onDestroy()
        var toast= Toast.makeText(this@MainActivity, "Activity DESTROY", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.FILL,0,0);
        toast.show();
    }
}