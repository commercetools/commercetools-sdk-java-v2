
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetParcelItemsActionBuilder implements Builder<StagedOrderSetParcelItemsAction> {

    private String parcelId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    public StagedOrderSetParcelItemsActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public StagedOrderSetParcelItemsActionBuilder items(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public StagedOrderSetParcelItemsActionBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public StagedOrderSetParcelItemsActionBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public StagedOrderSetParcelItemsActionBuilder items(
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

    public StagedOrderSetParcelItemsAction build() {
        Objects.requireNonNull(parcelId, StagedOrderSetParcelItemsAction.class + ": parcelId is missing");
        Objects.requireNonNull(items, StagedOrderSetParcelItemsAction.class + ": items is missing");
        return new StagedOrderSetParcelItemsActionImpl(parcelId, items);
    }

    /**
     * builds StagedOrderSetParcelItemsAction without checking for non null required values
     */
    public StagedOrderSetParcelItemsAction buildUnchecked() {
        return new StagedOrderSetParcelItemsActionImpl(parcelId, items);
    }

    public static StagedOrderSetParcelItemsActionBuilder of() {
        return new StagedOrderSetParcelItemsActionBuilder();
    }

    public static StagedOrderSetParcelItemsActionBuilder of(final StagedOrderSetParcelItemsAction template) {
        StagedOrderSetParcelItemsActionBuilder builder = new StagedOrderSetParcelItemsActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.items = template.getItems();
        return builder;
    }

}
