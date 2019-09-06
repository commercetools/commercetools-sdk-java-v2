package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
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
public final class CategoryChangeOrderHintActionImpl implements CategoryChangeOrderHintAction {

   private java.lang.String action;
   
   private java.lang.String orderHint;

   @JsonCreator
   CategoryChangeOrderHintActionImpl(@JsonProperty("orderHint") final java.lang.String orderHint) {
      this.orderHint = orderHint;
      this.action = "changeOrderHint";
   }
   public CategoryChangeOrderHintActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getOrderHint(){
      return this.orderHint;
   }

   public void setOrderHint(final java.lang.String orderHint){
      this.orderHint = orderHint;
   }

}