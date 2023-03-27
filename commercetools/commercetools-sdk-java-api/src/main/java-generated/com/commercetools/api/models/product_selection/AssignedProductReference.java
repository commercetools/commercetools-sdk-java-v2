
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
 * AssignedProductReference
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssignedProductReference assignedProductReference = AssignedProductReference.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssignedProductReferenceImpl.class)
public interface AssignedProductReference {

    /**
     *  <p>Reference to a Product that is assigned to the Product Selection.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>The Variants of the Product that are included from the Product Selection.</p>
     *  <p>This field may exist only for the IndividualProductSelectionType. In absence of this field, all Variants are deemed to be included.</p>
     * @return variantSelection
     */
    @Valid
    @JsonProperty("variantSelection")
    public ProductVariantSelection getVariantSelection();

    /**
     *  <p>The Variants of the Product that are excluded from the Product Selection.</p>
     *  <p>This field may exist only for the IndividualExclusionProductSelectionType. In absence of this field, all Variants are deemed to be excluded.</p>
     * @return variantExclusion
     */
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    /**
     *  <p>Reference to a Product that is assigned to the Product Selection.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p>The Variants of the Product that are included from the Product Selection.</p>
     *  <p>This field may exist only for the IndividualProductSelectionType. In absence of this field, all Variants are deemed to be included.</p>
     * @param variantSelection value to be set
     */

    public void setVariantSelection(final ProductVariantSelection variantSelection);

    /**
     *  <p>The Variants of the Product that are excluded from the Product Selection.</p>
     *  <p>This field may exist only for the IndividualExclusionProductSelectionType. In absence of this field, all Variants are deemed to be excluded.</p>
     * @param variantExclusion value to be set
     */

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    /**
     * factory method
     * @return instance of AssignedProductReference
     */
    public static AssignedProductReference of() {
        return new AssignedProductReferenceImpl();
    }

    /**
     * factory method to copy an instance of AssignedProductReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssignedProductReference of(final AssignedProductReference template) {
        AssignedProductReferenceImpl instance = new AssignedProductReferenceImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantSelection(template.getVariantSelection());
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    /**
     * builder factory method for AssignedProductReference
     * @return builder
     */
    public static AssignedProductReferenceBuilder builder() {
        return AssignedProductReferenceBuilder.of();
    }

    /**
     * create builder for AssignedProductReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssignedProductReferenceBuilder builder(final AssignedProductReference template) {
        return AssignedProductReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssignedProductReference(Function<AssignedProductReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssignedProductReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssignedProductReference>() {
            @Override
            public String toString() {
                return "TypeReference<AssignedProductReference>";
            }
        };
    }
}
