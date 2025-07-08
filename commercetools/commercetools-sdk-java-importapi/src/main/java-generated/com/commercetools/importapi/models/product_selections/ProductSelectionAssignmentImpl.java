
package com.commercetools.importapi.models.product_selections;

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
 *  <p>An assignment of a product and either variantSelection or variantExclusion (not both).</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionAssignmentImpl implements ProductSelectionAssignment, ModelBase {

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    private com.commercetools.importapi.models.product_selections.VariantSelection variantSelection;

    private com.commercetools.importapi.models.product_selections.VariantExclusion variantExclusion;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionAssignmentImpl(
            @JsonProperty("product") final com.commercetools.importapi.models.common.ProductKeyReference product,
            @JsonProperty("variantSelection") final com.commercetools.importapi.models.product_selections.VariantSelection variantSelection,
            @JsonProperty("variantExclusion") final com.commercetools.importapi.models.product_selections.VariantExclusion variantExclusion) {
        this.product = product;
        this.variantSelection = variantSelection;
        this.variantExclusion = variantExclusion;
    }

    /**
     * create empty instance
     */
    public ProductSelectionAssignmentImpl() {
    }

    /**
     *  <p>Reference to the Product by key.</p>
     */

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Variant selection specifying included SKUs.</p>
     */

    public com.commercetools.importapi.models.product_selections.VariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    /**
     *  <p>Variant exclusion specifying excluded SKUs.</p>
     */

    public com.commercetools.importapi.models.product_selections.VariantExclusion getVariantExclusion() {
        return this.variantExclusion;
    }

    public void setProduct(final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
    }

    public void setVariantSelection(
            final com.commercetools.importapi.models.product_selections.VariantSelection variantSelection) {
        this.variantSelection = variantSelection;
    }

    public void setVariantExclusion(
            final com.commercetools.importapi.models.product_selections.VariantExclusion variantExclusion) {
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
    public ProductSelectionAssignment copyDeep() {
        return ProductSelectionAssignment.deepCopy(this);
    }
}
