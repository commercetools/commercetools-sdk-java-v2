package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartUpdateImpl;

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
