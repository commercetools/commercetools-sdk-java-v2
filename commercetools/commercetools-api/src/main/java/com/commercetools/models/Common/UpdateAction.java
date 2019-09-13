package com.commercetools.models.common;

import java.lang.String;
import com.commercetools.models.common.UpdateActionImpl;

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
@JsonDeserialize(as = UpdateActionImpl.class)
public interface UpdateAction  {

   
   @NotNull
   @JsonProperty("action")
   public String getAction();

   public void setAction(final String action);
   
   public static UpdateActionImpl of(){
      return new UpdateActionImpl();
   }
   

   public static UpdateActionImpl of(final UpdateAction template) {
      UpdateActionImpl instance = new UpdateActionImpl();
      instance.setAction(template.getAction());
      return instance;
   }

}