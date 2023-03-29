
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetParcelMeasurementsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelMeasurementsAction orderSetParcelMeasurementsAction = OrderSetParcelMeasurementsAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetParcelMeasurementsActionImpl.class)
public interface OrderSetParcelMeasurementsAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetParcelMeasurementsAction
     */
    String SET_PARCEL_MEASUREMENTS = "setParcelMeasurements";

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *
     * @return measurements
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     * set parcelId
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     * set measurements
     * @param measurements value to be set
     */

    public void setMeasurements(final ParcelMeasurements measurements);

    /**
     * factory method
     * @return instance of OrderSetParcelMeasurementsAction
     */
    public static OrderSetParcelMeasurementsAction of() {
        return new OrderSetParcelMeasurementsActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetParcelMeasurementsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetParcelMeasurementsAction of(final OrderSetParcelMeasurementsAction template) {
        OrderSetParcelMeasurementsActionImpl instance = new OrderSetParcelMeasurementsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(template.getMeasurements());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetParcelMeasurementsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetParcelMeasurementsAction deepCopy(@Nullable final OrderSetParcelMeasurementsAction template) {
        if (template == null) {
            return null;
        }
        OrderSetParcelMeasurementsActionImpl instance = new OrderSetParcelMeasurementsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(
            com.commercetools.api.models.order.ParcelMeasurements.deepCopy(template.getMeasurements()));
        return instance;
    }

    /**
     * builder factory method for OrderSetParcelMeasurementsAction
     * @return builder
     */
    public static OrderSetParcelMeasurementsActionBuilder builder() {
        return OrderSetParcelMeasurementsActionBuilder.of();
    }

    /**
     * create builder for OrderSetParcelMeasurementsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetParcelMeasurementsActionBuilder builder(final OrderSetParcelMeasurementsAction template) {
        return OrderSetParcelMeasurementsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetParcelMeasurementsAction(Function<OrderSetParcelMeasurementsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelMeasurementsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelMeasurementsAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetParcelMeasurementsAction>";
            }
        };
    }
}
