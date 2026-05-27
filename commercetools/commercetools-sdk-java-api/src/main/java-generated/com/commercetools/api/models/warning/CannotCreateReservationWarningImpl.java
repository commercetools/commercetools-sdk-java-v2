
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
 *  <p>Contained in responses to a <span>Cart</span> operation. Indicates that a reservation could not be created for the specified Product.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CannotCreateReservationWarningImpl implements CannotCreateReservationWarning, ModelBase {

    private String code;

    private String message;

    private String productId;

    private String sku;

    private String supplyChannel;

    private Double quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CannotCreateReservationWarningImpl(@JsonProperty("message") final String message,
            @JsonProperty("productId") final String productId, @JsonProperty("sku") final String sku,
            @JsonProperty("supplyChannel") final String supplyChannel,
            @JsonProperty("quantity") final Double quantity) {
        this.message = message;
        this.productId = productId;
        this.sku = sku;
        this.supplyChannel = supplyChannel;
        this.quantity = quantity;
        this.code = CANNOT_CREATE_RESERVATION;
    }

    /**
     * create empty instance
     */
    public CannotCreateReservationWarningImpl() {
        this.code = CANNOT_CREATE_RESERVATION;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Failed to create a reservation for product $productId (SKU: $sku, Supply Channel: $supplyChannel) with quantity $quantity."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The ID of the Product for which the reservation could not be created.</p>
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *  <p>The SKU of the Product Variant for which the reservation could not be created.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The ID of the Supply Channel for which the reservation could not be created.</p>
     */

    public String getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     *  <p>The quantity for which the reservation could not be created.</p>
     */

    public Double getQuantity() {
        return this.quantity;
    }

    public void setMessage(final String message) {
        this.message = message;
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

    public void setQuantity(final Double quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CannotCreateReservationWarningImpl that = (CannotCreateReservationWarningImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(productId, that.productId)
                .append(sku, that.sku)
                .append(supplyChannel, that.supplyChannel)
                .append(quantity, that.quantity)
                .append(code, that.code)
                .append(message, that.message)
                .append(productId, that.productId)
                .append(sku, that.sku)
                .append(supplyChannel, that.supplyChannel)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(productId)
                .append(sku)
                .append(supplyChannel)
                .append(quantity)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("productId", productId)
                .append("sku", sku)
                .append("supplyChannel", supplyChannel)
                .append("quantity", quantity)
                .build();
    }

    @Override
    public CannotCreateReservationWarning copyDeep() {
        return CannotCreateReservationWarning.deepCopy(this);
    }
}
