
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
public class ReturnItemDraftImpl implements ReturnItemDraft, ModelBase {

    private Double quantity;

    private String lineItemId;

    private String customLineItemId;

    private String comment;

    private com.commercetools.importapi.models.order_patches.ReturnShipmentState shipmentState;

    @JsonCreator
    ReturnItemDraftImpl(@JsonProperty("quantity") final Double quantity,
            @JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("comment") final String comment,
            @JsonProperty("shipmentState") final com.commercetools.importapi.models.order_patches.ReturnShipmentState shipmentState) {
        this.quantity = quantity;
        this.lineItemId = lineItemId;
        this.customLineItemId = customLineItemId;
        this.comment = comment;
        this.shipmentState = shipmentState;
    }

    public ReturnItemDraftImpl() {
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public String getComment() {
        return this.comment;
    }

    /**
    *  <p>Maps to <code>ReturnItem.shipmentState</code></p>
    */
    public com.commercetools.importapi.models.order_patches.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public void setQuantity(final Double quantity) {
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

    public void setShipmentState(
            final com.commercetools.importapi.models.order_patches.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReturnItemDraftImpl that = (ReturnItemDraftImpl) o;

        return new EqualsBuilder().append(quantity, that.quantity)
                .append(lineItemId, that.lineItemId)
                .append(customLineItemId, that.customLineItemId)
                .append(comment, that.comment)
                .append(shipmentState, that.shipmentState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(quantity)
                .append(lineItemId)
                .append(customLineItemId)
                .append(comment)
                .append(shipmentState)
                .toHashCode();
    }

}
