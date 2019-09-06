package com.commercetools.models.Message;

import com.commercetools.models.Category.Category;
import com.commercetools.models.Message.MessagePayload;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryCreatedMessagePayloadImpl implements CategoryCreatedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.Category.Category category;

   @JsonCreator
   CategoryCreatedMessagePayloadImpl(@JsonProperty("category") final com.commercetools.models.Category.Category category) {
      this.category = category;
      this.type = "CategoryCreated";
   }
   public CategoryCreatedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Category.Category getCategory(){
      return this.category;
   }

   public void setCategory(final com.commercetools.models.Category.Category category){
      this.category = category;
   }

}