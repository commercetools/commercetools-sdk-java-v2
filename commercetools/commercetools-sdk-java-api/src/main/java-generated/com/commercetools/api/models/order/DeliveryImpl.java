
package com.commercetools.api.models.order;

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
 *  <p>Contains information on how items are shipped to Customers, for example, a delivery note.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryImpl implements Delivery, ModelBase {

    private String id;

    private String key;

    private java.time.ZonedDateTime createdAt;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private java.util.List<com.commercetools.api.models.order.Parcel> parcels;

    private com.commercetools.api.models.common.Address address;

    private com.commercetools.api.models.type.CustomFields custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items,
            @JsonProperty("parcels") final java.util.List<com.commercetools.api.models.order.Parcel> parcels,
            @JsonProperty("address") final com.commercetools.api.models.common.Address address,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
        this.key = key;
        this.createdAt = createdAt;
        this.items = items;
        this.parcels = parcels;
        this.address = address;
        this.custom = custom;
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
     *  <p>User-defined unique identifier of the Delivery.</p>
     */

    public String getKey() {
        return this.key;
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

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     */

    public java.util.List<com.commercetools.api.models.order.Parcel> getParcels() {
        return this.parcels;
    }

    /**
     *  <p>Address to which Parcels are delivered.</p>
     */

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Custom Fields of the Delivery.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setItems(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
    }

    public void setParcels(final com.commercetools.api.models.order.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
    }

    public void setParcels(final java.util.List<com.commercetools.api.models.order.Parcel> parcels) {
        this.parcels = parcels;
    }

    public void setAddress(final com.commercetools.api.models.common.Address address) {
        this.address = address;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DeliveryImpl that = (DeliveryImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(createdAt, that.createdAt)
                .append(items, that.items)
                .append(parcels, that.parcels)
                .append(address, that.address)
                .append(custom, that.custom)
                .append(id, that.id)
                .append(key, that.key)
                .append(createdAt, that.createdAt)
                .append(items, that.items)
                .append(parcels, that.parcels)
                .append(address, that.address)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(key)
                .append(createdAt)
                .append(items)
                .append(parcels)
                .append(address)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("createdAt", createdAt)
                .append("items", items)
                .append("parcels", parcels)
                .append("address", address)
                .append("custom", custom)
                .build();
    }

    @Override
    public Delivery copyDeep() {
        return Delivery.deepCopy(this);
    }
}
