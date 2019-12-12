package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ShippingRateInputDraft;
import com.commercetools.api.generated.models.cart.ClassificationShippingRateInputDraftImpl;

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
@JsonDeserialize(as = ClassificationShippingRateInputDraftImpl.class)
public interface ClassificationShippingRateInputDraft extends ShippingRateInputDraft {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static ClassificationShippingRateInputDraftImpl of(){
      return new ClassificationShippingRateInputDraftImpl();
   }
   

   public static ClassificationShippingRateInputDraftImpl of(final ClassificationShippingRateInputDraft template) {
      ClassificationShippingRateInputDraftImpl instance = new ClassificationShippingRateInputDraftImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}