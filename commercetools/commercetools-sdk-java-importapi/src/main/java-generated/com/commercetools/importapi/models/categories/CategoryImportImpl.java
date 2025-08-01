
package com.commercetools.importapi.models.categories;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Represents the data used to import a Category. Once imported, this data is persisted as a Category in the Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryImportImpl implements CategoryImport, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.LocalizedString slug;

    private com.commercetools.importapi.models.common.LocalizedString description;

    private com.commercetools.importapi.models.common.CategoryKeyReference parent;

    private String orderHint;

    private String externalId;

    private com.commercetools.importapi.models.common.LocalizedString metaTitle;

    private com.commercetools.importapi.models.common.LocalizedString metaDescription;

    private com.commercetools.importapi.models.common.LocalizedString metaKeywords;

    private java.util.List<com.commercetools.importapi.models.common.Asset> assets;

    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategoryImportImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name,
            @JsonProperty("slug") final com.commercetools.importapi.models.common.LocalizedString slug,
            @JsonProperty("description") final com.commercetools.importapi.models.common.LocalizedString description,
            @JsonProperty("parent") final com.commercetools.importapi.models.common.CategoryKeyReference parent,
            @JsonProperty("orderHint") final String orderHint, @JsonProperty("externalId") final String externalId,
            @JsonProperty("metaTitle") final com.commercetools.importapi.models.common.LocalizedString metaTitle,
            @JsonProperty("metaDescription") final com.commercetools.importapi.models.common.LocalizedString metaDescription,
            @JsonProperty("metaKeywords") final com.commercetools.importapi.models.common.LocalizedString metaKeywords,
            @JsonProperty("assets") final java.util.List<com.commercetools.importapi.models.common.Asset> assets,
            @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom) {
        this.key = key;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.parent = parent;
        this.orderHint = orderHint;
        this.externalId = externalId;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.assets = assets;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public CategoryImportImpl() {
    }

    /**
     *  <p>User-defined unique identifier. If a Category with this <code>key</code> exists, it is updated with the imported data.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>Category.name</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>Category.slug</code>. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>Maps to <code>Category.description</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Maps to <code>Category.parent</code>. If the referenced Category does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Category is created.</p>
     */

    public com.commercetools.importapi.models.common.CategoryKeyReference getParent() {
        return this.parent;
    }

    /**
     *  <p>Maps to <code>Category.orderHint</code>.</p>
     */

    public String getOrderHint() {
        return this.orderHint;
    }

    /**
     *  <p>Maps to <code>Category.externalId</code>.</p>
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     *  <p>Maps to <code>Category.metaTitle</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Maps to <code>Category.metaDescription</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Maps to <code>Category.metaKeywords</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>Maps to <code>Category.assets</code>.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.Asset> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Maps to <code>Category.custom</code>.</p>
     */

    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setSlug(final com.commercetools.importapi.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setDescription(final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setParent(final com.commercetools.importapi.models.common.CategoryKeyReference parent) {
        this.parent = parent;
    }

    public void setOrderHint(final String orderHint) {
        this.orderHint = orderHint;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setMetaTitle(final com.commercetools.importapi.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setMetaDescription(final com.commercetools.importapi.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setMetaKeywords(final com.commercetools.importapi.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public void setAssets(final com.commercetools.importapi.models.common.Asset... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.importapi.models.common.Asset> assets) {
        this.assets = assets;
    }

    public void setCustom(final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategoryImportImpl that = (CategoryImportImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(slug, that.slug)
                .append(description, that.description)
                .append(parent, that.parent)
                .append(orderHint, that.orderHint)
                .append(externalId, that.externalId)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(assets, that.assets)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(name, that.name)
                .append(slug, that.slug)
                .append(description, that.description)
                .append(parent, that.parent)
                .append(orderHint, that.orderHint)
                .append(externalId, that.externalId)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(assets, that.assets)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
                .append(slug)
                .append(description)
                .append(parent)
                .append(orderHint)
                .append(externalId)
                .append(metaTitle)
                .append(metaDescription)
                .append(metaKeywords)
                .append(assets)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("name", name)
                .append("slug", slug)
                .append("description", description)
                .append("parent", parent)
                .append("orderHint", orderHint)
                .append("externalId", externalId)
                .append("metaTitle", metaTitle)
                .append("metaDescription", metaDescription)
                .append("metaKeywords", metaKeywords)
                .append("assets", assets)
                .append("custom", custom)
                .build();
    }

    @Override
    public CategoryImport copyDeep() {
        return CategoryImport.deepCopy(this);
    }
}
