
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ReturnItem
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReturnItemImpl implements ReturnItem, ModelBase {

    private String id;

    private String key;

    private Long quantity;

    private String type;

    private String comment;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    private com.commercetools.api.models.type.CustomFields custom;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime createdAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReturnItemImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("quantity") final Long quantity, @JsonProperty("type") final String type,
            @JsonProperty("comment") final String comment,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ReturnShipmentState shipmentState,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.ReturnPaymentState paymentState,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt) {
        this.id = id;
        this.key = key;
        this.quantity = quantity;
        this.type = type;
        this.comment = comment;
        this.shipmentState = shipmentState;
        this.paymentState = paymentState;
        this.custom = custom;
        this.lastModifiedAt = lastModifiedAt;
        this.createdAt = createdAt;
    }

    /**
     * create empty instance
     */
    public ReturnItemImpl() {
    }

    /**
     *  <p>Unique identifier of the Return Item.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Return Item.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Number of Line Items or Custom Line Items returned.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>User-defined description for the return.</p>
     */

    public String getComment() {
        return this.comment;
    }

    /**
     *  <p>Shipment status of the Return Item.</p>
     */

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Payment status of the Return Item:</p>
     *  <ul>
     *   <li><code>NonRefundable</code>, for items in the <code>Advised</code> ReturnShipmentState</li>
     *   <li><code>Initial</code>, for items in the <code>Returned</code> ReturnShipmentState</li>
     *  </ul>
     */

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Custom Fields of the Return Item.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Date and time (UTC) the Return Item was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Date and time (UTC) the Return Item was intitially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setPaymentState(final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReturnItemImpl that = (ReturnItemImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(quantity, that.quantity)
                .append(type, that.type)
                .append(comment, that.comment)
                .append(shipmentState, that.shipmentState)
                .append(paymentState, that.paymentState)
                .append(custom, that.custom)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(createdAt, that.createdAt)
                .append(id, that.id)
                .append(key, that.key)
                .append(quantity, that.quantity)
                .append(type, that.type)
                .append(comment, that.comment)
                .append(shipmentState, that.shipmentState)
                .append(paymentState, that.paymentState)
                .append(custom, that.custom)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(createdAt, that.createdAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(key)
                .append(quantity)
                .append(type)
                .append(comment)
                .append(shipmentState)
                .append(paymentState)
                .append(custom)
                .append(lastModifiedAt)
                .append(createdAt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("key", key)
                .append("quantity", quantity)
                .append("type", type)
                .append("comment", comment)
                .append("shipmentState", shipmentState)
                .append("paymentState", paymentState)
                .append("custom", custom)
                .append("lastModifiedAt", lastModifiedAt)
                .append("createdAt", createdAt)
                .build();
    }

    @Override
    public ReturnItem copyDeep() {
        return ReturnItem.deepCopy(this);
    }
}
