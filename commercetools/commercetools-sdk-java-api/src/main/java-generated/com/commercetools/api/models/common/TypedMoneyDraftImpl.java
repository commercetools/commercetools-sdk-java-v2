
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
 *  <p>Base polymorphic money type containing common fields for <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
 *  <ul>
 *   <li>To set money in cent precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">Money</a>.</li>
 *   <li>To set money in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypedMoneyDraftImpl implements TypedMoneyDraft, ModelBase {

    private Long centAmount;

    private String currencyCode;

    private com.commercetools.api.models.common.MoneyType type;

    private Integer fractionDigits;

    /**
     * create instance with all properties
     */
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

    /**
     * create empty instance
     */
    public TypedMoneyDraftImpl() {
    }

    /**
     *  <p>Amount in the smallest indivisible unit of a currency.</p>
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

    /**
     *  <p>Determines the type of money used.</p>
     */

    public com.commercetools.api.models.common.MoneyType getType() {
        return this.type;
    }

    /**
     *  <p>Number of fraction digits for a specified money.</p>
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
    public TypedMoneyDraft copyDeep() {
        return TypedMoneyDraft.deepCopy(this);
    }
}
