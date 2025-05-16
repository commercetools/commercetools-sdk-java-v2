
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
 *  <p>Draft object to store money as a fraction of the smallest indivisible unit for a specific currency.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class HighPrecisionMoneyDraftImpl implements HighPrecisionMoneyDraft, ModelBase {

    private Long centAmount;

    private String currencyCode;

    private com.commercetools.api.models.common.MoneyType type;

    private Integer fractionDigits;

    private Long preciseAmount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    HighPrecisionMoneyDraftImpl(@JsonProperty("centAmount") final Long centAmount,
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
    public HighPrecisionMoneyDraftImpl() {
        this.type = MoneyType.findEnum("highPrecision");
    }

    /**
     *  <p>Amount in the smallest indivisible unit of a currency. This field is optional for high precision. If provided, it is checked for validity. Example:</p>
     *  <p>A Price of 1.015 USD can be rounded either to 1.01 USD or 1.02 USD. If it lies outside of this range, an error message stating that centAmount must be rounded correctly will be returned.</p>
     *  <p>If <code>centAmount</code> is not provided, the API calculates the value automatically using the default rounding mode half even.</p>
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
     *  <p>Determines the type of money used.</p>
     */

    public com.commercetools.api.models.common.MoneyType getType() {
        return this.type;
    }

    /**
     *  <p>Number of fraction digits for a specified high precision money. It must be greater than the default number of fraction digits for the specified currency.</p>
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

        HighPrecisionMoneyDraftImpl that = (HighPrecisionMoneyDraftImpl) o;

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
    public HighPrecisionMoneyDraft copyDeep() {
        return HighPrecisionMoneyDraft.deepCopy(this);
    }
}
