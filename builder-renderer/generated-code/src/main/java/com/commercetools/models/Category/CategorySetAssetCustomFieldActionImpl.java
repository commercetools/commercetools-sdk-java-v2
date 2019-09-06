package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.Object;
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
public final class CategorySetAssetCustomFieldActionImpl implements CategorySetAssetCustomFieldAction {

   private java.lang.String action;
   
   private java.lang.String assetId;
   
   private java.lang.String name;
   
   private java.lang.Object value;
   
   private java.lang.String assetKey;

   @JsonCreator
   CategorySetAssetCustomFieldActionImpl(@JsonProperty("assetId") final java.lang.String assetId, @JsonProperty("name") final java.lang.String name, @JsonProperty("value") final java.lang.Object value, @JsonProperty("assetKey") final java.lang.String assetKey) {
      this.assetId = assetId;
      this.name = name;
      this.value = value;
      this.assetKey = assetKey;
      this.action = "setAssetCustomField";
   }
   public CategorySetAssetCustomFieldActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   
   public java.lang.Object getValue(){
      return this.value;
   }
   
   
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }

   public void setAssetId(final java.lang.String assetId){
      this.assetId = assetId;
   }
   
   public void setName(final java.lang.String name){
      this.name = name;
   }
   
   public void setValue(final java.lang.Object value){
      this.value = value;
   }
   
   public void setAssetKey(final java.lang.String assetKey){
      this.assetKey = assetKey;
   }

}