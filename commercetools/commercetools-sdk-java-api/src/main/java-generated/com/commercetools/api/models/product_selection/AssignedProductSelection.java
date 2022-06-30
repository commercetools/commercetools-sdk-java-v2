
package com.commercetools.api.models.product_selection;

import java.time.*;
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
     *  <p>Selects which Variants of the newly added Product will be included, or excluded, from the Product Selection.</p>
     */
    @Valid
    @JsonProperty("variantSelection")
    public ProductVariantSelection getVariantSelection();

    public void setProductSelection(final ProductSelectionReference productSelection);

    public void setVariantSelection(final ProductVariantSelection variantSelection);

    public static AssignedProductSelection of() {
        return new AssignedProductSelectionImpl();
    }

    public static AssignedProductSelection of(final AssignedProductSelection template) {
        AssignedProductSelectionImpl instance = new AssignedProductSelectionImpl();
        instance.setProductSelection(template.getProductSelection());
        instance.setVariantSelection(template.getVariantSelection());
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
