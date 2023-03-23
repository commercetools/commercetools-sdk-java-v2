
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds a Product to the Product Selection.</p>
 *  <p>If the specified Product is already assigned to the Product Selection, but the existing Product Selection has a different Product Variant Selection, a ProductPresentWithDifferentVariantSelection error is returned.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionAddProductActionImpl.class)
public interface ProductSelectionAddProductAction extends ProductSelectionUpdateAction {

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
     *  <p>Defines which Variants of the Product will be included from the Product Selection. If not supplied all Variants are deemed to be included.</p>
     * @return variantSelection
     */
    @Valid
    @JsonProperty("variantSelection")
    public ProductVariantSelection getVariantSelection();

    public void setProduct(final ProductResourceIdentifier product);

    public void setVariantSelection(final ProductVariantSelection variantSelection);

    public static ProductSelectionAddProductAction of() {
        return new ProductSelectionAddProductActionImpl();
    }

    public static ProductSelectionAddProductAction of(final ProductSelectionAddProductAction template) {
        ProductSelectionAddProductActionImpl instance = new ProductSelectionAddProductActionImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantSelection(template.getVariantSelection());
        return instance;
    }

    public static ProductSelectionAddProductActionBuilder builder() {
        return ProductSelectionAddProductActionBuilder.of();
    }

    public static ProductSelectionAddProductActionBuilder builder(final ProductSelectionAddProductAction template) {
        return ProductSelectionAddProductActionBuilder.of(template);
    }

    default <T> T withProductSelectionAddProductAction(Function<ProductSelectionAddProductAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionAddProductAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionAddProductAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionAddProductAction>";
            }
        };
    }
}
