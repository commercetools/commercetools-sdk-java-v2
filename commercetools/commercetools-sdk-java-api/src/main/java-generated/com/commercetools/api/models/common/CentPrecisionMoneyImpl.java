package com.commercetools.api.models.common;

import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoney;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Object that stores cent amounts in a specific currency.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CentPrecisionMoneyImpl implements CentPrecisionMoney, ModelBase {

    
    private Long centAmount;
    
    
    private String currencyCode;
    
    
    private com.commercetools.api.models.common.MoneyType type;
    
    
    private Integer fractionDigits;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CentPrecisionMoneyImpl(@JsonProperty("centAmount") final Long centAmount, @JsonProperty("currencyCode") final String currencyCode, @JsonProperty("fractionDigits") final Integer fractionDigits) {
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
        this.fractionDigits = fractionDigits;
        this.type = MoneyType.findEnum("centPrecision");
    }
    /**
     * create empty instance
     */
    public CentPrecisionMoneyImpl() {
        this.type = MoneyType.findEnum("centPrecision");
    }

    /**
     *  <p>Amount in the smallest indivisible unit of a currency, such as:</p>
     *  <ul>
     *   <li>Cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as <code>500</code>).</li>
     *   <li>The value in the major unit for currencies without minor units, like JPY (5 JPY is specified as <code>5</code>).</li>
     *  </ul>
     */
    
    public Long getCentAmount(){
        return this.centAmount;
    }
    
    /**
     *  <p>Currency code compliant to ISO 4217.</p>
     */
    
    public String getCurrencyCode(){
        return this.currencyCode;
    }
    
    /**
     *  <p>MoneyType supports two different values, one for amounts in cent precision and another one for sub-cent amounts up to 20 fraction digits.</p>
     */
    
    public com.commercetools.api.models.common.MoneyType getType(){
        return this.type;
    }
    
    /**
     *  <p>The number of default fraction digits for the given currency, like <code>2</code> for EUR or <code>0</code> for JPY.</p>
     */
    
    public Integer getFractionDigits(){
        return this.fractionDigits;
    }

    
    public void setCentAmount(final Long centAmount){
        this.centAmount = centAmount;
    }
    
    
    public void setCurrencyCode(final String currencyCode){
        this.currencyCode = currencyCode;
    }
    
    
    public void setFractionDigits(final Integer fractionDigits){
        this.fractionDigits = fractionDigits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CentPrecisionMoneyImpl that = (CentPrecisionMoneyImpl) o;
    
        return new EqualsBuilder()
                .append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .append(type, that.type)
                .append(fractionDigits, that.fractionDigits)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(centAmount)
            .append(currencyCode)
            .append(type)
            .append(fractionDigits)
            .toHashCode();
    }

}
