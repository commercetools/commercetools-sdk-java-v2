
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderAddReturnInfoActionBuilder implements Builder<StagedOrderAddReturnInfoAction> {

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

    public StagedOrderAddReturnInfoActionBuilder withItems(
            Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraftBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()).build());
        return this;
    }

    public StagedOrderAddReturnInfoActionBuilder plusItems(
            Function<com.commercetools.api.models.order.ReturnItemDraftBuilder, com.commercetools.api.models.order.ReturnItemDraftBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.ReturnItemDraftBuilder.of()).build());
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
        Objects.requireNonNull(items, StagedOrderAddReturnInfoAction.class + ": items is missing");
        return new StagedOrderAddReturnInfoActionImpl(returnTrackingId, items, returnDate);
    }

    /**
     * builds StagedOrderAddReturnInfoAction without checking for non null required values
     */
    public StagedOrderAddReturnInfoAction buildUnchecked() {
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
