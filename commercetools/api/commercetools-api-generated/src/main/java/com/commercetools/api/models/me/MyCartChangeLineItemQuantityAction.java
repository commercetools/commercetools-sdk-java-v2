package com.commercetools.api.models.me;

import com.commercetools.api.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartChangeLineItemQuantityActionImpl;

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
@JsonDeserialize(as = MyCartChangeLineItemQuantityActionImpl.class)
public interface MyCartChangeLineItemQuantityAction extends MyCartUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @NotNull
   @JsonProperty("quantity")
   public Double getQuantity();
   
   @Valid
   @JsonProperty("externalPrice")
   public Money getExternalPrice();
   
   @Valid
   @JsonProperty("externalTotalPrice")
   public ExternalLineItemTotalPrice getExternalTotalPrice();

   public void setLineItemId(final String lineItemId);
   
   public void setQuantity(final Double quantity);
   
   public void setExternalPrice(final Money externalPrice);
   
   public void setExternalTotalPrice(final ExternalLineItemTotalPrice externalTotalPrice);
   
   public static MyCartChangeLineItemQuantityActionImpl of(){
      return new MyCartChangeLineItemQuantityActionImpl();
   }
   

   public static MyCartChangeLineItemQuantityActionImpl of(final MyCartChangeLineItemQuantityAction template) {
      MyCartChangeLineItemQuantityActionImpl instance = new MyCartChangeLineItemQuantityActionImpl();
      instance.setLineItemId(template.getLineItemId());
      instance.setQuantity(template.getQuantity());
      instance.setExternalPrice(template.getExternalPrice());
      instance.setExternalTotalPrice(template.getExternalTotalPrice());
      return instance;
   }

}
