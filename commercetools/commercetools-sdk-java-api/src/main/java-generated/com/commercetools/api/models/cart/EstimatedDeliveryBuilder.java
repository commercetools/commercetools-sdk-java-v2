
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * EstimatedDeliveryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     EstimatedDelivery estimatedDelivery = EstimatedDelivery.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EstimatedDeliveryBuilder implements Builder<EstimatedDelivery> {

    @Nullable
    private java.time.ZonedDateTime from;

    @Nullable
    private java.time.ZonedDateTime until;

    /**
     *  <p>Date and time (UTC) of the earliest expected delivery.</p>
     * @param from value to be set
     * @return Builder
     */

    public EstimatedDeliveryBuilder from(@Nullable final java.time.ZonedDateTime from) {
        this.from = from;
        return this;
    }

    /**
     *  <p>Date and time (UTC) of the latest expected delivery. When both <code>from</code> and <code>until</code> are set, <code>until</code> must be equal to or later than <code>from</code>.</p>
     * @param until value to be set
     * @return Builder
     */

    public EstimatedDeliveryBuilder until(@Nullable final java.time.ZonedDateTime until) {
        this.until = until;
        return this;
    }

    /**
     *  <p>Date and time (UTC) of the earliest expected delivery.</p>
     * @return from
     */

    @Nullable
    public java.time.ZonedDateTime getFrom() {
        return this.from;
    }

    /**
     *  <p>Date and time (UTC) of the latest expected delivery. When both <code>from</code> and <code>until</code> are set, <code>until</code> must be equal to or later than <code>from</code>.</p>
     * @return until
     */

    @Nullable
    public java.time.ZonedDateTime getUntil() {
        return this.until;
    }

    /**
     * builds EstimatedDelivery with checking for non-null required values
     * @return EstimatedDelivery
     */
    public EstimatedDelivery build() {
        return new EstimatedDeliveryImpl(from, until);
    }

    /**
     * builds EstimatedDelivery without checking for non-null required values
     * @return EstimatedDelivery
     */
    public EstimatedDelivery buildUnchecked() {
        return new EstimatedDeliveryImpl(from, until);
    }

    /**
     * factory method for an instance of EstimatedDeliveryBuilder
     * @return builder
     */
    public static EstimatedDeliveryBuilder of() {
        return new EstimatedDeliveryBuilder();
    }

    /**
     * create builder for EstimatedDelivery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EstimatedDeliveryBuilder of(final EstimatedDelivery template) {
        EstimatedDeliveryBuilder builder = new EstimatedDeliveryBuilder();
        builder.from = template.getFrom();
        builder.until = template.getUntil();
        return builder;
    }

}
