
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Create Product request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductCreatedMessage productCreatedMessage = ProductCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .productProjection(productProjectionBuilder -> productProjectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductCreatedMessageImpl.class)
public interface ProductCreatedMessage extends Message {

    /**
     * discriminator value for ProductCreatedMessage
     */
    String PRODUCT_CREATED = "ProductCreated";

    /**
     *  <p>The staged Product Projection of the Product at the time of creation.</p>
     * @return productProjection
     */
    @NotNull
    @Valid
    @JsonProperty("productProjection")
    public ProductProjection getProductProjection();

    /**
     *  <p>The staged Product Projection of the Product at the time of creation.</p>
     * @param productProjection value to be set
     */

    public void setProductProjection(final ProductProjection productProjection);

    /**
     * factory method
     * @return instance of ProductCreatedMessage
     */
    public static ProductCreatedMessage of() {
        return new ProductCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductCreatedMessage of(final ProductCreatedMessage template) {
        ProductCreatedMessageImpl instance = new ProductCreatedMessageImpl();
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
        instance.setProductProjection(template.getProductProjection());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductCreatedMessage deepCopy(@Nullable final ProductCreatedMessage template) {
        if (template == null) {
            return null;
        }
        ProductCreatedMessageImpl instance = new ProductCreatedMessageImpl();
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
        instance.setProductProjection(Optional.ofNullable(template.getProductProjection())
                .map(com.commercetools.api.models.product.ProductProjection::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductCreatedMessage
     * @return builder
     */
    public static ProductCreatedMessageBuilder builder() {
        return ProductCreatedMessageBuilder.of();
    }

    /**
     * create builder for ProductCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductCreatedMessageBuilder builder(final ProductCreatedMessage template) {
        return ProductCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductCreatedMessage(Function<ProductCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductCreatedMessage>";
            }
        };
    }
}
