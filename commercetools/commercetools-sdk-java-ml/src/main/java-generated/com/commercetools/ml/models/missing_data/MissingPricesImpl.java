
package com.commercetools.ml.models.missing_data;

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
public class MissingPricesImpl implements MissingPrices, ModelBase {

    private com.commercetools.ml.models.common.ProductReference product;

    private Long variantId;

    @JsonCreator
    MissingPricesImpl(@JsonProperty("product") final com.commercetools.ml.models.common.ProductReference product,
            @JsonProperty("variantId") final Long variantId) {
        this.product = product;
        this.variantId = variantId;
    }

    public MissingPricesImpl() {
    }

    public com.commercetools.ml.models.common.ProductReference getProduct() {
        return this.product;
    }

    /**
    *  <p>Id of the <code>ProductVariant</code>.</p>
    */
    public Long getVariantId() {
        return this.variantId;
    }

    public void setProduct(final com.commercetools.ml.models.common.ProductReference product) {
        this.product = product;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingPricesImpl that = (MissingPricesImpl) o;

        return new EqualsBuilder().append(product, that.product).append(variantId, that.variantId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(product).append(variantId).toHashCode();
    }

}
