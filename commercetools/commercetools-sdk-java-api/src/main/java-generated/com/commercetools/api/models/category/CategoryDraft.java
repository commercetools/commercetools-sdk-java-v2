
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.AssetDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategoryDraftImpl.class)
public interface CategoryDraft extends com.commercetools.api.models.CustomizableDraft<CategoryDraft> {

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
    *  <p>User-defined unique identifier for the Category.</p>
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

    @JsonIgnore
    public void setAssets(final AssetDraft... assets);

    public void setAssets(final List<AssetDraft> assets);

    public void setKey(final String key);

    public static CategoryDraft of() {
        return new CategoryDraftImpl();
    }

    public static CategoryDraft of(final CategoryDraft template) {
        CategoryDraftImpl instance = new CategoryDraftImpl();
        instance.setName(template.getName());
        instance.setSlug(template.getSlug());
        instance.setDescription(template.getDescription());
        instance.setParent(template.getParent());
        instance.setOrderHint(template.getOrderHint());
        instance.setExternalId(template.getExternalId());
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setCustom(template.getCustom());
        instance.setAssets(template.getAssets());
        instance.setKey(template.getKey());
        return instance;
    }

    public static CategoryDraftBuilder builder() {
        return CategoryDraftBuilder.of();
    }

    public static CategoryDraftBuilder builder(final CategoryDraft template) {
        return CategoryDraftBuilder.of(template);
    }

    default <T> T withCategoryDraft(Function<CategoryDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryDraft>";
            }
        };
    }
}
