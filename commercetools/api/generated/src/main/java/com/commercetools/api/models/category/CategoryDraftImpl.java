package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryResourceIdentifier;
import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
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
public final class CategoryDraftImpl implements CategoryDraft {

   private com.commercetools.api.models.category.CategoryResourceIdentifier parent;

   private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

   private com.commercetools.api.models.common.LocalizedString metaKeywords;

   private String orderHint;

   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   private com.commercetools.api.models.common.LocalizedString metaTitle;

   private com.commercetools.api.models.common.LocalizedString name;

   private String externalId;

   private com.commercetools.api.models.common.LocalizedString description;

   private com.commercetools.api.models.common.LocalizedString metaDescription;

   private String key;

   private com.commercetools.api.models.common.LocalizedString slug;

   @JsonCreator
   CategoryDraftImpl(@JsonProperty("parent") final com.commercetools.api.models.category.CategoryResourceIdentifier parent, @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.AssetDraft> assets, @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords, @JsonProperty("orderHint") final String orderHint, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("externalId") final String externalId, @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description, @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription, @JsonProperty("key") final String key, @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug) {
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

   /**
   *  <p>A category that is the parent of this category in the category tree.
   *  The parent can be set by its ID or by its key.</p>
   */
   public com.commercetools.api.models.category.CategoryResourceIdentifier getParent(){
      return this.parent;
   }


   public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets(){
      return this.assets;
   }


   public com.commercetools.api.models.common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }

   /**
   *  <p>An attribute as base for a custom category order in one level.
   *  A random value will be assigned by API if not set.</p>
   */
   public String getOrderHint(){
      return this.orderHint;
   }

   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }


   public com.commercetools.api.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }


   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
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
   *  <p>User-defined unique identifier for the category.
   *  Keys can only contain alphanumeric characters (<code>a-Z, 0-9</code>), underscores and hyphens (<code>-, _</code>) and be between 2 and 256 characters.</p>
   */
   public String getKey(){
      return this.key;
   }

   /**
   *  <p>human-readable identifier usually used as deep-link URL to the related category.
   *  Allowed are alphabetic, numeric, underscore (<code>_</code>) and hyphen (<code>-</code>) characters.
   *  Maximum size is 256.
   *  <strong>Must be unique across a project!</strong> The same category can have the same slug for different languages.</p>
   */
   public com.commercetools.api.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setParent(final com.commercetools.api.models.category.CategoryResourceIdentifier parent){
      this.parent = parent;
   }

   public void setAssets(final java.util.List<com.commercetools.api.models.common.AssetDraft> assets){
      this.assets = assets;
   }

   public void setMetaKeywords(final com.commercetools.api.models.common.LocalizedString metaKeywords){
      this.metaKeywords = metaKeywords;
   }

   public void setOrderHint(final String orderHint){
      this.orderHint = orderHint;
   }

   public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }

   public void setMetaTitle(final com.commercetools.api.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }

   public void setName(final com.commercetools.api.models.common.LocalizedString name){
      this.name = name;
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

   public void setKey(final String key){
      this.key = key;
   }

   public void setSlug(final com.commercetools.api.models.common.LocalizedString slug){
      this.slug = slug;
   }

}
