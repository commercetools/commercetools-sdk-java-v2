
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.ProductPublishScope;
import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishAction" rel="nofollow">Publish</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPublishedMessagePayload productPublishedMessagePayload = ProductPublishedMessagePayload.builder()
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .productProjection(productProjectionBuilder -> productProjectionBuilder)
 *             .scope(ProductPublishScope.ALL)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductPublished")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPublishedMessagePayloadImpl.class)
public interface ProductPublishedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPublishedMessagePayload
     */
    String PRODUCT_PUBLISHED = "ProductPublished";

    /**
     *  <p>List of image URLs which were removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishAction" rel="nofollow">Publish</a> update action.</p>
     * @return removedImageUrls
     */
    @NotNull
    @JsonProperty("removedImageUrls")
    public List<String> getRemovedImageUrls();

    /**
     *  <p>Current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> at the time of creation.</p>
     * @return productProjection
     */
    @NotNull
    @Valid
    @JsonProperty("productProjection")
    public ProductProjection getProductProjection();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishScope" rel="nofollow">Publishing Scope</a> that was used during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishAction" rel="nofollow">Publish</a> update action.</p>
     * @return scope
     */
    @NotNull
    @JsonProperty("scope")
    public ProductPublishScope getScope();

    /**
     *  <p>List of image URLs which were removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishAction" rel="nofollow">Publish</a> update action.</p>
     * @param removedImageUrls values to be set
     */

    @JsonIgnore
    public void setRemovedImageUrls(final String... removedImageUrls);

    /**
     *  <p>List of image URLs which were removed during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishAction" rel="nofollow">Publish</a> update action.</p>
     * @param removedImageUrls values to be set
     */

    public void setRemovedImageUrls(final List<String> removedImageUrls);

    /**
     *  <p>Current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> at the time of creation.</p>
     * @param productProjection value to be set
     */

    public void setProductProjection(final ProductProjection productProjection);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishScope" rel="nofollow">Publishing Scope</a> that was used during the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPublishAction" rel="nofollow">Publish</a> update action.</p>
     * @param scope value to be set
     */

    public void setScope(final ProductPublishScope scope);

    /**
     * factory method
     * @return instance of ProductPublishedMessagePayload
     */
    public static ProductPublishedMessagePayload of() {
        return new ProductPublishedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductPublishedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPublishedMessagePayload of(final ProductPublishedMessagePayload template) {
        ProductPublishedMessagePayloadImpl instance = new ProductPublishedMessagePayloadImpl();
        instance.setRemovedImageUrls(template.getRemovedImageUrls());
        instance.setProductProjection(template.getProductProjection());
        instance.setScope(template.getScope());
        return instance;
    }

    public ProductPublishedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductPublishedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPublishedMessagePayload deepCopy(@Nullable final ProductPublishedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPublishedMessagePayloadImpl instance = new ProductPublishedMessagePayloadImpl();
        instance.setRemovedImageUrls(
            Optional.ofNullable(template.getRemovedImageUrls()).map(ArrayList::new).orElse(null));
        instance.setProductProjection(
            com.commercetools.api.models.product.ProductProjection.deepCopy(template.getProductProjection()));
        instance.setScope(template.getScope());
        return instance;
    }

    /**
     * builder factory method for ProductPublishedMessagePayload
     * @return builder
     */
    public static ProductPublishedMessagePayloadBuilder builder() {
        return ProductPublishedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductPublishedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPublishedMessagePayloadBuilder builder(final ProductPublishedMessagePayload template) {
        return ProductPublishedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPublishedMessagePayload(Function<ProductPublishedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPublishedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPublishedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPublishedMessagePayload>";
            }
        };
    }
}
