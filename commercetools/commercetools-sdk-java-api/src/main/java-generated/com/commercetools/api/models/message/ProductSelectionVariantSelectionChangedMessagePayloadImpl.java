
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Set Variant Selection update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionVariantSelectionChangedMessagePayloadImpl
        implements ProductSelectionVariantSelectionChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductVariantSelection oldVariantSelection;

    private com.commercetools.api.models.product_selection.ProductVariantSelection newVariantSelection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionVariantSelectionChangedMessagePayloadImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("oldVariantSelection") final com.commercetools.api.models.product_selection.ProductVariantSelection oldVariantSelection,
            @JsonProperty("newVariantSelection") final com.commercetools.api.models.product_selection.ProductVariantSelection newVariantSelection) {
        this.product = product;
        this.oldVariantSelection = oldVariantSelection;
        this.newVariantSelection = newVariantSelection;
        this.type = PRODUCT_SELECTION_VARIANT_SELECTION_CHANGED;
    }

    /**
     * create empty instance
     */
    public ProductSelectionVariantSelectionChangedMessagePayloadImpl() {
        this.type = PRODUCT_SELECTION_VARIANT_SELECTION_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Product for which the Product Variant Selection changed.</p>
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Product Variant Selection before the Set Variant Selection update action.</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelection getOldVariantSelection() {
        return this.oldVariantSelection;
    }

    /**
     *  <p>Product Variant Selection after the Set Variant Selection update action.</p>
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelection getNewVariantSelection() {
        return this.newVariantSelection;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public void setOldVariantSelection(
            final com.commercetools.api.models.product_selection.ProductVariantSelection oldVariantSelection) {
        this.oldVariantSelection = oldVariantSelection;
    }

    public void setNewVariantSelection(
            final com.commercetools.api.models.product_selection.ProductVariantSelection newVariantSelection) {
        this.newVariantSelection = newVariantSelection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSelectionVariantSelectionChangedMessagePayloadImpl that = (ProductSelectionVariantSelectionChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(product, that.product)
                .append(oldVariantSelection, that.oldVariantSelection)
                .append(newVariantSelection, that.newVariantSelection)
                .append(type, that.type)
                .append(product, that.product)
                .append(oldVariantSelection, that.oldVariantSelection)
                .append(newVariantSelection, that.newVariantSelection)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(product)
                .append(oldVariantSelection)
                .append(newVariantSelection)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("product", product)
                .append("oldVariantSelection", oldVariantSelection)
                .append("newVariantSelection", newVariantSelection)
                .build();
    }

}
