package com.commercetools.models.category;

import com.commercetools.models.category.CategoryReference;
import com.commercetools.models.common.Asset;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.type.CustomFields;
import java.lang.String;
import com.commercetools.models.category.CategoryImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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

   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @NotNull
   @Valid
   @JsonProperty("ancestors")
   public List<CategoryReference> getAncestors();
   
   @Valid
   @JsonProperty("parent")
   public CategoryReference getParent();
   
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
   
   @Valid
   @JsonProperty("assets")
   public List<Asset> getAssets();
   
   
   @JsonProperty("key")
   public String getKey();

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
      instance.setAssets(template.getAssets());
      instance.setMetaKeywords(template.getMetaKeywords());
      instance.setOrderHint(template.getOrderHint());
      instance.setCustom(template.getCustom());
      instance.setMetaTitle(template.getMetaTitle());
      instance.setName(template.getName());
      instance.setExternalId(template.getExternalId());
      instance.setDescription(template.getDescription());
      instance.setAncestors(template.getAncestors());
      instance.setMetaDescription(template.getMetaDescription());
      instance.setKey(template.getKey());
      instance.setSlug(template.getSlug());
      return instance;
   }

}