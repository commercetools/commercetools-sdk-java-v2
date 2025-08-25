
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantSelection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a Product is already assigned to a <span>Product Selection</span>, but the Product Selection has either a different <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantSelection" rel="nofollow">Product Variant Selection</a> or a different <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariantExclusion" rel="nofollow">Product Variant Exclusion</a>.</p>
 *  <p>The error is returned as a failed response either to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionAddProductAction" rel="nofollow">Add Product</a> or to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionExcludeProductAction" rel="nofollow">Exclude Product</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPresentWithDifferentVariantSelectionError productPresentWithDifferentVariantSelectionError = ProductPresentWithDifferentVariantSelectionError.builder()
 *             .message("{message}")
 *             .product(productBuilder -> productBuilder)
 *             .existingVariantSelection(existingVariantSelectionBuilder -> existingVariantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductPresentWithDifferentVariantSelection")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPresentWithDifferentVariantSelectionErrorImpl.class)
public interface ProductPresentWithDifferentVariantSelectionError extends ErrorObject {

    /**
     * discriminator value for ProductPresentWithDifferentVariantSelectionError
     */
    String PRODUCT_PRESENT_WITH_DIFFERENT_VARIANT_SELECTION = "ProductPresentWithDifferentVariantSelection";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Product is already present with the following different $variantSelections."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> for which the error was returned.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Existing Product Variant Selection or Exclusion for the <span>Product</span> in the <span>Product Selection</span>.</p>
     * @return existingVariantSelection
     */
    @NotNull
    @Valid
    @JsonProperty("existingVariantSelection")
    public ProductVariantSelection getExistingVariantSelection();

    /**
     *  <p><code>"Product is already present with the following different $variantSelections."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> for which the error was returned.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p>Existing Product Variant Selection or Exclusion for the <span>Product</span> in the <span>Product Selection</span>.</p>
     * @param existingVariantSelection value to be set
     */

    public void setExistingVariantSelection(final ProductVariantSelection existingVariantSelection);

    /**
     * factory method
     * @return instance of ProductPresentWithDifferentVariantSelectionError
     */
    public static ProductPresentWithDifferentVariantSelectionError of() {
        return new ProductPresentWithDifferentVariantSelectionErrorImpl();
    }

    /**
     * factory method to create a shallow copy ProductPresentWithDifferentVariantSelectionError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPresentWithDifferentVariantSelectionError of(
            final ProductPresentWithDifferentVariantSelectionError template) {
        ProductPresentWithDifferentVariantSelectionErrorImpl instance = new ProductPresentWithDifferentVariantSelectionErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setProduct(template.getProduct());
        instance.setExistingVariantSelection(template.getExistingVariantSelection());
        return instance;
    }

    public ProductPresentWithDifferentVariantSelectionError copyDeep();

    /**
     * factory method to create a deep copy of ProductPresentWithDifferentVariantSelectionError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPresentWithDifferentVariantSelectionError deepCopy(
            @Nullable final ProductPresentWithDifferentVariantSelectionError template) {
        if (template == null) {
            return null;
        }
        ProductPresentWithDifferentVariantSelectionErrorImpl instance = new ProductPresentWithDifferentVariantSelectionErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setExistingVariantSelection(com.commercetools.api.models.product_selection.ProductVariantSelection
                .deepCopy(template.getExistingVariantSelection()));
        return instance;
    }

    /**
     * builder factory method for ProductPresentWithDifferentVariantSelectionError
     * @return builder
     */
    public static ProductPresentWithDifferentVariantSelectionErrorBuilder builder() {
        return ProductPresentWithDifferentVariantSelectionErrorBuilder.of();
    }

    /**
     * create builder for ProductPresentWithDifferentVariantSelectionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPresentWithDifferentVariantSelectionErrorBuilder builder(
            final ProductPresentWithDifferentVariantSelectionError template) {
        return ProductPresentWithDifferentVariantSelectionErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPresentWithDifferentVariantSelectionError(
            Function<ProductPresentWithDifferentVariantSelectionError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPresentWithDifferentVariantSelectionError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPresentWithDifferentVariantSelectionError>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPresentWithDifferentVariantSelectionError>";
            }
        };
    }
}
