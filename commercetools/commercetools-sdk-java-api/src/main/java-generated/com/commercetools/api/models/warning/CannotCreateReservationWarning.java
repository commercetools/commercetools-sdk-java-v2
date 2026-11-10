
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
 *  <p>Contained in responses to a <span>Cart</span> operation. Indicates that a reservation could not be created for the specified Product.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CannotCreateReservationWarning cannotCreateReservationWarning = CannotCreateReservationWarning.builder()
 *             .message("{message}")
 *             .productId("{productId}")
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CannotCreateReservation")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CannotCreateReservationWarningImpl.class)
public interface CannotCreateReservationWarning extends WarningObject {

    /**
     * discriminator value for CannotCreateReservationWarning
     */
    String CANNOT_CREATE_RESERVATION = "CannotCreateReservation";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Failed to create a reservation for product $productId (SKU: $sku, Supply Channel: $supplyChannel) with quantity $quantity."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>The ID of the Product for which the reservation could not be created.</p>
     * @return productId
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p>The SKU of the Product Variant for which the reservation could not be created.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The ID of the Supply Channel for which the reservation could not be created.</p>
     * @return supplyChannel
     */

    @JsonProperty("supplyChannel")
    public String getSupplyChannel();

    /**
     *  <p>The quantity for which the reservation could not be created.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Double getQuantity();

    /**
     *  <p><code>"Failed to create a reservation for product $productId (SKU: $sku, Supply Channel: $supplyChannel) with quantity $quantity."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>The ID of the Product for which the reservation could not be created.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p>The SKU of the Product Variant for which the reservation could not be created.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>The ID of the Supply Channel for which the reservation could not be created.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final String supplyChannel);

    /**
     *  <p>The quantity for which the reservation could not be created.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Double quantity);

    /**
     * factory method
     * @return instance of CannotCreateReservationWarning
     */
    public static CannotCreateReservationWarning of() {
        return new CannotCreateReservationWarningImpl();
    }

    /**
     * factory method to create a shallow copy CannotCreateReservationWarning
     * @param template instance to be copied
     * @return copy instance
     */
    public static CannotCreateReservationWarning of(final CannotCreateReservationWarning template) {
        CannotCreateReservationWarningImpl instance = new CannotCreateReservationWarningImpl();
        instance.setMessage(template.getMessage());
        instance.setProductId(template.getProductId());
        instance.setSku(template.getSku());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public CannotCreateReservationWarning copyDeep();

    /**
     * factory method to create a deep copy of CannotCreateReservationWarning
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CannotCreateReservationWarning deepCopy(@Nullable final CannotCreateReservationWarning template) {
        if (template == null) {
            return null;
        }
        CannotCreateReservationWarningImpl instance = new CannotCreateReservationWarningImpl();
        instance.setMessage(template.getMessage());
        instance.setProductId(template.getProductId());
        instance.setSku(template.getSku());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for CannotCreateReservationWarning
     * @return builder
     */
    public static CannotCreateReservationWarningBuilder builder() {
        return CannotCreateReservationWarningBuilder.of();
    }

    /**
     * create builder for CannotCreateReservationWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CannotCreateReservationWarningBuilder builder(final CannotCreateReservationWarning template) {
        return CannotCreateReservationWarningBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCannotCreateReservationWarning(Function<CannotCreateReservationWarning, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CannotCreateReservationWarning> typeReference() {
        return new tools.jackson.core.type.TypeReference<CannotCreateReservationWarning>() {
            @Override
            public String toString() {
                return "TypeReference<CannotCreateReservationWarning>";
            }
        };
    }
}
