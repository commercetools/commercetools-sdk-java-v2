
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Given the type of Product Selection this Assignment refers to, it may contain:</p>
 *  <ul>
 *   <li><code>variantSelection</code> field if the Product Selection is of type Individual.</li>
 *   <li><code>variantExclusion</code> field if the Product Selection is of type Individual Exclusion.</li>
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
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionReference getProductSelection();

    /**
     *  <p>Define which Variants of the added Product will be included from the Product Selection.</p>
     *  <p>This field is only available for Assignments to a Product Selection of type Individual. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     */
    @Valid
    @JsonProperty("variantSelection")
    public ProductVariantSelection getVariantSelection();

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for Assignments to a Product Selection of type Individual Exclusion. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     */
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    public void setProduct(final ProductReference product);

    public void setProductSelection(final ProductSelectionReference productSelection);

    public void setVariantSelection(final ProductVariantSelection variantSelection);

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    public static ProductSelectionAssignment of() {
        return new ProductSelectionAssignmentImpl();
    }

    public static ProductSelectionAssignment of(final ProductSelectionAssignment template) {
        ProductSelectionAssignmentImpl instance = new ProductSelectionAssignmentImpl();
        instance.setProduct(template.getProduct());
        instance.setProductSelection(template.getProductSelection());
        instance.setVariantSelection(template.getVariantSelection());
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    public static ProductSelectionAssignmentBuilder builder() {
        return ProductSelectionAssignmentBuilder.of();
    }

    public static ProductSelectionAssignmentBuilder builder(final ProductSelectionAssignment template) {
        return ProductSelectionAssignmentBuilder.of(template);
    }

    default <T> T withProductSelectionAssignment(Function<ProductSelectionAssignment, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionAssignment> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionAssignment>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionAssignment>";
            }
        };
    }
}
