
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

    String STORE_DELETED = "StoreDeleted";

    public static StoreDeletedMessage of() {
        return new StoreDeletedMessageImpl();
    }

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

    public static StoreDeletedMessageBuilder builder() {
        return StoreDeletedMessageBuilder.of();
    }

    public static StoreDeletedMessageBuilder builder(final StoreDeletedMessage template) {
        return StoreDeletedMessageBuilder.of(template);
    }

    default <T> T withStoreDeletedMessage(Function<StoreDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreDeletedMessage>";
            }
        };
    }
}
