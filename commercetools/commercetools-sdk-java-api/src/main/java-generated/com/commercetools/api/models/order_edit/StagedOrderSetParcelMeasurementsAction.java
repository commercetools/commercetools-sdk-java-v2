
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ParcelMeasurements;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetParcelMeasurementsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetParcelMeasurementsAction stagedOrderSetParcelMeasurementsAction = StagedOrderSetParcelMeasurementsAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetParcelMeasurementsActionImpl.class)
public interface StagedOrderSetParcelMeasurementsAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetParcelMeasurementsAction
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
     * @return instance of StagedOrderSetParcelMeasurementsAction
     */
    public static StagedOrderSetParcelMeasurementsAction of() {
        return new StagedOrderSetParcelMeasurementsActionImpl();
    }

    /**
     * factory method to copy an instance of StagedOrderSetParcelMeasurementsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetParcelMeasurementsAction of(final StagedOrderSetParcelMeasurementsAction template) {
        StagedOrderSetParcelMeasurementsActionImpl instance = new StagedOrderSetParcelMeasurementsActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setMeasurements(template.getMeasurements());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetParcelMeasurementsAction
     * @return builder
     */
    public static StagedOrderSetParcelMeasurementsActionBuilder builder() {
        return StagedOrderSetParcelMeasurementsActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetParcelMeasurementsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetParcelMeasurementsActionBuilder builder(
            final StagedOrderSetParcelMeasurementsAction template) {
        return StagedOrderSetParcelMeasurementsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetParcelMeasurementsAction(
            Function<StagedOrderSetParcelMeasurementsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelMeasurementsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetParcelMeasurementsAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetParcelMeasurementsAction>";
            }
        };
    }
}
