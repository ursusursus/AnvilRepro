package sk.foo.myapplication.di

import android.content.Context
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import sk.foo.base.Foo
import sk.foo.base.di.AppScope
import sk.foo.myapplication.FooImpl

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 1. 7. 2020.
 */
@Module
@ContributesTo(AppScope::class)
object AppModule {
    @Provides
    @AppScope
    @JvmStatic
    fun foo(context: Context): Foo = FooImpl(context)
}