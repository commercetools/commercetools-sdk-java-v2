
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetKeyActionBuilder {

    @Nullable
    private String key;

    public CartSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CartSetKeyAction build() {
        return new CartSetKeyActionImpl(key);
    }

    public static CartSetKeyActionBuilder of() {
        return new CartSetKeyActionBuilder();
    }

    public static CartSetKeyActionBuilder of(final CartSetKeyAction template) {
        CartSetKeyActionBuilder builder = new CartSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
