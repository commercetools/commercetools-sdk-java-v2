package com.commercetools.api.models.common;

import com.commercetools.api.models.common.UpdateAction;
import com.commercetools.api.models.common.UpdateImpl;

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
@JsonDeserialize(as = UpdateImpl.class)
public interface Update  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<UpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<UpdateAction> actions);
   
   public static UpdateImpl of(){
      return new UpdateImpl();
   }
   

   public static UpdateImpl of(final Update template) {
      UpdateImpl instance = new UpdateImpl();
      instance.setVersion(template.getVersion());
      instance.setActions(template.getActions());
      return instance;
   }

}
