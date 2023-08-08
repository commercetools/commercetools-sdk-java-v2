
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Custom Type with empty parameters.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomTypeRemovedMessage orderCustomTypeRemovedMessage = OrderCustomTypeRemovedMessage.builder()
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
@JsonDeserialize(as = OrderCustomTypeRemovedMessageImpl.class)
public interface OrderCustomTypeRemovedMessage extends OrderMessage {

    /**
     * discriminator value for OrderCustomTypeRemovedMessage
     */
    String ORDER_CUSTOM_TYPE_REMOVED = "OrderCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the Custom Type that has been removed.</p>
     *  <p>Absent when there has not been a Custom Type before.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p><code>id</code> of the Custom Type that has been removed.</p>
     *  <p>Absent when there has not been a Custom Type before.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     * factory method
     * @return instance of OrderCustomTypeRemovedMessage
     */
    public static OrderCustomTypeRemovedMessage of() {
        return new OrderCustomTypeRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomTypeRemovedMessage of(final OrderCustomTypeRemovedMessage template) {
        OrderCustomTypeRemovedMessageImpl instance = new OrderCustomTypeRemovedMessageImpl();
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
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomTypeRemovedMessage deepCopy(@Nullable final OrderCustomTypeRemovedMessage template) {
        if (template == null) {
            return null;
        }
        OrderCustomTypeRemovedMessageImpl instance = new OrderCustomTypeRemovedMessageImpl();
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
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * builder factory method for OrderCustomTypeRemovedMessage
     * @return builder
     */
    public static OrderCustomTypeRemovedMessageBuilder builder() {
        return OrderCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * create builder for OrderCustomTypeRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomTypeRemovedMessageBuilder builder(final OrderCustomTypeRemovedMessage template) {
        return OrderCustomTypeRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomTypeRemovedMessage(Function<OrderCustomTypeRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomTypeRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomTypeRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomTypeRemovedMessage>";
            }
        };
    }
}
