
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete Store request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreDeletedMessage storeDeletedMessage = StoreDeletedMessage.builder()
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
@JsonDeserialize(as = StoreDeletedMessageImpl.class)
public interface StoreDeletedMessage extends Message {

    /**
     * discriminator value for StoreDeletedMessage
     */
    String STORE_DELETED = "StoreDeleted";

    /**
     * factory method
     * @return instance of StoreDeletedMessage
     */
    public static StoreDeletedMessage of() {
        return new StoreDeletedMessageImpl();
    }

    /**
     * factory method to copy an instance of StoreDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreDeletedMessage of(final StoreDeletedMessage template) {
        StoreDeletedMessageImpl instance = new StoreDeletedMessageImpl();
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
        return instance;
    }

    /**
     * builder factory method for StoreDeletedMessage
     * @return builder
     */
    public static StoreDeletedMessageBuilder builder() {
        return StoreDeletedMessageBuilder.of();
    }

    /**
     * create builder for StoreDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreDeletedMessageBuilder builder(final StoreDeletedMessage template) {
        return StoreDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreDeletedMessage(Function<StoreDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreDeletedMessage>";
            }
        };
    }
}
