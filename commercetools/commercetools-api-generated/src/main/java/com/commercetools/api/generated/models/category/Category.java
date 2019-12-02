package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryReference;
import com.commercetools.api.generated.models.common.Asset;
import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.category.CategoryImpl;

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
@JsonDeserialize(as = CategoryImpl.class)
public interface Category extends LoggedResource {

   /**
   *  <p>The unique ID of the category.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();
   /**
   *  <p>The current version of the category.</p>
   */
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   *  <p>human-readable identifiers usually used as deep-link URL to the related category.
   *  Each slug is unique across a project, but a category can have the same slug for different languages.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   /**
   *  <p>Contains the parent path towards the root category.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("ancestors")
   public List<CategoryReference> getAncestors();
   /**
   *  <p>A category that is the parent of this category in the category tree.</p>
   */
   @Valid
   @JsonProperty("parent")
   public CategoryReference getParent();
   /**
   *  <p>An attribute as base for a custom category order in one level.</p>
   */
   @NotNull
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
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   /**
   *  <p>Can be used to store images, icons or movies related to this category.</p>
   */
   @Valid
   @JsonProperty("assets")
   public List<Asset> getAssets();
   /**
   *  <p>User-specific unique identifier for the category.</p>
   */
   
   @JsonProperty("key")
   public String getKey();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   
   public void setName(final LocalizedString name);
   
   public void setSlug(final LocalizedString slug);
   
   public void setDescription(final LocalizedString description);
   
   public void setAncestors(final List<CategoryReference> ancestors);
   
   public void setParent(final CategoryReference parent);
   
   public void setOrderHint(final String orderHint);
   
   public void setExternalId(final String externalId);
   
   public void setMetaTitle(final LocalizedString metaTitle);
   
   public void setMetaDescription(final LocalizedString metaDescription);
   
   public void setMetaKeywords(final LocalizedString metaKeywords);
   
   public void setCustom(final CustomFields custom);
   
   public void setAssets(final List<Asset> assets);
   
   public void setKey(final String key);
   
   public static CategoryImpl of(){
      return new CategoryImpl();
   }
   

   public static CategoryImpl of(final Category template) {
      CategoryImpl instance = new CategoryImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setParent(template.getParent());
      instance.setCustom(template.getCustom());
      instance.setExternalId(template.getExternalId());
      instance.setDescription(template.getDescription());
      instance.setMetaDescription(template.getMetaDescription());
      instance.setAssets(template.getAssets());
      instance.setMetaKeywords(template.getMetaKeywords());
      instance.setOrderHint(template.getOrderHint());
      instance.setMetaTitle(template.getMetaTitle());
      instance.setName(template.getName());
      instance.setAncestors(template.getAncestors());
      instance.setKey(template.getKey());
      instance.setSlug(template.getSlug());
      return instance;
   }

}