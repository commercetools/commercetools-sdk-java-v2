
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderImportCustomLineItemStateActionBuilder {

    private String customLineItemId;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    public OrderImportCustomLineItemStateActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public OrderImportCustomLineItemStateActionBuilder state(
            final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    public OrderImportCustomLineItemStateActionBuilder state(
            final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    public OrderImportCustomLineItemStateAction build() {
        return new OrderImportCustomLineItemStateActionImpl(customLineItemId, state);
    }

    public static OrderImportCustomLineItemStateActionBuilder of() {
        return new OrderImportCustomLineItemStateActionBuilder();
    }

    public static OrderImportCustomLineItemStateActionBuilder of(final OrderImportCustomLineItemStateAction template) {
        OrderImportCustomLineItemStateActionBuilder builder = new OrderImportCustomLineItemStateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.state = template.getState();
        return builder;
    }

}
