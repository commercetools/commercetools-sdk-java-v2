
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
 *  <p>Draft object to store money in cent amounts for a specific currency.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MoneyImpl implements Money, ModelBase {

    private Long centAmount;

    private String currencyCode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MoneyImpl(@JsonProperty("centAmount") final Long centAmount,
            @JsonProperty("currencyCode") final String currencyCode) {
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
    }

    /**
     * create empty instance
     */
    public MoneyImpl() {
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
     *  <p>Currency code compliant to <span>ISO 4217</span>.</p>
     */

    public String getCurrencyCode() {
        return this.currencyCode;
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

        return new EqualsBuilder().append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(centAmount).append(currencyCode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("centAmount", centAmount)
                .append("currencyCode", currencyCode)
                .build();
    }

    @Override
    public Money copyDeep() {
        return Money.deepCopy(this);
    }
}
