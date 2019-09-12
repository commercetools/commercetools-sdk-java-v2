package com.commercetools.models.Store;

import com.commercetools.models.Common.BaseResource;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Store.StoreImpl;

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
@JsonDeserialize(as = StoreImpl.class)
public interface Store extends BaseResource {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setKey(final String key);
   
   public void setName(final LocalizedString name);
   
   public static StoreImpl of(){
      return new StoreImpl();
   }
   

   public static StoreImpl of(final Store template) {
      StoreImpl instance = new StoreImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setName(template.getName());
      instance.setKey(template.getKey());
      return instance;
   }

}