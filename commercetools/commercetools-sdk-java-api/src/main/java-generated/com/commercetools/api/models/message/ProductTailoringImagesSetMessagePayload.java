
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetExternalImagesAction" rel="nofollow">Set Images</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringImagesSetMessagePayload productTailoringImagesSetMessagePayload = ProductTailoringImagesSetMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductTailoringImagesSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringImagesSetMessagePayloadImpl.class)
public interface ProductTailoringImagesSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductTailoringImagesSetMessagePayload
     */
    String PRODUCT_TAILORING_IMAGES_SET = "ProductTailoringImagesSet";

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p><code>key</code> of the tailored Product.</p>
     * @return productKey
     */

    @JsonProperty("productKey")
    public String getProductKey();

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p><code>id</code> of the tailored Product Variant.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Images</a> on the tailored <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoring" rel="nofollow">Product Variant</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetExternalImagesAction" rel="nofollow">Set Images</a> update action.</p>
     * @return oldImages
     */
    @Valid
    @JsonProperty("oldImages")
    public List<Image> getOldImages();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Images</a> on the tailored <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoring" rel="nofollow">Product Variant</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetExternalImagesAction" rel="nofollow">Set Images</a> update action.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     *  <p><code>key</code> of the tailored Product.</p>
     * @param productKey value to be set
     */

    public void setProductKey(final String productKey);

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p><code>id</code> of the tailored Product Variant.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Images</a> on the tailored <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoring" rel="nofollow">Product Variant</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetExternalImagesAction" rel="nofollow">Set Images</a> update action.</p>
     * @param oldImages values to be set
     */

    @JsonIgnore
    public void setOldImages(final Image... oldImages);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Images</a> on the tailored <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoring" rel="nofollow">Product Variant</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetExternalImagesAction" rel="nofollow">Set Images</a> update action.</p>
     * @param oldImages values to be set
     */

    public void setOldImages(final List<Image> oldImages);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Images</a> on the tailored <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoring" rel="nofollow">Product Variant</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetExternalImagesAction" rel="nofollow">Set Images</a> update action.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Image" rel="nofollow">Images</a> on the tailored <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoring" rel="nofollow">Product Variant</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetExternalImagesAction" rel="nofollow">Set Images</a> update action.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     * factory method
     * @return instance of ProductTailoringImagesSetMessagePayload
     */
    public static ProductTailoringImagesSetMessagePayload of() {
        return new ProductTailoringImagesSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringImagesSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringImagesSetMessagePayload of(final ProductTailoringImagesSetMessagePayload template) {
        ProductTailoringImagesSetMessagePayloadImpl instance = new ProductTailoringImagesSetMessagePayloadImpl();
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setOldImages(template.getOldImages());
        instance.setImages(template.getImages());
        return instance;
    }

    public ProductTailoringImagesSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringImagesSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringImagesSetMessagePayload deepCopy(
            @Nullable final ProductTailoringImagesSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductTailoringImagesSetMessagePayloadImpl instance = new ProductTailoringImagesSetMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setVariantId(template.getVariantId());
        instance.setOldImages(Optional.ofNullable(template.getOldImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringImagesSetMessagePayload
     * @return builder
     */
    public static ProductTailoringImagesSetMessagePayloadBuilder builder() {
        return ProductTailoringImagesSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductTailoringImagesSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringImagesSetMessagePayloadBuilder builder(
            final ProductTailoringImagesSetMessagePayload template) {
        return ProductTailoringImagesSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringImagesSetMessagePayload(
            Function<ProductTailoringImagesSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringImagesSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringImagesSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringImagesSetMessagePayload>";
            }
        };
    }
}
