
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
public class ProductSelectionAddProductActionImpl implements ProductSelectionAddProductAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    @JsonCreator
    ProductSelectionAddProductActionImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        this.action = ADD_PRODUCT;
    }

    public ProductSelectionAddProductActionImpl() {
        this.action = ADD_PRODUCT;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>ResourceIdentifier to Product</p>
    */
    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    public void setProduct(final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSelectionAddProductActionImpl that = (ProductSelectionAddProductActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(product, that.product).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(product).toHashCode();
    }

}
