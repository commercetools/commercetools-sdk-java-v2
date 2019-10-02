package com.commercetools.models.custom_object;

import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.custom_object.CustomObjectImpl;

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
@JsonDeserialize(as = CustomObjectImpl.class)
public interface CustomObject extends LoggedResource {

   
   @NotNull
   @JsonProperty("container")
   public String getContainer();
   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("value")
   public Object getValue();

   public void setContainer(final String container);
   
   public void setKey(final String key);
   
   public void setValue(final Object value);
   
   public static CustomObjectImpl of(){
      return new CustomObjectImpl();
   }
   

   public static CustomObjectImpl of(final CustomObject template) {
      CustomObjectImpl instance = new CustomObjectImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setContainer(template.getContainer());
      instance.setValue(template.getValue());
      instance.setKey(template.getKey());
      return instance;
   }

}