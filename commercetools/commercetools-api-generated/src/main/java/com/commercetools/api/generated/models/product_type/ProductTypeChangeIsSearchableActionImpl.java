package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
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
public final class ProductTypeChangeIsSearchableActionImpl implements ProductTypeChangeIsSearchableAction {

   private String action;
   
   private String attributeName;
   
   private Boolean isSearchable;

   @JsonCreator
   ProductTypeChangeIsSearchableActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("isSearchable") final Boolean isSearchable) {
      this.attributeName = attributeName;
      this.isSearchable = isSearchable;
      this.action = "changeIsSearchable";
   }
   public ProductTypeChangeIsSearchableActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }
   
   
   public Boolean getIsSearchable(){
      return this.isSearchable;
   }

   public void setAttributeName(final String attributeName){
      this.attributeName = attributeName;
   }
   
   public void setIsSearchable(final Boolean isSearchable){
      this.isSearchable = isSearchable;
   }

}