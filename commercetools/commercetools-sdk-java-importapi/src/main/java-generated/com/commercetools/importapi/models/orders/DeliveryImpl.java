
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Delivery
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryImpl implements Delivery, ModelBase {

    private String id;

    private java.time.ZonedDateTime createdAt;

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    private java.util.List<com.commercetools.importapi.models.orders.Parcel> parcels;

    private com.commercetools.importapi.models.common.Address address;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryImpl(@JsonProperty("id") final String id,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("items") final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items,
            @JsonProperty("parcels") final java.util.List<com.commercetools.importapi.models.orders.Parcel> parcels,
            @JsonProperty("address") final com.commercetools.importapi.models.common.Address address) {
        this.id = id;
        this.createdAt = createdAt;
        this.items = items;
        this.parcels = parcels;
        this.address = address;
    }

    /**
     * create empty instance
     */
    public DeliveryImpl() {
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Date and time (UTC) the Delivery was created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     */

    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     */

    public java.util.List<com.commercetools.importapi.models.orders.Parcel> getParcels() {
        return this.parcels;
    }

    /**
     *  <p>Address to which Parcels are delivered.</p>
     */

    public com.commercetools.importapi.models.common.Address getAddress() {
        return this.address;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setItems(final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
    }

    public void setParcels(final com.commercetools.importapi.models.orders.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
    }

    public void setParcels(final java.util.List<com.commercetools.importapi.models.orders.Parcel> parcels) {
        this.parcels = parcels;
    }

    public void setAddress(final com.commercetools.importapi.models.common.Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DeliveryImpl that = (DeliveryImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(createdAt, that.createdAt)
                .append(items, that.items)
                .append(parcels, that.parcels)
                .append(address, that.address)
                .append(id, that.id)
                .append(createdAt, that.createdAt)
                .append(items, that.items)
                .append(parcels, that.parcels)
                .append(address, that.address)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(createdAt)
                .append(items)
                .append(parcels)
                .append(address)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("createdAt", createdAt)
                .append("items", items)
                .append("parcels", parcels)
                .append("address", address)
                .build();
    }

    @Override
    public Delivery copyDeep() {
        return Delivery.deepCopy(this);
    }
}
