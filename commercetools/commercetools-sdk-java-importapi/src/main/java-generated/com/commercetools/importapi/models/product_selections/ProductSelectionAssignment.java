
package com.commercetools.importapi.models.product_selections;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ProductKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>An assignment of a product and either variantSelection or variantExclusion (not both).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionAssignment productSelectionAssignment = ProductSelectionAssignment.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionAssignmentImpl.class)
public interface ProductSelectionAssignment {

    /**
     *  <p>Reference to the Product by key.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductKeyReference getProduct();

    /**
     *  <p>Variant selection specifying included SKUs.</p>
     * @return variantSelection
     */
    @Valid
    @JsonProperty("variantSelection")
    public VariantSelection getVariantSelection();

    /**
     *  <p>Variant exclusion specifying excluded SKUs.</p>
     * @return variantExclusion
     */
    @Valid
    @JsonProperty("variantExclusion")
    public VariantExclusion getVariantExclusion();

    /**
     *  <p>Reference to the Product by key.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductKeyReference product);

    /**
     *  <p>Variant selection specifying included SKUs.</p>
     * @param variantSelection value to be set
     */

    public void setVariantSelection(final VariantSelection variantSelection);

    /**
     *  <p>Variant exclusion specifying excluded SKUs.</p>
     * @param variantExclusion value to be set
     */

    public void setVariantExclusion(final VariantExclusion variantExclusion);

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
        instance.setVariantSelection(template.getVariantSelection());
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    public ProductSelectionAssignment copyDeep();

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
        instance.setProduct(
            com.commercetools.importapi.models.common.ProductKeyReference.deepCopy(template.getProduct()));
        instance.setVariantSelection(com.commercetools.importapi.models.product_selections.VariantSelection
                .deepCopy(template.getVariantSelection()));
        instance.setVariantExclusion(com.commercetools.importapi.models.product_selections.VariantExclusion
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
