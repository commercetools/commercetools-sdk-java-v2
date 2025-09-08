
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
 *  <p>Adds a Product to the Product Selection.</p>
 *  <p>If the specified Product is already assigned to the Product Selection, but the existing Product Selection has a different Product Variant Selection, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductPresentWithDifferentVariantSelectionError" rel="nofollow">ProductPresentWithDifferentVariantSelection</a> error is returned.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionAddProductActionImpl implements ProductSelectionAddProductAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionAddProductActionImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductResourceIdentifier product,
            @JsonProperty("variantSelection") final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.product = product;
        this.variantSelection = variantSelection;
        this.action = ADD_PRODUCT;
    }

    /**
     * create empty instance
     */
    public ProductSelectionAddProductActionImpl() {
        this.action = ADD_PRODUCT;
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
     *  <p>Defines which Variants of the Product will be included in the Product Selection. If not supplied all Variants are deemed to be included.</p>
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

        ProductSelectionAddProductActionImpl that = (ProductSelectionAddProductActionImpl) o;

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
    public ProductSelectionAddProductAction copyDeep() {
        return ProductSelectionAddProductAction.deepCopy(this);
    }
}
