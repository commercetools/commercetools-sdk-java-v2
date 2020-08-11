package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryReference;
import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LoggedResource;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
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
public final class CategoryImpl implements Category {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.api.models.category.CategoryReference parent;
   
   private com.commercetools.api.models.type.CustomFields custom;
   
   private String externalId;
   
   private com.commercetools.api.models.common.LocalizedString description;
   
   private com.commercetools.api.models.common.LocalizedString metaDescription;
   
   private java.util.List<com.commercetools.api.models.common.Asset> assets;
   
   private com.commercetools.api.models.common.LocalizedString metaKeywords;
   
   private String orderHint;
   
   private com.commercetools.api.models.common.LocalizedString metaTitle;
   
   private com.commercetools.api.models.common.LocalizedString name;
   
   private java.util.List<com.commercetools.api.models.category.CategoryReference> ancestors;
   
   private String key;
   
   private com.commercetools.api.models.common.LocalizedString slug;

   @JsonCreator
   CategoryImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("parent") final com.commercetools.api.models.category.CategoryReference parent, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom, @JsonProperty("externalId") final String externalId, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription, @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.Asset> assets, @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords, @JsonProperty("orderHint") final String orderHint, @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("ancestors") final java.util.List<com.commercetools.api.models.category.CategoryReference> ancestors, @JsonProperty("key") final String key, @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.parent = parent;
      this.custom = custom;
      this.externalId = externalId;
      this.description = description;
      this.metaDescription = metaDescription;
      this.assets = assets;
      this.metaKeywords = metaKeywords;
      this.orderHint = orderHint;
      this.metaTitle = metaTitle;
      this.name = name;
      this.ancestors = ancestors;
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
   
   /**
   *  <p>The unique ID of the category.</p>
   */
   public String getId(){
      return this.id;
   }
   
   /**
   *  <p>The current version of the category.</p>
   */
   public Long getVersion(){
      return this.version;
   }
   
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   /**
   *  <p>A category that is the parent of this category in the category tree.</p>
   */
   public com.commercetools.api.models.category.CategoryReference getParent(){
      return this.parent;
   }
   
   
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public String getExternalId(){
      return this.externalId;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   /**
   *  <p>Can be used to store images, icons or movies related to this category.</p>
   */
   public java.util.List<com.commercetools.api.models.common.Asset> getAssets(){
      return this.assets;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   /**
   *  <p>An attribute as base for a custom category order in one level.</p>
   */
   public String getOrderHint(){
      return this.orderHint;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   *  <p>Contains the parent path towards the root category.</p>
   */
   public java.util.List<com.commercetools.api.models.category.CategoryReference> getAncestors(){
      return this.ancestors;
   }
   
   /**
   *  <p>User-specific unique identifier for the category.</p>
   */
   public String getKey(){
      return this.key;
   }
   
   /**
   *  <p>human-readable identifiers usually used as deep-link URL to the related category.
   *  Each slug is unique across a project, but a category can have the same slug for different languages.</p>
   */
   public com.commercetools.api.models.common.LocalizedString getSlug(){
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
   
   public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setParent(final com.commercetools.api.models.category.CategoryReference parent){
      this.parent = parent;
   }
   
   public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setMetaDescription(final com.commercetools.api.models.common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setAssets(final java.util.List<com.commercetools.api.models.common.Asset> assets){
      this.assets = assets;
   }
   
   public void setMetaKeywords(final com.commercetools.api.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setOrderHint(final String orderHint){
      this.orderHint = orderHint;
   }
   
   public void setMetaTitle(final com.commercetools.api.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setAncestors(final java.util.List<com.commercetools.api.models.category.CategoryReference> ancestors){
      this.ancestors = ancestors;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setSlug(final com.commercetools.api.models.common.LocalizedString slug){
      this.slug = slug;
   }

}
