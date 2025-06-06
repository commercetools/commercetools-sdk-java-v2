
package com.commercetools.history.models.common;

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
 * Money
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MoneyImpl implements Money, ModelBase {

    private String currencyCode;

    private Integer centAmount;

    private Integer fractionDigits;

    private com.commercetools.history.models.common.MoneyType type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MoneyImpl(@JsonProperty("currencyCode") final String currencyCode,
            @JsonProperty("centAmount") final Integer centAmount,
            @JsonProperty("fractionDigits") final Integer fractionDigits,
            @JsonProperty("type") final com.commercetools.history.models.common.MoneyType type) {
        this.currencyCode = currencyCode;
        this.centAmount = centAmount;
        this.fractionDigits = fractionDigits;
        this.type = type;
    }

    /**
     * create empty instance
     */
    public MoneyImpl() {
    }

    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     *
     */

    public Integer getCentAmount() {
        return this.centAmount;
    }

    /**
     *
     */

    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.MoneyType getType() {
        return this.type;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setCentAmount(final Integer centAmount) {
        this.centAmount = centAmount;
    }

    public void setFractionDigits(final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
    }

    public void setType(final com.commercetools.history.models.common.MoneyType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MoneyImpl that = (MoneyImpl) o;

        return new EqualsBuilder().append(currencyCode, that.currencyCode)
                .append(centAmount, that.centAmount)
                .append(fractionDigits, that.fractionDigits)
                .append(type, that.type)
                .append(currencyCode, that.currencyCode)
                .append(centAmount, that.centAmount)
                .append(fractionDigits, that.fractionDigits)
                .append(type, that.type)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(currencyCode)
                .append(centAmount)
                .append(fractionDigits)
                .append(type)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("currencyCode", currencyCode)
                .append("centAmount", centAmount)
                .append("fractionDigits", fractionDigits)
                .append("type", type)
                .build();
    }

    @Override
    public Money copyDeep() {
        return Money.deepCopy(this);
    }
}
