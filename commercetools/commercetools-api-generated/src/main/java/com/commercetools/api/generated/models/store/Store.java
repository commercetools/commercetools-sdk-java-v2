package com.commercetools.api.generated.models.store;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.store.StoreImpl;

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
@JsonDeserialize(as = StoreImpl.class)
public interface Store extends LoggedResource {

   
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
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setName(template.getName());
      instance.setKey(template.getKey());
      return instance;
   }

}