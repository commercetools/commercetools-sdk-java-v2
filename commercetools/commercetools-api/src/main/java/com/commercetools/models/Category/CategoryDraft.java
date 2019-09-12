package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryResourceIdentifier;
import com.commercetools.models.Common.AssetDraft;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.String;
import com.commercetools.models.Category.CategoryDraftImpl;

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
@JsonDeserialize(as = CategoryDraftImpl.class)
public interface CategoryDraft  {

   
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
   
   @Valid
   @JsonProperty("parent")
   public CategoryResourceIdentifier getParent();
   
   
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
   public CustomFieldsDraft getCustom();
   
   @Valid
   @JsonProperty("assets")
   public List<AssetDraft> getAssets();
   
   
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