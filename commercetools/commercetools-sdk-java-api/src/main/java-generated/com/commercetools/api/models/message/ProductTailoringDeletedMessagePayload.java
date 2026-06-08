
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
 *  <p>Generated after a successful <span>Delete Product Tailoring</span> or <span>Delete ProductTailoring assigned to Product in Store</span> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringDeletedMessagePayload productTailoringDeletedMessagePayload = ProductTailoringDeletedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductTailoringDeleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringDeletedMessagePayloadImpl.class)
public interface ProductTailoringDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductTailoringDeletedMessagePayload
     */
    String PRODUCT_TAILORING_DELETED = "ProductTailoringDeleted";

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
     * @return instance of ProductTailoringDeletedMessagePayload
     */
    public static ProductTailoringDeletedMessagePayload of() {
        return new ProductTailoringDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringDeletedMessagePayload of(final ProductTailoringDeletedMessagePayload template) {
        ProductTailoringDeletedMessagePayloadImpl instance = new ProductTailoringDeletedMessagePayloadImpl();
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        return instance;
    }

    public ProductTailoringDeletedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringDeletedMessagePayload deepCopy(
            @Nullable final ProductTailoringDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductTailoringDeletedMessagePayloadImpl instance = new ProductTailoringDeletedMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringDeletedMessagePayload
     * @return builder
     */
    public static ProductTailoringDeletedMessagePayloadBuilder builder() {
        return ProductTailoringDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductTailoringDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringDeletedMessagePayloadBuilder builder(
            final ProductTailoringDeletedMessagePayload template) {
        return ProductTailoringDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringDeletedMessagePayload(Function<ProductTailoringDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringDeletedMessagePayload>";
            }
        };
    }
}
