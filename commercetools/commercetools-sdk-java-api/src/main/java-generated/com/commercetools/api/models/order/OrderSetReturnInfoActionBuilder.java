
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSetReturnInfoActionBuilder implements Builder<OrderSetReturnInfoAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items;

    public OrderSetReturnInfoActionBuilder items(
            @Nullable final com.commercetools.api.models.order.ReturnInfoDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public OrderSetReturnInfoActionBuilder items(
            @Nullable final java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items) {
        this.items = items;
        return this;
    }

    public OrderSetReturnInfoActionBuilder plusItems(
            @Nullable final com.commercetools.api.models.order.ReturnInfoDraft... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    public OrderSetReturnInfoActionBuilder plusItems(
            Function<com.commercetools.api.models.order.ReturnInfoDraftBuilder, com.commercetools.api.models.order.ReturnInfoDraftBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnInfoDraftBuilder.of()).build());
        return this;
    }

    public OrderSetReturnInfoActionBuilder withItems(
            Function<com.commercetools.api.models.order.ReturnInfoDraftBuilder, com.commercetools.api.models.order.ReturnInfoDraftBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnInfoDraftBuilder.of()).build());
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> getItems() {
        return this.items;
    }

    public OrderSetReturnInfoAction build() {
        return new OrderSetReturnInfoActionImpl(items);
    }

    /**
     * builds OrderSetReturnInfoAction without checking for non null required values
     */
    public OrderSetReturnInfoAction buildUnchecked() {
        return new OrderSetReturnInfoActionImpl(items);
    }

    public static OrderSetReturnInfoActionBuilder of() {
        return new OrderSetReturnInfoActionBuilder();
    }

    public static OrderSetReturnInfoActionBuilder of(final OrderSetReturnInfoAction template) {
        OrderSetReturnInfoActionBuilder builder = new OrderSetReturnInfoActionBuilder();
        builder.items = template.getItems();
        return builder;
    }

}
