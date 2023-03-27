
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete Product Selection request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionDeletedMessage productSelectionDeletedMessage = ProductSelectionDeletedMessage.builder()
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
@JsonDeserialize(as = ProductSelectionDeletedMessageImpl.class)
public interface ProductSelectionDeletedMessage extends Message {

    /**
     * discriminator value for ProductSelectionDeletedMessage
     */
    String PRODUCT_SELECTION_DELETED = "ProductSelectionDeleted";

    /**
     * factory method
     * @return instance of ProductSelectionDeletedMessage
     */
    public static ProductSelectionDeletedMessage of() {
        return new ProductSelectionDeletedMessageImpl();
    }

    /**
     * factory method to copy an instance of ProductSelectionDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionDeletedMessage of(final ProductSelectionDeletedMessage template) {
        ProductSelectionDeletedMessageImpl instance = new ProductSelectionDeletedMessageImpl();
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
     * builder factory method for ProductSelectionDeletedMessage
     * @return builder
     */
    public static ProductSelectionDeletedMessageBuilder builder() {
        return ProductSelectionDeletedMessageBuilder.of();
    }

    /**
     * create builder for ProductSelectionDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionDeletedMessageBuilder builder(final ProductSelectionDeletedMessage template) {
        return ProductSelectionDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionDeletedMessage(Function<ProductSelectionDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionDeletedMessage>";
            }
        };
    }
}
