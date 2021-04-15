
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartRecalculateActionImpl implements CartRecalculateAction {

    private String action;

    private Boolean updateProductData;

    @JsonCreator
    CartRecalculateActionImpl(@JsonProperty("updateProductData") final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        this.action = RECALCULATE;
    }

    public CartRecalculateActionImpl() {
        this.action = RECALCULATE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If set to <code>true</code>, the line item product data (<code>name</code>, <code>variant</code> and <code>productType</code>) will also be updated.
    *  If set to <code>false</code>,
    *  only the prices and tax rates of the line item will be updated.
    *  The updated price of a line item may not correspond to a price in <code>variant.prices</code> anymore.</p>
    */
    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    public void setUpdateProductData(final Boolean updateProductData) {
        this.updateProductData = updateProductData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartRecalculateActionImpl that = (CartRecalculateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(updateProductData, that.updateProductData)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(updateProductData).toHashCode();
    }

}
