
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MoneyImpl implements Money {

    private com.commercetools.importapi.models.common.MoneyType type;

    private Integer fractionDigits;

    private Long centAmount;

    private String currencyCode;

    @JsonCreator
    MoneyImpl(@JsonProperty("fractionDigits") final Integer fractionDigits,
            @JsonProperty("centAmount") final Long centAmount,
            @JsonProperty("currencyCode") final String currencyCode) {
        this.fractionDigits = fractionDigits;
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
        this.type = MoneyType.findEnum("centPrecision");
    }

    public MoneyImpl() {
        this.type = MoneyType.findEnum("centPrecision");
    }

    public com.commercetools.importapi.models.common.MoneyType getType() {
        return this.type;
    }

    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    public Long getCentAmount() {
        return this.centAmount;
    }

    /**
    *  <p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
    */
    public String getCurrencyCode() {
        return this.currencyCode;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MoneyImpl that = (MoneyImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(fractionDigits, that.fractionDigits)
                .append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(fractionDigits)
                .append(centAmount)
                .append(currencyCode)
                .toHashCode();
    }

}
