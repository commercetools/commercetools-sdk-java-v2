
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
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updates an address in <code>itemShippingAddresses</code> by keeping the Address <code>key</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderUpdateItemShippingAddressAction stagedOrderUpdateItemShippingAddressAction = StagedOrderUpdateItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("updateItemShippingAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderUpdateItemShippingAddressActionImpl.class)
public interface StagedOrderUpdateItemShippingAddressAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderUpdateItemShippingAddressAction
     */
    String UPDATE_ITEM_SHIPPING_ADDRESS = "updateItemShippingAddress";

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of StagedOrderUpdateItemShippingAddressAction
     */
    public static StagedOrderUpdateItemShippingAddressAction of() {
        return new StagedOrderUpdateItemShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderUpdateItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderUpdateItemShippingAddressAction of(
            final StagedOrderUpdateItemShippingAddressAction template) {
        StagedOrderUpdateItemShippingAddressActionImpl instance = new StagedOrderUpdateItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public StagedOrderUpdateItemShippingAddressAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderUpdateItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderUpdateItemShippingAddressAction deepCopy(
            @Nullable final StagedOrderUpdateItemShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderUpdateItemShippingAddressActionImpl instance = new StagedOrderUpdateItemShippingAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderUpdateItemShippingAddressAction
     * @return builder
     */
    public static StagedOrderUpdateItemShippingAddressActionBuilder builder() {
        return StagedOrderUpdateItemShippingAddressActionBuilder.of();
    }

    /**
     * create builder for StagedOrderUpdateItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderUpdateItemShippingAddressActionBuilder builder(
            final StagedOrderUpdateItemShippingAddressAction template) {
        return StagedOrderUpdateItemShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderUpdateItemShippingAddressAction(
            Function<StagedOrderUpdateItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderUpdateItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderUpdateItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderUpdateItemShippingAddressAction>";
            }
        };
    }
}
