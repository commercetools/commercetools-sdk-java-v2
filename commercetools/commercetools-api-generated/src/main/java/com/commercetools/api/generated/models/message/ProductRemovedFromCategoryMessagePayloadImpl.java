package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.category.CategoryReference;
import com.commercetools.api.generated.models.message.MessagePayload;
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
public final class ProductRemovedFromCategoryMessagePayloadImpl implements ProductRemovedFromCategoryMessagePayload {

   private String type;
   
   private Boolean staged;
   
   private com.commercetools.api.generated.models.category.CategoryReference category;

   @JsonCreator
   ProductRemovedFromCategoryMessagePayloadImpl(@JsonProperty("staged") final Boolean staged, @JsonProperty("category") final com.commercetools.api.generated.models.category.CategoryReference category) {
      this.staged = staged;
      this.category = category;
      this.type = "ProductRemovedFromCategory";
   }
   public ProductRemovedFromCategoryMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.api.generated.models.category.CategoryReference getCategory(){
      return this.category;
   }

   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setCategory(final com.commercetools.api.generated.models.category.CategoryReference category){
      this.category = category;
   }

}