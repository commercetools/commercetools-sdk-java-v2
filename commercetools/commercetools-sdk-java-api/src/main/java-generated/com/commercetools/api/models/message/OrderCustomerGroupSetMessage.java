
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

    /**
     * discriminator value for OrderCustomerGroupSetMessage
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
     * @return instance of OrderCustomerGroupSetMessage
     */
    public static OrderCustomerGroupSetMessage of() {
        return new OrderCustomerGroupSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomerGroupSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of OrderCustomerGroupSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomerGroupSetMessage deepCopy(@Nullable final OrderCustomerGroupSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderCustomerGroupSetMessageImpl instance = new OrderCustomerGroupSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setCustomerGroup(
            com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setOldCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupReference
                .deepCopy(template.getOldCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for OrderCustomerGroupSetMessage
     * @return builder
     */
    public static OrderCustomerGroupSetMessageBuilder builder() {
        return OrderCustomerGroupSetMessageBuilder.of();
    }

    /**
     * create builder for OrderCustomerGroupSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomerGroupSetMessageBuilder builder(final OrderCustomerGroupSetMessage template) {
        return OrderCustomerGroupSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomerGroupSetMessage(Function<OrderCustomerGroupSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomerGroupSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomerGroupSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomerGroupSetMessage>";
            }
        };
    }
}
