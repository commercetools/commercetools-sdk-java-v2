package com.commercetools.api.models.message;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.message.MessagePayload;
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
public final class ProductAddedToCategoryMessagePayloadImpl implements ProductAddedToCategoryMessagePayload {

   private String type;
   
   private com.commercetools.api.models.category.CategoryReference category;
   
   private Boolean staged;

   @JsonCreator
   ProductAddedToCategoryMessagePayloadImpl(@JsonProperty("category") final com.commercetools.api.models.category.CategoryReference category, @JsonProperty("staged") final Boolean staged) {
      this.category = category;
      this.staged = staged;
      this.type = "ProductAddedToCategory";
   }
   public ProductAddedToCategoryMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.models.category.CategoryReference getCategory(){
      return this.category;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }

   public void setCategory(final com.commercetools.api.models.category.CategoryReference category){
      this.category = category;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }

}
