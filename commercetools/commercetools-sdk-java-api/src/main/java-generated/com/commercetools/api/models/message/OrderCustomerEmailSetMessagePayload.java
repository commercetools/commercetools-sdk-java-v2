
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setEmail(final String email);

    public void setOldEmail(final String oldEmail);

    public static OrderCustomerEmailSetMessagePayload of() {
        return new OrderCustomerEmailSetMessagePayloadImpl();
    }

    public static OrderCustomerEmailSetMessagePayload of(final OrderCustomerEmailSetMessagePayload template) {
        OrderCustomerEmailSetMessagePayloadImpl instance = new OrderCustomerEmailSetMessagePayloadImpl();
        instance.setEmail(template.getEmail());
        instance.setOldEmail(template.getOldEmail());
        return instance;
    }

    public static OrderCustomerEmailSetMessagePayloadBuilder builder() {
        return OrderCustomerEmailSetMessagePayloadBuilder.of();
    }

    public static OrderCustomerEmailSetMessagePayloadBuilder builder(
            final OrderCustomerEmailSetMessagePayload template) {
        return OrderCustomerEmailSetMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderCustomerEmailSetMessagePayload(Function<OrderCustomerEmailSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomerEmailSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomerEmailSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomerEmailSetMessagePayload>";
            }
        };
    }
}
