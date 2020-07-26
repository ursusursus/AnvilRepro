package sk.foo.base.di;

import java.lang.System;

/**
 * Created by Vlastimil Brečka (www.vlastimilbrecka.sk)
 * on 1. 7. 2020.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lsk/foo/base/di/BaseComponent;", "", "bar", "Lsk/foo/base/Bar;", "getBar", "()Lsk/foo/base/Bar;", "base_debug"})
@com.squareup.anvil.annotations.ContributesTo(scope = sk.foo.base.di.AppScope.class)
public abstract interface BaseComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract sk.foo.base.Bar getBar();
}