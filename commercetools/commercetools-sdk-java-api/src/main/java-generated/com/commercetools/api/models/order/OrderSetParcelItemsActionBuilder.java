
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetParcelItemsActionBuilder {

    private String parcelId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    public OrderSetParcelItemsActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public OrderSetParcelItemsActionBuilder items(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public OrderSetParcelItemsActionBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public OrderSetParcelItemsAction build() {
        return new OrderSetParcelItemsActionImpl(parcelId, items);
    }

    public static OrderSetParcelItemsActionBuilder of() {
        return new OrderSetParcelItemsActionBuilder();
    }

    public static OrderSetParcelItemsActionBuilder of(final OrderSetParcelItemsAction template) {
        OrderSetParcelItemsActionBuilder builder = new OrderSetParcelItemsActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.items = template.getItems();
        return builder;
    }

}
