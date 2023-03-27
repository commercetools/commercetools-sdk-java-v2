
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Store update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderStoreSetMessage orderStoreSetMessage = OrderStoreSetMessage.builder()
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
@JsonDeserialize(as = OrderStoreSetMessageImpl.class)
public interface OrderStoreSetMessage extends OrderMessage {

    /**
     * discriminator value for OrderStoreSetMessage
     */
    String ORDER_STORE_SET = "OrderStoreSet";

    /**
     *  <p>Store that was set.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>Store that was set.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     * factory method
     * @return instance of OrderStoreSetMessage
     */
    public static OrderStoreSetMessage of() {
        return new OrderStoreSetMessageImpl();
    }

    /**
     * factory method to copy an instance of OrderStoreSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderStoreSetMessage of(final OrderStoreSetMessage template) {
        OrderStoreSetMessageImpl instance = new OrderStoreSetMessageImpl();
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
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * builder factory method for OrderStoreSetMessage
     * @return builder
     */
    public static OrderStoreSetMessageBuilder builder() {
        return OrderStoreSetMessageBuilder.of();
    }

    /**
     * create builder for OrderStoreSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderStoreSetMessageBuilder builder(final OrderStoreSetMessage template) {
        return OrderStoreSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderStoreSetMessage(Function<OrderStoreSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderStoreSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderStoreSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderStoreSetMessage>";
            }
        };
    }
}
