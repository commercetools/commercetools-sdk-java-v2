
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionProductAddedMessagePayloadImpl
        implements ProductSelectionProductAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.product.ProductReference product;

    @JsonCreator
    ProductSelectionProductAddedMessagePayloadImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        this.type = PRODUCT_SELECTION_PRODUCT_ADDED;
    }

    public ProductSelectionProductAddedMessagePayloadImpl() {
        this.type = PRODUCT_SELECTION_PRODUCT_ADDED;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:Product">Product</a>.</p>
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

        ProductSelectionProductAddedMessagePayloadImpl that = (ProductSelectionProductAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(product, that.product).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(product).toHashCode();
    }

}
