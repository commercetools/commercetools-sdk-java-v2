
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
 *     OrderBillingAddressSetMessage orderBillingAddressSetMessage = OrderBillingAddressSetMessage.builder()
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
@JsonDeserialize(as = OrderBillingAddressSetMessageImpl.class)
public interface OrderBillingAddressSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderBillingAddressSetMessage
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
     * @return instance of OrderBillingAddressSetMessage
     */
    public static OrderBillingAddressSetMessage of() {
        return new OrderBillingAddressSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderBillingAddressSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderBillingAddressSetMessage of(final OrderBillingAddressSetMessage template) {
        OrderBillingAddressSetMessageImpl instance = new OrderBillingAddressSetMessageImpl();
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
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderBillingAddressSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderBillingAddressSetMessage deepCopy(@Nullable final OrderBillingAddressSetMessage template) {
        if (template == null) {
            return null;
        }
        OrderBillingAddressSetMessageImpl instance = new OrderBillingAddressSetMessageImpl();
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
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        instance.setOldAddress(com.commercetools.api.models.common.Address.deepCopy(template.getOldAddress()));
        return instance;
    }

    /**
     * builder factory method for OrderBillingAddressSetMessage
     * @return builder
     */
    public static OrderBillingAddressSetMessageBuilder builder() {
        return OrderBillingAddressSetMessageBuilder.of();
    }

    /**
     * create builder for OrderBillingAddressSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderBillingAddressSetMessageBuilder builder(final OrderBillingAddressSetMessage template) {
        return OrderBillingAddressSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderBillingAddressSetMessage(Function<OrderBillingAddressSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderBillingAddressSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderBillingAddressSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderBillingAddressSetMessage>";
            }
        };
    }
}
