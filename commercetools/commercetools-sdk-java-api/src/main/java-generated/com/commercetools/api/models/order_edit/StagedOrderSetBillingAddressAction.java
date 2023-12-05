
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
 *  <p>This action updates the <code>billingAddress</code> on the Order, but it does not change the billing address on the referenced Cart from which the Order is created.</p>
 *  <p>Produces the Order Billing Address Set Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetBillingAddressAction stagedOrderSetBillingAddressAction = StagedOrderSetBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetBillingAddressActionImpl.class)
public interface StagedOrderSetBillingAddressAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetBillingAddressAction
     */
    String SET_BILLING_ADDRESS = "setBillingAddress";

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
     * @return instance of StagedOrderSetBillingAddressAction
     */
    public static StagedOrderSetBillingAddressAction of() {
        return new StagedOrderSetBillingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetBillingAddressAction of(final StagedOrderSetBillingAddressAction template) {
        StagedOrderSetBillingAddressActionImpl instance = new StagedOrderSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetBillingAddressAction deepCopy(
            @Nullable final StagedOrderSetBillingAddressAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetBillingAddressActionImpl instance = new StagedOrderSetBillingAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetBillingAddressAction
     * @return builder
     */
    public static StagedOrderSetBillingAddressActionBuilder builder() {
        return StagedOrderSetBillingAddressActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetBillingAddressActionBuilder builder(final StagedOrderSetBillingAddressAction template) {
        return StagedOrderSetBillingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetBillingAddressAction(Function<StagedOrderSetBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetBillingAddressAction>";
            }
        };
    }
}
