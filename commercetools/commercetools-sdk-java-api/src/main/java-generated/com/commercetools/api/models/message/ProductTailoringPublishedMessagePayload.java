
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Product Tailoring Publish update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringPublishedMessagePayload productTailoringPublishedMessagePayload = ProductTailoringPublishedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductTailoringPublished")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringPublishedMessagePayloadImpl.class)
public interface ProductTailoringPublishedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductTailoringPublishedMessagePayload
     */
    String PRODUCT_TAILORING_PUBLISHED = "ProductTailoringPublished";

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
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
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     * @param productKey value to be set
     */

    public void setProductKey(final String productKey);

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     * factory method
     * @return instance of ProductTailoringPublishedMessagePayload
     */
    public static ProductTailoringPublishedMessagePayload of() {
        return new ProductTailoringPublishedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringPublishedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringPublishedMessagePayload of(final ProductTailoringPublishedMessagePayload template) {
        ProductTailoringPublishedMessagePayloadImpl instance = new ProductTailoringPublishedMessagePayloadImpl();
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        return instance;
    }

    public ProductTailoringPublishedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringPublishedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringPublishedMessagePayload deepCopy(
            @Nullable final ProductTailoringPublishedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductTailoringPublishedMessagePayloadImpl instance = new ProductTailoringPublishedMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringPublishedMessagePayload
     * @return builder
     */
    public static ProductTailoringPublishedMessagePayloadBuilder builder() {
        return ProductTailoringPublishedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductTailoringPublishedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringPublishedMessagePayloadBuilder builder(
            final ProductTailoringPublishedMessagePayload template) {
        return ProductTailoringPublishedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringPublishedMessagePayload(
            Function<ProductTailoringPublishedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringPublishedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringPublishedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringPublishedMessagePayload>";
            }
        };
    }
}
