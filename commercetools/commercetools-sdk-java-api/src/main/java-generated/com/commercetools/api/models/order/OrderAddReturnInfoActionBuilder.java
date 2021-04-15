
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderAddReturnInfoActionBuilder {

    @Nullable
    private String returnTrackingId;

    private java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items;

    @Nullable
    private java.time.ZonedDateTime returnDate;

    public OrderAddReturnInfoActionBuilder returnTrackingId(@Nullable final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
        return this;
    }

    public OrderAddReturnInfoActionBuilder items(final com.commercetools.api.models.order.ReturnItemDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public OrderAddReturnInfoActionBuilder items(
            final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items) {
        this.items = items;
        return this;
    }

    public OrderAddReturnInfoActionBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    @Nullable
    public String getReturnTrackingId() {
        return this.returnTrackingId;
    }

    public java.util.List<com.commercetools.api.models.order.ReturnItemDraft> getItems() {
        return this.items;
    }

    @Nullable
    public java.time.ZonedDateTime getReturnDate() {
        return this.returnDate;
    }

    public OrderAddReturnInfoAction build() {
        return new OrderAddReturnInfoActionImpl(returnTrackingId, items, returnDate);
    }

    public static OrderAddReturnInfoActionBuilder of() {
        return new OrderAddReturnInfoActionBuilder();
    }

    public static OrderAddReturnInfoActionBuilder of(final OrderAddReturnInfoAction template) {
        OrderAddReturnInfoActionBuilder builder = new OrderAddReturnInfoActionBuilder();
        builder.returnTrackingId = template.getReturnTrackingId();
        builder.items = template.getItems();
        builder.returnDate = template.getReturnDate();
        return builder;
    }

}
