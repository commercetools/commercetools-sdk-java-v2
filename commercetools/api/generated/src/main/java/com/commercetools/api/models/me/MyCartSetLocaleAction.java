package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartSetLocaleActionImpl;

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
@JsonDeserialize(as = MyCartSetLocaleActionImpl.class)
public interface MyCartSetLocaleAction extends MyCartUpdateAction {

   
   
   @JsonProperty("locale")
   public String getLocale();

   public void setLocale(final String locale);
   
   public static MyCartSetLocaleActionImpl of(){
      return new MyCartSetLocaleActionImpl();
   }
   

   public static MyCartSetLocaleActionImpl of(final MyCartSetLocaleAction template) {
      MyCartSetLocaleActionImpl instance = new MyCartSetLocaleActionImpl();
      instance.setLocale(template.getLocale());
      return instance;
   }

}
