
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
 * CategorySetAssetTagsAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetAssetTagsActionImpl implements CategorySetAssetTagsAction, ModelBase {

    private String action;

    private String assetId;

    private String assetKey;

    private java.util.List<String> tags;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategorySetAssetTagsActionImpl(@JsonProperty("assetId") final String assetId,
            @JsonProperty("assetKey") final String assetKey, @JsonProperty("tags") final java.util.List<String> tags) {
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.tags = tags;
        this.action = SET_ASSET_TAGS;
    }

    /**
     * create empty instance
     */
    public CategorySetAssetTagsActionImpl() {
        this.action = SET_ASSET_TAGS;
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
     *  <p>Keywords for categorizing and organizing Assets.</p>
     */

    public java.util.List<String> getTags() {
        return this.tags;
    }

    public void setAssetId(final String assetId) {
        this.assetId = assetId;
    }

    public void setAssetKey(final String assetKey) {
        this.assetKey = assetKey;
    }

    public void setTags(final String... tags) {
        this.tags = new ArrayList<>(Arrays.asList(tags));
    }

    public void setTags(final java.util.List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySetAssetTagsActionImpl that = (CategorySetAssetTagsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .append(tags, that.tags)
                .append(action, that.action)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .append(tags, that.tags)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(assetId).append(assetKey).append(tags).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("assetId", assetId)
                .append("assetKey", assetKey)
                .append("tags", tags)
                .build();
    }

    @Override
    public CategorySetAssetTagsAction copyDeep() {
        return CategorySetAssetTagsAction.deepCopy(this);
    }
}
