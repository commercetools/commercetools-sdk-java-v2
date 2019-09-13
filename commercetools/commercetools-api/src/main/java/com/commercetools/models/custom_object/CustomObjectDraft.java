package com.commercetools.models.custom_object;

import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.custom_object.CustomObjectDraftImpl;

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
@JsonDeserialize(as = CustomObjectDraftImpl.class)
public interface CustomObjectDraft  {

   
   @NotNull
   @JsonProperty("container")
   public String getContainer();
   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
   @JsonProperty("value")
   public Object getValue();
   
   
   @JsonProperty("version")
   public Long getVersion();

   public void setContainer(final String container);
   
   public void setKey(final String key);
   
   public void setValue(final Object value);
   
   public void setVersion(final Long version);
   
   public static CustomObjectDraftImpl of(){
      return new CustomObjectDraftImpl();
   }
   

   public static CustomObjectDraftImpl of(final CustomObjectDraft template) {
      CustomObjectDraftImpl instance = new CustomObjectDraftImpl();
      instance.setContainer(template.getContainer());
      instance.setVersion(template.getVersion());
      instance.setValue(template.getValue());
      instance.setKey(template.getKey());
      return instance;
   }

}