package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
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
public final class ProductTypeChangeAttributeNameActionImpl implements ProductTypeChangeAttributeNameAction {

   private String action;
   
   private String attributeName;
   
   private String newAttributeName;

   @JsonCreator
   ProductTypeChangeAttributeNameActionImpl(@JsonProperty("attributeName") final String attributeName, @JsonProperty("newAttributeName") final String newAttributeName) {
      this.attributeName = attributeName;
      this.newAttributeName = newAttributeName;
      this.action = "changeAttributeName";
   }
   public ProductTypeChangeAttributeNameActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }
   
   
   public String getNewAttributeName(){
      return this.newAttributeName;
   }

   public void setAttributeName(final String attributeName){
      this.attributeName = attributeName;
   }
   
   public void setNewAttributeName(final String newAttributeName){
      this.newAttributeName = newAttributeName;
   }

}
