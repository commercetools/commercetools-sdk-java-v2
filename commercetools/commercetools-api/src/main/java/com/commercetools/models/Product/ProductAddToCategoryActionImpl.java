package com.commercetools.models.product;

import com.commercetools.models.category.CategoryResourceIdentifier;
import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
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
public final class ProductAddToCategoryActionImpl implements ProductAddToCategoryAction {

   private java.lang.String action;
   
   private java.lang.String orderHint;
   
   private java.lang.Boolean staged;
   
   private com.commercetools.models.category.CategoryResourceIdentifier category;

   @JsonCreator
   ProductAddToCategoryActionImpl(@JsonProperty("orderHint") final java.lang.String orderHint, @JsonProperty("staged") final java.lang.Boolean staged, @JsonProperty("category") final com.commercetools.models.category.CategoryResourceIdentifier category) {
      this.orderHint = orderHint;
      this.staged = staged;
      this.category = category;
      this.action = "addToCategory";
   }
   public ProductAddToCategoryActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getOrderHint(){
      return this.orderHint;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.models.category.CategoryResourceIdentifier getCategory(){
      return this.category;
   }

   public void setOrderHint(final java.lang.String orderHint){
      this.orderHint = orderHint;
   }
   
   public void setStaged(final java.lang.Boolean staged){
      this.staged = staged;
   }
   
   public void setCategory(final com.commercetools.models.category.CategoryResourceIdentifier category){
      this.category = category;
   }

}