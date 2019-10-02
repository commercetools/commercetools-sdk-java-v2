package com.commercetools.models.category;

import com.commercetools.models.category.CategoryResourceIdentifier;
import com.commercetools.models.common.AssetDraft;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.CustomFieldsDraft;
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
public final class CategoryDraftImpl implements CategoryDraft {

   private com.commercetools.models.category.CategoryResourceIdentifier parent;
   
   private java.util.List<com.commercetools.models.common.AssetDraft> assets;
   
   private com.commercetools.models.common.LocalizedString metaKeywords;
   
   private String orderHint;
   
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.models.common.LocalizedString metaTitle;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private String externalId;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private com.commercetools.models.common.LocalizedString metaDescription;
   
   private String key;
   
   private com.commercetools.models.common.LocalizedString slug;

   @JsonCreator
   CategoryDraftImpl(@JsonProperty("parent") final com.commercetools.models.category.CategoryResourceIdentifier parent, @JsonProperty("assets") final java.util.List<com.commercetools.models.common.AssetDraft> assets, @JsonProperty("metaKeywords") final com.commercetools.models.common.LocalizedString metaKeywords, @JsonProperty("orderHint") final String orderHint, @JsonProperty("custom") final com.commercetools.models.type.CustomFieldsDraft custom, @JsonProperty("metaTitle") final com.commercetools.models.common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("externalId") final String externalId, @JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("metaDescription") final com.commercetools.models.common.LocalizedString metaDescription, @JsonProperty("key") final String key, @JsonProperty("slug") final com.commercetools.models.common.LocalizedString slug) {
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
   
   
   public com.commercetools.models.category.CategoryResourceIdentifier getParent(){
      return this.parent;
   }
   
   
   public java.util.List<com.commercetools.models.common.AssetDraft> getAssets(){
      return this.assets;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public String getOrderHint(){
      return this.orderHint;
   }
   
   
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public String getExternalId(){
      return this.externalId;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setParent(final com.commercetools.models.category.CategoryResourceIdentifier parent){
      this.parent = parent;
   }
   
   public void setAssets(final java.util.List<com.commercetools.models.common.AssetDraft> assets){
      this.assets = assets;
   }
   
   public void setMetaKeywords(final com.commercetools.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setOrderHint(final String orderHint){
      this.orderHint = orderHint;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setMetaTitle(final com.commercetools.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setMetaDescription(final com.commercetools.models.common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setSlug(final com.commercetools.models.common.LocalizedString slug){
      this.slug = slug;
   }

}