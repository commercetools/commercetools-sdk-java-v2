package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodChangeIsDefaultActionImpl;

import com.fasterxml.jackson.annotation.*;
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
@JsonDeserialize(as = ShippingMethodChangeIsDefaultActionImpl.class)
public interface ShippingMethodChangeIsDefaultAction extends ShippingMethodUpdateAction {

   
   @NotNull
   @JsonProperty("isDefault")
   public Boolean getIsDefault();

   public void setIsDefault(final Boolean isDefault);
   
   public static ShippingMethodChangeIsDefaultActionImpl of(){
      return new ShippingMethodChangeIsDefaultActionImpl();
   }
   

   public static ShippingMethodChangeIsDefaultActionImpl of(final ShippingMethodChangeIsDefaultAction template) {
      ShippingMethodChangeIsDefaultActionImpl instance = new ShippingMethodChangeIsDefaultActionImpl();
      instance.setIsDefault(template.getIsDefault());
      return instance;
   }

}