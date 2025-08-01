
package com.commercetools.importapi.models.orders;

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
 * TaxPortion
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TaxPortionImpl implements TaxPortion, ModelBase {

    private String name;

    private Double rate;

    private com.commercetools.importapi.models.common.TypedMoney amount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TaxPortionImpl(@JsonProperty("name") final String name, @JsonProperty("rate") final Double rate,
            @JsonProperty("amount") final com.commercetools.importapi.models.common.TypedMoney amount) {
        this.name = name;
        this.rate = rate;
        this.amount = amount;
    }

    /**
     * create empty instance
     */
    public TaxPortionImpl() {
    }

    /**
     *  <p>Name of the tax portion.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>A number in the range 0-1.</p>
     */

    public Double getRate() {
        return this.rate;
    }

    /**
     *  <p>Money value of the tax portion.</p>
     */

    public com.commercetools.importapi.models.common.TypedMoney getAmount() {
        return this.amount;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setRate(final Double rate) {
        this.rate = rate;
    }

    public void setAmount(final com.commercetools.importapi.models.common.TypedMoney amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TaxPortionImpl that = (TaxPortionImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(rate, that.rate)
                .append(amount, that.amount)
                .append(name, that.name)
                .append(rate, that.rate)
                .append(amount, that.amount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(rate).append(amount).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("rate", rate)
                .append("amount", amount)
                .build();
    }

    @Override
    public TaxPortion copyDeep() {
        return TaxPortion.deepCopy(this);
    }
}
