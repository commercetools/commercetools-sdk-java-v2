
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetLocaleActionBuilder {

    @Nullable
    private String locale;

    public CartSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    public CartSetLocaleAction build() {
        return new CartSetLocaleActionImpl(locale);
    }

    public static CartSetLocaleActionBuilder of() {
        return new CartSetLocaleActionBuilder();
    }

    public static CartSetLocaleActionBuilder of(final CartSetLocaleAction template) {
        CartSetLocaleActionBuilder builder = new CartSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
