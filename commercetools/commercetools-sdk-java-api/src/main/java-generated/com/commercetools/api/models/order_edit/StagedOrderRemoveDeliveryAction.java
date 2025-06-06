
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
 *  <p>Produces the DeliveryRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveDeliveryAction stagedOrderRemoveDeliveryAction = StagedOrderRemoveDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeDelivery")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderRemoveDeliveryActionImpl.class)
public interface StagedOrderRemoveDeliveryAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderRemoveDeliveryAction
     */
    String REMOVE_DELIVERY = "removeDelivery";

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryId
     */

    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryKey
     */

    @JsonProperty("deliveryKey")
    public String getDeliveryKey();

    /**
     *  <p><code>id</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryKey value to be set
     */

    public void setDeliveryKey(final String deliveryKey);

    /**
     * factory method
     * @return instance of StagedOrderRemoveDeliveryAction
     */
    public static StagedOrderRemoveDeliveryAction of() {
        return new StagedOrderRemoveDeliveryActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderRemoveDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderRemoveDeliveryAction of(final StagedOrderRemoveDeliveryAction template) {
        StagedOrderRemoveDeliveryActionImpl instance = new StagedOrderRemoveDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        return instance;
    }

    public StagedOrderRemoveDeliveryAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderRemoveDeliveryAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderRemoveDeliveryAction deepCopy(@Nullable final StagedOrderRemoveDeliveryAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderRemoveDeliveryActionImpl instance = new StagedOrderRemoveDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        return instance;
    }

    /**
     * builder factory method for StagedOrderRemoveDeliveryAction
     * @return builder
     */
    public static StagedOrderRemoveDeliveryActionBuilder builder() {
        return StagedOrderRemoveDeliveryActionBuilder.of();
    }

    /**
     * create builder for StagedOrderRemoveDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemoveDeliveryActionBuilder builder(final StagedOrderRemoveDeliveryAction template) {
        return StagedOrderRemoveDeliveryActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderRemoveDeliveryAction(Function<StagedOrderRemoveDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemoveDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemoveDeliveryAction>";
            }
        };
    }
}
