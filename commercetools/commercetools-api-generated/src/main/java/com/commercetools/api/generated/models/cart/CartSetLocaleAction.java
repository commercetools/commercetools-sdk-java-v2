package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.CartSetLocaleActionImpl;

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
@JsonDeserialize(as = CartSetLocaleActionImpl.class)
public interface CartSetLocaleAction extends CartUpdateAction {

   
   
   @JsonProperty("locale")
   public String getLocale();

   public void setLocale(final String locale);
   
   public static CartSetLocaleActionImpl of(){
      return new CartSetLocaleActionImpl();
   }
   

   public static CartSetLocaleActionImpl of(final CartSetLocaleAction template) {
      CartSetLocaleActionImpl instance = new CartSetLocaleActionImpl();
      instance.setLocale(template.getLocale());
      return instance;
   }

}