
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ParcelItemsImpl implements ParcelItems, ModelBase {

    private String parcelId;

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    @JsonCreator
    ParcelItemsImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("items") final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.parcelId = parcelId;
        this.items = items;
    }

    public ParcelItemsImpl() {
    }

    public String getParcelId() {
        return this.parcelId;
    }

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

        return new EqualsBuilder().append(parcelId, that.parcelId).append(items, that.items).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(parcelId).append(items).toHashCode();
    }

}
