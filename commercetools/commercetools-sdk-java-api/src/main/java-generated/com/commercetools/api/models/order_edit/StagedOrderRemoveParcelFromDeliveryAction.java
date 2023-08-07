
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Produces the ParcelRemovedFromDelivery Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveParcelFromDeliveryAction stagedOrderRemoveParcelFromDeliveryAction = StagedOrderRemoveParcelFromDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderRemoveParcelFromDeliveryActionImpl.class)
public interface StagedOrderRemoveParcelFromDeliveryAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderRemoveParcelFromDeliveryAction
     */
    String REMOVE_PARCEL_FROM_DELIVERY = "removeParcelFromDelivery";

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
     * factory method
     * @return instance of StagedOrderRemoveParcelFromDeliveryAction
     */
    public static StagedOrderRemoveParcelFromDeliveryAction of() {
        return new StagedOrderRemoveParcelFromDeliveryActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderRemoveParcelFromDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderRemoveParcelFromDeliveryAction of(
            final StagedOrderRemoveParcelFromDeliveryAction template) {
        StagedOrderRemoveParcelFromDeliveryActionImpl instance = new StagedOrderRemoveParcelFromDeliveryActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setParcelKey(template.getParcelKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderRemoveParcelFromDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderRemoveParcelFromDeliveryAction deepCopy(
            @Nullable final StagedOrderRemoveParcelFromDeliveryAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderRemoveParcelFromDeliveryActionImpl instance = new StagedOrderRemoveParcelFromDeliveryActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setParcelKey(template.getParcelKey());
        return instance;
    }

    /**
     * builder factory method for StagedOrderRemoveParcelFromDeliveryAction
     * @return builder
     */
    public static StagedOrderRemoveParcelFromDeliveryActionBuilder builder() {
        return StagedOrderRemoveParcelFromDeliveryActionBuilder.of();
    }

    /**
     * create builder for StagedOrderRemoveParcelFromDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveParcelFromDeliveryActionBuilder builder(
            final StagedOrderRemoveParcelFromDeliveryAction template) {
        return StagedOrderRemoveParcelFromDeliveryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderRemoveParcelFromDeliveryAction(
            Function<StagedOrderRemoveParcelFromDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveParcelFromDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveParcelFromDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveParcelFromDeliveryAction>";
            }
        };
    }
}
