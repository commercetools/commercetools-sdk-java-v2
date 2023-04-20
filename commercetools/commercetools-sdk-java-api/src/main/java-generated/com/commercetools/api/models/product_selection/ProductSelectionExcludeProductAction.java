
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Excludes a Product from a Product Selection with <code>IndividualExclusion</code> ProductSelectionMode.</p>
 *  <p>If the specified Product is already assigned to the Product Selection, but the existing Product Selection has a different Product Variant Exclusion, a ProductPresentWithDifferentVariantSelection error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionExcludeProductAction productSelectionExcludeProductAction = ProductSelectionExcludeProductAction.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionExcludeProductActionImpl.class)
public interface ProductSelectionExcludeProductAction extends ProductSelectionUpdateAction {

    /**
     * discriminator value for ProductSelectionExcludeProductAction
     */
    String EXCLUDE_PRODUCT = "excludeProduct";

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection. If not supplied all Variants are deemed to be excluded.</p>
     * @return variantExclusion
     */
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @param product value to be set
     */

    public void setProduct(final ProductResourceIdentifier product);

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection. If not supplied all Variants are deemed to be excluded.</p>
     * @param variantExclusion value to be set
     */

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    /**
     * factory method
     * @return instance of ProductSelectionExcludeProductAction
     */
    public static ProductSelectionExcludeProductAction of() {
        return new ProductSelectionExcludeProductActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionExcludeProductAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionExcludeProductAction of(final ProductSelectionExcludeProductAction template) {
        ProductSelectionExcludeProductActionImpl instance = new ProductSelectionExcludeProductActionImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionExcludeProductAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionExcludeProductAction deepCopy(
            @Nullable final ProductSelectionExcludeProductAction template) {
        if (template == null) {
            return null;
        }
        ProductSelectionExcludeProductActionImpl instance = new ProductSelectionExcludeProductActionImpl();
        instance.setProduct(
            com.commercetools.api.models.product.ProductResourceIdentifier.deepCopy(template.getProduct()));
        instance.setVariantExclusion(com.commercetools.api.models.product_selection.ProductVariantExclusion
                .deepCopy(template.getVariantExclusion()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionExcludeProductAction
     * @return builder
     */
    public static ProductSelectionExcludeProductActionBuilder builder() {
        return ProductSelectionExcludeProductActionBuilder.of();
    }

    /**
     * create builder for ProductSelectionExcludeProductAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionExcludeProductActionBuilder builder(
            final ProductSelectionExcludeProductAction template) {
        return ProductSelectionExcludeProductActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionExcludeProductAction(Function<ProductSelectionExcludeProductAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionExcludeProductAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionExcludeProductAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionExcludeProductAction>";
            }
        };
    }
}
