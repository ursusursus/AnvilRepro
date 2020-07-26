package sk.foo.base.di

import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import sk.foo.base.Bar
import sk.foo.base.BarImpl
import sk.foo.base.Foo
import javax.inject.Scope

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 1. 7. 2020.
 */
@ContributesTo(AppScope::class)
interface BaseComponent {
    val bar: Bar
}

@Module
@ContributesTo(AppScope::class)
object BaseModule {
    @Provides
    @JvmStatic
    fun bar(foo: Foo): Bar = BarImpl(foo)
}


@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope