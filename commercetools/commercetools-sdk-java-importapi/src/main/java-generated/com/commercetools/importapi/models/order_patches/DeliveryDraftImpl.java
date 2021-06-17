
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryDraftImpl implements DeliveryDraft {

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    private com.commercetools.importapi.models.common.Address address;

    private java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels;

    @JsonCreator
    DeliveryDraftImpl(
            @JsonProperty("items") final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items,
            @JsonProperty("address") final com.commercetools.importapi.models.common.Address address,
            @JsonProperty("parcels") final java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels) {
        this.items = items;
        this.address = address;
        this.parcels = parcels;
    }

    public DeliveryDraftImpl() {
    }

    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    public com.commercetools.importapi.models.common.Address getAddress() {
        return this.address;
    }

    public java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> getParcels() {
        return this.parcels;
    }

    public void setItems(final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
    }

    public void setAddress(final com.commercetools.importapi.models.common.Address address) {
        this.address = address;
    }

    public void setParcels(final com.commercetools.importapi.models.order_patches.DeliveryParcelDraft... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
    }

    public void setParcels(
            final java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels) {
        this.parcels = parcels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DeliveryDraftImpl that = (DeliveryDraftImpl) o;

        return new EqualsBuilder().append(items, that.items)
                .append(address, that.address)
                .append(parcels, that.parcels)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(items).append(address).append(parcels).toHashCode();
    }

}
