
package com.commercetools.importapi.models.order_patches;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryDraftBuilder {

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    @Nullable
    private com.commercetools.importapi.models.common.Address address;

    private java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels;

    public DeliveryDraftBuilder items(final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public DeliveryDraftBuilder items(
            final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public DeliveryDraftBuilder address(@Nullable final com.commercetools.importapi.models.common.Address address) {
        this.address = address;
        return this;
    }

    public DeliveryDraftBuilder parcels(
            final com.commercetools.importapi.models.order_patches.DeliveryParcelDraft... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    public DeliveryDraftBuilder parcels(
            final java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels) {
        this.parcels = parcels;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    @Nullable
    public com.commercetools.importapi.models.common.Address getAddress() {
        return this.address;
    }

    public java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> getParcels() {
        return this.parcels;
    }

    public DeliveryDraft build() {
        return new DeliveryDraftImpl(items, address, parcels);
    }

    public static DeliveryDraftBuilder of() {
        return new DeliveryDraftBuilder();
    }

    public static DeliveryDraftBuilder of(final DeliveryDraft template) {
        DeliveryDraftBuilder builder = new DeliveryDraftBuilder();
        builder.items = template.getItems();
        builder.address = template.getAddress();
        builder.parcels = template.getParcels();
        return builder;
    }

}
