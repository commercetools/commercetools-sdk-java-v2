package com.commercetools.api.generated.models.product;

import com.fasterxml.jackson.databind.JsonNode;
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
public final class AttributeImpl implements Attribute {

   private String name;
   
   private com.fasterxml.jackson.databind.JsonNode value;

   @JsonCreator
   AttributeImpl(@JsonProperty("name") final String name, @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value) {
      this.name = name;
      this.value = value;
   }
   public AttributeImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   /**
   *  <p>A valid JSON value, based on an AttributeDefinition.</p>
   */
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setValue(final com.fasterxml.jackson.databind.JsonNode value){
      this.value = value;
   }

}