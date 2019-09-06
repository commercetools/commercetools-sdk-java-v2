package com.commercetools.models.Common;

import com.commercetools.models.Common.MoneyType;
import com.commercetools.models.Common.TypedMoneyDraft;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CentPrecisionMoneyDraftImpl implements CentPrecisionMoneyDraft {

   private java.lang.Long centAmount;
   
   private java.lang.String currencyCode;
   
   private com.commercetools.models.Common.MoneyType type;

   @JsonCreator
   CentPrecisionMoneyDraftImpl(@JsonProperty("centAmount") final java.lang.Long centAmount, @JsonProperty("currencyCode") final java.lang.String currencyCode) {
      this.centAmount = centAmount;
      this.currencyCode = currencyCode;
      this.type = MoneyType.findEnumViaJsonName("centPrecision").get();
   }
   public CentPrecisionMoneyDraftImpl() {
      
   }
   
   
   public java.lang.Long getCentAmount(){
      return this.centAmount;
   }
   
   /**
   	<p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   public java.lang.String getCurrencyCode(){
      return this.currencyCode;
   }
   
   
   public com.commercetools.models.Common.MoneyType getType(){
      return this.type;
   }

   public void setCentAmount(final java.lang.Long centAmount){
      this.centAmount = centAmount;
   }
   
   public void setCurrencyCode(final java.lang.String currencyCode){
      this.currencyCode = currencyCode;
   }

}