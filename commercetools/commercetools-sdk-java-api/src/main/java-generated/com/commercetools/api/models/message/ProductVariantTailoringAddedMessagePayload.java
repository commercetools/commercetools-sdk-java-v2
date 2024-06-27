
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_tailoring.ProductVariantTailoring;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add ProductVariant Tailoring update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoringAddedMessagePayload productVariantTailoringAddedMessagePayload = ProductVariantTailoringAddedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .variantId(1)
 *             .variant(variantBuilder -> variantBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantTailoringAddedMessagePayloadImpl.class)
public interface ProductVariantTailoringAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductVariantTailoringAddedMessagePayload
     */
    String PRODUCT_VARIANT_TAILORING_ADDED = "ProductVariantTailoringAdded";

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
     *  <p><code>id</code> of the ProductVariant added to the Tailoring.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The ProductVariantTailoring that was added to the ProductTailoring.</p>
     * @return variant
     */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariantTailoring getVariant();

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
     *  <p><code>id</code> of the ProductVariant added to the Tailoring.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The ProductVariantTailoring that was added to the ProductTailoring.</p>
     * @param variant value to be set
     */

    public void setVariant(final ProductVariantTailoring variant);

    /**
     * factory method
     * @return instance of ProductVariantTailoringAddedMessagePayload
     */
    public static ProductVariantTailoringAddedMessagePayload of() {
        return new ProductVariantTailoringAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantTailoringAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantTailoringAddedMessagePayload of(
            final ProductVariantTailoringAddedMessagePayload template) {
        ProductVariantTailoringAddedMessagePayloadImpl instance = new ProductVariantTailoringAddedMessagePayloadImpl();
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setVariant(template.getVariant());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductVariantTailoringAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantTailoringAddedMessagePayload deepCopy(
            @Nullable final ProductVariantTailoringAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductVariantTailoringAddedMessagePayloadImpl instance = new ProductVariantTailoringAddedMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setVariantId(template.getVariantId());
        instance.setVariant(
            com.commercetools.api.models.product_tailoring.ProductVariantTailoring.deepCopy(template.getVariant()));
        return instance;
    }

    /**
     * builder factory method for ProductVariantTailoringAddedMessagePayload
     * @return builder
     */
    public static ProductVariantTailoringAddedMessagePayloadBuilder builder() {
        return ProductVariantTailoringAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductVariantTailoringAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringAddedMessagePayloadBuilder builder(
            final ProductVariantTailoringAddedMessagePayload template) {
        return ProductVariantTailoringAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantTailoringAddedMessagePayload(
            Function<ProductVariantTailoringAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantTailoringAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantTailoringAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantTailoringAddedMessagePayload>";
            }
        };
    }
}
