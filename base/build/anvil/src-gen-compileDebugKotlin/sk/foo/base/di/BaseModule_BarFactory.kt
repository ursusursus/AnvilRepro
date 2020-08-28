package sk.foo.base.di

import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import dagger.internal.Factory
import dagger.internal.Preconditions
import javax.annotation.Generated
import javax.inject.Provider
import javax.inject.Scope
import kotlin.jvm.JvmStatic
import sk.foo.base.Bar
import sk.foo.base.BarImpl
import sk.foo.base.Foo

@Generated(
  value = ["com.squareup.anvil.compiler.AnvilComponentRegistrar"],
  comments = "https://github.com/square/anvil"
)
class BaseModule_BarFactory(
  private val param0: Provider<Foo>
) : Factory<Bar> {
  override fun get(): Bar = bar(param0.get())

  companion object {
    @JvmStatic
    fun create(param0: Provider<Foo>): BaseModule_BarFactory = BaseModule_BarFactory(param0)

    @JvmStatic
    fun bar(param0: Foo): Bar = Preconditions.checkNotNull(BaseModule.bar(param0),
        "Cannot return null from a non-@Nullable @Provides method")
  }
}
