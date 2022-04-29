
package com.commercetools.api.models.category;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategoryImpl.class)
public interface Category extends BaseResource, com.commercetools.api.models.DomainResource<Category>,
        com.commercetools.api.models.Referencable<Category>,
        com.commercetools.api.models.ResourceIdentifiable<Category>,
        com.commercetools.api.models.Customizable<Category> {

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
    *  <p>Present on resources updated after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
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

    @JsonIgnore
    public void setAncestors(final CategoryReference... ancestors);

    public void setAncestors(final List<CategoryReference> ancestors);

    public void setParent(final CategoryReference parent);

    public void setOrderHint(final String orderHint);

    public void setExternalId(final String externalId);

    public void setMetaTitle(final LocalizedString metaTitle);

    public void setMetaDescription(final LocalizedString metaDescription);

    public void setMetaKeywords(final LocalizedString metaKeywords);

    public void setCustom(final CustomFields custom);

    @JsonIgnore
    public void setAssets(final Asset... assets);

    public void setAssets(final List<Asset> assets);

    public void setKey(final String key);

    public static Category of() {
        return new CategoryImpl();
    }

    public static Category of(final Category template) {
        CategoryImpl instance = new CategoryImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setName(template.getName());
        instance.setSlug(template.getSlug());
        instance.setDescription(template.getDescription());
        instance.setAncestors(template.getAncestors());
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

    public static CategoryBuilder builder() {
        return CategoryBuilder.of();
    }

    public static CategoryBuilder builder(final Category template) {
        return CategoryBuilder.of(template);
    }

    default <T> T withCategory(Function<Category, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.category.CategoryResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.category.CategoryReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Category> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Category>() {
            @Override
            public String toString() {
                return "TypeReference<Category>";
            }
        };
    }
}
