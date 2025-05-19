
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Product Tailoring Set Slug update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSlugSetMessagePayload productTailoringSlugSetMessagePayload = ProductTailoringSlugSetMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductTailoringSlugSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSlugSetMessagePayloadImpl.class)
public interface ProductTailoringSlugSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductTailoringSlugSetMessagePayload
     */
    String PRODUCT_TAILORING_SLUG_SET = "ProductTailoringSlugSet";

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
     *  <p>The slug of the Product Tailoring after the Set Slug update action.</p>
     * @return slug
     */
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>The slug of the ProductTailoring before the Set Slug update action.</p>
     * @return oldSlug
     */
    @Valid
    @JsonProperty("oldSlug")
    public LocalizedString getOldSlug();

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
     *  <p>The slug of the Product Tailoring after the Set Slug update action.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>The slug of the ProductTailoring before the Set Slug update action.</p>
     * @param oldSlug value to be set
     */

    public void setOldSlug(final LocalizedString oldSlug);

    /**
     * factory method
     * @return instance of ProductTailoringSlugSetMessagePayload
     */
    public static ProductTailoringSlugSetMessagePayload of() {
        return new ProductTailoringSlugSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSlugSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSlugSetMessagePayload of(final ProductTailoringSlugSetMessagePayload template) {
        ProductTailoringSlugSetMessagePayloadImpl instance = new ProductTailoringSlugSetMessagePayloadImpl();
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        instance.setSlug(template.getSlug());
        instance.setOldSlug(template.getOldSlug());
        return instance;
    }

    public ProductTailoringSlugSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringSlugSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSlugSetMessagePayload deepCopy(
            @Nullable final ProductTailoringSlugSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSlugSetMessagePayloadImpl instance = new ProductTailoringSlugSetMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setOldSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getOldSlug()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSlugSetMessagePayload
     * @return builder
     */
    public static ProductTailoringSlugSetMessagePayloadBuilder builder() {
        return ProductTailoringSlugSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductTailoringSlugSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSlugSetMessagePayloadBuilder builder(
            final ProductTailoringSlugSetMessagePayload template) {
        return ProductTailoringSlugSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSlugSetMessagePayload(Function<ProductTailoringSlugSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSlugSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSlugSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSlugSetMessagePayload>";
            }
        };
    }
}
