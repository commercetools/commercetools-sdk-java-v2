
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

/**
 * ReturnItemDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReturnItemDraftImpl implements ReturnItemDraft, ModelBase {

    private String key;

    private Long quantity;

    private String lineItemId;

    private String customLineItemId;

    private String comment;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReturnItemDraftImpl(@JsonProperty("key") final String key, @JsonProperty("quantity") final Long quantity,
            @JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("comment") final String comment,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ReturnShipmentState shipmentState,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.quantity = quantity;
        this.lineItemId = lineItemId;
        this.customLineItemId = customLineItemId;
        this.comment = comment;
        this.shipmentState = shipmentState;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public ReturnItemDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the Return Item.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Number of Line Items or Custom Line Items to return.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p><code>id</code> of the LineItem to return.</p>
     *  <p>Required if Line Items are returned, to create a LineItemReturnItem.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to return.</p>
     *  <p>Required if Custom Line Items are returned, to create a CustomLineItemReturnItem.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>User-defined description for the return.</p>
     */

    public String getComment() {
        return this.comment;
    }

    /**
     *  <p>Shipment status of the item to be returned. Can either be <code>Advised</code> or <code>Returned</code> only.</p>
     */

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Custom Fields for the Return Item.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReturnItemDraftImpl that = (ReturnItemDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(quantity, that.quantity)
                .append(lineItemId, that.lineItemId)
                .append(customLineItemId, that.customLineItemId)
                .append(comment, that.comment)
                .append(shipmentState, that.shipmentState)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(quantity, that.quantity)
                .append(lineItemId, that.lineItemId)
                .append(customLineItemId, that.customLineItemId)
                .append(comment, that.comment)
                .append(shipmentState, that.shipmentState)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(quantity)
                .append(lineItemId)
                .append(customLineItemId)
                .append(comment)
                .append(shipmentState)
                .append(custom)
                .toHashCode();
    }

}
