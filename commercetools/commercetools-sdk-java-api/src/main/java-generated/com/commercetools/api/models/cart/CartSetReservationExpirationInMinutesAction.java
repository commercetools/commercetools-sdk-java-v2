
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Sets a new expiration date and time for all <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> Line Items with a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a>. The Cart will return a <a href="https://docs.commercetools.com/apis/ctp:api:type:WarningObject" rel="nofollow">warning</a> for any Reservation that could not be changed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetReservationExpirationInMinutesAction cartSetReservationExpirationInMinutesAction = CartSetReservationExpirationInMinutesAction.builder()
 *             .reservationExpirationInMinutes(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setReservationExpirationInMinutes")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetReservationExpirationInMinutesActionImpl.class)
public interface CartSetReservationExpirationInMinutesAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetReservationExpirationInMinutesAction
     */
    String SET_RESERVATION_EXPIRATION_IN_MINUTES = "setReservationExpirationInMinutes";

    /**
     *  <p>Value to set. Must be a positive integer.</p>
     * @return reservationExpirationInMinutes
     */
    @NotNull
    @JsonProperty("reservationExpirationInMinutes")
    public Integer getReservationExpirationInMinutes();

    /**
     *  <p>Value to set. Must be a positive integer.</p>
     * @param reservationExpirationInMinutes value to be set
     */

    public void setReservationExpirationInMinutes(final Integer reservationExpirationInMinutes);

    /**
     * factory method
     * @return instance of CartSetReservationExpirationInMinutesAction
     */
    public static CartSetReservationExpirationInMinutesAction of() {
        return new CartSetReservationExpirationInMinutesActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetReservationExpirationInMinutesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetReservationExpirationInMinutesAction of(
            final CartSetReservationExpirationInMinutesAction template) {
        CartSetReservationExpirationInMinutesActionImpl instance = new CartSetReservationExpirationInMinutesActionImpl();
        instance.setReservationExpirationInMinutes(template.getReservationExpirationInMinutes());
        return instance;
    }

    public CartSetReservationExpirationInMinutesAction copyDeep();

    /**
     * factory method to create a deep copy of CartSetReservationExpirationInMinutesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetReservationExpirationInMinutesAction deepCopy(
            @Nullable final CartSetReservationExpirationInMinutesAction template) {
        if (template == null) {
            return null;
        }
        CartSetReservationExpirationInMinutesActionImpl instance = new CartSetReservationExpirationInMinutesActionImpl();
        instance.setReservationExpirationInMinutes(template.getReservationExpirationInMinutes());
        return instance;
    }

    /**
     * builder factory method for CartSetReservationExpirationInMinutesAction
     * @return builder
     */
    public static CartSetReservationExpirationInMinutesActionBuilder builder() {
        return CartSetReservationExpirationInMinutesActionBuilder.of();
    }

    /**
     * create builder for CartSetReservationExpirationInMinutesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetReservationExpirationInMinutesActionBuilder builder(
            final CartSetReservationExpirationInMinutesAction template) {
        return CartSetReservationExpirationInMinutesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetReservationExpirationInMinutesAction(
            Function<CartSetReservationExpirationInMinutesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetReservationExpirationInMinutesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetReservationExpirationInMinutesAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetReservationExpirationInMinutesAction>";
            }
        };
    }
}
