package com.commercetools.api.generated.models.product;


import com.commercetools.api.generated.models.product.AttributeImpl;

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
@JsonDeserialize(as = AttributeImpl.class)
public interface Attribute  {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   @NotNull
   @JsonProperty("value")
   public Object getValue();

   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public static AttributeImpl of(){
      return new AttributeImpl();
   }
   

   public static AttributeImpl of(final Attribute template) {
      AttributeImpl instance = new AttributeImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}