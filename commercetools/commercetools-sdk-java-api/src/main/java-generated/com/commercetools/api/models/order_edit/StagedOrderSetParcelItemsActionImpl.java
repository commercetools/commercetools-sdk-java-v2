
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Produces the ParcelItemsUpdated Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetParcelItemsActionImpl implements StagedOrderSetParcelItemsAction, ModelBase {

    private String action;

    private String parcelId;

    private String parcelKey;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderSetParcelItemsActionImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("parcelKey") final String parcelKey,
            @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.parcelId = parcelId;
        this.parcelKey = parcelKey;
        this.items = items;
        this.action = SET_PARCEL_ITEMS;
    }

    /**
     * create empty instance
     */
    public StagedOrderSetParcelItemsActionImpl() {
        this.action = SET_PARCEL_ITEMS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     */

    public String getParcelKey() {
        return this.parcelKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setParcelKey(final String parcelKey) {
        this.parcelKey = parcelKey;
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

        return new EqualsBuilder().append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(parcelKey, that.parcelKey)
                .append(items, that.items)
                .append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(parcelKey, that.parcelKey)
                .append(items, that.items)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(parcelId).append(parcelKey).append(items).toHashCode();
    }

}
