package com.commercetools.api.models.common;

import com.commercetools.api.models.common.MoneyType;
import com.commercetools.api.models.common.TypedMoneyDraft;
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
public final class CentPrecisionMoneyDraftImpl implements CentPrecisionMoneyDraft {

    private Long centAmount;
    
    private String currencyCode;
    
    private com.commercetools.api.models.common.MoneyType type;
    
    private Integer fractionDigits;

    @JsonCreator
    CentPrecisionMoneyDraftImpl(@JsonProperty("centAmount") final Long centAmount, @JsonProperty("currencyCode") final String currencyCode, @JsonProperty("fractionDigits") final Integer fractionDigits) {
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
        this.fractionDigits = fractionDigits;
        this.type = MoneyType.findEnum("centPrecision");
    }
    public CentPrecisionMoneyDraftImpl() {
       
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
    
    
    public com.commercetools.api.models.common.MoneyType getType(){
        return this.type;
    }
    
    
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

}
