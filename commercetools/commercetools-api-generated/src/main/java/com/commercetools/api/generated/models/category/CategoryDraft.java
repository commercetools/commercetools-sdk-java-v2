package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryResourceIdentifier;
import com.commercetools.api.generated.models.common.AssetDraft;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.category.CategoryDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategoryDraftImpl.class)
public interface CategoryDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   *  <p>human-readable identifier usually used as deep-link URL to the related category.
   *  Allowed are alphabetic, numeric, underscore (<code>_</code>) and hyphen (<code>-</code>) characters.
   *  Maximum size is 256.
   *  <strong>Must be unique across a project!</strong> The same category can have the same slug for different languages.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   /**
   *  <p>A category that is the parent of this category in the category tree.
   *  The parent can be set by its ID or by its key.</p>
   */
   @Valid
   @JsonProperty("parent")
   public CategoryResourceIdentifier getParent();
   /**
   *  <p>An attribute as base for a custom category order in one level.
   *  A random value will be assigned by API if not set.</p>
   */
   
   @JsonProperty("orderHint")
   public String getOrderHint();
   
   
   @JsonProperty("externalId")
   public String getExternalId();
   
   @Valid
   @JsonProperty("metaTitle")
   public LocalizedString getMetaTitle();
   
   @Valid
   @JsonProperty("metaDescription")
   public LocalizedString getMetaDescription();
   
   @Valid
   @JsonProperty("metaKeywords")
   public LocalizedString getMetaKeywords();
   /**
   *  <p>The custom fields.</p>
   */
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   @Valid
   @JsonProperty("assets")
   public List<AssetDraft> getAssets();
   /**
   *  <p>User-defined unique identifier for the category.
   *  Keys can only contain alphanumeric characters (<code>a-Z, 0-9</code>), underscores and hyphens (<code>-, _</code>) and be between 2 and 256 characters.</p>
   */
   
   @JsonProperty("key")
   public String getKey();

   public void setName(final LocalizedString name);
   
   public void setSlug(final LocalizedString slug);
   
   public void setDescription(final LocalizedString description);
   
   public void setParent(final CategoryResourceIdentifier parent);
   
   public void setOrderHint(final String orderHint);
   
   public void setExternalId(final String externalId);
   
   public void setMetaTitle(final LocalizedString metaTitle);
   
   public void setMetaDescription(final LocalizedString metaDescription);
   
   public void setMetaKeywords(final LocalizedString metaKeywords);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setAssets(final List<AssetDraft> assets);
   
   public void setKey(final String key);
   
   public static CategoryDraftImpl of(){
      return new CategoryDraftImpl();
   }
   

   public static CategoryDraftImpl of(final CategoryDraft template) {
      CategoryDraftImpl instance = new CategoryDraftImpl();
      instance.setParent(template.getParent());
      instance.setAssets(template.getAssets());
      instance.setMetaKeywords(template.getMetaKeywords());
      instance.setOrderHint(template.getOrderHint());
      instance.setCustom(template.getCustom());
      instance.setMetaTitle(template.getMetaTitle());
      instance.setName(template.getName());
      instance.setExternalId(template.getExternalId());
      instance.setDescription(template.getDescription());
      instance.setMetaDescription(template.getMetaDescription());
      instance.setKey(template.getKey());
      instance.setSlug(template.getSlug());
      return instance;
   }

}