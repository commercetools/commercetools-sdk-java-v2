package com.commercetools.api.generated.models.common;

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
public final class PriceTierDraftImpl implements PriceTierDraft {

   private com.commercetools.api.generated.models.common.Money value;
   
   private Long minimumQuantity;

   @JsonCreator
   PriceTierDraftImpl(@JsonProperty("value") final com.commercetools.api.generated.models.common.Money value, @JsonProperty("minimumQuantity") final Long minimumQuantity) {
      this.value = value;
      this.minimumQuantity = minimumQuantity;
   }
   public PriceTierDraftImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.common.Money getValue(){
      return this.value;
   }
   
   
   public Long getMinimumQuantity(){
      return this.minimumQuantity;
   }

   public void setValue(final com.commercetools.api.generated.models.common.Money value){
      this.value = value;
   }
   
   public void setMinimumQuantity(final Long minimumQuantity){
      this.minimumQuantity = minimumQuantity;
   }

}