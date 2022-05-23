
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   AssignedProductSelection assignedProductSelection = AssignedProductSelection.builder()
           .productSelection(productSelectionBuilder -> productSelectionBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssignedProductSelectionBuilder implements Builder<AssignedProductSelection> {

    private com.commercetools.api.models.product_selection.ProductSelectionReference productSelection;

    /**
     *  <p>Reference to the ProductSelection that this assignment is part of.</p>
     */

    public AssignedProductSelectionBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder, com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the ProductSelection that this assignment is part of.</p>
     */

    public AssignedProductSelectionBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    public com.commercetools.api.models.product_selection.ProductSelectionReference getProductSelection() {
        return this.productSelection;
    }

    public AssignedProductSelection build() {
        Objects.requireNonNull(productSelection, AssignedProductSelection.class + ": productSelection is missing");
        return new AssignedProductSelectionImpl(productSelection);
    }

    /**
     * builds AssignedProductSelection without checking for non null required values
     */
    public AssignedProductSelection buildUnchecked() {
        return new AssignedProductSelectionImpl(productSelection);
    }

    public static AssignedProductSelectionBuilder of() {
        return new AssignedProductSelectionBuilder();
    }

    public static AssignedProductSelectionBuilder of(final AssignedProductSelection template) {
        AssignedProductSelectionBuilder builder = new AssignedProductSelectionBuilder();
        builder.productSelection = template.getProductSelection();
        return builder;
    }

}
