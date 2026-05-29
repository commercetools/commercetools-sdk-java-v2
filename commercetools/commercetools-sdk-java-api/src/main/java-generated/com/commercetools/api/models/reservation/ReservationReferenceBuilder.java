
package com.commercetools.api.models.reservation;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReservationReferenceBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReservationReferenceBuilder implements Builder<ReservationReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.reservation.Reservation obj;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public ReservationReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Reservation. Only present in responses to requests with <span>Reference Expansion</span> for Reservations.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public ReservationReferenceBuilder obj(
            Function<com.commercetools.api.models.reservation.ReservationBuilder, com.commercetools.api.models.reservation.ReservationBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.reservation.ReservationBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Reservation. Only present in responses to requests with <span>Reference Expansion</span> for Reservations.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public ReservationReferenceBuilder withObj(
            Function<com.commercetools.api.models.reservation.ReservationBuilder, com.commercetools.api.models.reservation.Reservation> builder) {
        this.obj = builder.apply(com.commercetools.api.models.reservation.ReservationBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Reservation. Only present in responses to requests with <span>Reference Expansion</span> for Reservations.</p>
     * @param obj value to be set
     * @return Builder
     */

    public ReservationReferenceBuilder obj(@Nullable final com.commercetools.api.models.reservation.Reservation obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded Reservation. Only present in responses to requests with <span>Reference Expansion</span> for Reservations.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.reservation.Reservation getObj() {
        return this.obj;
    }

    /**
     * builds ReservationReference with checking for non-null required values
     * @return ReservationReference
     */
    public ReservationReference build() {
        Objects.requireNonNull(id, ReservationReference.class + ": id is missing");
        return new ReservationReferenceImpl(id, obj);
    }

    /**
     * builds ReservationReference without checking for non-null required values
     * @return ReservationReference
     */
    public ReservationReference buildUnchecked() {
        return new ReservationReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of ReservationReferenceBuilder
     * @return builder
     */
    public static ReservationReferenceBuilder of() {
        return new ReservationReferenceBuilder();
    }

    /**
     * create builder for ReservationReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReservationReferenceBuilder of(final ReservationReference template) {
        ReservationReferenceBuilder builder = new ReservationReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
