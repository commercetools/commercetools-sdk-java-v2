
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomerEmailSetMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerEmailSetMessage orderCustomerEmailSetMessage = OrderCustomerEmailSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomerEmailSetMessageImpl.class)
public interface OrderCustomerEmailSetMessage extends OrderMessage {

    String ORDER_CUSTOMER_EMAIL_SET = "OrderCustomerEmailSet";

    /**
     *
     */

    @JsonProperty("email")
    public String getEmail();

    /**
     *
     */

    @JsonProperty("oldEmail")
    public String getOldEmail();

    public void setEmail(final String email);

    public void setOldEmail(final String oldEmail);

    public static OrderCustomerEmailSetMessage of() {
        return new OrderCustomerEmailSetMessageImpl();
    }

    public static OrderCustomerEmailSetMessage of(final OrderCustomerEmailSetMessage template) {
        OrderCustomerEmailSetMessageImpl instance = new OrderCustomerEmailSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setEmail(template.getEmail());
        instance.setOldEmail(template.getOldEmail());
        return instance;
    }

    public static OrderCustomerEmailSetMessageBuilder builder() {
        return OrderCustomerEmailSetMessageBuilder.of();
    }

    public static OrderCustomerEmailSetMessageBuilder builder(final OrderCustomerEmailSetMessage template) {
        return OrderCustomerEmailSetMessageBuilder.of(template);
    }

    default <T> T withOrderCustomerEmailSetMessage(Function<OrderCustomerEmailSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomerEmailSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomerEmailSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomerEmailSetMessage>";
            }
        };
    }
}
