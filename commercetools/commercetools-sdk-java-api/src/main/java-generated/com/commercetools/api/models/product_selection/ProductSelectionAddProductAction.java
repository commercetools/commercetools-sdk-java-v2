
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adds a Product to the Product Selection.</p>
 *  <p>If the specified Product is already assigned to the Product Selection, but the existing Product Selection has a different Product Variant Selection, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPresentWithDifferentVariantSelectionError" rel="nofollow">ProductPresentWithDifferentVariantSelection</a> error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionAddProductAction productSelectionAddProductAction = ProductSelectionAddProductAction.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addProduct")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionAddProductActionImpl.class)
public interface ProductSelectionAddProductAction extends ProductSelectionUpdateAction {

    /**
     * discriminator value for ProductSelectionAddProductAction
     */
    String ADD_PRODUCT = "addProduct";

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    /**
     *  <p>Defines which Variants of the Product will be included in the Product Selection. If not supplied all Variants are deemed to be included.</p>
     * @return variantSelection
     */
    @Valid
    @JsonProperty("variantSelection")
    public ProductVariantSelection getVariantSelection();

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @param product value to be set
     */

    public void setProduct(final ProductResourceIdentifier product);

    /**
     *  <p>Defines which Variants of the Product will be included in the Product Selection. If not supplied all Variants are deemed to be included.</p>
     * @param variantSelection value to be set
     */

    public void setVariantSelection(final ProductVariantSelection variantSelection);

    /**
     * factory method
     * @return instance of ProductSelectionAddProductAction
     */
    public static ProductSelectionAddProductAction of() {
        return new ProductSelectionAddProductActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionAddProductAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionAddProductAction of(final ProductSelectionAddProductAction template) {
        ProductSelectionAddProductActionImpl instance = new ProductSelectionAddProductActionImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantSelection(template.getVariantSelection());
        return instance;
    }

    public ProductSelectionAddProductAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionAddProductAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionAddProductAction deepCopy(@Nullable final ProductSelectionAddProductAction template) {
        if (template == null) {
            return null;
        }
        ProductSelectionAddProductActionImpl instance = new ProductSelectionAddProductActionImpl();
        instance.setProduct(
            com.commercetools.api.models.product.ProductResourceIdentifier.deepCopy(template.getProduct()));
        instance.setVariantSelection(com.commercetools.api.models.product_selection.ProductVariantSelection
                .deepCopy(template.getVariantSelection()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionAddProductAction
     * @return builder
     */
    public static ProductSelectionAddProductActionBuilder builder() {
        return ProductSelectionAddProductActionBuilder.of();
    }

    /**
     * create builder for ProductSelectionAddProductAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionAddProductActionBuilder builder(final ProductSelectionAddProductAction template) {
        return ProductSelectionAddProductActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionAddProductAction(Function<ProductSelectionAddProductAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionAddProductAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionAddProductAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionAddProductAction>";
            }
        };
    }
}
