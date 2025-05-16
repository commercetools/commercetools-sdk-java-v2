
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
 *  <p>Updates the Product Variant Selection of an existing Product Selection Assignment. A ProductVariantSelection can only be set if the Product has already been included in the Product Selection with <code>Individual</code> ProductSelectionMode.</p>
 *  <p>If the specified Product is not assigned to the Product Selection, a ProductAssignmentMissing error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionSetVariantSelectionAction productSelectionSetVariantSelectionAction = ProductSelectionSetVariantSelectionAction.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setVariantSelection")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionSetVariantSelectionActionImpl.class)
public interface ProductSelectionSetVariantSelectionAction extends ProductSelectionUpdateAction {

    /**
     * discriminator value for ProductSelectionSetVariantSelectionAction
     */
    String SET_VARIANT_SELECTION = "setVariantSelection";

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductResourceIdentifier getProduct();

    /**
     *  <p>Determines which Variants of the previously added Product are to be included in, or excluded from, the Product Selection. Leave it empty to unset an existing Variant Selection.</p>
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
     *  <p>Determines which Variants of the previously added Product are to be included in, or excluded from, the Product Selection. Leave it empty to unset an existing Variant Selection.</p>
     * @param variantSelection value to be set
     */

    public void setVariantSelection(final ProductVariantSelection variantSelection);

    /**
     * factory method
     * @return instance of ProductSelectionSetVariantSelectionAction
     */
    public static ProductSelectionSetVariantSelectionAction of() {
        return new ProductSelectionSetVariantSelectionActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionSetVariantSelectionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionSetVariantSelectionAction of(
            final ProductSelectionSetVariantSelectionAction template) {
        ProductSelectionSetVariantSelectionActionImpl instance = new ProductSelectionSetVariantSelectionActionImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantSelection(template.getVariantSelection());
        return instance;
    }

    public ProductSelectionSetVariantSelectionAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionSetVariantSelectionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionSetVariantSelectionAction deepCopy(
            @Nullable final ProductSelectionSetVariantSelectionAction template) {
        if (template == null) {
            return null;
        }
        ProductSelectionSetVariantSelectionActionImpl instance = new ProductSelectionSetVariantSelectionActionImpl();
        instance.setProduct(
            com.commercetools.api.models.product.ProductResourceIdentifier.deepCopy(template.getProduct()));
        instance.setVariantSelection(com.commercetools.api.models.product_selection.ProductVariantSelection
                .deepCopy(template.getVariantSelection()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionSetVariantSelectionAction
     * @return builder
     */
    public static ProductSelectionSetVariantSelectionActionBuilder builder() {
        return ProductSelectionSetVariantSelectionActionBuilder.of();
    }

    /**
     * create builder for ProductSelectionSetVariantSelectionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionSetVariantSelectionActionBuilder builder(
            final ProductSelectionSetVariantSelectionAction template) {
        return ProductSelectionSetVariantSelectionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionSetVariantSelectionAction(
            Function<ProductSelectionSetVariantSelectionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetVariantSelectionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionSetVariantSelectionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionSetVariantSelectionAction>";
            }
        };
    }
}
