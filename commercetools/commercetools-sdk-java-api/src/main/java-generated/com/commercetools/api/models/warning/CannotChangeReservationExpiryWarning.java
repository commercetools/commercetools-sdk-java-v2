
package com.commercetools.api.models.warning;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Contained in responses to a <span>Cart</span> update operation. Indicates that a <code>ReserveOnCart</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a> was found for a Line Item but its expiration date and time cannot be changed using the <span>Set Reservation Expiration In Minutes</span> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CannotChangeReservationExpiryWarning cannotChangeReservationExpiryWarning = CannotChangeReservationExpiryWarning.builder()
 *             .message("{message}")
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CannotChangeReservationExpiry")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CannotChangeReservationExpiryWarningImpl.class)
public interface CannotChangeReservationExpiryWarning extends WarningObject {

    /**
     * discriminator value for CannotChangeReservationExpiryWarning
     */
    String CANNOT_CHANGE_RESERVATION_EXPIRY = "CannotChangeReservationExpiry";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The reservation expiration for line item $lineItemId cannot be changed."</code></p>
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
     *  <p><code>"The reservation expiration for line item $lineItemId cannot be changed."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>The ID of the Line Item.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     * factory method
     * @return instance of CannotChangeReservationExpiryWarning
     */
    public static CannotChangeReservationExpiryWarning of() {
        return new CannotChangeReservationExpiryWarningImpl();
    }

    /**
     * factory method to create a shallow copy CannotChangeReservationExpiryWarning
     * @param template instance to be copied
     * @return copy instance
     */
    public static CannotChangeReservationExpiryWarning of(final CannotChangeReservationExpiryWarning template) {
        CannotChangeReservationExpiryWarningImpl instance = new CannotChangeReservationExpiryWarningImpl();
        instance.setMessage(template.getMessage());
        instance.setLineItemId(template.getLineItemId());
        return instance;
    }

    public CannotChangeReservationExpiryWarning copyDeep();

    /**
     * factory method to create a deep copy of CannotChangeReservationExpiryWarning
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CannotChangeReservationExpiryWarning deepCopy(
            @Nullable final CannotChangeReservationExpiryWarning template) {
        if (template == null) {
            return null;
        }
        CannotChangeReservationExpiryWarningImpl instance = new CannotChangeReservationExpiryWarningImpl();
        instance.setMessage(template.getMessage());
        instance.setLineItemId(template.getLineItemId());
        return instance;
    }

    /**
     * builder factory method for CannotChangeReservationExpiryWarning
     * @return builder
     */
    public static CannotChangeReservationExpiryWarningBuilder builder() {
        return CannotChangeReservationExpiryWarningBuilder.of();
    }

    /**
     * create builder for CannotChangeReservationExpiryWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CannotChangeReservationExpiryWarningBuilder builder(
            final CannotChangeReservationExpiryWarning template) {
        return CannotChangeReservationExpiryWarningBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCannotChangeReservationExpiryWarning(Function<CannotChangeReservationExpiryWarning, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CannotChangeReservationExpiryWarning> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CannotChangeReservationExpiryWarning>() {
            @Override
            public String toString() {
                return "TypeReference<CannotChangeReservationExpiryWarning>";
            }
        };
    }
}
