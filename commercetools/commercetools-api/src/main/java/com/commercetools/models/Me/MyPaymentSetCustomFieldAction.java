package com.commercetools.models.Me;

import com.commercetools.models.Me.MyPaymentUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Me.MyPaymentSetCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = MyPaymentSetCustomFieldActionImpl.class)
public interface MyPaymentSetCustomFieldAction extends MyPaymentUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public Object getValue();

   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public static MyPaymentSetCustomFieldActionImpl of(){
      return new MyPaymentSetCustomFieldActionImpl();
   }
   

   public static MyPaymentSetCustomFieldActionImpl of(final MyPaymentSetCustomFieldAction template) {
      MyPaymentSetCustomFieldActionImpl instance = new MyPaymentSetCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}