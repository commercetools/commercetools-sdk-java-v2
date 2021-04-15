
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderImportLineItemStateActionBuilder {

    private String lineItemId;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    public OrderImportLineItemStateActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public OrderImportLineItemStateActionBuilder state(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    public OrderImportLineItemStateActionBuilder state(
            final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    public OrderImportLineItemStateAction build() {
        return new OrderImportLineItemStateActionImpl(lineItemId, state);
    }

    public static OrderImportLineItemStateActionBuilder of() {
        return new OrderImportLineItemStateActionBuilder();
    }

    public static OrderImportLineItemStateActionBuilder of(final OrderImportLineItemStateAction template) {
        OrderImportLineItemStateActionBuilder builder = new OrderImportLineItemStateActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.state = template.getState();
        return builder;
    }

}
