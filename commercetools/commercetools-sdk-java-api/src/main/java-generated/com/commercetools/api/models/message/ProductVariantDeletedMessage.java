
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductVariant;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove ProductVariant update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantDeletedMessage productVariantDeletedMessage = ProductVariantDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantDeletedMessageImpl.class)
public interface ProductVariantDeletedMessage extends Message {

    /**
     * discriminator value for ProductVariantDeletedMessage
     */
    String PRODUCT_VARIANT_DELETED = "ProductVariantDeleted";

    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     * @return variant
     */
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();

    /**
     *  <p>List of image URLs that were removed with the Remove Product Variant update action.</p>
     * @return removedImageUrls
     */
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     * @param variant value to be set
     */

    public void setVariant(final ProductVariant variant);

    /**
     *  <p>List of image URLs that were removed with the Remove Product Variant update action.</p>
     * @param removedImageUrls values to be set
     */

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    /**
     *  <p>List of image URLs that were removed with the Remove Product Variant update action.</p>
     * @param removedImageUrls values to be set
     */

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    /**
     * factory method
     * @return instance of ProductVariantDeletedMessage
     */
    public static ProductVariantDeletedMessage of() {
        return new ProductVariantDeletedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantDeletedMessage of(final ProductVariantDeletedMessage template) {
        ProductVariantDeletedMessageImpl instance = new ProductVariantDeletedMessageImpl();
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
        instance.setVariant(template.getVariant());
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantDeletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantDeletedMessage deepCopy(@Nullable final ProductVariantDeletedMessage template) {
        if (template == null) {
            return null;
        }
        ProductVariantDeletedMessageImpl instance = new ProductVariantDeletedMessageImpl();
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
        instance.setVariant(com.commercetools.api.models.product.ProductVariant.deepCopy(template.getVariant()));
        instance.setRemovedImageUrls(
            Optional.ofNullable(template.getRemovedImageUrls()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantDeletedMessage
     * @return builder
     */
    public static ProductVariantDeletedMessageBuilder builder() {
        return ProductVariantDeletedMessageBuilder.of();
    }

    /**
     * create builder for ProductVariantDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantDeletedMessageBuilder builder(final ProductVariantDeletedMessage template) {
        return ProductVariantDeletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantDeletedMessage(Function<ProductVariantDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantDeletedMessage>";
            }
        };
    }
}
