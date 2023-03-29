
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Unpublish Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductUnpublishedMessage productUnpublishedMessage = ProductUnpublishedMessage.builder()
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
@JsonDeserialize(as = ProductUnpublishedMessageImpl.class)
public interface ProductUnpublishedMessage extends Message {

    /**
     * discriminator value for ProductUnpublishedMessage
     */
    String PRODUCT_UNPUBLISHED = "ProductUnpublished";

    /**
     * factory method
     * @return instance of ProductUnpublishedMessage
     */
    public static ProductUnpublishedMessage of() {
        return new ProductUnpublishedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductUnpublishedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductUnpublishedMessage of(final ProductUnpublishedMessage template) {
        ProductUnpublishedMessageImpl instance = new ProductUnpublishedMessageImpl();
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
     * factory method to create a deep copy of ProductUnpublishedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductUnpublishedMessage deepCopy(@Nullable final ProductUnpublishedMessage template) {
        if (template == null) {
            return null;
        }
        ProductUnpublishedMessageImpl instance = new ProductUnpublishedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductUnpublishedMessage
     * @return builder
     */
    public static ProductUnpublishedMessageBuilder builder() {
        return ProductUnpublishedMessageBuilder.of();
    }

    /**
     * create builder for ProductUnpublishedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductUnpublishedMessageBuilder builder(final ProductUnpublishedMessage template) {
        return ProductUnpublishedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductUnpublishedMessage(Function<ProductUnpublishedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductUnpublishedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductUnpublishedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductUnpublishedMessage>";
            }
        };
    }
}
