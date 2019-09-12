package com.commercetools.models.Cart;

import com.commercetools.models.Common.TypedMoney;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxedItemPriceImpl implements TaxedItemPrice {

   private com.commercetools.models.Common.TypedMoney totalGross;
   
   private com.commercetools.models.Common.TypedMoney totalNet;

   @JsonCreator
   TaxedItemPriceImpl(@JsonProperty("totalGross") final com.commercetools.models.Common.TypedMoney totalGross, @JsonProperty("totalNet") final com.commercetools.models.Common.TypedMoney totalNet) {
      this.totalGross = totalGross;
      this.totalNet = totalNet;
   }
   public TaxedItemPriceImpl() {
      
   }
   
   
   public com.commercetools.models.Common.TypedMoney getTotalGross(){
      return this.totalGross;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getTotalNet(){
      return this.totalNet;
   }

   public void setTotalGross(final com.commercetools.models.Common.TypedMoney totalGross){
      this.totalGross = totalGross;
   }
   
   public void setTotalNet(final com.commercetools.models.Common.TypedMoney totalNet){
      this.totalNet = totalNet;
   }

}