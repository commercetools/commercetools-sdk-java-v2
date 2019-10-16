package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.category.CategoryResourceIdentifier;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
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
public final class ProductAddToCategoryActionImpl implements ProductAddToCategoryAction {

   private String action;
   
   private String orderHint;
   
   private Boolean staged;
   
   private com.commercetools.api.generated.models.category.CategoryResourceIdentifier category;

   @JsonCreator
   ProductAddToCategoryActionImpl(@JsonProperty("orderHint") final String orderHint, @JsonProperty("staged") final Boolean staged, @JsonProperty("category") final com.commercetools.api.generated.models.category.CategoryResourceIdentifier category) {
      this.orderHint = orderHint;
      this.staged = staged;
      this.category = category;
      this.action = "addToCategory";
   }
   public ProductAddToCategoryActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getOrderHint(){
      return this.orderHint;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.api.generated.models.category.CategoryResourceIdentifier getCategory(){
      return this.category;
   }

   public void setOrderHint(final String orderHint){
      this.orderHint = orderHint;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setCategory(final com.commercetools.api.generated.models.category.CategoryResourceIdentifier category){
      this.category = category;
   }

}