
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
public class ProductDiscountMatchQueryImpl implements ProductDiscountMatchQuery, ModelBase {

    private String productId;

    private Integer variantId;

    private Boolean staged;

    private com.commercetools.api.models.common.QueryPrice price;

    @JsonCreator
    ProductDiscountMatchQueryImpl(@JsonProperty("productId") final String productId,
            @JsonProperty("variantId") final Integer variantId, @JsonProperty("staged") final Boolean staged,
            @JsonProperty("price") final com.commercetools.api.models.common.QueryPrice price) {
        this.productId = productId;
        this.variantId = variantId;
        this.staged = staged;
        this.price = price;
    }

    public ProductDiscountMatchQueryImpl() {
    }

    /**
    *  <p>ID of the specified Product.</p>
    */
    public String getProductId() {
        return this.productId;
    }

    /**
    *  <p>ID of the specified Product Variant.</p>
    */
    public Integer getVariantId() {
        return this.variantId;
    }

    /**
    *  <p>Controls which <a href="/../api/projects/productProjections#current--staged">projected representation</a> is applied for the query.
    *  Set to <code>true</code> for the <code>staged</code> Product Projection of the specified Product Variant, set to <code>false</code> for the <code>current</code> one.</p>
    */
    public Boolean getStaged() {
        return this.staged;
    }

    /**
    *  <p>Specified Price of the specified Product Variant.</p>
    */
    public com.commercetools.api.models.common.QueryPrice getPrice() {
        return this.price;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setPrice(final com.commercetools.api.models.common.QueryPrice price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductDiscountMatchQueryImpl that = (ProductDiscountMatchQueryImpl) o;

        return new EqualsBuilder().append(productId, that.productId)
                .append(variantId, that.variantId)
                .append(staged, that.staged)
                .append(price, that.price)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productId)
                .append(variantId)
                .append(staged)
                .append(price)
                .toHashCode();
    }

}
