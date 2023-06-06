
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetParcelTrackingDataAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetParcelTrackingDataAction stagedOrderSetParcelTrackingDataAction = StagedOrderSetParcelTrackingDataAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetParcelTrackingDataActionImpl.class)
public interface StagedOrderSetParcelTrackingDataAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetParcelTrackingDataAction
     */
    String SET_PARCEL_TRACKING_DATA = "setParcelTrackingData";

    /**
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> is required for this update action.</p>
     * @return parcelId
     */

    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> is required for this update action.</p>
     * @return parcelKey
     */

    @JsonProperty("parcelKey")
    public String getParcelKey();

    /**
     *
     * @return trackingData
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> is required for this update action.</p>
     * @param parcelId value to be set
     */

    public void setParcelId(final String parcelId);

    /**
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> is required for this update action.</p>
     * @param parcelKey value to be set
     */

    public void setParcelKey(final String parcelKey);

    /**
     * set trackingData
     * @param trackingData value to be set
     */

    public void setTrackingData(final TrackingData trackingData);

    /**
     * factory method
     * @return instance of StagedOrderSetParcelTrackingDataAction
     */
    public static StagedOrderSetParcelTrackingDataAction of() {
        return new StagedOrderSetParcelTrackingDataActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetParcelTrackingDataAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetParcelTrackingDataAction of(final StagedOrderSetParcelTrackingDataAction template) {
        StagedOrderSetParcelTrackingDataActionImpl instance = new StagedOrderSetParcelTrackingDataActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setParcelKey(template.getParcelKey());
        instance.setTrackingData(template.getTrackingData());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetParcelTrackingDataAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetParcelTrackingDataAction deepCopy(
            @Nullable final StagedOrderSetParcelTrackingDataAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetParcelTrackingDataActionImpl instance = new StagedOrderSetParcelTrackingDataActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setParcelKey(template.getParcelKey());
        instance.setTrackingData(com.commercetools.api.models.order.TrackingData.deepCopy(template.getTrackingData()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetParcelTrackingDataAction
     * @return builder
     */
    public static StagedOrderSetParcelTrackingDataActionBuilder builder() {
        return StagedOrderSetParcelTrackingDataActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetParcelTrackingDataAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetParcelTrackingDataActionBuilder builder(
            final StagedOrderSetParcelTrackingDataAction template) {
        return StagedOrderSetParcelTrackingDataActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetParcelTrackingDataAction(
            Function<StagedOrderSetParcelTrackingDataAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelTrackingDataAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelTrackingDataAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetParcelTrackingDataAction>";
            }
        };
    }
}
