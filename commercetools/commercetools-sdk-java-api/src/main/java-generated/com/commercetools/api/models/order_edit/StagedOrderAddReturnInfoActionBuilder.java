
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderAddReturnInfoActionBuilder {

    @Nullable
    private String returnTrackingId;

    private java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items;

    @Nullable
    private java.time.ZonedDateTime returnDate;

    public StagedOrderAddReturnInfoActionBuilder returnTrackingId(@Nullable final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
        return this;
    }

    public StagedOrderAddReturnInfoActionBuilder items(
            final com.commercetools.api.models.order.ReturnItemDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public StagedOrderAddReturnInfoActionBuilder items(
            final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items) {
        this.items = items;
        return this;
    }

    public StagedOrderAddReturnInfoActionBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
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

    public StagedOrderAddReturnInfoAction build() {
        return new StagedOrderAddReturnInfoActionImpl(returnTrackingId, items, returnDate);
    }

    public static StagedOrderAddReturnInfoActionBuilder of() {
        return new StagedOrderAddReturnInfoActionBuilder();
    }

    public static StagedOrderAddReturnInfoActionBuilder of(final StagedOrderAddReturnInfoAction template) {
        StagedOrderAddReturnInfoActionBuilder builder = new StagedOrderAddReturnInfoActionBuilder();
        builder.returnTrackingId = template.getReturnTrackingId();
        builder.items = template.getItems();
        builder.returnDate = template.getReturnDate();
        return builder;
    }

}
