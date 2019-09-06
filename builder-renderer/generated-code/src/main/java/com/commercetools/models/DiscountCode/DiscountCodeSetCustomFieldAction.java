package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.DiscountCode.DiscountCodeSetCustomFieldActionImpl;

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
@JsonDeserialize(as = DiscountCodeSetCustomFieldActionImpl.class)
public interface DiscountCodeSetCustomFieldAction extends DiscountCodeUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public Object getValue();

   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public static DiscountCodeSetCustomFieldActionImpl of(){
      return new DiscountCodeSetCustomFieldActionImpl();
   }
   

   public static DiscountCodeSetCustomFieldActionImpl of(final DiscountCodeSetCustomFieldAction template) {
      DiscountCodeSetCustomFieldActionImpl instance = new DiscountCodeSetCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}