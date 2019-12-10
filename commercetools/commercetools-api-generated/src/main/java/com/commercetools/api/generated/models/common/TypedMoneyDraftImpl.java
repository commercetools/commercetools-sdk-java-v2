package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.CentPrecisionMoneyDraft;
import com.commercetools.api.generated.models.common.HighPrecisionMoneyDraft;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.common.MoneyType;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TypedMoneyDraftImpl implements TypedMoneyDraft {

   private Long centAmount;
   
   private String currencyCode;
   
   private com.commercetools.api.generated.models.common.MoneyType type;

   @JsonCreator
   TypedMoneyDraftImpl(@JsonProperty("centAmount") final Long centAmount, @JsonProperty("currencyCode") final String currencyCode) {
      this.centAmount = centAmount;
      this.currencyCode = currencyCode;
      this.type = MoneyType.findEnumViaJsonName("null").get();
   }
   public TypedMoneyDraftImpl() {
      
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
   
   
   public com.commercetools.api.generated.models.common.MoneyType getType(){
      return this.type;
   }

   public void setCentAmount(final Long centAmount){
      this.centAmount = centAmount;
   }
   
   public void setCurrencyCode(final String currencyCode){
      this.currencyCode = currencyCode;
   }

}