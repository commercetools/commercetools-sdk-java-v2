
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AssetImpl implements Asset {

    private String key;

    private java.util.List<com.commercetools.importapi.models.common.AssetSource> sources;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.LocalizedString description;

    private java.util.List<String> tags;

    private com.commercetools.importapi.models.customfields.Custom custom;

    @JsonCreator
    AssetImpl(@JsonProperty("key") final String key,
            @JsonProperty("sources") final java.util.List<com.commercetools.importapi.models.common.AssetSource> sources,
            @JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.importapi.models.common.LocalizedString description,
            @JsonProperty("tags") final java.util.List<String> tags,
            @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom) {
        this.key = key;
        this.sources = sources;
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.custom = custom;
    }

    public AssetImpl() {
    }

    /**
    *  <p>User-defined identifier for the asset.
    *  Asset keys are unique inside their container (a product variant or a category).</p>
    */
    public String getKey() {
        return this.key;
    }

    public java.util.List<com.commercetools.importapi.models.common.AssetSource> getSources() {
        return this.sources;
    }

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
    *  <p>The representation to be sent to the server when creating a resource with custom fields.</p>
    */
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setSources(final com.commercetools.importapi.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
    }

    public void setSources(final java.util.List<com.commercetools.importapi.models.common.AssetSource> sources) {
        this.sources = sources;
    }

    public void setName(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setTags(final String... tags) {
        this.tags = new ArrayList<>(Arrays.asList(tags));
    }

    public void setTags(final java.util.List<String> tags) {
        this.tags = tags;
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

        AssetImpl that = (AssetImpl) o;

        return new EqualsBuilder().append(key, that.key).append(sources, that.sources).append(name, that.name).append(
            description, that.description).append(tags, that.tags).append(custom, that.custom).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(sources).append(name).append(description).append(
            tags).append(custom).toHashCode();
    }

}
