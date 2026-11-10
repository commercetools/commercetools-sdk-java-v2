
package com.commercetools.api.models.warning;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Contained in responses to a <span>Cart</span> operation. Indicates that the reservation for a Line Item could not be updated to the requested quantity. The existing reserved amount remains unchanged.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CannotUpdateReservationWarning cannotUpdateReservationWarning = CannotUpdateReservationWarning.builder()
 *             .message("{message}")
 *             .lineItemId("{lineItemId}")
 *             .requestedQuantity(0.3)
 *             .reservedQuantity(0.3)
 *             .productId("{productId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CannotUpdateReservation")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CannotUpdateReservationWarningImpl.class)
public interface CannotUpdateReservationWarning extends WarningObject {

    /**
     * discriminator value for CannotUpdateReservationWarning
     */
    String CANNOT_UPDATE_RESERVATION = "CannotUpdateReservation";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Failed to update the reservation for line item $lineItemId (Product ID: $productId, SKU: $sku, Supply Channel: $supplyChannel) to a quantity of $requestedQuantity. The reserved amount is still $reservedQuantity."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>The ID of the Line Item.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>The quantity that was requested for the Line Item.</p>
     * @return requestedQuantity
     */
    @NotNull
    @JsonProperty("requestedQuantity")
    public Double getRequestedQuantity();

    /**
     *  <p>The quantity that remains reserved for the Line Item.</p>
     * @return reservedQuantity
     */
    @NotNull
    @JsonProperty("reservedQuantity")
    public Double getReservedQuantity();

    /**
     *  <p>The ID of the Product associated with the Line Item.</p>
     * @return productId
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p>The SKU of the Product Variant associated with the Line Item.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The ID of the Supply Channel associated with the reservation.</p>
     * @return supplyChannel
     */

    @JsonProperty("supplyChannel")
    public String getSupplyChannel();

    /**
     *  <p><code>"Failed to update the reservation for line item $lineItemId (Product ID: $productId, SKU: $sku, Supply Channel: $supplyChannel) to a quantity of $requestedQuantity. The reserved amount is still $reservedQuantity."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>The ID of the Line Item.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>The quantity that was requested for the Line Item.</p>
     * @param requestedQuantity value to be set
     */

    public void setRequestedQuantity(final Double requestedQuantity);

    /**
     *  <p>The quantity that remains reserved for the Line Item.</p>
     * @param reservedQuantity value to be set
     */

    public void setReservedQuantity(final Double reservedQuantity);

    /**
     *  <p>The ID of the Product associated with the Line Item.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p>The SKU of the Product Variant associated with the Line Item.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>The ID of the Supply Channel associated with the reservation.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final String supplyChannel);

    /**
     * factory method
     * @return instance of CannotUpdateReservationWarning
     */
    public static CannotUpdateReservationWarning of() {
        return new CannotUpdateReservationWarningImpl();
    }

    /**
     * factory method to create a shallow copy CannotUpdateReservationWarning
     * @param template instance to be copied
     * @return copy instance
     */
    public static CannotUpdateReservationWarning of(final CannotUpdateReservationWarning template) {
        CannotUpdateReservationWarningImpl instance = new CannotUpdateReservationWarningImpl();
        instance.setMessage(template.getMessage());
        instance.setLineItemId(template.getLineItemId());
        instance.setRequestedQuantity(template.getRequestedQuantity());
        instance.setReservedQuantity(template.getReservedQuantity());
        instance.setProductId(template.getProductId());
        instance.setSku(template.getSku());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public CannotUpdateReservationWarning copyDeep();

    /**
     * factory method to create a deep copy of CannotUpdateReservationWarning
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CannotUpdateReservationWarning deepCopy(@Nullable final CannotUpdateReservationWarning template) {
        if (template == null) {
            return null;
        }
        CannotUpdateReservationWarningImpl instance = new CannotUpdateReservationWarningImpl();
        instance.setMessage(template.getMessage());
        instance.setLineItemId(template.getLineItemId());
        instance.setRequestedQuantity(template.getRequestedQuantity());
        instance.setReservedQuantity(template.getReservedQuantity());
        instance.setProductId(template.getProductId());
        instance.setSku(template.getSku());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    /**
     * builder factory method for CannotUpdateReservationWarning
     * @return builder
     */
    public static CannotUpdateReservationWarningBuilder builder() {
        return CannotUpdateReservationWarningBuilder.of();
    }

    /**
     * create builder for CannotUpdateReservationWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CannotUpdateReservationWarningBuilder builder(final CannotUpdateReservationWarning template) {
        return CannotUpdateReservationWarningBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCannotUpdateReservationWarning(Function<CannotUpdateReservationWarning, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CannotUpdateReservationWarning> typeReference() {
        return new tools.jackson.core.type.TypeReference<CannotUpdateReservationWarning>() {
            @Override
            public String toString() {
                return "TypeReference<CannotUpdateReservationWarning>";
            }
        };
    }
}
