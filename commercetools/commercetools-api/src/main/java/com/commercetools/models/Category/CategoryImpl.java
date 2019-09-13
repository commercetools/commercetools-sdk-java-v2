package com.commercetools.models.category;

import com.commercetools.models.category.CategoryReference;
import com.commercetools.models.common.Asset;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.LoggedResource;
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
public final class CategoryImpl implements Category {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.common.CreatedBy createdBy;
   
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.models.category.CategoryReference parent;
   
   private java.util.List<com.commercetools.models.common.Asset> assets;
   
   private com.commercetools.models.common.LocalizedString metaKeywords;
   
   private java.lang.String orderHint;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private com.commercetools.models.common.LocalizedString metaTitle;
   
   private com.commercetools.models.common.LocalizedString name;
   
   private java.lang.String externalId;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private java.util.List<com.commercetools.models.category.CategoryReference> ancestors;
   
   private com.commercetools.models.common.LocalizedString metaDescription;
   
   private java.lang.String key;
   
   private com.commercetools.models.common.LocalizedString slug;

   @JsonCreator
   CategoryImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("parent") final com.commercetools.models.category.CategoryReference parent, @JsonProperty("assets") final java.util.List<com.commercetools.models.common.Asset> assets, @JsonProperty("metaKeywords") final com.commercetools.models.common.LocalizedString metaKeywords, @JsonProperty("orderHint") final java.lang.String orderHint, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("metaTitle") final com.commercetools.models.common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.models.common.LocalizedString name, @JsonProperty("externalId") final java.lang.String externalId, @JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("ancestors") final java.util.List<com.commercetools.models.category.CategoryReference> ancestors, @JsonProperty("metaDescription") final com.commercetools.models.common.LocalizedString metaDescription, @JsonProperty("key") final java.lang.String key, @JsonProperty("slug") final com.commercetools.models.common.LocalizedString slug) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.parent = parent;
      this.assets = assets;
      this.metaKeywords = metaKeywords;
      this.orderHint = orderHint;
      this.custom = custom;
      this.metaTitle = metaTitle;
      this.name = name;
      this.externalId = externalId;
      this.description = description;
      this.ancestors = ancestors;
      this.metaDescription = metaDescription;
      this.key = key;
      this.slug = slug;
   }
   public CategoryImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.category.CategoryReference getParent(){
      return this.parent;
   }
   
   
   public java.util.List<com.commercetools.models.common.Asset> getAssets(){
      return this.assets;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public java.lang.String getOrderHint(){
      return this.orderHint;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.models.category.CategoryReference> getAncestors(){
      return this.ancestors;
   }
   
   
   public com.commercetools.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setParent(final com.commercetools.models.category.CategoryReference parent){
      this.parent = parent;
   }
   
   public void setAssets(final java.util.List<com.commercetools.models.common.Asset> assets){
      this.assets = assets;
   }
   
   public void setMetaKeywords(final com.commercetools.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setOrderHint(final java.lang.String orderHint){
      this.orderHint = orderHint;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setMetaTitle(final com.commercetools.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setName(final com.commercetools.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setExternalId(final java.lang.String externalId){
      this.externalId = externalId;
   }
   
   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setAncestors(final java.util.List<com.commercetools.models.category.CategoryReference> ancestors){
      this.ancestors = ancestors;
   }
   
   public void setMetaDescription(final com.commercetools.models.common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setSlug(final com.commercetools.models.common.LocalizedString slug){
      this.slug = slug;
   }

}