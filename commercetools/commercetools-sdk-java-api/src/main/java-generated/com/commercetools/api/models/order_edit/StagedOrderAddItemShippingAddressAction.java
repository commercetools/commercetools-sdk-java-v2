
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
 *  <p>Adds an address to an Order when shipping to multiple addresses is desired.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddItemShippingAddressAction stagedOrderAddItemShippingAddressAction = StagedOrderAddItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddItemShippingAddressActionImpl.class)
public interface StagedOrderAddItemShippingAddressAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderAddItemShippingAddressAction
     */
    String ADD_ITEM_SHIPPING_ADDRESS = "addItemShippingAddress";

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>. The new Address must have a <code>key</code> that is unique across this Order.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>. The new Address must have a <code>key</code> that is unique across this Order.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of StagedOrderAddItemShippingAddressAction
     */
    public static StagedOrderAddItemShippingAddressAction of() {
        return new StagedOrderAddItemShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderAddItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderAddItemShippingAddressAction of(final StagedOrderAddItemShippingAddressAction template) {
        StagedOrderAddItemShippingAddressActionImpl instance = new StagedOrderAddItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderAddItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderAddItemShippingAddressAction deepCopy(
            @Nullable final StagedOrderAddItemShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderAddItemShippingAddressActionImpl instance = new StagedOrderAddItemShippingAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderAddItemShippingAddressAction
     * @return builder
     */
    public static StagedOrderAddItemShippingAddressActionBuilder builder() {
        return StagedOrderAddItemShippingAddressActionBuilder.of();
    }

    /**
     * create builder for StagedOrderAddItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddItemShippingAddressActionBuilder builder(
            final StagedOrderAddItemShippingAddressAction template) {
        return StagedOrderAddItemShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderAddItemShippingAddressAction(
            Function<StagedOrderAddItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddItemShippingAddressAction>";
            }
        };
    }
}
