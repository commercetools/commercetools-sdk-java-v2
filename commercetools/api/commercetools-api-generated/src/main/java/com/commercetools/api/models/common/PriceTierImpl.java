package com.commercetools.api.models.common;

import com.commercetools.api.models.common.TypedMoney;
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
public final class PriceTierImpl implements PriceTier {

   private com.commercetools.api.models.common.TypedMoney value;

   private Long minimumQuantity;

   @JsonCreator
   PriceTierImpl(@JsonProperty("value") final com.commercetools.api.models.common.TypedMoney value, @JsonProperty("minimumQuantity") final Long minimumQuantity) {
      this.value = value;
      this.minimumQuantity = minimumQuantity;
   }
   public PriceTierImpl() {

   }


   public com.commercetools.api.models.common.TypedMoney getValue(){
      return this.value;
   }


   public Long getMinimumQuantity(){
      return this.minimumQuantity;
   }

   public void setValue(final com.commercetools.api.models.common.TypedMoney value){
      this.value = value;
   }

   public void setMinimumQuantity(final Long minimumQuantity){
      this.minimumQuantity = minimumQuantity;
   }

}
