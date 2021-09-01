
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditSetKeyActionBuilder implements Builder<OrderEditSetKeyAction> {

    @Nullable
    private String key;

    public OrderEditSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public OrderEditSetKeyAction build() {
        return new OrderEditSetKeyActionImpl(key);
    }

    /**
     * builds OrderEditSetKeyAction without checking for non null required values
     */
    public OrderEditSetKeyAction buildUnchecked() {
        return new OrderEditSetKeyActionImpl(key);
    }

    public static OrderEditSetKeyActionBuilder of() {
        return new OrderEditSetKeyActionBuilder();
    }

    public static OrderEditSetKeyActionBuilder of(final OrderEditSetKeyAction template) {
        OrderEditSetKeyActionBuilder builder = new OrderEditSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
