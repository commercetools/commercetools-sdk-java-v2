package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodAddShippingRateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodAddZoneAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeNameAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeTaxCategoryAction;
import com.commercetools.api.models.shipping_method.ShippingMethodRemoveShippingRateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetDescriptionAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetKeyAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetPredicateAction;
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
public final class ShippingMethodUpdateActionImpl implements ShippingMethodUpdateAction {

   private String action;

   @JsonCreator
   ShippingMethodUpdateActionImpl() {
      this.action = "null";
   }



   public String getAction(){
      return this.action;
   }


}
