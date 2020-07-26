package sk.foo.myapplication.di

import android.content.Context
import com.squareup.anvil.annotations.MergeComponent
import dagger.BindsInstance
import dagger.Component
import sk.foo.base.di.AppScope

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 1. 7. 2020.
 */
@AppScope
@MergeComponent(AppScope::class)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}