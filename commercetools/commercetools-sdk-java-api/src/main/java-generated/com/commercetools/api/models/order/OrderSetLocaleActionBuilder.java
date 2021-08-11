
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetLocaleActionBuilder implements Builder<OrderSetLocaleAction> {

    @Nullable
    private String locale;

    public OrderSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    public OrderSetLocaleAction build() {
        return new OrderSetLocaleActionImpl(locale);
    }

    /**
     * builds OrderSetLocaleAction without checking for non null required values
     */
    public OrderSetLocaleAction buildUnchecked() {
        return new OrderSetLocaleActionImpl(locale);
    }

    public static OrderSetLocaleActionBuilder of() {
        return new OrderSetLocaleActionBuilder();
    }

    public static OrderSetLocaleActionBuilder of(final OrderSetLocaleAction template) {
        OrderSetLocaleActionBuilder builder = new OrderSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
