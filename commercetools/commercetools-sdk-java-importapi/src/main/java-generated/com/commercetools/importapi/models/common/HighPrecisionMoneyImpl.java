
package com.commercetools.importapi.models.common;

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
 * HighPrecisionMoney
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class HighPrecisionMoneyImpl implements HighPrecisionMoney, ModelBase {

    private com.commercetools.importapi.models.common.MoneyType type;

    private Integer fractionDigits;

    private Long centAmount;

    private String currencyCode;

    private Long preciseAmount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    HighPrecisionMoneyImpl(@JsonProperty("fractionDigits") final Integer fractionDigits,
            @JsonProperty("centAmount") final Long centAmount, @JsonProperty("currencyCode") final String currencyCode,
            @JsonProperty("preciseAmount") final Long preciseAmount) {
        this.fractionDigits = fractionDigits;
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
        this.preciseAmount = preciseAmount;
        this.type = MoneyType.findEnum("highPrecision");
    }

    /**
     * create empty instance
     */
    public HighPrecisionMoneyImpl() {
        this.type = MoneyType.findEnum("highPrecision");
    }

    /**
     *
     */

    public com.commercetools.importapi.models.common.MoneyType getType() {
        return this.type;
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

    public Long getCentAmount() {
        return this.centAmount;
    }

    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     *
     */

    public Long getPreciseAmount() {
        return this.preciseAmount;
    }

    public void setFractionDigits(final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
    }

    public void setCentAmount(final Long centAmount) {
        this.centAmount = centAmount;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setPreciseAmount(final Long preciseAmount) {
        this.preciseAmount = preciseAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        HighPrecisionMoneyImpl that = (HighPrecisionMoneyImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(fractionDigits, that.fractionDigits)
                .append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .append(preciseAmount, that.preciseAmount)
                .append(type, that.type)
                .append(fractionDigits, that.fractionDigits)
                .append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .append(preciseAmount, that.preciseAmount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(fractionDigits)
                .append(centAmount)
                .append(currencyCode)
                .append(preciseAmount)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("fractionDigits", fractionDigits)
                .append("centAmount", centAmount)
                .append("currencyCode", currencyCode)
                .append("preciseAmount", preciseAmount)
                .build();
    }

    @Override
    public HighPrecisionMoney copyDeep() {
        return HighPrecisionMoney.deepCopy(this);
    }
}
