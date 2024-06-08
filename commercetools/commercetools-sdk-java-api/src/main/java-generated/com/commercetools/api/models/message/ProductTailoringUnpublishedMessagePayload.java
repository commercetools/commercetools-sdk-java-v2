
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
 *  <p>Generated after a successful Product Tailoring Unpublish update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringUnpublishedMessagePayload productTailoringUnpublishedMessagePayload = ProductTailoringUnpublishedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringUnpublishedMessagePayloadImpl.class)
public interface ProductTailoringUnpublishedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductTailoringUnpublishedMessagePayload
     */
    String PRODUCT_TAILORING_UNPUBLISHED = "ProductTailoringUnpublished";

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
     * @return instance of ProductTailoringUnpublishedMessagePayload
     */
    public static ProductTailoringUnpublishedMessagePayload of() {
        return new ProductTailoringUnpublishedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringUnpublishedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringUnpublishedMessagePayload of(
            final ProductTailoringUnpublishedMessagePayload template) {
        ProductTailoringUnpublishedMessagePayloadImpl instance = new ProductTailoringUnpublishedMessagePayloadImpl();
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringUnpublishedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringUnpublishedMessagePayload deepCopy(
            @Nullable final ProductTailoringUnpublishedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductTailoringUnpublishedMessagePayloadImpl instance = new ProductTailoringUnpublishedMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringUnpublishedMessagePayload
     * @return builder
     */
    public static ProductTailoringUnpublishedMessagePayloadBuilder builder() {
        return ProductTailoringUnpublishedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductTailoringUnpublishedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringUnpublishedMessagePayloadBuilder builder(
            final ProductTailoringUnpublishedMessagePayload template) {
        return ProductTailoringUnpublishedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringUnpublishedMessagePayload(
            Function<ProductTailoringUnpublishedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringUnpublishedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringUnpublishedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringUnpublishedMessagePayload>";
            }
        };
    }
}
