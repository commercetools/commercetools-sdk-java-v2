
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
 *  <p>Generated after a successful Remove Product update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionProductRemovedMessagePayloadImpl
        implements ProductSelectionProductRemovedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.product.ProductReference product;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionProductRemovedMessagePayloadImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        this.type = PRODUCT_SELECTION_PRODUCT_REMOVED;
    }

    /**
     * create empty instance
     */
    public ProductSelectionProductRemovedMessagePayloadImpl() {
        this.type = PRODUCT_SELECTION_PRODUCT_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Product that was removed from the Product Selection.</p>
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

        ProductSelectionProductRemovedMessagePayloadImpl that = (ProductSelectionProductRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(product, that.product)
                .append(type, that.type)
                .append(product, that.product)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(product).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("product", product)
                .build();
    }

}
