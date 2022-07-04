
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
 *  <p>Adds a Product to the Product Selection. If the given Product is already assigned to the Product Selection with the same Variant Selection nothing happens but if the existing Assignment has a different Variant Selection ProductPresentWithDifferentVariantSelection is raised.'</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionAddProductActionImpl implements ProductSelectionAddProductAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    @JsonCreator
    ProductSelectionAddProductActionImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductResourceIdentifier product,
            @JsonProperty("variantSelection") final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.product = product;
        this.variantSelection = variantSelection;
        this.action = ADD_PRODUCT;
    }

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
     *  <p>ResourceIdentifier to Product</p>
     */

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    /**
     *  <p>Selects which Variants of the newly added Product will be included, or excluded, from the Product Selection. If not supplied all Variants are deemed to be included.</p>
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(product).append(variantSelection).toHashCode();
    }

}
