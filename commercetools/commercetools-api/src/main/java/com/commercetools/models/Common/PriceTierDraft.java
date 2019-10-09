package com.commercetools.models.common;

import com.commercetools.models.common.Money;
import com.commercetools.models.common.PriceTierDraftImpl;

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
@JsonDeserialize(as = PriceTierDraftImpl.class)
public interface PriceTierDraft  {

   
   @NotNull
   @JsonProperty("minimumQuantity")
   public Long getMinimumQuantity();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public Money getValue();

   public void setMinimumQuantity(final Long minimumQuantity);
   
   public void setValue(final Money value);
   
   public static PriceTierDraftImpl of(){
      return new PriceTierDraftImpl();
   }
   

   public static PriceTierDraftImpl of(final PriceTierDraft template) {
      PriceTierDraftImpl instance = new PriceTierDraftImpl();
      instance.setValue(template.getValue());
      instance.setMinimumQuantity(template.getMinimumQuantity());
      return instance;
   }

}