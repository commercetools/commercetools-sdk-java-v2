
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddParcelToDeliveryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddParcelToDeliveryAction stagedOrderAddParcelToDeliveryAction = StagedOrderAddParcelToDeliveryAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddParcelToDeliveryActionImpl.class)
public interface StagedOrderAddParcelToDeliveryAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderAddParcelToDeliveryAction
     */
    String ADD_PARCEL_TO_DELIVERY = "addParcelToDelivery";

    /**
     *
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *
     * @return measurements
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     *
     * @return trackingData
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     *
     * @return items
     */
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     * set deliveryId
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     * set measurements
     * @param measurements value to be set
     */

    public void setMeasurements(final ParcelMeasurements measurements);

    /**
     * set trackingData
     * @param trackingData value to be set
     */

    public void setTrackingData(final TrackingData trackingData);

    /**
     * set items
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     * set items
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     * factory method
     * @return instance of StagedOrderAddParcelToDeliveryAction
     */
    public static StagedOrderAddParcelToDeliveryAction of() {
        return new StagedOrderAddParcelToDeliveryActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderAddParcelToDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderAddParcelToDeliveryAction of(final StagedOrderAddParcelToDeliveryAction template) {
        StagedOrderAddParcelToDeliveryActionImpl instance = new StagedOrderAddParcelToDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        return instance;
    }

    /**
     * builder factory method for StagedOrderAddParcelToDeliveryAction
     * @return builder
     */
    public static StagedOrderAddParcelToDeliveryActionBuilder builder() {
        return StagedOrderAddParcelToDeliveryActionBuilder.of();
    }

    /**
     * create builder for StagedOrderAddParcelToDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddParcelToDeliveryActionBuilder builder(
            final StagedOrderAddParcelToDeliveryAction template) {
        return StagedOrderAddParcelToDeliveryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderAddParcelToDeliveryAction(Function<StagedOrderAddParcelToDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddParcelToDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddParcelToDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddParcelToDeliveryAction>";
            }
        };
    }
}
