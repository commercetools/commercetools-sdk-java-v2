package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import java.time.ZonedDateTime;
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
public final class DiscountCodeNonApplicableErrorImpl implements DiscountCodeNonApplicableError {

    private String code;
    
    private String message;
    
    private String discountCode;
    
    private String reason;
    
    private String dicountCodeId;
    
    private java.time.ZonedDateTime validFrom;
    
    private java.time.ZonedDateTime validUntil;
    
    private java.time.ZonedDateTime validityCheckTime;

    @JsonCreator
    DiscountCodeNonApplicableErrorImpl(@JsonProperty("message") final String message, @JsonProperty("discountCode") final String discountCode, @JsonProperty("reason") final String reason, @JsonProperty("dicountCodeId") final String dicountCodeId, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("validityCheckTime") final java.time.ZonedDateTime validityCheckTime) {
        this.message = message;
        this.discountCode = discountCode;
        this.reason = reason;
        this.dicountCodeId = dicountCodeId;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.validityCheckTime = validityCheckTime;
        this.code = "DiscountCodeNonApplicable";
    }
    public DiscountCodeNonApplicableErrorImpl() {
       
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public String getDiscountCode(){
        return this.discountCode;
    }
    
    
    public String getReason(){
        return this.reason;
    }
    
    
    public String getDicountCodeId(){
        return this.dicountCodeId;
    }
    
    
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }
    
    
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }
    
    
    public java.time.ZonedDateTime getValidityCheckTime(){
        return this.validityCheckTime;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setDiscountCode(final String discountCode){
        this.discountCode = discountCode;
    }
    
    public void setReason(final String reason){
        this.reason = reason;
    }
    
    public void setDicountCodeId(final String dicountCodeId){
        this.dicountCodeId = dicountCodeId;
    }
    
    public void setValidFrom(final java.time.ZonedDateTime validFrom){
        this.validFrom = validFrom;
    }
    
    public void setValidUntil(final java.time.ZonedDateTime validUntil){
        this.validUntil = validUntil;
    }
    
    public void setValidityCheckTime(final java.time.ZonedDateTime validityCheckTime){
        this.validityCheckTime = validityCheckTime;
    }

}
