package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.Long;
import com.commercetools.models.Cart.CartUpdateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartUpdateImpl.class)
public interface CartUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<CartUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<CartUpdateAction> actions);
   
   public static CartUpdateImpl of(){
      return new CartUpdateImpl();
   }
   

   public static CartUpdateImpl of(final CartUpdate template) {
      CartUpdateImpl instance = new CartUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}