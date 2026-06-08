
package com.commercetools.api.models.reservation;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReservationReference reservationReference = ReservationReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("reservation")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReservationReferenceImpl.class)
public interface ReservationReference extends Reference {

    /**
     * discriminator value for ReservationReference
     */
    String RESERVATION = "reservation";

    /**
     *
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *  <p>Contains the representation of the expanded Reservation. Only present in responses to requests with <span>Reference Expansion</span> for Reservations.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Reservation getObj();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded Reservation. Only present in responses to requests with <span>Reference Expansion</span> for Reservations.</p>
     * @param obj value to be set
     */

    public void setObj(final Reservation obj);

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of ReservationReference
     */
    public static ReservationReference of() {
        return new ReservationReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ReservationReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReservationReference of(final ReservationReference template) {
        ReservationReferenceImpl instance = new ReservationReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public ReservationReference copyDeep();

    /**
     * factory method to create a deep copy of ReservationReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReservationReference deepCopy(@Nullable final ReservationReference template) {
        if (template == null) {
            return null;
        }
        ReservationReferenceImpl instance = new ReservationReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.reservation.Reservation.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for ReservationReference
     * @return builder
     */
    public static ReservationReferenceBuilder builder() {
        return ReservationReferenceBuilder.of();
    }

    /**
     * create builder for ReservationReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReservationReferenceBuilder builder(final ReservationReference template) {
        return ReservationReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReservationReference(Function<ReservationReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReservationReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReservationReference>() {
            @Override
            public String toString() {
                return "TypeReference<ReservationReference>";
            }
        };
    }
}
