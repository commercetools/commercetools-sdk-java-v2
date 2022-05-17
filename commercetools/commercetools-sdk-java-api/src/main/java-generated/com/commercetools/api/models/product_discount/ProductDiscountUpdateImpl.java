
package com.commercetools.api.models.product_discount;

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
public class ProductDiscountUpdateImpl implements ProductDiscountUpdate, ModelBase {

    private Long version;

    private java.util.List<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction> actions;

    @JsonCreator
    ProductDiscountUpdateImpl(@JsonProperty("version") final Long version,
            @JsonProperty("actions") final java.util.List<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }

    public ProductDiscountUpdateImpl() {
    }

    /**
    *  <p>Expected version of the ProductDiscount on which the changes should be applied. If the expected version does not match the actual version, a <a href="/../api/errors#409-conflict">409 Conflict</a> will be returned.</p>
    */
    public Long getVersion() {
        return this.version;
    }

    /**
    *  <p>Update actions to be performed on the ProductDiscount.</p>
    */
    public java.util.List<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction> getActions() {
        return this.actions;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setActions(final com.commercetools.api.models.product_discount.ProductDiscountUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
    }

    public void setActions(
            final java.util.List<com.commercetools.api.models.product_discount.ProductDiscountUpdateAction> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDiscountUpdateImpl that = (ProductDiscountUpdateImpl) o;

        return new EqualsBuilder().append(version, that.version).append(actions, that.actions).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(actions).toHashCode();
    }

}
