package sk.foo.myapplication.di;

import java.lang.System;

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 1. 7. 2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lsk/foo/myapplication/di/AppComponent;", "Lsk/foo/base/di/BaseComponent;", "Factory", "app_debug"})
@dagger.Component(modules = {sk.foo.base.di.BaseModule.class, sk.foo.myapplication.di.AppModule.class}, dependencies = {})
@com.squareup.anvil.annotations.MergeComponent(scope = sk.foo.base.di.AppScope.class)
@sk.foo.base.di.AppScope()
public abstract interface AppComponent extends sk.foo.base.di.BaseComponent {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lsk/foo/myapplication/di/AppComponent$Factory;", "", "create", "Lsk/foo/myapplication/di/AppComponent;", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract sk.foo.myapplication.di.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context context);
    }
}