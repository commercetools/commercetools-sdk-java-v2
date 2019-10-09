package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
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
public final class CategoryChangeAssetOrderActionImpl implements CategoryChangeAssetOrderAction {

   private String action;
   
   private java.util.List<String> assetOrder;

   @JsonCreator
   CategoryChangeAssetOrderActionImpl(@JsonProperty("assetOrder") final java.util.List<String> assetOrder) {
      this.assetOrder = assetOrder;
      this.action = "changeAssetOrder";
   }
   public CategoryChangeAssetOrderActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<String> getAssetOrder(){
      return this.assetOrder;
   }

   public void setAssetOrder(final java.util.List<String> assetOrder){
      this.assetOrder = assetOrder;
   }

}