
package com.commercetools.api.models.cart;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Estimated time window during which a shipment is expected to be delivered. The window is anchored to the selected Shipping Method and the shipping destination.</p>
 *
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
@JsonDeserialize(as = EstimatedDeliveryImpl.class)
public interface EstimatedDelivery {

    /**
     *  <p>Date and time (UTC) of the earliest expected delivery.</p>
     * @return from
     */

    @JsonProperty("from")
    public ZonedDateTime getFrom();

    /**
     *  <p>Date and time (UTC) of the latest expected delivery. When both <code>from</code> and <code>until</code> are set, <code>until</code> must be equal to or later than <code>from</code>.</p>
     * @return until
     */

    @JsonProperty("until")
    public ZonedDateTime getUntil();

    /**
     *  <p>Date and time (UTC) of the earliest expected delivery.</p>
     * @param from value to be set
     */

    public void setFrom(final ZonedDateTime from);

    /**
     *  <p>Date and time (UTC) of the latest expected delivery. When both <code>from</code> and <code>until</code> are set, <code>until</code> must be equal to or later than <code>from</code>.</p>
     * @param until value to be set
     */

    public void setUntil(final ZonedDateTime until);

    /**
     * factory method
     * @return instance of EstimatedDelivery
     */
    public static EstimatedDelivery of() {
        return new EstimatedDeliveryImpl();
    }

    /**
     * factory method to create a shallow copy EstimatedDelivery
     * @param template instance to be copied
     * @return copy instance
     */
    public static EstimatedDelivery of(final EstimatedDelivery template) {
        EstimatedDeliveryImpl instance = new EstimatedDeliveryImpl();
        instance.setFrom(template.getFrom());
        instance.setUntil(template.getUntil());
        return instance;
    }

    public EstimatedDelivery copyDeep();

    /**
     * factory method to create a deep copy of EstimatedDelivery
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static EstimatedDelivery deepCopy(@Nullable final EstimatedDelivery template) {
        if (template == null) {
            return null;
        }
        EstimatedDeliveryImpl instance = new EstimatedDeliveryImpl();
        instance.setFrom(template.getFrom());
        instance.setUntil(template.getUntil());
        return instance;
    }

    /**
     * builder factory method for EstimatedDelivery
     * @return builder
     */
    public static EstimatedDeliveryBuilder builder() {
        return EstimatedDeliveryBuilder.of();
    }

    /**
     * create builder for EstimatedDelivery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static EstimatedDeliveryBuilder builder(final EstimatedDelivery template) {
        return EstimatedDeliveryBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withEstimatedDelivery(Function<EstimatedDelivery, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<EstimatedDelivery> typeReference() {
        return new tools.jackson.core.type.TypeReference<EstimatedDelivery>() {
            @Override
            public String toString() {
                return "TypeReference<EstimatedDelivery>";
            }
        };
    }
}
