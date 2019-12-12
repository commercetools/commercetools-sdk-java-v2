package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetCustomFieldActionImpl implements CustomerSetCustomFieldAction {

   private String action;
   
   private String name;
   
   private JsonNode value;

   @JsonCreator
   CustomerSetCustomFieldActionImpl(@JsonProperty("name") final String name, @JsonProperty("value") final JsonNode value) {
      this.name = name;
      this.value = value;
      this.action = "setCustomField";
   }
   public CustomerSetCustomFieldActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public JsonNode getValue(){
      return this.value;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setValue(final JsonNode value){
      this.value = value;
   }

}