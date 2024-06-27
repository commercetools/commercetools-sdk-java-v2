
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
 *  <p>Generated after a successful Add External Image update action or after a successful Upload Product Tailoring image request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringImageAddedMessagePayload productTailoringImageAddedMessagePayload = ProductTailoringImageAddedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .variantId(0.3)
 *             .image(imageBuilder -> imageBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringImageAddedMessagePayloadImpl.class)
public interface ProductTailoringImageAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductTailoringImageAddedMessagePayload
     */
    String PRODUCT_TAILORING_IMAGE_ADDED = "ProductTailoringImageAdded";

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
     *  <p>Reference to the tailored Product.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p><code>id</code> of the tailored ProductVariant.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Image that was added.</p>
     * @return image
     */
    @NotNull
    @Valid
    @JsonProperty("image")
    public Image getImage();

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
     *  <p>Reference to the tailored Product.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p><code>id</code> of the tailored ProductVariant.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>Image that was added.</p>
     * @param image value to be set
     */

    public void setImage(final Image image);

    /**
     * factory method
     * @return instance of ProductTailoringImageAddedMessagePayload
     */
    public static ProductTailoringImageAddedMessagePayload of() {
        return new ProductTailoringImageAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringImageAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringImageAddedMessagePayload of(final ProductTailoringImageAddedMessagePayload template) {
        ProductTailoringImageAddedMessagePayloadImpl instance = new ProductTailoringImageAddedMessagePayloadImpl();
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setImage(template.getImage());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringImageAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringImageAddedMessagePayload deepCopy(
            @Nullable final ProductTailoringImageAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductTailoringImageAddedMessagePayloadImpl instance = new ProductTailoringImageAddedMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setVariantId(template.getVariantId());
        instance.setImage(com.commercetools.api.models.common.Image.deepCopy(template.getImage()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringImageAddedMessagePayload
     * @return builder
     */
    public static ProductTailoringImageAddedMessagePayloadBuilder builder() {
        return ProductTailoringImageAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductTailoringImageAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringImageAddedMessagePayloadBuilder builder(
            final ProductTailoringImageAddedMessagePayload template) {
        return ProductTailoringImageAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringImageAddedMessagePayload(
            Function<ProductTailoringImageAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringImageAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringImageAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringImageAddedMessagePayload>";
            }
        };
    }
}
