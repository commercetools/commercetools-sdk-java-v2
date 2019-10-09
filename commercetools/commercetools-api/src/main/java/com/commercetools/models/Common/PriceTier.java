package com.commercetools.models.common;

import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.common.PriceTierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PriceTierImpl.class)
public interface PriceTier  {

   
   @NotNull
   @JsonProperty("minimumQuantity")
   public Long getMinimumQuantity();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public TypedMoney getValue();

   public void setMinimumQuantity(final Long minimumQuantity);
   
   public void setValue(final TypedMoney value);
   
   public static PriceTierImpl of(){
      return new PriceTierImpl();
   }
   

   public static PriceTierImpl of(final PriceTier template) {
      PriceTierImpl instance = new PriceTierImpl();
      instance.setValue(template.getValue());
      instance.setMinimumQuantity(template.getMinimumQuantity());
      return instance;
   }

}