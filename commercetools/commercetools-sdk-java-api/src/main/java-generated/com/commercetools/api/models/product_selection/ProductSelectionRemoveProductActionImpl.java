
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
 * ProductSelectionRemoveProductAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionRemoveProductActionImpl implements ProductSelectionRemoveProductAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSelectionRemoveProductActionImpl(
            @JsonProperty("product") final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        this.action = REMOVE_PRODUCT;
    }

    /**
     * create empty instance
     */
    public ProductSelectionRemoveProductActionImpl() {
        this.action = REMOVE_PRODUCT;
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

    public void setProduct(final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSelectionRemoveProductActionImpl that = (ProductSelectionRemoveProductActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(product, that.product)
                .append(action, that.action)
                .append(product, that.product)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(product).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("product", product)
                .build();
    }

    @Override
    public ProductSelectionRemoveProductAction copyDeep() {
        return ProductSelectionRemoveProductAction.deepCopy(this);
    }
}
