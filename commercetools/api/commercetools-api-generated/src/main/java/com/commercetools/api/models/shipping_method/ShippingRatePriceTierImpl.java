package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.CartClassificationTier;
import com.commercetools.api.models.shipping_method.CartScoreTier;
import com.commercetools.api.models.shipping_method.CartValueTier;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
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
public final class ShippingRatePriceTierImpl implements ShippingRatePriceTier {

   private com.commercetools.api.models.shipping_method.ShippingRateTierType type;

   @JsonCreator
   ShippingRatePriceTierImpl() {
      this.type = ShippingRateTierType.findEnumViaJsonName("null").get();
   }



   public com.commercetools.api.models.shipping_method.ShippingRateTierType getType(){
      return this.type;
   }


}
