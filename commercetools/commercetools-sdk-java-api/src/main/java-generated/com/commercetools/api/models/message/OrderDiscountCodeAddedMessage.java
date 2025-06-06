
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add DiscountCode update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDiscountCodeAddedMessage orderDiscountCodeAddedMessage = OrderDiscountCodeAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .discountCode(discountCodeBuilder -> discountCodeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderDiscountCodeAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderDiscountCodeAddedMessageImpl.class)
public interface OrderDiscountCodeAddedMessage extends OrderMessage {

    /**
     * discriminator value for OrderDiscountCodeAddedMessage
     */
    String ORDER_DISCOUNT_CODE_ADDED = "OrderDiscountCodeAdded";

    /**
     *  <p>DiscountCode that was added.</p>
     * @return discountCode
     */
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();

    /**
     *  <p>DiscountCode that was added.</p>
     * @param discountCode value to be set
     */

    public void setDiscountCode(final DiscountCodeReference discountCode);

    /**
     * factory method
     * @return instance of OrderDiscountCodeAddedMessage
     */
    public static OrderDiscountCodeAddedMessage of() {
        return new OrderDiscountCodeAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderDiscountCodeAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderDiscountCodeAddedMessage of(final OrderDiscountCodeAddedMessage template) {
        OrderDiscountCodeAddedMessageImpl instance = new OrderDiscountCodeAddedMessageImpl();
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
        instance.setDiscountCode(template.getDiscountCode());
        return instance;
    }

    public OrderDiscountCodeAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of OrderDiscountCodeAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderDiscountCodeAddedMessage deepCopy(@Nullable final OrderDiscountCodeAddedMessage template) {
        if (template == null) {
            return null;
        }
        OrderDiscountCodeAddedMessageImpl instance = new OrderDiscountCodeAddedMessageImpl();
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
        instance.setDiscountCode(
            com.commercetools.api.models.discount_code.DiscountCodeReference.deepCopy(template.getDiscountCode()));
        return instance;
    }

    /**
     * builder factory method for OrderDiscountCodeAddedMessage
     * @return builder
     */
    public static OrderDiscountCodeAddedMessageBuilder builder() {
        return OrderDiscountCodeAddedMessageBuilder.of();
    }

    /**
     * create builder for OrderDiscountCodeAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderDiscountCodeAddedMessageBuilder builder(final OrderDiscountCodeAddedMessage template) {
        return OrderDiscountCodeAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderDiscountCodeAddedMessage(Function<OrderDiscountCodeAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDiscountCodeAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDiscountCodeAddedMessage>";
            }
        };
    }
}
