
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
 *  <p>Updates the Product Variant Selection of an existing Product Selection Assignment. A ProductVariantSelection can only be set if the Product has already been included in the Product Selection with <code>Individual</code> ProductSelectionMode.</p>
 *  <p>If the specified Product is not assigned to the Product Selection, a ProductAssignmentMissing error is returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionSetVariantSelectionActionImpl
        implements ProductSelectionSetVariantSelectionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionSetVariantSelectionActionImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductResourceIdentifier product,
            @JsonProperty("variantSelection") final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.product = product;
        this.variantSelection = variantSelection;
        this.action = SET_VARIANT_SELECTION;
    }

    /**
     * create empty instance
     */
    public ProductSelectionSetVariantSelectionActionImpl() {
        this.action = SET_VARIANT_SELECTION;
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
     *  <p>Determines which Variants of the previously added Product are to be included in, or excluded from, the Product Selection. Leave it empty to unset an existing Variant Selection.</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
    }

    public void setVariantSelection(
            final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSelectionSetVariantSelectionActionImpl that = (ProductSelectionSetVariantSelectionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(product, that.product)
                .append(variantSelection, that.variantSelection)
                .append(action, that.action)
                .append(product, that.product)
                .append(variantSelection, that.variantSelection)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(product).append(variantSelection).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("product", product)
                .append("variantSelection", variantSelection)
                .build();
    }

    @Override
    public ProductSelectionSetVariantSelectionAction copyDeep() {
        return ProductSelectionSetVariantSelectionAction.deepCopy(this);
    }
}
