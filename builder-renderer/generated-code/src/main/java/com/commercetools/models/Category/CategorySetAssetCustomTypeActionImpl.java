package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Type.TypeResourceIdentifier;
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
public final class CategorySetAssetCustomTypeActionImpl implements CategorySetAssetCustomTypeAction {

   private java.lang.String action;
   
   private java.lang.String assetId;
   
   private java.lang.Object fields;
   
   private com.commercetools.models.Type.TypeResourceIdentifier type;
   
   private java.lang.String assetKey;

   @JsonCreator
   CategorySetAssetCustomTypeActionImpl(@JsonProperty("assetId") final java.lang.String assetId, @JsonProperty("fields") final java.lang.Object fields, @JsonProperty("type") final com.commercetools.models.Type.TypeResourceIdentifier type, @JsonProperty("assetKey") final java.lang.String assetKey) {
      this.assetId = assetId;
      this.fields = fields;
      this.type = type;
      this.assetKey = assetKey;
      this.action = "setAssetCustomType";
   }
   public CategorySetAssetCustomTypeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   
   public java.lang.Object getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.models.Type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }

   public void setAssetId(final java.lang.String assetId){
      this.assetId = assetId;
   }
   
   public void setFields(final java.lang.Object fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.models.Type.TypeResourceIdentifier type){
      this.type = type;
   }
   
   public void setAssetKey(final java.lang.String assetKey){
      this.assetKey = assetKey;
   }

}