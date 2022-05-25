
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomerGroupSetMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerGroupSetMessage orderCustomerGroupSetMessage = OrderCustomerGroupSetMessage.builder()
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
@JsonDeserialize(as = OrderCustomerGroupSetMessageImpl.class)
public interface OrderCustomerGroupSetMessage extends OrderMessage {

    String ORDER_CUSTOMER_GROUP_SET = "OrderCustomerGroupSet";

    /**
     *  <p>Reference to a CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Reference to a CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("oldCustomerGroup")
    public CustomerGroupReference getOldCustomerGroup();

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);

    public static OrderCustomerGroupSetMessage of() {
        return new OrderCustomerGroupSetMessageImpl();
    }

    public static OrderCustomerGroupSetMessage of(final OrderCustomerGroupSetMessage template) {
        OrderCustomerGroupSetMessageImpl instance = new OrderCustomerGroupSetMessageImpl();
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
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setOldCustomerGroup(template.getOldCustomerGroup());
        return instance;
    }

    public static OrderCustomerGroupSetMessageBuilder builder() {
        return OrderCustomerGroupSetMessageBuilder.of();
    }

    public static OrderCustomerGroupSetMessageBuilder builder(final OrderCustomerGroupSetMessage template) {
        return OrderCustomerGroupSetMessageBuilder.of(template);
    }

    default <T> T withOrderCustomerGroupSetMessage(Function<OrderCustomerGroupSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomerGroupSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomerGroupSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomerGroupSetMessage>";
            }
        };
    }
}
