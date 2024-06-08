
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>This action updates the <code>shippingAddress</code> on the Order, but it does not change the shipping address on the referenced Cart from which the Order is created. Also, it does not recalculate the Cart as taxes may not fit to the shipping address anymore.</p>
 *  <p>Produces the Order Shipping Address Set Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingAddressAction stagedOrderSetShippingAddressAction = StagedOrderSetShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetShippingAddressActionImpl.class)
public interface StagedOrderSetShippingAddressAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetShippingAddressAction
     */
    String SET_SHIPPING_ADDRESS = "setShippingAddress";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of StagedOrderSetShippingAddressAction
     */
    public static StagedOrderSetShippingAddressAction of() {
        return new StagedOrderSetShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetShippingAddressAction of(final StagedOrderSetShippingAddressAction template) {
        StagedOrderSetShippingAddressActionImpl instance = new StagedOrderSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetShippingAddressAction deepCopy(
            @Nullable final StagedOrderSetShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetShippingAddressActionImpl instance = new StagedOrderSetShippingAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetShippingAddressAction
     * @return builder
     */
    public static StagedOrderSetShippingAddressActionBuilder builder() {
        return StagedOrderSetShippingAddressActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingAddressActionBuilder builder(
            final StagedOrderSetShippingAddressAction template) {
        return StagedOrderSetShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetShippingAddressAction(Function<StagedOrderSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetShippingAddressAction>";
            }
        };
    }
}
