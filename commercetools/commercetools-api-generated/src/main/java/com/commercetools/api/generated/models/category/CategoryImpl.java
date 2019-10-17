package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryReference;
import com.commercetools.api.generated.models.common.Asset;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.type.CustomFields;
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
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.api.generated.models.category.CategoryReference parent;
   
   private java.util.List<com.commercetools.api.generated.models.common.Asset> assets;
   
   private com.commercetools.api.generated.models.common.LocalizedString metaKeywords;
   
   private String orderHint;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private com.commercetools.api.generated.models.common.LocalizedString metaTitle;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private String externalId;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private java.util.List<com.commercetools.api.generated.models.category.CategoryReference> ancestors;
   
   private com.commercetools.api.generated.models.common.LocalizedString metaDescription;
   
   private String key;
   
   private com.commercetools.api.generated.models.common.LocalizedString slug;

   @JsonCreator
   CategoryImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("parent") final com.commercetools.api.generated.models.category.CategoryReference parent, @JsonProperty("assets") final java.util.List<com.commercetools.api.generated.models.common.Asset> assets, @JsonProperty("metaKeywords") final com.commercetools.api.generated.models.common.LocalizedString metaKeywords, @JsonProperty("orderHint") final String orderHint, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("metaTitle") final com.commercetools.api.generated.models.common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("externalId") final String externalId, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("ancestors") final java.util.List<com.commercetools.api.generated.models.category.CategoryReference> ancestors, @JsonProperty("metaDescription") final com.commercetools.api.generated.models.common.LocalizedString metaDescription, @JsonProperty("key") final String key, @JsonProperty("slug") final com.commercetools.api.generated.models.common.LocalizedString slug) {
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
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.api.generated.models.category.CategoryReference getParent(){
      return this.parent;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.Asset> getAssets(){
      return this.assets;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   
   public String getOrderHint(){
      return this.orderHint;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public String getExternalId(){
      return this.externalId;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.category.CategoryReference> getAncestors(){
      return this.ancestors;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.api.generated.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setParent(final com.commercetools.api.generated.models.category.CategoryReference parent){
      this.parent = parent;
   }
   
   public void setAssets(final java.util.List<com.commercetools.api.generated.models.common.Asset> assets){
      this.assets = assets;
   }
   
   public void setMetaKeywords(final com.commercetools.api.generated.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setOrderHint(final String orderHint){
      this.orderHint = orderHint;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setMetaTitle(final com.commercetools.api.generated.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setDescription(final com.commercetools.api.generated.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setAncestors(final java.util.List<com.commercetools.api.generated.models.category.CategoryReference> ancestors){
      this.ancestors = ancestors;
   }
   
   public void setMetaDescription(final com.commercetools.api.generated.models.common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setSlug(final com.commercetools.api.generated.models.common.LocalizedString slug){
      this.slug = slug;
   }

}