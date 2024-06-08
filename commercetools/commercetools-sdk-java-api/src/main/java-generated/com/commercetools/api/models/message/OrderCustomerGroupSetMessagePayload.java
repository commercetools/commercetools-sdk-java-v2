
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful Set Customer Group update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerGroupSetMessagePayload orderCustomerGroupSetMessagePayload = OrderCustomerGroupSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomerGroupSetMessagePayloadImpl.class)
public interface OrderCustomerGroupSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomerGroupSetMessagePayload
     */
    String ORDER_CUSTOMER_GROUP_SET = "OrderCustomerGroupSet";

    /**
     *  <p>CustomerGroup on the Order after the Set Customer Group update action.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>CustomerGroup on the Order before the Set Customer Group update action.</p>
     * @return oldCustomerGroup
     */
    @Valid
    @JsonProperty("oldCustomerGroup")
    public CustomerGroupReference getOldCustomerGroup();

    /**
     *  <p>CustomerGroup on the Order after the Set Customer Group update action.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     *  <p>CustomerGroup on the Order before the Set Customer Group update action.</p>
     * @param oldCustomerGroup value to be set
     */

    public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);

    /**
     * factory method
     * @return instance of OrderCustomerGroupSetMessagePayload
     */
    public static OrderCustomerGroupSetMessagePayload of() {
        return new OrderCustomerGroupSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomerGroupSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomerGroupSetMessagePayload of(final OrderCustomerGroupSetMessagePayload template) {
        OrderCustomerGroupSetMessagePayloadImpl instance = new OrderCustomerGroupSetMessagePayloadImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setOldCustomerGroup(template.getOldCustomerGroup());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomerGroupSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomerGroupSetMessagePayload deepCopy(
            @Nullable final OrderCustomerGroupSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCustomerGroupSetMessagePayloadImpl instance = new OrderCustomerGroupSetMessagePayloadImpl();
        instance.setCustomerGroup(
            com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setOldCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupReference
                .deepCopy(template.getOldCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for OrderCustomerGroupSetMessagePayload
     * @return builder
     */
    public static OrderCustomerGroupSetMessagePayloadBuilder builder() {
        return OrderCustomerGroupSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCustomerGroupSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomerGroupSetMessagePayloadBuilder builder(
            final OrderCustomerGroupSetMessagePayload template) {
        return OrderCustomerGroupSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomerGroupSetMessagePayload(Function<OrderCustomerGroupSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomerGroupSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomerGroupSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomerGroupSetMessagePayload>";
            }
        };
    }
}
