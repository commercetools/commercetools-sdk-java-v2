package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ShippingRateInput;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.cart.ClassificationShippingRateInputImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = ClassificationShippingRateInputImpl.class)
public interface ClassificationShippingRateInput extends ShippingRateInput {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @Valid
   @JsonProperty("label")
   public LocalizedString getLabel();

   public void setKey(final String key);
   
   public void setLabel(final LocalizedString label);
   
   public static ClassificationShippingRateInputImpl of(){
      return new ClassificationShippingRateInputImpl();
   }
   

   public static ClassificationShippingRateInputImpl of(final ClassificationShippingRateInput template) {
      ClassificationShippingRateInputImpl instance = new ClassificationShippingRateInputImpl();
      instance.setLabel(template.getLabel());
      instance.setKey(template.getKey());
      return instance;
   }

}