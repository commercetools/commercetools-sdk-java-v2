
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingPricesMetaImpl implements MissingPricesMeta {

    private com.commercetools.ml.models.missing_data.MissingPricesProductLevel productLevel;

    private com.commercetools.ml.models.missing_data.MissingPricesVariantLevel variantLevel;

    @JsonCreator
    MissingPricesMetaImpl(
            @JsonProperty("productLevel") final com.commercetools.ml.models.missing_data.MissingPricesProductLevel productLevel,
            @JsonProperty("variantLevel") final com.commercetools.ml.models.missing_data.MissingPricesVariantLevel variantLevel) {
        this.productLevel = productLevel;
        this.variantLevel = variantLevel;
    }

    public MissingPricesMetaImpl() {
    }

    public com.commercetools.ml.models.missing_data.MissingPricesProductLevel getProductLevel() {
        return this.productLevel;
    }

    public com.commercetools.ml.models.missing_data.MissingPricesVariantLevel getVariantLevel() {
        return this.variantLevel;
    }

    public void setProductLevel(final com.commercetools.ml.models.missing_data.MissingPricesProductLevel productLevel) {
        this.productLevel = productLevel;
    }

    public void setVariantLevel(final com.commercetools.ml.models.missing_data.MissingPricesVariantLevel variantLevel) {
        this.variantLevel = variantLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingPricesMetaImpl that = (MissingPricesMetaImpl) o;

        return new EqualsBuilder().append(productLevel, that.productLevel)
                .append(variantLevel, that.variantLevel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productLevel).append(variantLevel).toHashCode();
    }

}
