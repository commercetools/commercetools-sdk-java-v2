
package com.commercetools.api.models.common;

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
 * Asset
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssetImpl implements Asset, ModelBase {

    private String id;

    private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private java.util.List<String> tags;

    private com.commercetools.api.models.type.CustomFields custom;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssetImpl(@JsonProperty("id") final String id,
            @JsonProperty("sources") final java.util.List<com.commercetools.api.models.common.AssetSource> sources,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("tags") final java.util.List<String> tags,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("key") final String key) {
        this.id = id;
        this.sources = sources;
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.custom = custom;
        this.key = key;
    }

    /**
     * create empty instance
     */
    public AssetImpl() {
    }

    /**
     *  <p>Unique identifier of the Asset.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.common.AssetSource> getSources() {
        return this.sources;
    }

    /**
     *  <p>Name of the Asset.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the Asset.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     */

    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     *  <p>Custom Fields defined for the Asset.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>User-defined identifier of the Asset. It is unique per Category or ProductVariant.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setSources(final com.commercetools.api.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
    }

    public void setSources(final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.sources = sources;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setTags(final String... tags) {
        this.tags = new ArrayList<>(Arrays.asList(tags));
    }

    public void setTags(final java.util.List<String> tags) {
        this.tags = tags;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
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

        AssetImpl that = (AssetImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(sources, that.sources)
                .append(name, that.name)
                .append(description, that.description)
                .append(tags, that.tags)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(id, that.id)
                .append(sources, that.sources)
                .append(name, that.name)
                .append(description, that.description)
                .append(tags, that.tags)
                .append(custom, that.custom)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(sources)
                .append(name)
                .append(description)
                .append(tags)
                .append(custom)
                .append(key)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("sources", sources)
                .append("name", name)
                .append("description", description)
                .append("tags", tags)
                .append("custom", custom)
                .append("key", key)
                .build();
    }

    @Override
    public Asset copyDeep() {
        return Asset.deepCopy(this);
    }
}
