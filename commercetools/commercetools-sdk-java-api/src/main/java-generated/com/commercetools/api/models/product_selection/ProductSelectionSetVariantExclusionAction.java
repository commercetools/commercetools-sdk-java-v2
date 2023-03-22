
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
 *  <p>Updates the Product Variant Exclusion of an existing Product Selection Assignment. A ProductVariantExclusion can only be set if the Product has already been excluded from the Product Selection of type Individual Exclusion.</p>
 *  <p>If the specified Product is not assigned to the Product Selection, a ProductAssignmentMissing error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetVariantExclusionAction productSelectionSetVariantExclusionAction = ProductSelectionSetVariantExclusionAction.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionSetVariantExclusionActionImpl.class)
public interface ProductSelectionSetVariantExclusionAction extends ProductSelectionUpdateAction {

    String SET_VARIANT_EXCLUSION = "setVariantExclusion";

    /**
     *  <p>ResourceIdentifier of the Product</p>
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    /**
     *  <p>Determines which Variants of the previously excluded Product are to be included in the Product Selection of type Individual Exclusion. Leave it empty to unset an existing Variant Exclusion.</p>
     */
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    public void setProduct(final ProductResourceIdentifier product);

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    public static ProductSelectionSetVariantExclusionAction of() {
        return new ProductSelectionSetVariantExclusionActionImpl();
    }

    public static ProductSelectionSetVariantExclusionAction of(
            final ProductSelectionSetVariantExclusionAction template) {
        ProductSelectionSetVariantExclusionActionImpl instance = new ProductSelectionSetVariantExclusionActionImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    public static ProductSelectionSetVariantExclusionActionBuilder builder() {
        return ProductSelectionSetVariantExclusionActionBuilder.of();
    }

    public static ProductSelectionSetVariantExclusionActionBuilder builder(
            final ProductSelectionSetVariantExclusionAction template) {
        return ProductSelectionSetVariantExclusionActionBuilder.of(template);
    }

    default <T> T withProductSelectionSetVariantExclusionAction(
            Function<ProductSelectionSetVariantExclusionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetVariantExclusionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetVariantExclusionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSetVariantExclusionAction>";
            }
        };
    }
}
