
package com.commercetools.history.models.change_value;

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
 * DeliveryChangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryChangeValueImpl implements DeliveryChangeValue, ModelBase {

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> items;

    private com.commercetools.history.models.common.Address address;

    private java.util.List<com.commercetools.history.models.common.Parcel> parcels;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryChangeValueImpl(
            @JsonProperty("items") final java.util.List<com.commercetools.history.models.common.DeliveryItem> items,
            @JsonProperty("address") final com.commercetools.history.models.common.Address address,
            @JsonProperty("parcels") final java.util.List<com.commercetools.history.models.common.Parcel> parcels) {
        this.items = items;
        this.address = address;
        this.parcels = parcels;
    }

    /**
     * create empty instance
     */
    public DeliveryChangeValueImpl() {
    }

    /**
     *  <p>Line Items or Custom Line Items shipped in the Delivery.</p>
     */

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Address to which the parcels are delivered.</p>
     */

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Parcels included in the Delivery.</p>
     */

    public java.util.List<com.commercetools.history.models.common.Parcel> getParcels() {
        return this.parcels;
    }

    public void setItems(final com.commercetools.history.models.common.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.history.models.common.DeliveryItem> items) {
        this.items = items;
    }

    public void setAddress(final com.commercetools.history.models.common.Address address) {
        this.address = address;
    }

    public void setParcels(final com.commercetools.history.models.common.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
    }

    public void setParcels(final java.util.List<com.commercetools.history.models.common.Parcel> parcels) {
        this.parcels = parcels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DeliveryChangeValueImpl that = (DeliveryChangeValueImpl) o;

        return new EqualsBuilder().append(items, that.items)
                .append(address, that.address)
                .append(parcels, that.parcels)
                .append(items, that.items)
                .append(address, that.address)
                .append(parcels, that.parcels)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(items).append(address).append(parcels).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("items", items)
                .append("address", address)
                .append("parcels", parcels)
                .build();
    }

    @Override
    public DeliveryChangeValue copyDeep() {
        return DeliveryChangeValue.deepCopy(this);
    }
}
