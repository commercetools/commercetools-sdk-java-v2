
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * AssignedProductReference
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssignedProductReferenceImpl implements AssignedProductReference, ModelBase {

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssignedProductReferenceImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("variantSelection") final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection,
            @JsonProperty("variantExclusion") final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.product = product;
        this.variantSelection = variantSelection;
        this.variantExclusion = variantExclusion;
    }

    /**
     * create empty instance
     */
    public AssignedProductReferenceImpl() {
    }

    /**
     *  <p>Reference to a Product that is assigned to the Product Selection.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>The Variants of the Product that are included from the Product Selection.</p>
     *  <p>This field may exist only in Product Selections with <code>Individual</code> ProductSelectionMode. In absence of this field, all Variants are deemed to be included.</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    /**
     *  <p>The Variants of the Product that are excluded from the Product Selection.</p>
     *  <p>This field may exist only in Product Selections with <code>IndividualExclusion</code> ProductSelectionMode. In absence of this field, all Variants are deemed to be excluded.</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
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

        AssignedProductReferenceImpl that = (AssignedProductReferenceImpl) o;

        return new EqualsBuilder().append(product, that.product)
                .append(variantSelection, that.variantSelection)
                .append(variantExclusion, that.variantExclusion)
                .append(product, that.product)
                .append(variantSelection, that.variantSelection)
                .append(variantExclusion, that.variantExclusion)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(product)
                .append(variantSelection)
                .append(variantExclusion)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("product", product)
                .append("variantSelection", variantSelection)
                .append("variantExclusion", variantExclusion)
                .build();
    }

    @Override
    public AssignedProductReference copyDeep() {
        return AssignedProductReference.deepCopy(this);
    }
}
