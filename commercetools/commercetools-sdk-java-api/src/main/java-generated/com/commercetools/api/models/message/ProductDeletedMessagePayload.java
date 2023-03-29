
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
 *  <p>Generated after a successful Delete Product request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDeletedMessagePayload productDeletedMessagePayload = ProductDeletedMessagePayload.builder()
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDeletedMessagePayloadImpl.class)
public interface ProductDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductDeletedMessagePayload
     */
    String PRODUCT_DELETED = "ProductDeleted";

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @return removedImageUrls
     */
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    /**
     *  <p>Current Product Projection of the deleted Product.</p>
     * @return currentProjection
     */
    @Valid
    @JsonProperty("currentProjection")
    public ProductProjection getCurrentProjection();

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @param removedImageUrls values to be set
     */

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     * @param removedImageUrls values to be set
     */

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    /**
     *  <p>Current Product Projection of the deleted Product.</p>
     * @param currentProjection value to be set
     */

    public void setCurrentProjection(final ProductProjection currentProjection);

    /**
     * factory method
     * @return instance of ProductDeletedMessagePayload
     */
    public static ProductDeletedMessagePayload of() {
        return new ProductDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDeletedMessagePayload of(final ProductDeletedMessagePayload template) {
        ProductDeletedMessagePayloadImpl instance = new ProductDeletedMessagePayloadImpl();
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        instance.setCurrentProjection(template.getCurrentProjection());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDeletedMessagePayload deepCopy(@Nullable final ProductDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductDeletedMessagePayloadImpl instance = new ProductDeletedMessagePayloadImpl();
        instance.setRemovedImageUrls(
            Optional.ofNullable(template.getRemovedImageUrls()).map(ArrayList::new).orElse(null));
        instance.setCurrentProjection(Optional.ofNullable(template.getCurrentProjection())
                .map(com.commercetools.api.models.product.ProductProjection::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductDeletedMessagePayload
     * @return builder
     */
    public static ProductDeletedMessagePayloadBuilder builder() {
        return ProductDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDeletedMessagePayloadBuilder builder(final ProductDeletedMessagePayload template) {
        return ProductDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDeletedMessagePayload(Function<ProductDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDeletedMessagePayload>";
            }
        };
    }
}
