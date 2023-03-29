
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
 * OrderSetParcelTrackingDataAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetParcelTrackingDataAction orderSetParcelTrackingDataAction = OrderSetParcelTrackingDataAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetParcelTrackingDataActionImpl.class)
public interface OrderSetParcelTrackingDataAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetParcelTrackingDataAction
     */
    String SET_PARCEL_TRACKING_DATA = "setParcelTrackingData";

    /**
     *
     * @return parcelId
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *
     * @return trackingData
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     * set parcelId
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     * set trackingData
     * @param trackingData value to be set
     */

    public void setTrackingData(final TrackingData trackingData);

    /**
     * factory method
     * @return instance of OrderSetParcelTrackingDataAction
     */
    public static OrderSetParcelTrackingDataAction of() {
        return new OrderSetParcelTrackingDataActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderSetParcelTrackingDataAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetParcelTrackingDataAction of(final OrderSetParcelTrackingDataAction template) {
        OrderSetParcelTrackingDataActionImpl instance = new OrderSetParcelTrackingDataActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(template.getTrackingData());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderSetParcelTrackingDataAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetParcelTrackingDataAction deepCopy(@Nullable final OrderSetParcelTrackingDataAction template) {
        if (template == null) {
            return null;
        }
        OrderSetParcelTrackingDataActionImpl instance = new OrderSetParcelTrackingDataActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(Optional.ofNullable(template.getTrackingData())
                .map(com.commercetools.api.models.order.TrackingData::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for OrderSetParcelTrackingDataAction
     * @return builder
     */
    public static OrderSetParcelTrackingDataActionBuilder builder() {
        return OrderSetParcelTrackingDataActionBuilder.of();
    }

    /**
     * create builder for OrderSetParcelTrackingDataAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetParcelTrackingDataActionBuilder builder(final OrderSetParcelTrackingDataAction template) {
        return OrderSetParcelTrackingDataActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetParcelTrackingDataAction(Function<OrderSetParcelTrackingDataAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelTrackingDataAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetParcelTrackingDataAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetParcelTrackingDataAction>";
            }
        };
    }
}
