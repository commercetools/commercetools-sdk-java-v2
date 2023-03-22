
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
 *  <p>Excludes a Product from the Product Selection of type Individual Exclusion.</p>
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

    String EXCLUDE_PRODUCT = "excludeProduct";

    /**
     *  <p>ResourceIdentifier of the Product</p>
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection. If not supplied all Variants are deemed to be excluded.</p>
     */
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    public void setProduct(final ProductResourceIdentifier product);

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    public static ProductSelectionExcludeProductAction of() {
        return new ProductSelectionExcludeProductActionImpl();
    }

    public static ProductSelectionExcludeProductAction of(final ProductSelectionExcludeProductAction template) {
        ProductSelectionExcludeProductActionImpl instance = new ProductSelectionExcludeProductActionImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    public static ProductSelectionExcludeProductActionBuilder builder() {
        return ProductSelectionExcludeProductActionBuilder.of();
    }

    public static ProductSelectionExcludeProductActionBuilder builder(
            final ProductSelectionExcludeProductAction template) {
        return ProductSelectionExcludeProductActionBuilder.of(template);
    }

    default <T> T withProductSelectionExcludeProductAction(Function<ProductSelectionExcludeProductAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionExcludeProductAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionExcludeProductAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionExcludeProductAction>";
            }
        };
    }
}
