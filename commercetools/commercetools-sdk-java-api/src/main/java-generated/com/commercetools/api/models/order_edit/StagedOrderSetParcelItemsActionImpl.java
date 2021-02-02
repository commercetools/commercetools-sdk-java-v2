
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetParcelItemsActionImpl implements StagedOrderSetParcelItemsAction {

    private String action;

    private String parcelId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    @JsonCreator
    StagedOrderSetParcelItemsActionImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.parcelId = parcelId;
        this.items = items;
        this.action = SET_PARCEL_ITEMS;
    }

    public StagedOrderSetParcelItemsActionImpl() {
        this.action = SET_PARCEL_ITEMS;
    }

    public String getAction() {
        return this.action;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setItems(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public void setItems(final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetParcelItemsActionImpl that = (StagedOrderSetParcelItemsActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(parcelId, that.parcelId).append(items,
            that.items).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(parcelId).append(items).toHashCode();
    }

}
