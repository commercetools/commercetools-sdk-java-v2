package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Money;
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
public final class TaxedItemPriceDraftImpl implements TaxedItemPriceDraft {

   private com.commercetools.api.generated.models.common.Money totalGross;
   
   private com.commercetools.api.generated.models.common.Money totalNet;

   @JsonCreator
   TaxedItemPriceDraftImpl(@JsonProperty("totalGross") final com.commercetools.api.generated.models.common.Money totalGross, @JsonProperty("totalNet") final com.commercetools.api.generated.models.common.Money totalNet) {
      this.totalGross = totalGross;
      this.totalNet = totalNet;
   }
   public TaxedItemPriceDraftImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.common.Money getTotalGross(){
      return this.totalGross;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getTotalNet(){
      return this.totalNet;
   }

   public void setTotalGross(final com.commercetools.api.generated.models.common.Money totalGross){
      this.totalGross = totalGross;
   }
   
   public void setTotalNet(final com.commercetools.api.generated.models.common.Money totalNet){
      this.totalNet = totalNet;
   }

}