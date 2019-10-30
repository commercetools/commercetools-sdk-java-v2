package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class MyCartSetLineItemCustomFieldActionImpl implements MyCartSetLineItemCustomFieldAction {

   private String action;
   
   private String lineItemId;
   
   private String name;
   
   private Object value;

   @JsonCreator
   MyCartSetLineItemCustomFieldActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("name") final String name, @JsonProperty("value") final Object value) {
      this.lineItemId = lineItemId;
      this.name = name;
      this.value = value;
      this.action = "setLineItemCustomField";
   }
   public MyCartSetLineItemCustomFieldActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public Object getValue(){
      return this.value;
   }

   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setName(final String name){
      this.name = name;
   }
   
   public void setValue(final Object value){
      this.value = value;
   }

}