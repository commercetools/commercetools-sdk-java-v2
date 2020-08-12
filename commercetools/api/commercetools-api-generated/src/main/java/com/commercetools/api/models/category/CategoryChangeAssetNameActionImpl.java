package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
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
public final class CategoryChangeAssetNameActionImpl implements CategoryChangeAssetNameAction {

   private String action;
   
   private String assetId;
   
   private String assetKey;
   
   private com.commercetools.api.models.common.LocalizedString name;

   @JsonCreator
   CategoryChangeAssetNameActionImpl(@JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
      this.assetId = assetId;
      this.assetKey = assetKey;
      this.name = name;
      this.action = "changeAssetName";
   }
   public CategoryChangeAssetNameActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAssetId(){
      return this.assetId;
   }
   
   
   public String getAssetKey(){
      return this.assetKey;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }

   public void setAssetId(final String assetId){
      this.assetId = assetId;
   }
   
   public void setAssetKey(final String assetKey){
      this.assetKey = assetKey;
   }
   
   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
   }

}
