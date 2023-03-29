
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantExclusion;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Variant Exclusion update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionVariantExclusionChangedMessagePayload productSelectionVariantExclusionChangedMessagePayload = ProductSelectionVariantExclusionChangedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .oldVariantExclusion(oldVariantExclusionBuilder -> oldVariantExclusionBuilder)
 *             .newVariantExclusion(newVariantExclusionBuilder -> newVariantExclusionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionVariantExclusionChangedMessagePayloadImpl.class)
public interface ProductSelectionVariantExclusionChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductSelectionVariantExclusionChangedMessagePayload
     */
    String PRODUCT_SELECTION_VARIANT_EXCLUSION_CHANGED = "ProductSelectionVariantExclusionChanged";

    /**
     *  <p>Product for which the Product Variant Exclusion changed.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Product Variant Exclusion before the Set Variant Exclusion update action.</p>
     * @return oldVariantExclusion
     */
    @NotNull
    @Valid
    @JsonProperty("oldVariantExclusion")
    public ProductVariantExclusion getOldVariantExclusion();

    /**
     *  <p>Product Variant Exclusion after the Set Variant Exclusion update action.</p>
     * @return newVariantExclusion
     */
    @NotNull
    @Valid
    @JsonProperty("newVariantExclusion")
    public ProductVariantExclusion getNewVariantExclusion();

    /**
     *  <p>Product for which the Product Variant Exclusion changed.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p>Product Variant Exclusion before the Set Variant Exclusion update action.</p>
     * @param oldVariantExclusion value to be set
     */

    public void setOldVariantExclusion(final ProductVariantExclusion oldVariantExclusion);

    /**
     *  <p>Product Variant Exclusion after the Set Variant Exclusion update action.</p>
     * @param newVariantExclusion value to be set
     */

    public void setNewVariantExclusion(final ProductVariantExclusion newVariantExclusion);

    /**
     * factory method
     * @return instance of ProductSelectionVariantExclusionChangedMessagePayload
     */
    public static ProductSelectionVariantExclusionChangedMessagePayload of() {
        return new ProductSelectionVariantExclusionChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionVariantExclusionChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionVariantExclusionChangedMessagePayload of(
            final ProductSelectionVariantExclusionChangedMessagePayload template) {
        ProductSelectionVariantExclusionChangedMessagePayloadImpl instance = new ProductSelectionVariantExclusionChangedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        instance.setOldVariantExclusion(template.getOldVariantExclusion());
        instance.setNewVariantExclusion(template.getNewVariantExclusion());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionVariantExclusionChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionVariantExclusionChangedMessagePayload deepCopy(
            @Nullable final ProductSelectionVariantExclusionChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductSelectionVariantExclusionChangedMessagePayloadImpl instance = new ProductSelectionVariantExclusionChangedMessagePayloadImpl();
        instance.setProduct(Optional.ofNullable(template.getProduct())
                .map(com.commercetools.api.models.product.ProductReference::deepCopy)
                .orElse(null));
        instance.setOldVariantExclusion(Optional.ofNullable(template.getOldVariantExclusion())
                .map(com.commercetools.api.models.product_selection.ProductVariantExclusion::deepCopy)
                .orElse(null));
        instance.setNewVariantExclusion(Optional.ofNullable(template.getNewVariantExclusion())
                .map(com.commercetools.api.models.product_selection.ProductVariantExclusion::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionVariantExclusionChangedMessagePayload
     * @return builder
     */
    public static ProductSelectionVariantExclusionChangedMessagePayloadBuilder builder() {
        return ProductSelectionVariantExclusionChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductSelectionVariantExclusionChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionVariantExclusionChangedMessagePayloadBuilder builder(
            final ProductSelectionVariantExclusionChangedMessagePayload template) {
        return ProductSelectionVariantExclusionChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionVariantExclusionChangedMessagePayload(
            Function<ProductSelectionVariantExclusionChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantExclusionChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantExclusionChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionVariantExclusionChangedMessagePayload>";
            }
        };
    }
}
