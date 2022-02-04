
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AssignedProductReferenceImpl implements AssignedProductReference, ModelBase {

    private com.commercetools.api.models.product.ProductReference product;

    @JsonCreator
    AssignedProductReferenceImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    public AssignedProductReferenceImpl() {
    }

    /**
    *  <p>Reference to a Product that is assigned to the Product Selection.</p>
    */
    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssignedProductReferenceImpl that = (AssignedProductReferenceImpl) o;

        return new EqualsBuilder().append(product, that.product).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(product).toHashCode();
    }

}
