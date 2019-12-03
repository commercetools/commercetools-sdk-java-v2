package com.commercetools.importer.models.categories;

import com.commercetools.importer.models.common.Asset;
import com.commercetools.importer.models.common.CategoryKeyReference;
import com.commercetools.importer.models.common.ImportResource;
import com.commercetools.importer.models.common.LocalizedString;
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


/**
*  <p>Import representation for a category.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryImportImpl implements CategoryImport {

   private String key;
   
   private com.commercetools.importer.models.common.CategoryKeyReference parent;
   
   private java.util.List<com.commercetools.importer.models.common.Asset> assets;
   
   private com.commercetools.importer.models.common.LocalizedString metaKeywords;
   
   private String orderHint;
   
   private com.commercetools.importer.models.common.LocalizedString metaTitle;
   
   private com.commercetools.importer.models.common.LocalizedString name;
   
   private String externalId;
   
   private com.commercetools.importer.models.common.LocalizedString description;
   
   private com.commercetools.importer.models.common.LocalizedString metaDescription;
   
   private com.commercetools.importer.models.common.LocalizedString slug;

   @JsonCreator
   CategoryImportImpl(@JsonProperty("key") final String key, @JsonProperty("parent") final com.commercetools.importer.models.common.CategoryKeyReference parent, @JsonProperty("assets") final java.util.List<com.commercetools.importer.models.common.Asset> assets, @JsonProperty("metaKeywords") final com.commercetools.importer.models.common.LocalizedString metaKeywords, @JsonProperty("orderHint") final String orderHint, @JsonProperty("metaTitle") final com.commercetools.importer.models.common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.importer.models.common.LocalizedString name, @JsonProperty("externalId") final String externalId, @JsonProperty("description") final com.commercetools.importer.models.common.LocalizedString description, @JsonProperty("metaDescription") final com.commercetools.importer.models.common.LocalizedString metaDescription, @JsonProperty("slug") final com.commercetools.importer.models.common.LocalizedString slug) {
      this.key = key;
      this.parent = parent;
      this.assets = assets;
      this.metaKeywords = metaKeywords;
      this.orderHint = orderHint;
      this.metaTitle = metaTitle;
      this.name = name;
      this.externalId = externalId;
      this.description = description;
      this.metaDescription = metaDescription;
      this.slug = slug;
   }
   public CategoryImportImpl() {
      
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   /**
   *  <p>Maps to <code>Category.parent</code>.
   *  The parent category referenced must already exist
   *  in the commercetools project, or the import operation
   *  will have an <code>Unresolved</code> state.</p>
   */
   public com.commercetools.importer.models.common.CategoryKeyReference getParent(){
      return this.parent;
   }
   
   
   public java.util.List<com.commercetools.importer.models.common.Asset> getAssets(){
      return this.assets;
   }
   
   /**
   *  <p>Maps to <code>Category.metaKeywords</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }
   
   /**
   *  <p>Maps to <code>Category.orderHint</code>.</p>
   */
   public String getOrderHint(){
      return this.orderHint;
   }
   
   /**
   *  <p>Maps to <code>Category.metaTitle</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   /**
   *  <p>Maps to <code>Category.name</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getName(){
      return this.name;
   }
   
   /**
   *  <p>Maps to <code>Category.externalId</code>.</p>
   */
   public String getExternalId(){
      return this.externalId;
   }
   
   /**
   *  <p>Maps to <code>Category.description</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   /**
   *  <p>Maps to <code>Category.metaDescription</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }
   
   /**
   *  <p>Maps to <code>Category.slug</code>.
   *  Must match the pattern <code>[-a-zA-Z0-9_]{2,256}</code>.</p>
   */
   public com.commercetools.importer.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setKey(final String key){
      this.key = key;
   }
   
   public void setParent(final com.commercetools.importer.models.common.CategoryKeyReference parent){
      this.parent = parent;
   }
   
   public void setAssets(final java.util.List<com.commercetools.importer.models.common.Asset> assets){
      this.assets = assets;
   }
   
   public void setMetaKeywords(final com.commercetools.importer.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }
   
   public void setOrderHint(final String orderHint){
      this.orderHint = orderHint;
   }
   
   public void setMetaTitle(final com.commercetools.importer.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setName(final com.commercetools.importer.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setDescription(final com.commercetools.importer.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setMetaDescription(final com.commercetools.importer.models.common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }
   
   public void setSlug(final com.commercetools.importer.models.common.LocalizedString slug){
      this.slug = slug;
   }

}