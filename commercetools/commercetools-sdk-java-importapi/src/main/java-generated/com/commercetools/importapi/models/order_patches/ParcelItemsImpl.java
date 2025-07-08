
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
 * ParcelItems
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelItemsImpl implements ParcelItems, ModelBase {

    private String parcelId;

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelItemsImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("items") final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.parcelId = parcelId;
        this.items = items;
    }

    /**
     * create empty instance
     */
    public ParcelItemsImpl() {
    }

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p>Items in the Parcel.</p>
     */

    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setItems(final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParcelItemsImpl that = (ParcelItemsImpl) o;

        return new EqualsBuilder().append(parcelId, that.parcelId)
                .append(items, that.items)
                .append(parcelId, that.parcelId)
                .append(items, that.items)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(parcelId).append(items).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("parcelId", parcelId)
                .append("items", items)
                .build();
    }

    @Override
    public ParcelItems copyDeep() {
        return ParcelItems.deepCopy(this);
    }
}
