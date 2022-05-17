
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypedMoneyDraftImpl implements TypedMoneyDraft, ModelBase {

    private Long centAmount;

    private String currencyCode;

    private com.commercetools.api.models.common.MoneyType type;

    private Integer fractionDigits;

    @JsonCreator
    TypedMoneyDraftImpl(@JsonProperty("centAmount") final Long centAmount,
            @JsonProperty("currencyCode") final String currencyCode,
            @JsonProperty("type") final com.commercetools.api.models.common.MoneyType type,
            @JsonProperty("fractionDigits") final Integer fractionDigits) {
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
        this.type = type;
        this.fractionDigits = fractionDigits;
    }

    public TypedMoneyDraftImpl() {
    }

    /**
    *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
    *  <ul>
    *  <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
    *  <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
    *  </ul>
    */
    public Long getCentAmount() {
        return this.centAmount;
    }

    /**
    *  <p>Currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
    */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public com.commercetools.api.models.common.MoneyType getType() {
        return this.type;
    }

    /**
    *  <p>Must be equal to the default number of fraction digits for the specified currency.</p>
    */
    public Integer getFractionDigits() {
        return this.fractionDigits;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypedMoneyDraftImpl that = (TypedMoneyDraftImpl) o;

        return new EqualsBuilder().append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .append(type, that.type)
                .append(fractionDigits, that.fractionDigits)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(centAmount)
                .append(currencyCode)
                .append(type)
                .append(fractionDigits)
                .toHashCode();
    }

}
