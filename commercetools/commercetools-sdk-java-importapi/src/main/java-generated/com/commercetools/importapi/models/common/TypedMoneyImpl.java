package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.HighPrecisionMoney;
import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.common.MoneyType;
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
 * TypedMoney
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TypedMoneyImpl implements TypedMoney, ModelBase {

    
    private com.commercetools.importapi.models.common.MoneyType type;
    
    
    private Integer fractionDigits;
    
    
    private Long centAmount;
    
    
    private String currencyCode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TypedMoneyImpl(@JsonProperty("type") final com.commercetools.importapi.models.common.MoneyType type, @JsonProperty("fractionDigits") final Integer fractionDigits, @JsonProperty("centAmount") final Long centAmount, @JsonProperty("currencyCode") final String currencyCode) {
        this.type = type;
        this.fractionDigits = fractionDigits;
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
    }
    /**
     * create empty instance
     */
    public TypedMoneyImpl() {
    }

    /**
     *
     */
    
    public com.commercetools.importapi.models.common.MoneyType getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public Integer getFractionDigits(){
        return this.fractionDigits;
    }
    
    /**
     *
     */
    
    public Long getCentAmount(){
        return this.centAmount;
    }
    
    /**
     *  <p>The currency code compliant to ISO 4217.</p>
     */
    
    public String getCurrencyCode(){
        return this.currencyCode;
    }

    
    public void setFractionDigits(final Integer fractionDigits){
        this.fractionDigits = fractionDigits;
    }
    
    
    public void setCentAmount(final Long centAmount){
        this.centAmount = centAmount;
    }
    
    
    public void setCurrencyCode(final String currencyCode){
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        TypedMoneyImpl that = (TypedMoneyImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(fractionDigits, that.fractionDigits)
                .append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(fractionDigits)
            .append(centAmount)
            .append(currencyCode)
            .toHashCode();
    }

}
