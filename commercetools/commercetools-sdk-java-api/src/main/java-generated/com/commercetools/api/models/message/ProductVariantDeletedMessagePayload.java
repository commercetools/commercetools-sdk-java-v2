
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
 *  <p>Generated after a successful Remove Product Variant update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantDeletedMessagePayload productVariantDeletedMessagePayload = ProductVariantDeletedMessagePayload.builder()
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantDeletedMessagePayloadImpl.class)
public interface ProductVariantDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductVariantDeletedMessagePayload
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
     * @return instance of ProductVariantDeletedMessagePayload
     */
    public static ProductVariantDeletedMessagePayload of() {
        return new ProductVariantDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantDeletedMessagePayload of(final ProductVariantDeletedMessagePayload template) {
        ProductVariantDeletedMessagePayloadImpl instance = new ProductVariantDeletedMessagePayloadImpl();
        instance.setVariant(template.getVariant());
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantDeletedMessagePayload deepCopy(
            @Nullable final ProductVariantDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductVariantDeletedMessagePayloadImpl instance = new ProductVariantDeletedMessagePayloadImpl();
        instance.setVariant(Optional.ofNullable(template.getVariant())
                .map(com.commercetools.api.models.product.ProductVariant::deepCopy)
                .orElse(null));
        instance.setRemovedImageUrls(
            Optional.ofNullable(template.getRemovedImageUrls()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductVariantDeletedMessagePayload
     * @return builder
     */
    public static ProductVariantDeletedMessagePayloadBuilder builder() {
        return ProductVariantDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductVariantDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantDeletedMessagePayloadBuilder builder(
            final ProductVariantDeletedMessagePayload template) {
        return ProductVariantDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantDeletedMessagePayload(Function<ProductVariantDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantDeletedMessagePayload>";
            }
        };
    }
}
