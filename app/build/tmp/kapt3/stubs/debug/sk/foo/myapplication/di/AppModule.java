package sk.foo.myapplication.di;

import java.lang.System;

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 1. 7. 2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lsk/foo/myapplication/di/AppModule;", "", "()V", "foo", "Lsk/foo/base/Foo;", "context", "Landroid/content/Context;", "app_debug"})
@com.squareup.anvil.annotations.ContributesTo(scope = sk.foo.base.di.AppScope.class)
@dagger.Module()
public final class AppModule {
    public static final sk.foo.myapplication.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @sk.foo.base.di.AppScope()
    @dagger.Provides()
    public static final sk.foo.base.Foo foo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}