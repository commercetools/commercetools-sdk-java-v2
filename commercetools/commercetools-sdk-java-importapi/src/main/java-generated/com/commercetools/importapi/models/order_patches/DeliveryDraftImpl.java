
package com.commercetools.importapi.models.order_patches;

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
 * DeliveryDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryDraftImpl implements DeliveryDraft, ModelBase {

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    private com.commercetools.importapi.models.common.Address address;

    private java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryDraftImpl(
            @JsonProperty("items") final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items,
            @JsonProperty("address") final com.commercetools.importapi.models.common.Address address,
            @JsonProperty("parcels") final java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels) {
        this.items = items;
        this.address = address;
        this.parcels = parcels;
    }

    /**
     * create empty instance
     */
    public DeliveryDraftImpl() {
    }

    /**
     *  <p>Line Items or Custom Line Items to deliver. It can also be specified individually for each Parcel.</p>
     */

    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Address to which the Parcels are delivered.</p>
     */

    public com.commercetools.importapi.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a parcel.</p>
     */

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
    public DeliveryDraft copyDeep() {
        return DeliveryDraft.deepCopy(this);
    }
}
