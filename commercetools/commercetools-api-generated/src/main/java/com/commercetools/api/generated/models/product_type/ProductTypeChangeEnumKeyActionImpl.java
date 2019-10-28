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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeChangeEnumKeyActionImpl implements ProductTypeChangeEnumKeyAction {

   private String action;
   
   private String newKey;
   
   private String attributeName;
   
   private String key;

   @JsonCreator
   ProductTypeChangeEnumKeyActionImpl(@JsonProperty("newKey") final String newKey, @JsonProperty("attributeName") final String attributeName, @JsonProperty("key") final String key) {
      this.newKey = newKey;
      this.attributeName = attributeName;
      this.key = key;
      this.action = "changeEnumKey";
   }
   public ProductTypeChangeEnumKeyActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getNewKey(){
      return this.newKey;
   }
   
   
   public String getAttributeName(){
      return this.attributeName;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setNewKey(final String newKey){
      this.newKey = newKey;
   }
   
   public void setAttributeName(final String attributeName){
      this.attributeName = attributeName;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}