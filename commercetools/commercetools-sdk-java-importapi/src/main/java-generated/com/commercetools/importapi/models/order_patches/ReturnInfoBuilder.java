
package com.commercetools.importapi.models.order_patches;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReturnInfoBuilder implements Builder<ReturnInfo> {

    private java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> items;

    @Nullable
    private String returnTrackingId;

    @Nullable
    private java.time.ZonedDateTime returnDate;

    public ReturnInfoBuilder items(final com.commercetools.importapi.models.order_patches.ReturnItemDraft... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public ReturnInfoBuilder items(
            final java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> items) {
        this.items = items;
        return this;
    }

    public ReturnInfoBuilder plusItems(
            final com.commercetools.importapi.models.order_patches.ReturnItemDraft... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    public ReturnInfoBuilder plusItems(
            Function<com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder, com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(
            builder.apply(com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder.of()).build());
        return this;
    }

    public ReturnInfoBuilder withItems(
            Function<com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder, com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(
            builder.apply(com.commercetools.importapi.models.order_patches.ReturnItemDraftBuilder.of()).build());
        return this;
    }

    public ReturnInfoBuilder returnTrackingId(@Nullable final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
        return this;
    }

    public ReturnInfoBuilder returnDate(@Nullable final java.time.ZonedDateTime returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.order_patches.ReturnItemDraft> getItems() {
        return this.items;
    }

    @Nullable
    public String getReturnTrackingId() {
        return this.returnTrackingId;
    }

    @Nullable
    public java.time.ZonedDateTime getReturnDate() {
        return this.returnDate;
    }

    public ReturnInfo build() {
        Objects.requireNonNull(items, ReturnInfo.class + ": items is missing");
        return new ReturnInfoImpl(items, returnTrackingId, returnDate);
    }

    /**
     * builds ReturnInfo without checking for non null required values
     */
    public ReturnInfo buildUnchecked() {
        return new ReturnInfoImpl(items, returnTrackingId, returnDate);
    }

    public static ReturnInfoBuilder of() {
        return new ReturnInfoBuilder();
    }

    public static ReturnInfoBuilder of(final ReturnInfo template) {
        ReturnInfoBuilder builder = new ReturnInfoBuilder();
        builder.items = template.getItems();
        builder.returnTrackingId = template.getReturnTrackingId();
        builder.returnDate = template.getReturnDate();
        return builder;
    }

}
