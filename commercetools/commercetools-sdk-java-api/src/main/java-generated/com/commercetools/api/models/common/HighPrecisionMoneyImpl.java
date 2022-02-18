
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

/**
*  <p>Money object that stores an amount of a fraction of the smallest indivisible unit of the specified currency.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class HighPrecisionMoneyImpl implements HighPrecisionMoney, ModelBase {

    private com.commercetools.api.models.common.MoneyType type;

    private String currencyCode;

    private Long centAmount;

    private Integer fractionDigits;

    private Long preciseAmount;

    @JsonCreator
    HighPrecisionMoneyImpl(@JsonProperty("currencyCode") final String currencyCode,
            @JsonProperty("centAmount") final Long centAmount,
            @JsonProperty("fractionDigits") final Integer fractionDigits,
            @JsonProperty("preciseAmount") final Long preciseAmount) {
        this.currencyCode = currencyCode;
        this.centAmount = centAmount;
        this.fractionDigits = fractionDigits;
        this.preciseAmount = preciseAmount;
        this.type = MoneyType.findEnum("highPrecision");
    }

    public HighPrecisionMoneyImpl() {
        this.type = MoneyType.findEnum("highPrecision");
    }

    /**
    *  <p>The platform supports two different types of Money, one for amounts in cent precision and another one for sub-cent amounts up to 12 fraction digits.</p>
    */
    public com.commercetools.api.models.common.MoneyType getType() {
        return this.type;
    }

    /**
    *  <p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
    */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
    *  <p>amount in the smallest indivisible unit of a currency, such as</p>
    *  <ul>
    *  <li>cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as 500).</li>
    *  <li>the value in the major unit for currencies without minor units, like JPY (5 JPY is specified as 5).</li>
    *  </ul>
    */
    public Long getCentAmount() {
        return this.centAmount;
    }

    /**
    *  <p>number of digits after the decimal separator</p>
    *  <ul>
    *  <li>equal to the default number of fraction digits for a currency in <a href="ctp:api:type:CentPrecisionMoney">CentPrecisionMoney</a>.</li>
    *  <li>greater than the default number of fraction digits for a currency in <a href="ctp:api:type:HighPrecisionMoney">HighPrecisionMoney</a>.</li>
    *  </ul>
    */
    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    /**
    *  <p>amount in 1 / (10 ^ <code>fractionDigits</code>) of a currency.</p>
    */
    public Long getPreciseAmount() {
        return this.preciseAmount;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setCentAmount(final Long centAmount) {
        this.centAmount = centAmount;
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

        return new EqualsBuilder().append(type, that.type)
                .append(currencyCode, that.currencyCode)
                .append(centAmount, that.centAmount)
                .append(fractionDigits, that.fractionDigits)
                .append(preciseAmount, that.preciseAmount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(currencyCode)
                .append(centAmount)
                .append(fractionDigits)
                .append(preciseAmount)
                .toHashCode();
    }

}
