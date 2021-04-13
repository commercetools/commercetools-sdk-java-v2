
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>The product variant that contains the image.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantImpl implements ProductVariant {

    private com.commercetools.ml.models.common.ProductReference product;

    private Boolean staged;

    private Integer variantId;

    @JsonCreator
    ProductVariantImpl(@JsonProperty("product") final com.commercetools.ml.models.common.ProductReference product,
            @JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Integer variantId) {
        this.product = product;
        this.staged = staged;
        this.variantId = variantId;
    }

    public ProductVariantImpl() {
    }

    /**
    *  <p>The product that contains this variant.</p>
    */
    public com.commercetools.ml.models.common.ProductReference getProduct() {
        return this.product;
    }

    /**
    *  <p>The state of the product variant.</p>
    */
    public Boolean getStaged() {
        return this.staged;
    }

    /**
    *  <p>The id of the product variant.</p>
    */
    public Integer getVariantId() {
        return this.variantId;
    }

    public void setProduct(final com.commercetools.ml.models.common.ProductReference product) {
        this.product = product;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantImpl that = (ProductVariantImpl) o;

        return new EqualsBuilder().append(product, that.product)
                .append(staged, that.staged)
                .append(variantId, that.variantId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(product).append(staged).append(variantId).toHashCode();
    }

}
