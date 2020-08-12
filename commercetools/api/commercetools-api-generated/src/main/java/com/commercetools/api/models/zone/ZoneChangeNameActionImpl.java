package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ZoneChangeNameActionImpl implements ZoneChangeNameAction {

   private String action;
   
   private String name;

   @JsonCreator
   ZoneChangeNameActionImpl(@JsonProperty("name") final String name) {
      this.name = name;
      this.action = "changeName";
   }
   public ZoneChangeNameActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getName(){
      return this.name;
   }

   public void setName(final String name){
      this.name = name;
   }

}
