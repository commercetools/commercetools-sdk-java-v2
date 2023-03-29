
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Customer Email update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerEmailSetMessagePayload orderCustomerEmailSetMessagePayload = OrderCustomerEmailSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomerEmailSetMessagePayloadImpl.class)
public interface OrderCustomerEmailSetMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomerEmailSetMessagePayload
     */
    String ORDER_CUSTOMER_EMAIL_SET = "OrderCustomerEmailSet";

    /**
     *  <p>Email address on the Order after the Set Customer Email update action.</p>
     * @return email
     */

    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Email address on the Order before the Set Customer Email update action.</p>
     * @return oldEmail
     */

    @JsonProperty("oldEmail")
    public String getOldEmail();

    /**
     *  <p>Email address on the Order after the Set Customer Email update action.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     *  <p>Email address on the Order before the Set Customer Email update action.</p>
     * @param oldEmail value to be set
     */

    public void setOldEmail(final String oldEmail);

    /**
     * factory method
     * @return instance of OrderCustomerEmailSetMessagePayload
     */
    public static OrderCustomerEmailSetMessagePayload of() {
        return new OrderCustomerEmailSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomerEmailSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomerEmailSetMessagePayload of(final OrderCustomerEmailSetMessagePayload template) {
        OrderCustomerEmailSetMessagePayloadImpl instance = new OrderCustomerEmailSetMessagePayloadImpl();
        instance.setEmail(template.getEmail());
        instance.setOldEmail(template.getOldEmail());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomerEmailSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomerEmailSetMessagePayload deepCopy(
            @Nullable final OrderCustomerEmailSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCustomerEmailSetMessagePayloadImpl instance = new OrderCustomerEmailSetMessagePayloadImpl();
        instance.setEmail(template.getEmail());
        instance.setOldEmail(template.getOldEmail());
        return instance;
    }

    /**
     * builder factory method for OrderCustomerEmailSetMessagePayload
     * @return builder
     */
    public static OrderCustomerEmailSetMessagePayloadBuilder builder() {
        return OrderCustomerEmailSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCustomerEmailSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomerEmailSetMessagePayloadBuilder builder(
            final OrderCustomerEmailSetMessagePayload template) {
        return OrderCustomerEmailSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomerEmailSetMessagePayload(Function<OrderCustomerEmailSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomerEmailSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomerEmailSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomerEmailSetMessagePayload>";
            }
        };
    }
}
