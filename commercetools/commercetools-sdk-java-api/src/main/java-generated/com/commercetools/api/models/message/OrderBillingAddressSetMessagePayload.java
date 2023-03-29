
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Billing Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderBillingAddressSetMessagePayload orderBillingAddressSetMessagePayload = OrderBillingAddressSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderBillingAddressSetMessagePayloadImpl.class)
public interface OrderBillingAddressSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderBillingAddressSetMessagePayload
     */
    String ORDER_BILLING_ADDRESS_SET = "OrderBillingAddressSet";

    /**
     *  <p>Billing address on the Order after the Set Billing Address update action.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Billing address on the Order before the Set Billing Address update action.</p>
     * @return oldAddress
     */
    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    /**
     *  <p>Billing address on the Order after the Set Billing Address update action.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     *  <p>Billing address on the Order before the Set Billing Address update action.</p>
     * @param oldAddress value to be set
     */

    public void setOldAddress(final Address oldAddress);

    /**
     * factory method
     * @return instance of OrderBillingAddressSetMessagePayload
     */
    public static OrderBillingAddressSetMessagePayload of() {
        return new OrderBillingAddressSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderBillingAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderBillingAddressSetMessagePayload of(final OrderBillingAddressSetMessagePayload template) {
        OrderBillingAddressSetMessagePayloadImpl instance = new OrderBillingAddressSetMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderBillingAddressSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderBillingAddressSetMessagePayload deepCopy(
            @Nullable final OrderBillingAddressSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderBillingAddressSetMessagePayloadImpl instance = new OrderBillingAddressSetMessagePayloadImpl();
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        instance.setOldAddress(com.commercetools.api.models.common.Address.deepCopy(template.getOldAddress()));
        return instance;
    }

    /**
     * builder factory method for OrderBillingAddressSetMessagePayload
     * @return builder
     */
    public static OrderBillingAddressSetMessagePayloadBuilder builder() {
        return OrderBillingAddressSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderBillingAddressSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderBillingAddressSetMessagePayloadBuilder builder(
            final OrderBillingAddressSetMessagePayload template) {
        return OrderBillingAddressSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderBillingAddressSetMessagePayload(Function<OrderBillingAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderBillingAddressSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderBillingAddressSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderBillingAddressSetMessagePayload>";
            }
        };
    }
}
