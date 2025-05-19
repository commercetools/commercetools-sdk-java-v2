
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
 *  <p>Updates the Product Variant Exclusion of an existing Product Selection Assignment. A ProductVariantExclusion can only be set if the Product has already been excluded from the Product Selection with <code>IndividualExclusion</code> ProductSelectionMode.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("setVariantExclusion")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionSetVariantExclusionActionImpl.class)
public interface ProductSelectionSetVariantExclusionAction extends ProductSelectionUpdateAction {

    /**
     * discriminator value for ProductSelectionSetVariantExclusionAction
     */
    String SET_VARIANT_EXCLUSION = "setVariantExclusion";

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    /**
     *  <p>Determines which Variants of the previously excluded Product are to be included in the Product Selection with <code>IndividualExclusion</code> ProductSelectionMode. Leave it empty to unset an existing Variant Exclusion.</p>
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
     *  <p>Determines which Variants of the previously excluded Product are to be included in the Product Selection with <code>IndividualExclusion</code> ProductSelectionMode. Leave it empty to unset an existing Variant Exclusion.</p>
     * @param variantExclusion value to be set
     */

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    /**
     * factory method
     * @return instance of ProductSelectionSetVariantExclusionAction
     */
    public static ProductSelectionSetVariantExclusionAction of() {
        return new ProductSelectionSetVariantExclusionActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionSetVariantExclusionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionSetVariantExclusionAction of(
            final ProductSelectionSetVariantExclusionAction template) {
        ProductSelectionSetVariantExclusionActionImpl instance = new ProductSelectionSetVariantExclusionActionImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    public ProductSelectionSetVariantExclusionAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionSetVariantExclusionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionSetVariantExclusionAction deepCopy(
            @Nullable final ProductSelectionSetVariantExclusionAction template) {
        if (template == null) {
            return null;
        }
        ProductSelectionSetVariantExclusionActionImpl instance = new ProductSelectionSetVariantExclusionActionImpl();
        instance.setProduct(
            com.commercetools.api.models.product.ProductResourceIdentifier.deepCopy(template.getProduct()));
        instance.setVariantExclusion(com.commercetools.api.models.product_selection.ProductVariantExclusion
                .deepCopy(template.getVariantExclusion()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionSetVariantExclusionAction
     * @return builder
     */
    public static ProductSelectionSetVariantExclusionActionBuilder builder() {
        return ProductSelectionSetVariantExclusionActionBuilder.of();
    }

    /**
     * create builder for ProductSelectionSetVariantExclusionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSetVariantExclusionActionBuilder builder(
            final ProductSelectionSetVariantExclusionAction template) {
        return ProductSelectionSetVariantExclusionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionSetVariantExclusionAction(
            Function<ProductSelectionSetVariantExclusionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetVariantExclusionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetVariantExclusionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSetVariantExclusionAction>";
            }
        };
    }
}
