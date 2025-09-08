
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantExclusion;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionExcludeProductAction" rel="nofollow">Exclude Product</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductExcludedMessagePayload productSelectionProductExcludedMessagePayload = ProductSelectionProductExcludedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductSelectionProductExcluded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductExcludedMessagePayloadImpl.class)
public interface ProductSelectionProductExcludedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductSelectionProductExcludedMessagePayload
     */
    String PRODUCT_SELECTION_PRODUCT_EXCLUDED = "ProductSelectionProductExcluded";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that was excluded from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">Product Selection</a>.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Product Variant Exclusion after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionExcludeProductAction" rel="nofollow">Exclude Product</a> update action.</p>
     * @return variantExclusion
     */
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that was excluded from the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">Product Selection</a>.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p>Product Variant Exclusion after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionExcludeProductAction" rel="nofollow">Exclude Product</a> update action.</p>
     * @param variantExclusion value to be set
     */

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    /**
     * factory method
     * @return instance of ProductSelectionProductExcludedMessagePayload
     */
    public static ProductSelectionProductExcludedMessagePayload of() {
        return new ProductSelectionProductExcludedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionProductExcludedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionProductExcludedMessagePayload of(
            final ProductSelectionProductExcludedMessagePayload template) {
        ProductSelectionProductExcludedMessagePayloadImpl instance = new ProductSelectionProductExcludedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    public ProductSelectionProductExcludedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionProductExcludedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionProductExcludedMessagePayload deepCopy(
            @Nullable final ProductSelectionProductExcludedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductSelectionProductExcludedMessagePayloadImpl instance = new ProductSelectionProductExcludedMessagePayloadImpl();
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setVariantExclusion(com.commercetools.api.models.product_selection.ProductVariantExclusion
                .deepCopy(template.getVariantExclusion()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionProductExcludedMessagePayload
     * @return builder
     */
    public static ProductSelectionProductExcludedMessagePayloadBuilder builder() {
        return ProductSelectionProductExcludedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductSelectionProductExcludedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionProductExcludedMessagePayloadBuilder builder(
            final ProductSelectionProductExcludedMessagePayload template) {
        return ProductSelectionProductExcludedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionProductExcludedMessagePayload(
            Function<ProductSelectionProductExcludedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductExcludedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductExcludedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductExcludedMessagePayload>";
            }
        };
    }
}
