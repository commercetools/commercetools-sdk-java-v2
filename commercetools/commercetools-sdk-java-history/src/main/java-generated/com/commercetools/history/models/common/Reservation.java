
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Reservation
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Reservation reservation = Reservation.builder()
 *             .quantity(1)
 *             .owner(ownerBuilder -> ownerBuilder)
 *             .createdAt("{createdAt}")
 *             .checkoutStartedAt("{checkoutStartedAt}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReservationImpl.class)
public interface Reservation {

    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    /**
     *
     * @return owner
     */
    @NotNull
    @Valid
    @JsonProperty("owner")
    public Reference getOwner();

    /**
     *
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public String getCreatedAt();

    /**
     *
     * @return checkoutStartedAt
     */
    @NotNull
    @JsonProperty("checkoutStartedAt")
    public String getCheckoutStartedAt();

    /**
     * set quantity
     * @param quantity value to be set
     */

    public void setQuantity(final Integer quantity);

    /**
     * set owner
     * @param owner value to be set
     */

    public void setOwner(final Reference owner);

    /**
     * set createdAt
     * @param createdAt value to be set
     */

    public void setCreatedAt(final String createdAt);

    /**
     * set checkoutStartedAt
     * @param checkoutStartedAt value to be set
     */

    public void setCheckoutStartedAt(final String checkoutStartedAt);

    /**
     * factory method
     * @return instance of Reservation
     */
    public static Reservation of() {
        return new ReservationImpl();
    }

    /**
     * factory method to copy an instance of Reservation
     * @param template instance to be copied
     * @return copy instance
     */
    public static Reservation of(final Reservation template) {
        ReservationImpl instance = new ReservationImpl();
        instance.setQuantity(template.getQuantity());
        instance.setOwner(template.getOwner());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setCheckoutStartedAt(template.getCheckoutStartedAt());
        return instance;
    }

    /**
     * builder factory method for Reservation
     * @return builder
     */
    public static ReservationBuilder builder() {
        return ReservationBuilder.of();
    }

    /**
     * create builder for Reservation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReservationBuilder builder(final Reservation template) {
        return ReservationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReservation(Function<Reservation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Reservation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Reservation>() {
            @Override
            public String toString() {
                return "TypeReference<Reservation>";
            }
        };
    }
}
