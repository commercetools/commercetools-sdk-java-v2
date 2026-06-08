
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringRemoveVariantAction" rel="nofollow">Remove ProductVariant Tailoring</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoringRemovedMessagePayload productVariantTailoringRemovedMessagePayload = ProductVariantTailoringRemovedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .variantId(1)
 *             .variant(variantBuilder -> variantBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductVariantTailoringRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantTailoringRemovedMessagePayloadImpl.class)
public interface ProductVariantTailoringRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductVariantTailoringRemovedMessagePayload
     */
    String PRODUCT_VARIANT_TAILORING_REMOVED = "ProductVariantTailoringRemoved";

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
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> removed from the Tailoring.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoring" rel="nofollow">ProductVariantTailoring</a> that was removed from the ProductTailoring.</p>
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
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> removed from the Tailoring.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantTailoring" rel="nofollow">ProductVariantTailoring</a> that was removed from the ProductTailoring.</p>
     * @param variant value to be set
     */

    public void setVariant(final ProductVariantTailoring variant);

    /**
     * factory method
     * @return instance of ProductVariantTailoringRemovedMessagePayload
     */
    public static ProductVariantTailoringRemovedMessagePayload of() {
        return new ProductVariantTailoringRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantTailoringRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantTailoringRemovedMessagePayload of(
            final ProductVariantTailoringRemovedMessagePayload template) {
        ProductVariantTailoringRemovedMessagePayloadImpl instance = new ProductVariantTailoringRemovedMessagePayloadImpl();
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setVariant(template.getVariant());
        return instance;
    }

    public ProductVariantTailoringRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductVariantTailoringRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantTailoringRemovedMessagePayload deepCopy(
            @Nullable final ProductVariantTailoringRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductVariantTailoringRemovedMessagePayloadImpl instance = new ProductVariantTailoringRemovedMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setVariantId(template.getVariantId());
        instance.setVariant(
            com.commercetools.api.models.product_tailoring.ProductVariantTailoring.deepCopy(template.getVariant()));
        return instance;
    }

    /**
     * builder factory method for ProductVariantTailoringRemovedMessagePayload
     * @return builder
     */
    public static ProductVariantTailoringRemovedMessagePayloadBuilder builder() {
        return ProductVariantTailoringRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductVariantTailoringRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringRemovedMessagePayloadBuilder builder(
            final ProductVariantTailoringRemovedMessagePayload template) {
        return ProductVariantTailoringRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantTailoringRemovedMessagePayload(
            Function<ProductVariantTailoringRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantTailoringRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantTailoringRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantTailoringRemovedMessagePayload>";
            }
        };
    }
}
