package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryResourceIdentifier;
import com.commercetools.models.Common.AssetDraft;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.CustomFieldsDraft;
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
public final class CategoryDraftImpl implements CategoryDraft {

   private com.commercetools.models.Category.CategoryResourceIdentifier parent;
   
   private java.util.List<com.commercetools.models.Common.AssetDraft> assets;
   
   private com.commercetools.models.Common.LocalizedString metaKeywords;
   
   private java.lang.String orderHint;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private com.commercetools.models.Common.LocalizedString metaTitle;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private java.lang.String externalId;
   
   private com.commercetools.models.Common.LocalizedString description;
   
   private com.commercetools.models.Common.LocalizedString metaDescription;
   
   private java.lang.String key;
   
   private com.commercetools.models.Common.LocalizedString slug;

   @JsonCreator
   CategoryDraftImpl(@JsonProperty("parent") final com.commercetools.models.Category.CategoryResourceIdentifier parent, @JsonProperty("assets") final java.util.List<com.commercetools.models.Common.AssetDraft> assets, @JsonProperty("metaKeywords") final com.commercetools.models.Common.LocalizedString metaKeywords, @JsonProperty("orderHint") final java.lang.String orderHint, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("metaTitle") final com.commercetools.models.Common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("externalId") final java.lang.String externalId, @JsonProperty("description") final com.commercetools.models.Common.LocalizedString description, @JsonProperty("metaDescription") final com.commercetools.models.Common.LocalizedString metaDescription, @JsonProperty("key") final java.lang.String key, @JsonProperty("slug") final com.commercetools.models.Common.LocalizedString slug) {
      this.parent = parent;
      this.assets = assets;
      this.metaKeywords = metaKeywords;
      this.orderHint = orderHint;
      this.custom = custom;
      this.metaTitle = metaTitle;
      this.name = name;
      this.externalId = externalId;
      this.description = description;
      this.metaDescription = metaDescription;
      this.key = key;
      this.slug = slug;
   }
   public CategoryDraftImpl() {
      
   }
   
   
   public com.commercetools.models.Category.CategoryResourceIdentifier getParent(){
      return this.parent;
   }
   
   
   public java.util.List<com.commercetools.models.Common.AssetDraft> getAssets(){
      return this.assets;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public java.lang.String getOrderHint(){
      return this.orderHint;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setParent(final com.commercetools.models.Category.CategoryResourceIdentifier parent){
      this.parent = parent;
   }
   
   public void setAssets(final java.util.List<com.commercetools.models.Common.AssetDraft> assets){
      this.assets = assets;
   }
   
   public void setMetaKeywords(final com.commercetools.models.Common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setOrderHint(final java.lang.String orderHint){
      this.orderHint = orderHint;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setMetaTitle(final com.commercetools.models.Common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setExternalId(final java.lang.String externalId){
      this.externalId = externalId;
   }
   
   public void setDescription(final com.commercetools.models.Common.LocalizedString description){
      this.description = description;
   }
   
   public void setMetaDescription(final com.commercetools.models.Common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setSlug(final com.commercetools.models.Common.LocalizedString slug){
      this.slug = slug;
   }

}