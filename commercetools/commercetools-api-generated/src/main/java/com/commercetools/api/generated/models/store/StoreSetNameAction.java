package com.commercetools.api.generated.models.store;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.store.StoreUpdateAction;
import com.commercetools.api.generated.models.store.StoreSetNameActionImpl;

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
@JsonDeserialize(as = StoreSetNameActionImpl.class)
public interface StoreSetNameAction extends StoreUpdateAction {

   
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setName(final LocalizedString name);
   
   public static StoreSetNameActionImpl of(){
      return new StoreSetNameActionImpl();
   }
   

   public static StoreSetNameActionImpl of(final StoreSetNameAction template) {
      StoreSetNameActionImpl instance = new StoreSetNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}