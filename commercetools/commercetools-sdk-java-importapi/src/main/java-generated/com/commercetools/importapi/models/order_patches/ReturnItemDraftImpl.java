
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
 * ReturnItemDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReturnItemDraftImpl implements ReturnItemDraft, ModelBase {

    private Long quantity;

    private String lineItemId;

    private String customLineItemId;

    private String comment;

    private com.commercetools.importapi.models.order_patches.ReturnShipmentState shipmentState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReturnItemDraftImpl(@JsonProperty("quantity") final Long quantity,
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

    /**
     * create empty instance
     */
    public ReturnItemDraftImpl() {
    }

    /**
     *
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *
     */

    public String getComment() {
        return this.comment;
    }

    /**
     *  <p>Maps to <code>ReturnItem.shipmentState</code></p>
     */

    public com.commercetools.importapi.models.order_patches.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
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
                .append(quantity, that.quantity)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("quantity", quantity)
                .append("lineItemId", lineItemId)
                .append("customLineItemId", customLineItemId)
                .append("comment", comment)
                .append("shipmentState", shipmentState)
                .build();
    }

    @Override
    public ReturnItemDraft copyDeep() {
        return ReturnItemDraft.deepCopy(this);
    }
}
