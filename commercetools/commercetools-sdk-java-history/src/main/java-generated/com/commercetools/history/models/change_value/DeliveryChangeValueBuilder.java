
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryChangeValueBuilder implements Builder<DeliveryChangeValue> {

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> items;

    private com.commercetools.history.models.common.Address address;

    private java.util.List<com.commercetools.history.models.common.Parcel> parcels;

    public DeliveryChangeValueBuilder items(final com.commercetools.history.models.common.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public DeliveryChangeValueBuilder items(
            final java.util.List<com.commercetools.history.models.common.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public DeliveryChangeValueBuilder address(final com.commercetools.history.models.common.Address address) {
        this.address = address;
        return this;
    }

    public DeliveryChangeValueBuilder parcels(final com.commercetools.history.models.common.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    public DeliveryChangeValueBuilder parcels(
            final java.util.List<com.commercetools.history.models.common.Parcel> parcels) {
        this.parcels = parcels;
        return this;
    }

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getItems() {
        return this.items;
    }

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    public java.util.List<com.commercetools.history.models.common.Parcel> getParcels() {
        return this.parcels;
    }

    public DeliveryChangeValue build() {
        Objects.requireNonNull(items);
        Objects.requireNonNull(address);
        Objects.requireNonNull(parcels);
        return new DeliveryChangeValueImpl(items, address, parcels);
    }

    /**
     * builds DeliveryChangeValue without checking for non null required values
     */
    public DeliveryChangeValue buildUnchecked() {
        return new DeliveryChangeValueImpl(items, address, parcels);
    }

    public static DeliveryChangeValueBuilder of() {
        return new DeliveryChangeValueBuilder();
    }

    public static DeliveryChangeValueBuilder of(final DeliveryChangeValue template) {
        DeliveryChangeValueBuilder builder = new DeliveryChangeValueBuilder();
        builder.items = template.getItems();
        builder.address = template.getAddress();
        builder.parcels = template.getParcels();
        return builder;
    }

}
