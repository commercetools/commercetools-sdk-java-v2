
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ReturnInfoBuilder {

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
