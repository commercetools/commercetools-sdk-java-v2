
package com.commercetools.api.models.common;

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
 *  <p>Object that stores money as a fraction of the smallest indivisible unit of a specific currency.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class HighPrecisionMoneyImpl implements HighPrecisionMoney, ModelBase {

    private Long centAmount;

    private String currencyCode;

    private com.commercetools.api.models.common.MoneyType type;

    private Integer fractionDigits;

    private Long preciseAmount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    HighPrecisionMoneyImpl(@JsonProperty("centAmount") final Long centAmount,
            @JsonProperty("currencyCode") final String currencyCode,
            @JsonProperty("fractionDigits") final Integer fractionDigits,
            @JsonProperty("preciseAmount") final Long preciseAmount) {
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
        this.fractionDigits = fractionDigits;
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
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     */

    public Long getCentAmount() {
        return this.centAmount;
    }

    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     *  <p>Type of money used.</p>
     */

    public com.commercetools.api.models.common.MoneyType getType() {
        return this.type;
    }

    /**
     *  <p>Number of digits after the decimal separator, greater than the default number of fraction digits for a currency.</p>
     */

    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    /**
     *  <p>Amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
     */

    public Long getPreciseAmount() {
        return this.preciseAmount;
    }

    public void setCentAmount(final Long centAmount) {
        this.centAmount = centAmount;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setFractionDigits(final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
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

        return new EqualsBuilder().append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .append(type, that.type)
                .append(fractionDigits, that.fractionDigits)
                .append(preciseAmount, that.preciseAmount)
                .append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .append(type, that.type)
                .append(fractionDigits, that.fractionDigits)
                .append(preciseAmount, that.preciseAmount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(centAmount)
                .append(currencyCode)
                .append(type)
                .append(fractionDigits)
                .append(preciseAmount)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("centAmount", centAmount)
                .append("currencyCode", currencyCode)
                .append("type", type)
                .append("fractionDigits", fractionDigits)
                .append("preciseAmount", preciseAmount)
                .build();
    }

    @Override
    public HighPrecisionMoney copyDeep() {
        return HighPrecisionMoney.deepCopy(this);
    }
}
