
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
 *  <p>Updates the Product Variant Exclusion of an existing Product Selection Assignment. A ProductVariantExclusion can only be set if the Product has already been excluded from the Product Selection with <code>IndividualExclusion</code> ProductSelectionMode.</p>
 *  <p>If the specified Product is not assigned to the Product Selection, a ProductAssignmentMissing error is returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionSetVariantExclusionActionImpl
        implements ProductSelectionSetVariantExclusionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    private com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionSetVariantExclusionActionImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductResourceIdentifier product,
            @JsonProperty("variantExclusion") final com.commercetools.api.models.product_selection.ProductVariantExclusion variantExclusion) {
        this.product = product;
        this.variantExclusion = variantExclusion;
        this.action = SET_VARIANT_EXCLUSION;
    }

    /**
     * create empty instance
     */
    public ProductSelectionSetVariantExclusionActionImpl() {
        this.action = SET_VARIANT_EXCLUSION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>ResourceIdentifier of the Product</p>
     */

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    /**
     *  <p>Determines which Variants of the previously excluded Product are to be included in the Product Selection with <code>IndividualExclusion</code> ProductSelectionMode. Leave it empty to unset an existing Variant Exclusion.</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
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

        ProductSelectionSetVariantExclusionActionImpl that = (ProductSelectionSetVariantExclusionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(product, that.product)
                .append(variantExclusion, that.variantExclusion)
                .append(action, that.action)
                .append(product, that.product)
                .append(variantExclusion, that.variantExclusion)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(product).append(variantExclusion).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("product", product)
                .append("variantExclusion", variantExclusion)
                .build();
    }

    @Override
    public ProductSelectionSetVariantExclusionAction copyDeep() {
        return ProductSelectionSetVariantExclusionAction.deepCopy(this);
    }
}
