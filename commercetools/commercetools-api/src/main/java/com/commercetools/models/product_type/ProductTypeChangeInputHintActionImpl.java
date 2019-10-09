package com.commercetools.models.product_type;

import com.commercetools.models.product_type.ProductTypeUpdateAction;
import com.commercetools.models.product_type.TextInputHint;
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
public final class ProductTypeChangeInputHintActionImpl implements ProductTypeChangeInputHintAction {

   private String action;
   
   private com.commercetools.models.product_type.TextInputHint newValue;
   
   private String attributeName;

   @JsonCreator
   ProductTypeChangeInputHintActionImpl(@JsonProperty("newValue") final com.commercetools.models.product_type.TextInputHint newValue, @JsonProperty("attributeName") final String attributeName) {
      this.newValue = newValue;
      this.attributeName = attributeName;
      this.action = "changeInputHint";
   }
   public ProductTypeChangeInputHintActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.product_type.TextInputHint getNewValue(){
      return this.newValue;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }

   public void setNewValue(final com.commercetools.models.product_type.TextInputHint newValue){
      this.newValue = newValue;
   }
   
   public void setAttributeName(final String attributeName){
      this.attributeName = attributeName;
   }

}