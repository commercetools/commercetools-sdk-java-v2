package com.commercetools.models.CustomerGroup;

import com.commercetools.models.CustomerGroup.CustomerGroupUpdateAction;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerGroupChangeNameActionImpl implements CustomerGroupChangeNameAction {

   private java.lang.String action;
   
   private java.lang.String name;

   @JsonCreator
   CustomerGroupChangeNameActionImpl(@JsonProperty("name") final java.lang.String name) {
      this.name = name;
      this.action = "changeName";
   }
   public CustomerGroupChangeNameActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }

   public void setName(final java.lang.String name){
      this.name = name;
   }

}