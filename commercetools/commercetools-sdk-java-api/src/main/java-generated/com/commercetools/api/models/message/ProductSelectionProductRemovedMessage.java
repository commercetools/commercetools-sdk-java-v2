
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductRemovedMessage productSelectionProductRemovedMessage = ProductSelectionProductRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductRemovedMessageImpl.class)
public interface ProductSelectionProductRemovedMessage extends Message {

    /**
     * discriminator value for ProductSelectionProductRemovedMessage
     */
    String PRODUCT_SELECTION_PRODUCT_REMOVED = "ProductSelectionProductRemoved";

    /**
     *  <p>Product that was removed from the Product Selection.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Product that was removed from the Product Selection.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     * factory method
     * @return instance of ProductSelectionProductRemovedMessage
     */
    public static ProductSelectionProductRemovedMessage of() {
        return new ProductSelectionProductRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionProductRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionProductRemovedMessage of(final ProductSelectionProductRemovedMessage template) {
        ProductSelectionProductRemovedMessageImpl instance = new ProductSelectionProductRemovedMessageImpl();
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
        instance.setProduct(template.getProduct());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionProductRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionProductRemovedMessage deepCopy(
            @Nullable final ProductSelectionProductRemovedMessage template) {
        if (template == null) {
            return null;
        }
        ProductSelectionProductRemovedMessageImpl instance = new ProductSelectionProductRemovedMessageImpl();
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
        instance.setProduct(Optional.ofNullable(template.getProduct())
                .map(com.commercetools.api.models.product.ProductReference::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionProductRemovedMessage
     * @return builder
     */
    public static ProductSelectionProductRemovedMessageBuilder builder() {
        return ProductSelectionProductRemovedMessageBuilder.of();
    }

    /**
     * create builder for ProductSelectionProductRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionProductRemovedMessageBuilder builder(
            final ProductSelectionProductRemovedMessage template) {
        return ProductSelectionProductRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionProductRemovedMessage(Function<ProductSelectionProductRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductRemovedMessage>";
            }
        };
    }
}
