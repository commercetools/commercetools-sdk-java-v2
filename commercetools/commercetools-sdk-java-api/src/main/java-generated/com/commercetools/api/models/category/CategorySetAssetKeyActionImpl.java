
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
 *  <p>Set or remove the <code>key</code> of an Asset.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetAssetKeyActionImpl implements CategorySetAssetKeyAction, ModelBase {

    private String action;

    private String assetId;

    private String assetKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategorySetAssetKeyActionImpl(@JsonProperty("assetId") final String assetId,
            @JsonProperty("assetKey") final String assetKey) {
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.action = SET_ASSET_KEY;
    }

    /**
     * create empty instance
     */
    public CategorySetAssetKeyActionImpl() {
        this.action = SET_ASSET_KEY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set.</p>
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public String getAssetKey() {
        return this.assetKey;
    }

    public void setAssetId(final String assetId) {
        this.assetId = assetId;
    }

    public void setAssetKey(final String assetKey) {
        this.assetKey = assetKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySetAssetKeyActionImpl that = (CategorySetAssetKeyActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .append(action, that.action)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(assetId).append(assetKey).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("assetId", assetId)
                .append("assetKey", assetKey)
                .build();
    }

    @Override
    public CategorySetAssetKeyAction copyDeep() {
        return CategorySetAssetKeyAction.deepCopy(this);
    }
}
