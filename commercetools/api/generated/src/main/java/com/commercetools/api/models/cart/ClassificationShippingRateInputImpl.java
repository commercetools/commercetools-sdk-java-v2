package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.common.LocalizedString;
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
public final class ClassificationShippingRateInputImpl implements ClassificationShippingRateInput {

   private String type;

   private com.commercetools.api.models.common.LocalizedString label;

   private String key;

   @JsonCreator
   ClassificationShippingRateInputImpl(@JsonProperty("label") final com.commercetools.api.models.common.LocalizedString label, @JsonProperty("key") final String key) {
      this.label = label;
      this.key = key;
      this.type = "Classification";
   }
   public ClassificationShippingRateInputImpl() {

   }


   public String getType(){
      return this.type;
   }


   public com.commercetools.api.models.common.LocalizedString getLabel(){
      return this.label;
   }


   public String getKey(){
      return this.key;
   }

   public void setLabel(final com.commercetools.api.models.common.LocalizedString label){
      this.label = label;
   }

   public void setKey(final String key){
      this.key = key;
   }

}
