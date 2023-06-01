package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.product_selection.ProductSelectionReference;
import com.commercetools.api.models.product_selection.ProductVariantExclusion;
import com.commercetools.api.models.product_selection.ProductVariantSelection;
import java.time.ZonedDateTime;
import com.commercetools.api.models.product_selection.AssignedProductSelectionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * AssignedProductSelection
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssignedProductSelection assignedProductSelection = AssignedProductSelection.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AssignedProductSelectionImpl.class)
public interface AssignedProductSelection  {


    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     * @return productSelection
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionReference getProductSelection();
    /**
     *  <p>Defines which Variants of the Product will be included in the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>Individual</code> ProductSelectionMode.</p>
     * @return variantSelection
     */
    @Valid
    @JsonProperty("variantSelection")
    public ProductVariantSelection getVariantSelection();
    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>IndividualExclusion</code> ProductSelectionMode.</p>
     * @return variantExclusion
     */
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();
    /**
     *  <p>Date and time (UTC) this assignment was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     * @param productSelection value to be set
     */
    
    public void setProductSelection(final ProductSelectionReference productSelection);
    
    
    /**
     *  <p>Defines which Variants of the Product will be included in the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>Individual</code> ProductSelectionMode.</p>
     * @param variantSelection value to be set
     */
    
    public void setVariantSelection(final ProductVariantSelection variantSelection);
    
    
    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>IndividualExclusion</code> ProductSelectionMode.</p>
     * @param variantExclusion value to be set
     */
    
    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);
    
    
    /**
     *  <p>Date and time (UTC) this assignment was initially created.</p>
     * @param createdAt value to be set
     */
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    

    /**
     * factory method
     * @return instance of AssignedProductSelection
     */
    public static AssignedProductSelection of(){
        return new AssignedProductSelectionImpl();
    }
    

    /**
     * factory method to create a shallow copy AssignedProductSelection
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssignedProductSelection of(final AssignedProductSelection template) {
        AssignedProductSelectionImpl instance = new AssignedProductSelectionImpl();
        instance.setProductSelection(template.getProductSelection());
        instance.setVariantSelection(template.getVariantSelection());
        instance.setVariantExclusion(template.getVariantExclusion());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssignedProductSelection
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssignedProductSelection deepCopy(@Nullable final AssignedProductSelection template) {
        if (template == null) {
            return null;
        }
        AssignedProductSelectionImpl instance = new AssignedProductSelectionImpl();
        instance.setProductSelection(com.commercetools.api.models.product_selection.ProductSelectionReference.deepCopy(template.getProductSelection()));
        instance.setVariantSelection(com.commercetools.api.models.product_selection.ProductVariantSelection.deepCopy(template.getVariantSelection()));
        instance.setVariantExclusion(com.commercetools.api.models.product_selection.ProductVariantExclusion.deepCopy(template.getVariantExclusion()));
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    /**
     * builder factory method for AssignedProductSelection
     * @return builder
     */
    public static AssignedProductSelectionBuilder builder() {
        return AssignedProductSelectionBuilder.of();
    }
    
    /**
     * create builder for AssignedProductSelection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssignedProductSelectionBuilder builder(final AssignedProductSelection template) {
        return AssignedProductSelectionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssignedProductSelection(Function<AssignedProductSelection, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssignedProductSelection> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssignedProductSelection>() {
            @Override
            public String toString() {
                return "TypeReference<AssignedProductSelection>";
            }
        };
    }
}
