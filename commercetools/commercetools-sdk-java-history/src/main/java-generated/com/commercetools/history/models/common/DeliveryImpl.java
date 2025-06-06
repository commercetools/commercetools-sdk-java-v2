
package com.commercetools.history.models.common;

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

    private String createdAt;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> items;

    private java.util.List<com.commercetools.history.models.common.Parcel> parcels;

    private com.commercetools.history.models.common.Address address;

    private com.commercetools.history.models.common.CustomFields custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryImpl(@JsonProperty("id") final String id, @JsonProperty("createdAt") final String createdAt,
            @JsonProperty("items") final java.util.List<com.commercetools.history.models.common.DeliveryItem> items,
            @JsonProperty("parcels") final java.util.List<com.commercetools.history.models.common.Parcel> parcels,
            @JsonProperty("address") final com.commercetools.history.models.common.Address address,
            @JsonProperty("custom") final com.commercetools.history.models.common.CustomFields custom) {
        this.id = id;
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
     *
     */

    public String getId() {
        return this.id;
    }

    /**
     *
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.history.models.common.Parcel> getParcels() {
        return this.parcels;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     */

    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    public void setItems(final com.commercetools.history.models.common.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.history.models.common.DeliveryItem> items) {
        this.items = items;
    }

    public void setParcels(final com.commercetools.history.models.common.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
    }

    public void setParcels(final java.util.List<com.commercetools.history.models.common.Parcel> parcels) {
        this.parcels = parcels;
    }

    public void setAddress(final com.commercetools.history.models.common.Address address) {
        this.address = address;
    }

    public void setCustom(final com.commercetools.history.models.common.CustomFields custom) {
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
                .append(createdAt, that.createdAt)
                .append(items, that.items)
                .append(parcels, that.parcels)
                .append(address, that.address)
                .append(custom, that.custom)
                .append(id, that.id)
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
