package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeSetValidFromAndUntilActionImpl implements DiscountCodeSetValidFromAndUntilAction {

   private String action;
   
   private java.time.ZonedDateTime validUntil;
   
   private java.time.ZonedDateTime validFrom;

   @JsonCreator
   DiscountCodeSetValidFromAndUntilActionImpl(@JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom) {
      this.validUntil = validUntil;
      this.validFrom = validFrom;
      this.action = "setValidFromAndUntil";
   }
   public DiscountCodeSetValidFromAndUntilActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>If absent, the field with the value is removed in case a value was set before.</p>
   */
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   /**
   *  <p>If absent, the field with the value is removed in case a value was set before.</p>
   */
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }

   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }

}