package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.HighPrecisionMoney;
import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.common.MoneyType;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypedMoneyImpl implements TypedMoney {

    private com.commercetools.importapi.models.common.MoneyType type;
    
    private Integer fractionDigits;
    
    private Long centAmount;
    
    private String currencyCode;

    @JsonCreator
    TypedMoneyImpl(@JsonProperty("fractionDigits") final Integer fractionDigits, @JsonProperty("centAmount") final Long centAmount, @JsonProperty("currencyCode") final String currencyCode) {
        this.fractionDigits = fractionDigits;
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
        this.type = MoneyType.findEnumViaJsonName("null").get();
    }
    public TypedMoneyImpl() {
       
    }

    
    public com.commercetools.importapi.models.common.MoneyType getType(){
        return this.type;
    }
    
    
    public Integer getFractionDigits(){
        return this.fractionDigits;
    }
    
    
    public Long getCentAmount(){
        return this.centAmount;
    }
    
    /**
    *  <p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
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

}
