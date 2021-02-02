
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryAddAssetActionImpl implements CategoryAddAssetAction {

    private String action;

    private com.commercetools.api.models.common.AssetDraft asset;

    private Integer position;

    @JsonCreator
    CategoryAddAssetActionImpl(@JsonProperty("asset") final com.commercetools.api.models.common.AssetDraft asset,
            @JsonProperty("position") final Integer position) {
        this.asset = asset;
        this.position = position;
        this.action = ADD_ASSET;
    }

    public CategoryAddAssetActionImpl() {
        this.action = ADD_ASSET;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.AssetDraft getAsset() {
        return this.asset;
    }

    /**
    *  <p>When specified, the value might be <code>0</code> and should be lower than the total of the assets list.</p>
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

        return new EqualsBuilder().append(action, that.action).append(asset, that.asset).append(position,
            that.position).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(asset).append(position).toHashCode();
    }

}
