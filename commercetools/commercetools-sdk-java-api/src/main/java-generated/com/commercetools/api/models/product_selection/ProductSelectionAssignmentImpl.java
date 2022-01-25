
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
*  <p>Specifies which Product is assigned to which Product Selection.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionAssignmentImpl implements ProductSelectionAssignment, ModelBase {

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductSelectionReference productSelection;

    @JsonCreator
    ProductSelectionAssignmentImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product,
            @JsonProperty("productSelection") final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection) {
        this.product = product;
        this.productSelection = productSelection;
    }

    public ProductSelectionAssignmentImpl() {
    }

    /**
    *  <p>Reference to a Product that is assigned to the Product Selection.</p>
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

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public void setProductSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection) {
        this.productSelection = productSelection;
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(product).append(productSelection).toHashCode();
    }

}
