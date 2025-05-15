
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Produces the ParcelMeasurementsUpdated Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelMeasurementsAction orderSetParcelMeasurementsAction = OrderSetParcelMeasurementsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setParcelMeasurements")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetParcelMeasurementsActionImpl.class)
public interface OrderSetParcelMeasurementsAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetParcelMeasurementsAction
     */
    String SET_PARCEL_MEASUREMENTS = "setParcelMeasurements";

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelId
     */

    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @return parcelKey
     */

    @JsonProperty("parcelKey")
    public String getParcelKey();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return measurements
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     * @param parcelKey value to be set
     */

    public void setParcelKey(final String parcelKey);

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
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
        instance.setParcelKey(template.getParcelKey());
        instance.setMeasurements(template.getMeasurements());
        return instance;
    }

    public OrderSetParcelMeasurementsAction copyDeep();

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
        instance.setParcelKey(template.getParcelKey());
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
