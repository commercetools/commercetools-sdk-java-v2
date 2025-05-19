
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
 *  <p>This draft type is the alternative to Money.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CentPrecisionMoneyDraftImpl implements CentPrecisionMoneyDraft, ModelBase {

    private Long centAmount;

    private String currencyCode;

    private com.commercetools.api.models.common.MoneyType type;

    private Integer fractionDigits;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CentPrecisionMoneyDraftImpl(@JsonProperty("centAmount") final Long centAmount,
            @JsonProperty("currencyCode") final String currencyCode,
            @JsonProperty("fractionDigits") final Integer fractionDigits) {
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
        this.fractionDigits = fractionDigits;
        this.type = MoneyType.findEnum("centPrecision");
    }

    /**
     * create empty instance
     */
    public CentPrecisionMoneyDraftImpl() {
        this.type = MoneyType.findEnum("centPrecision");
    }

    /**
     *  <p>Amount in the smallest indivisible unit of a currency.</p>
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
     *  <p>This field is optional for cent precision. If provided, it must be equal to the default number of fraction digits for the specified currency.</p>
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

        CentPrecisionMoneyDraftImpl that = (CentPrecisionMoneyDraftImpl) o;

        return new EqualsBuilder().append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .append(type, that.type)
                .append(fractionDigits, that.fractionDigits)
                .append(centAmount, that.centAmount)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("centAmount", centAmount)
                .append("currencyCode", currencyCode)
                .append("type", type)
                .append("fractionDigits", fractionDigits)
                .build();
    }

    @Override
    public CentPrecisionMoneyDraft copyDeep() {
        return CentPrecisionMoneyDraft.deepCopy(this);
    }
}
