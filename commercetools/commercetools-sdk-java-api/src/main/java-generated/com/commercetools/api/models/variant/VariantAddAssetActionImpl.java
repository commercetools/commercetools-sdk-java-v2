
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Adds an asset to existing variant's assets.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAddAssetActionImpl implements VariantAddAssetAction, ModelBase {

    private String action;

    private Boolean staged;

    private com.commercetools.api.models.common.AssetDraft asset;

    private Integer position;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantAddAssetActionImpl(@JsonProperty("staged") final Boolean staged,
            @JsonProperty("asset") final com.commercetools.api.models.common.AssetDraft asset,
            @JsonProperty("position") final Integer position) {
        this.staged = staged;
        this.asset = asset;
        this.position = position;
        this.action = ADD_ASSET;
    }

    /**
     * create empty instance
     */
    public VariantAddAssetActionImpl() {
        this.action = ADD_ASSET;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Whether only the staged <code>assets</code> are updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Value to append.</p>
     */

    public com.commercetools.api.models.common.AssetDraft getAsset() {
        return this.asset;
    }

    /**
     *  <p>Position in <code>assets</code> where the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     */

    public Integer getPosition() {
        return this.position;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
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

        VariantAddAssetActionImpl that = (VariantAddAssetActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(staged, that.staged)
                .append(asset, that.asset)
                .append(position, that.position)
                .append(action, that.action)
                .append(staged, that.staged)
                .append(asset, that.asset)
                .append(position, that.position)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(staged).append(asset).append(position).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("staged", staged)
                .append("asset", asset)
                .append("position", position)
                .build();
    }

    @Override
    public VariantAddAssetAction copyDeep() {
        return VariantAddAssetAction.deepCopy(this);
    }
}
