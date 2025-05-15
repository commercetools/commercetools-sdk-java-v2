
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful Set Customer ID update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerSetMessage orderCustomerSetMessage = OrderCustomerSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("OrderCustomerSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomerSetMessageImpl.class)
public interface OrderCustomerSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderCustomerSetMessage
     */
    String ORDER_CUSTOMER_SET = "OrderCustomerSet";

    /**
     *  <p>Customer on the Order after the Set Customer ID update action.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>CustomerGroup on the Order after the Set Customer ID update action.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Customer on the Order before the Set Customer ID update action.</p>
     * @return oldCustomer
     */
    @Valid
    @JsonProperty("oldCustomer")
    public CustomerReference getOldCustomer();

    /**
     *  <p>CustomerGroup on the Order before the Set Customer ID update action.</p>
     * @return oldCustomerGroup
     */
    @Valid
    @JsonProperty("oldCustomerGroup")
    public CustomerGroupReference getOldCustomerGroup();

    /**
     *  <p>Customer on the Order after the Set Customer ID update action.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>CustomerGroup on the Order after the Set Customer ID update action.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     *  <p>Customer on the Order before the Set Customer ID update action.</p>
     * @param oldCustomer value to be set
     */

    public void setOldCustomer(final CustomerReference oldCustomer);

    /**
     *  <p>CustomerGroup on the Order before the Set Customer ID update action.</p>
     * @param oldCustomerGroup value to be set
     */

    public void setOldCustomerGroup(final CustomerGroupReference oldCustomerGroup);

    /**
     * factory method
     * @return instance of OrderCustomerSetMessage
     */
    public static OrderCustomerSetMessage of() {
        return new OrderCustomerSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomerSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomerSetMessage of(final OrderCustomerSetMessage template) {
        OrderCustomerSetMessageImpl instance = new OrderCustomerSetMessageImpl();
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
        instance.setCustomer(template.getCustomer());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setOldCustomer(template.getOldCustomer());
        instance.setOldCustomerGroup(template.getOldCustomerGroup());
        return instance;
    }

    public OrderCustomerSetMessage copyDeep();

    /**
     * factory method to create a deep copy of OrderCustomerSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomerSetMessage deepCopy(@Nullable final OrderCustomerSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderCustomerSetMessageImpl instance = new OrderCustomerSetMessageImpl();
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
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setCustomerGroup(
            com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setOldCustomer(
            com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getOldCustomer()));
        instance.setOldCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupReference
                .deepCopy(template.getOldCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for OrderCustomerSetMessage
     * @return builder
     */
    public static OrderCustomerSetMessageBuilder builder() {
        return OrderCustomerSetMessageBuilder.of();
    }

    /**
     * create builder for OrderCustomerSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomerSetMessageBuilder builder(final OrderCustomerSetMessage template) {
        return OrderCustomerSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomerSetMessage(Function<OrderCustomerSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomerSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomerSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomerSetMessage>";
            }
        };
    }
}
