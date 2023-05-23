
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDeliveryAddressAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryAddressAction stagedOrderSetDeliveryAddressAction = StagedOrderSetDeliveryAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDeliveryAddressActionImpl.class)
public interface StagedOrderSetDeliveryAddressAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetDeliveryAddressAction
     */
    String SET_DELIVERY_ADDRESS = "setDeliveryAddress";

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryId
     */

    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @return deliveryKey
     */

    @JsonProperty("deliveryKey")
    public String getDeliveryKey();

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> is required for this update action.</p>
     * @param deliveryKey value to be set
     */

    public void setDeliveryKey(final String deliveryKey);

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of StagedOrderSetDeliveryAddressAction
     */
    public static StagedOrderSetDeliveryAddressAction of() {
        return new StagedOrderSetDeliveryAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetDeliveryAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetDeliveryAddressAction of(final StagedOrderSetDeliveryAddressAction template) {
        StagedOrderSetDeliveryAddressActionImpl instance = new StagedOrderSetDeliveryAddressActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetDeliveryAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetDeliveryAddressAction deepCopy(
            @Nullable final StagedOrderSetDeliveryAddressAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetDeliveryAddressActionImpl instance = new StagedOrderSetDeliveryAddressActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setDeliveryKey(template.getDeliveryKey());
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetDeliveryAddressAction
     * @return builder
     */
    public static StagedOrderSetDeliveryAddressActionBuilder builder() {
        return StagedOrderSetDeliveryAddressActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetDeliveryAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDeliveryAddressActionBuilder builder(
            final StagedOrderSetDeliveryAddressAction template) {
        return StagedOrderSetDeliveryAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetDeliveryAddressAction(Function<StagedOrderSetDeliveryAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static StagedOrderSetDeliveryAddressAction ofUnset() {
        return StagedOrderSetDeliveryAddressAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDeliveryAddressAction>";
            }
        };
    }
}
