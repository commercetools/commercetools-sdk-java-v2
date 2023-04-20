
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Given the mode of Product Selection, this assignment refers to, it may contain:</p>
 *  <ul>
 *   <li><code>variantSelection</code> field for a Product Selection with <code>Individual</code> ProductSelectionMode.</li>
 *   <li><code>variantExclusion</code> field for a Product Selection with <code>IndividualExclusion</code> ProductSelectionMode (BETA).</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionAssignment productSelectionAssignment = ProductSelectionAssignment.builder()
 *             .product(productBuilder -> productBuilder)
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionAssignmentImpl.class)
public interface ProductSelectionAssignment {

    /**
     *  <p>Reference to a Product that is assigned to the ProductSelection.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     * @return productSelection
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionReference getProductSelection();

    /**
     *  <p>Define which Variants of the added Product will be included in the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>Individual</code> ProductSelectionMode. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     * @return variantSelection
     */
    @Valid
    @JsonProperty("variantSelection")
    public ProductVariantSelection getVariantSelection();

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>IndividualExclusion</code> ProductSelectionMode. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     * @return variantExclusion
     */
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    /**
     *  <p>Reference to a Product that is assigned to the ProductSelection.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     * @param productSelection value to be set
     */

    public void setProductSelection(final ProductSelectionReference productSelection);

    /**
     *  <p>Define which Variants of the added Product will be included in the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>Individual</code> ProductSelectionMode. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     * @param variantSelection value to be set
     */

    public void setVariantSelection(final ProductVariantSelection variantSelection);

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>IndividualExclusion</code> ProductSelectionMode. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     * @param variantExclusion value to be set
     */

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    /**
     * factory method
     * @return instance of ProductSelectionAssignment
     */
    public static ProductSelectionAssignment of() {
        return new ProductSelectionAssignmentImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionAssignment
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionAssignment of(final ProductSelectionAssignment template) {
        ProductSelectionAssignmentImpl instance = new ProductSelectionAssignmentImpl();
        instance.setProduct(template.getProduct());
        instance.setProductSelection(template.getProductSelection());
        instance.setVariantSelection(template.getVariantSelection());
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionAssignment
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionAssignment deepCopy(@Nullable final ProductSelectionAssignment template) {
        if (template == null) {
            return null;
        }
        ProductSelectionAssignmentImpl instance = new ProductSelectionAssignmentImpl();
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setProductSelection(com.commercetools.api.models.product_selection.ProductSelectionReference
                .deepCopy(template.getProductSelection()));
        instance.setVariantSelection(com.commercetools.api.models.product_selection.ProductVariantSelection
                .deepCopy(template.getVariantSelection()));
        instance.setVariantExclusion(com.commercetools.api.models.product_selection.ProductVariantExclusion
                .deepCopy(template.getVariantExclusion()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionAssignment
     * @return builder
     */
    public static ProductSelectionAssignmentBuilder builder() {
        return ProductSelectionAssignmentBuilder.of();
    }

    /**
     * create builder for ProductSelectionAssignment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionAssignmentBuilder builder(final ProductSelectionAssignment template) {
        return ProductSelectionAssignmentBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionAssignment(Function<ProductSelectionAssignment, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionAssignment> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionAssignment>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionAssignment>";
            }
        };
    }
}
