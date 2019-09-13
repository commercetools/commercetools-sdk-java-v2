package com.commercetools.models.store;

import com.commercetools.models.store.StoreUpdateAction;
import java.lang.Long;
import com.commercetools.models.store.StoreUpdateImpl;

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
@JsonDeserialize(as = StoreUpdateImpl.class)
public interface StoreUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<StoreUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<StoreUpdateAction> actions);
   
   public static StoreUpdateImpl of(){
      return new StoreUpdateImpl();
   }
   

   public static StoreUpdateImpl of(final StoreUpdate template) {
      StoreUpdateImpl instance = new StoreUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}