
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
 * AssignedProductSelection
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssignedProductSelectionImpl implements AssignedProductSelection, ModelBase {

    private com.commercetools.api.models.product_selection.ProductSelectionReference productSelection;

    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    private java.time.ZonedDateTime createdAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssignedProductSelectionImpl(
            @JsonProperty("productSelection") final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection,
            @JsonProperty("variantSelection") final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection,
            @JsonProperty("variantExclusion") final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt) {
        this.productSelection = productSelection;
        this.variantSelection = variantSelection;
        this.variantExclusion = variantExclusion;
        this.createdAt = createdAt;
    }

    /**
     * create empty instance
     */
    public AssignedProductSelectionImpl() {
    }

    /**
     *  <p>Reference to the Product Selection that this assignment is part of.</p>
     */

    public com.commercetools.api.models.product_selection.ProductSelectionReference getProductSelection() {
        return this.productSelection;
    }

    /**
     *  <p>Defines which Variants of the Product will be included in the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>Individual</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    /**
     *  <p>Defines which Variants of the Product will be excluded from the Product Selection.</p>
     *  <p>This field is only available for assignments to a Product Selection with <code>IndividualExclusion</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionMode" rel="nofollow">ProductSelectionMode</a>.</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    /**
     *  <p>Date and time (UTC) this assignment was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
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

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssignedProductSelectionImpl that = (AssignedProductSelectionImpl) o;

        return new EqualsBuilder().append(productSelection, that.productSelection)
                .append(variantSelection, that.variantSelection)
                .append(variantExclusion, that.variantExclusion)
                .append(createdAt, that.createdAt)
                .append(productSelection, that.productSelection)
                .append(variantSelection, that.variantSelection)
                .append(variantExclusion, that.variantExclusion)
                .append(createdAt, that.createdAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productSelection)
                .append(variantSelection)
                .append(variantExclusion)
                .append(createdAt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("productSelection", productSelection)
                .append("variantSelection", variantSelection)
                .append("variantExclusion", variantExclusion)
                .append("createdAt", createdAt)
                .build();
    }

    @Override
    public AssignedProductSelection copyDeep() {
        return AssignedProductSelection.deepCopy(this);
    }
}
