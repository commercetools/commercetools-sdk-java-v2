
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CategoryDraftImpl implements CategoryDraft, ModelBase {

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString slug;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.category.CategoryResourceIdentifier parent;

    private String orderHint;

    private String externalId;

    private com.commercetools.api.models.common.LocalizedString metaTitle;

    private com.commercetools.api.models.common.LocalizedString metaDescription;

    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    private String key;

    @JsonCreator
    CategoryDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("parent") final com.commercetools.api.models.category.CategoryResourceIdentifier parent,
            @JsonProperty("orderHint") final String orderHint, @JsonProperty("externalId") final String externalId,
            @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle,
            @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription,
            @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.AssetDraft> assets,
            @JsonProperty("key") final String key) {
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.parent = parent;
        this.orderHint = orderHint;
        this.externalId = externalId;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.custom = custom;
        this.assets = assets;
        this.key = key;
    }

    public CategoryDraftImpl() {
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
    *  <p>human-readable identifier usually used as deep-link URL to the related category.
    *  Allowed are alphabetic, numeric, underscore (<code>_</code>) and hyphen (<code>-</code>) characters.
    *  Maximum size is 256.
    *  <strong>Must be unique across a project!</strong> The same category can have the same slug for different languages.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
    *  <p>A category that is the parent of this category in the category tree.
    *  The parent can be set by its ID or by its key.</p>
    */
    public com.commercetools.api.models.category.CategoryResourceIdentifier getParent() {
        return this.parent;
    }

    /**
    *  <p>An attribute as base for a custom category order in one level.
    *  A random value will be assigned by API if not set.</p>
    */
    public String getOrderHint() {
        return this.orderHint;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
    *  <p>The custom fields.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets() {
        return this.assets;
    }

    /**
    *  <p>User-defined unique identifier for the Category.</p>
    */
    public String getKey() {
        return this.key;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setParent(final com.commercetools.api.models.category.CategoryResourceIdentifier parent) {
        this.parent = parent;
    }

    public void setOrderHint(final String orderHint) {
        this.orderHint = orderHint;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setMetaTitle(final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setMetaDescription(final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setMetaKeywords(final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setAssets(final com.commercetools.api.models.common.AssetDraft... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.assets = assets;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategoryDraftImpl that = (CategoryDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(slug, that.slug)
                .append(description, that.description)
                .append(parent, that.parent)
                .append(orderHint, that.orderHint)
                .append(externalId, that.externalId)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(custom, that.custom)
                .append(assets, that.assets)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(slug)
                .append(description)
                .append(parent)
                .append(orderHint)
                .append(externalId)
                .append(metaTitle)
                .append(metaDescription)
                .append(metaKeywords)
                .append(custom)
                .append(assets)
                .append(key)
                .toHashCode();
    }

}
