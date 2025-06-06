
package com.commercetools.history.models.common;

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

    private com.commercetools.history.models.common.LocalizedString name;

    private com.commercetools.history.models.common.LocalizedString description;

    private com.commercetools.history.models.common.CustomFields custom;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssetImpl(@JsonProperty("id") final String id,
            @JsonProperty("name") final com.commercetools.history.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.history.models.common.LocalizedString description,
            @JsonProperty("custom") final com.commercetools.history.models.common.CustomFields custom,
            @JsonProperty("key") final String key) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.custom = custom;
        this.key = key;
    }

    /**
     * create empty instance
     */
    public AssetImpl() {
    }

    /**
     *
     */

    public String getId() {
        return this.id;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *
     */

    public String getKey() {
        return this.key;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.history.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setCustom(final com.commercetools.history.models.common.CustomFields custom) {
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
                .append(name, that.name)
                .append(description, that.description)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(id, that.id)
                .append(name, that.name)
                .append(description, that.description)
                .append(custom, that.custom)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(name)
                .append(description)
                .append(custom)
                .append(key)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("name", name)
                .append("description", description)
                .append("custom", custom)
                .append("key", key)
                .build();
    }

    @Override
    public Asset copyDeep() {
        return Asset.deepCopy(this);
    }
}
