package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
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
public final class ProductSetCategoryOrderHintActionImpl implements ProductSetCategoryOrderHintAction {

   private String action;
   
   private String orderHint;
   
   private Boolean staged;
   
   private String categoryId;

   @JsonCreator
   ProductSetCategoryOrderHintActionImpl(@JsonProperty("orderHint") final String orderHint, @JsonProperty("staged") final Boolean staged, @JsonProperty("categoryId") final String categoryId) {
      this.orderHint = orderHint;
      this.staged = staged;
      this.categoryId = categoryId;
      this.action = "setCategoryOrderHint";
   }
   public ProductSetCategoryOrderHintActionImpl() {
      
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
   
   
   public String getCategoryId(){
      return this.categoryId;
   }

   public void setOrderHint(final String orderHint){
      this.orderHint = orderHint;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setCategoryId(final String categoryId){
      this.categoryId = categoryId;
   }

}