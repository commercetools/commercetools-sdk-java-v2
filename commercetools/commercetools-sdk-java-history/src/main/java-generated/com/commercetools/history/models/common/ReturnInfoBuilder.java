
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReturnInfoBuilder implements Builder<ReturnInfo> {

    private java.util.List<com.commercetools.history.models.common.ReturnItem> items;

    private String returnTrackingId;

    private String returnDate;

    public ReturnInfoBuilder items(final com.commercetools.history.models.common.ReturnItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public ReturnInfoBuilder items(final java.util.List<com.commercetools.history.models.common.ReturnItem> items) {
        this.items = items;
        return this;
    }

    public ReturnInfoBuilder plusItems(final com.commercetools.history.models.common.ReturnItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    public ReturnInfoBuilder plusItems(
            Function<com.commercetools.history.models.common.ReturnItemBuilder, com.commercetools.history.models.common.ReturnItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.history.models.common.ReturnItemBuilder.of()).build());
        return this;
    }

    public ReturnInfoBuilder withItems(
            Function<com.commercetools.history.models.common.ReturnItemBuilder, com.commercetools.history.models.common.ReturnItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.history.models.common.ReturnItemBuilder.of()).build());
        return this;
    }

    public ReturnInfoBuilder returnTrackingId(final String returnTrackingId) {
        this.returnTrackingId = returnTrackingId;
        return this;
    }

    public ReturnInfoBuilder returnDate(final String returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public java.util.List<com.commercetools.history.models.common.ReturnItem> getItems() {
        return this.items;
    }

    public String getReturnTrackingId() {
        return this.returnTrackingId;
    }

    public String getReturnDate() {
        return this.returnDate;
    }

    public ReturnInfo build() {
        Objects.requireNonNull(items, ReturnInfo.class + ": items is missing");
        Objects.requireNonNull(returnTrackingId, ReturnInfo.class + ": returnTrackingId is missing");
        Objects.requireNonNull(returnDate, ReturnInfo.class + ": returnDate is missing");
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
