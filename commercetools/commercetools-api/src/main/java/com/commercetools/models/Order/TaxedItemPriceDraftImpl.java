package com.commercetools.models.order;

import com.commercetools.models.common.Money;
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
public final class TaxedItemPriceDraftImpl implements TaxedItemPriceDraft {

   private com.commercetools.models.common.Money totalGross;
   
   private com.commercetools.models.common.Money totalNet;

   @JsonCreator
   TaxedItemPriceDraftImpl(@JsonProperty("totalGross") final com.commercetools.models.common.Money totalGross, @JsonProperty("totalNet") final com.commercetools.models.common.Money totalNet) {
      this.totalGross = totalGross;
      this.totalNet = totalNet;
   }
   public TaxedItemPriceDraftImpl() {
      
   }
   
   
   public com.commercetools.models.common.Money getTotalGross(){
      return this.totalGross;
   }
   
   
   public com.commercetools.models.common.Money getTotalNet(){
      return this.totalNet;
   }

   public void setTotalGross(final com.commercetools.models.common.Money totalGross){
      this.totalGross = totalGross;
   }
   
   public void setTotalNet(final com.commercetools.models.common.Money totalNet){
      this.totalNet = totalNet;
   }

}