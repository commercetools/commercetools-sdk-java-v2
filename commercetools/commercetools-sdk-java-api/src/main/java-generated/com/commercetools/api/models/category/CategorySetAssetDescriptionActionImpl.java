
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * CategorySetAssetDescriptionAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetAssetDescriptionActionImpl implements CategorySetAssetDescriptionAction, ModelBase {

    private String action;

    private String assetId;

    private String assetKey;

    private com.commercetools.api.models.common.LocalizedString description;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategorySetAssetDescriptionActionImpl(@JsonProperty("assetId") final String assetId,
            @JsonProperty("assetKey") final String assetKey,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description) {
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.description = description;
        this.action = SET_ASSET_DESCRIPTION;
    }

    /**
     * create empty instance
     */
    public CategorySetAssetDescriptionActionImpl() {
        this.action = SET_ASSET_DESCRIPTION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    public String getAssetKey() {
        return this.assetKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public void setAssetId(final String assetId) {
        this.assetId = assetId;
    }

    public void setAssetKey(final String assetKey) {
        this.assetKey = assetKey;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySetAssetDescriptionActionImpl that = (CategorySetAssetDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .append(description, that.description)
                .append(action, that.action)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .append(description, that.description)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(assetId)
                .append(assetKey)
                .append(description)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("assetId", assetId)
                .append("assetKey", assetKey)
                .append("description", description)
                .build();
    }

    @Override
    public CategorySetAssetDescriptionAction copyDeep() {
        return CategorySetAssetDescriptionAction.deepCopy(this);
    }
}
