
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Given the type of Product Selection this Assignment refers to, it may contain:</p>
 *  <ul>
 *   <li><code>variantSelection</code> field if the Product Selection is of type Individual.</li>
 *   <li><code>variantExclusion</code> field if the Product Selection is of type Individual Exclusion.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionAssignmentImpl implements ProductSelectionAssignment, ModelBase {

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductSelectionReference productSelection;

    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    @JsonCreator
    ProductSelectionAssignmentImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("productSelection") final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection,
            @JsonProperty("variantSelection") final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection,
            @JsonProperty("variantExclusion") final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.product = product;
        this.productSelection = productSelection;
        this.variantSelection = variantSelection;
        this.variantExclusion = variantExclusion;
    }

    public ProductSelectionAssignmentImpl() {
    }

    /**
     *  <p>Reference to a Product that is assigned to the ProductSelection.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     */

    public com.commercetools.api.models.product_selection.ProductSelectionReference getProductSelection() {
        return this.productSelection;
    }

    /**
     *  <p>Define which Variants of the added Product will be included from the Product Selection.</p>
     *  <p>This field is only available for Assignments to a Product Selection of type Individual. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for Assignments to a Product Selection of type Individual Exclusion. The list of SKUs will be updated automatically on any change of those performed on the respective Product itself.</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public void setProductSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection) {
        this.productSelection = productSelection;
    }

    public void setVariantSelection(
            final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
    }

    public void setVariantExclusion(
            final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.variantExclusion = variantExclusion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSelectionAssignmentImpl that = (ProductSelectionAssignmentImpl) o;

        return new EqualsBuilder().append(product, that.product)
                .append(productSelection, that.productSelection)
                .append(variantSelection, that.variantSelection)
                .append(variantExclusion, that.variantExclusion)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(product)
                .append(productSelection)
                .append(variantSelection)
                .append(variantExclusion)
                .toHashCode();
    }

}
