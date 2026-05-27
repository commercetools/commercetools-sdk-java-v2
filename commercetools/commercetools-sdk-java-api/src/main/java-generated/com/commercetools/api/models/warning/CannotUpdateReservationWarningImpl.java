
package com.commercetools.api.models.warning;

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
 *  <p>Contained in responses to a <span>Cart</span> operation. Indicates that the reservation for a Line Item could not be updated to the requested quantity. The existing reserved amount remains unchanged.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CannotUpdateReservationWarningImpl implements CannotUpdateReservationWarning, ModelBase {

    private String code;

    private String message;

    private String lineItemId;

    private Double requestedQuantity;

    private Double reservedQuantity;

    private String productId;

    private String sku;

    private String supplyChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CannotUpdateReservationWarningImpl(@JsonProperty("message") final String message,
            @JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("requestedQuantity") final Double requestedQuantity,
            @JsonProperty("reservedQuantity") final Double reservedQuantity,
            @JsonProperty("productId") final String productId, @JsonProperty("sku") final String sku,
            @JsonProperty("supplyChannel") final String supplyChannel) {
        this.message = message;
        this.lineItemId = lineItemId;
        this.requestedQuantity = requestedQuantity;
        this.reservedQuantity = reservedQuantity;
        this.productId = productId;
        this.sku = sku;
        this.supplyChannel = supplyChannel;
        this.code = CANNOT_UPDATE_RESERVATION;
    }

    /**
     * create empty instance
     */
    public CannotUpdateReservationWarningImpl() {
        this.code = CANNOT_UPDATE_RESERVATION;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Failed to update the reservation for line item $lineItemId (Product ID: $productId, SKU: $sku, Supply Channel: $supplyChannel) to a quantity of $requestedQuantity. The reserved amount is still $reservedQuantity."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The ID of the Line Item.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>The quantity that was requested for the Line Item.</p>
     */

    public Double getRequestedQuantity() {
        return this.requestedQuantity;
    }

    /**
     *  <p>The quantity that remains reserved for the Line Item.</p>
     */

    public Double getReservedQuantity() {
        return this.reservedQuantity;
    }

    /**
     *  <p>The ID of the Product associated with the Line Item.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>The SKU of the Product Variant associated with the Line Item.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The ID of the Supply Channel associated with the reservation.</p>
     */

    public String getSupplyChannel() {
        return this.supplyChannel;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setRequestedQuantity(final Double requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public void setReservedQuantity(final Double reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setSupplyChannel(final String supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CannotUpdateReservationWarningImpl that = (CannotUpdateReservationWarningImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(lineItemId, that.lineItemId)
                .append(requestedQuantity, that.requestedQuantity)
                .append(reservedQuantity, that.reservedQuantity)
                .append(productId, that.productId)
                .append(sku, that.sku)
                .append(supplyChannel, that.supplyChannel)
                .append(code, that.code)
                .append(message, that.message)
                .append(lineItemId, that.lineItemId)
                .append(requestedQuantity, that.requestedQuantity)
                .append(reservedQuantity, that.reservedQuantity)
                .append(productId, that.productId)
                .append(sku, that.sku)
                .append(supplyChannel, that.supplyChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(lineItemId)
                .append(requestedQuantity)
                .append(reservedQuantity)
                .append(productId)
                .append(sku)
                .append(supplyChannel)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("lineItemId", lineItemId)
                .append("requestedQuantity", requestedQuantity)
                .append("reservedQuantity", reservedQuantity)
                .append("productId", productId)
                .append("sku", sku)
                .append("supplyChannel", supplyChannel)
                .build();
    }

    @Override
    public CannotUpdateReservationWarning copyDeep() {
        return CannotUpdateReservationWarning.deepCopy(this);
    }
}
