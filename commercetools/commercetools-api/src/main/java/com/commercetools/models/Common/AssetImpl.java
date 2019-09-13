package com.commercetools.models.common;

import com.commercetools.models.common.AssetSource;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.CustomFields;
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
public final class AssetImpl implements Asset {

   private java.util.List<com.commercetools.models.common.AssetSource> sources;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private java.lang.String id;
   
   private java.lang.String key;
   
   private java.util.List<java.lang.String> tags;

   @JsonCreator
   AssetImpl(@JsonProperty("sources") final java.util.List<com.commercetools.models.common.AssetSource> sources, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("id") final java.lang.String id, @JsonProperty("key") final java.lang.String key, @JsonProperty("tags") final java.util.List<java.lang.String> tags) {
      this.sources = sources;
      this.custom = custom;
      this.name = name;
      this.description = description;
      this.id = id;
      this.key = key;
      this.tags = tags;
   }
   public AssetImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.models.common.AssetSource> getSources(){
      return this.sources;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public java.util.List<java.lang.String> getTags(){
      return this.tags;
   }

   public void setSources(final java.util.List<com.commercetools.models.common.AssetSource> sources){
      this.sources = sources;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setTags(final java.util.List<java.lang.String> tags){
      this.tags = tags;
   }

}