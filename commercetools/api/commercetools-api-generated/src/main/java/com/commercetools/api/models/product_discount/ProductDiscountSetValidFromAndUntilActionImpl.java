package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountSetValidFromAndUntilActionImpl implements ProductDiscountSetValidFromAndUntilAction {

   private String action;
   
   private java.time.ZonedDateTime validFrom;
   
   private java.time.ZonedDateTime validUntil;

   @JsonCreator
   ProductDiscountSetValidFromAndUntilActionImpl(@JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
      this.validFrom = validFrom;
      this.validUntil = validUntil;
      this.action = "setValidFromAndUntil";
   }
   public ProductDiscountSetValidFromAndUntilActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   /**
   *  <p>The timeframe for which the discount should be effective.
   *  Please take Eventual Consistency into account for calculated undiscounted values.</p>
   */
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }

   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }

}
