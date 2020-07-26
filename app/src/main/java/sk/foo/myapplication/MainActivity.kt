package sk.foo.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import sk.foo.base.di.BaseComponent
import sk.foo.myapplication.di.DaggerAppComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = DaggerAppComponent.factory().create(this)
//        val bar = (appComponent as BaseComponent).bar
//        Log.d("Default", "bar=$bar")
        Log.d("Default", "dasdasdas")
    }

    private fun base(baseComponent: BaseComponent) {

    }
}