
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
 * CategoryAddAssetAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryAddAssetActionImpl implements CategoryAddAssetAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.AssetDraft asset;

    private Integer position;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategoryAddAssetActionImpl(@JsonProperty("asset") final com.commercetools.api.models.common.AssetDraft asset,
            @JsonProperty("position") final Integer position) {
        this.asset = asset;
        this.position = position;
        this.action = ADD_ASSET;
    }

    /**
     * create empty instance
     */
    public CategoryAddAssetActionImpl() {
        this.action = ADD_ASSET;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to append.</p>
     */

    public com.commercetools.api.models.common.AssetDraft getAsset() {
        return this.asset;
    }

    /**
     *  <p>Position in the array at which the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     */

    public Integer getPosition() {
        return this.position;
    }

    public void setAsset(final com.commercetools.api.models.common.AssetDraft asset) {
        this.asset = asset;
    }

    public void setPosition(final Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategoryAddAssetActionImpl that = (CategoryAddAssetActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(asset, that.asset)
                .append(position, that.position)
                .append(action, that.action)
                .append(asset, that.asset)
                .append(position, that.position)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(asset).append(position).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("asset", asset)
                .append("position", position)
                .build();
    }

    @Override
    public CategoryAddAssetAction copyDeep() {
        return CategoryAddAssetAction.deepCopy(this);
    }
}
