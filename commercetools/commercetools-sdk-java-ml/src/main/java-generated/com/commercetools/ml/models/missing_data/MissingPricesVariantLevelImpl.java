
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
public class MissingPricesVariantLevelImpl implements MissingPricesVariantLevel, ModelBase {

    private Long total;

    private Long missingPrices;

    @JsonCreator
    MissingPricesVariantLevelImpl(@JsonProperty("total") final Long total,
            @JsonProperty("missingPrices") final Long missingPrices) {
        this.total = total;
        this.missingPrices = missingPrices;
    }

    public MissingPricesVariantLevelImpl() {
    }

    /**
    *  <p>Number of product variants scanned.</p>
    */
    public Long getTotal() {
        return this.total;
    }

    /**
    *  <p>Number of product variants missing prices.</p>
    */
    public Long getMissingPrices() {
        return this.missingPrices;
    }

    public void setTotal(final Long total) {
        this.total = total;
    }

    public void setMissingPrices(final Long missingPrices) {
        this.missingPrices = missingPrices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingPricesVariantLevelImpl that = (MissingPricesVariantLevelImpl) o;

        return new EqualsBuilder().append(total, that.total).append(missingPrices, that.missingPrices).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(total).append(missingPrices).toHashCode();
    }

}
