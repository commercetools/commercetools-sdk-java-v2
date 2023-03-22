
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssignedProductSelectionImpl.class)
public interface AssignedProductSelection {

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelectionReference getProductSelection();

    /**
     *  <p>Defines which Variants of the Product will be included from the Product Selection.</p>
     *  <p>This field is only available for Assignments to a Product Selection of type Individual.</p>
     */
    @Valid
    @JsonProperty("variantSelection")
    public ProductVariantSelection getVariantSelection();

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for Assignments to a Product Selection of type Individual Exclusion.</p>
     */
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    /**
     *  <p>Date and time (UTC) this assignment was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    public void setProductSelection(final ProductSelectionReference productSelection);

    public void setVariantSelection(final ProductVariantSelection variantSelection);

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public static AssignedProductSelection of() {
        return new AssignedProductSelectionImpl();
    }

    public static AssignedProductSelection of(final AssignedProductSelection template) {
        AssignedProductSelectionImpl instance = new AssignedProductSelectionImpl();
        instance.setProductSelection(template.getProductSelection());
        instance.setVariantSelection(template.getVariantSelection());
        instance.setVariantExclusion(template.getVariantExclusion());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    public static AssignedProductSelectionBuilder builder() {
        return AssignedProductSelectionBuilder.of();
    }

    public static AssignedProductSelectionBuilder builder(final AssignedProductSelection template) {
        return AssignedProductSelectionBuilder.of(template);
    }

    default <T> T withAssignedProductSelection(Function<AssignedProductSelection, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AssignedProductSelection> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssignedProductSelection>() {
            @Override
            public String toString() {
                return "TypeReference<AssignedProductSelection>";
            }
        };
    }
}
