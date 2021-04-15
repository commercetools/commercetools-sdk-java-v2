
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
public final class CategorySetAssetKeyActionImpl implements CategorySetAssetKeyAction {

    private String action;

    private String assetId;

    private String assetKey;

    @JsonCreator
    CategorySetAssetKeyActionImpl(@JsonProperty("assetId") final String assetId,
            @JsonProperty("assetKey") final String assetKey) {
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.action = SET_ASSET_KEY;
    }

    public CategorySetAssetKeyActionImpl() {
        this.action = SET_ASSET_KEY;
    }

    public String getAction() {
        return this.action;
    }

    public String getAssetId() {
        return this.assetId;
    }

    /**
    *  <p>User-defined identifier for the asset.
    *  If left blank or set to <code>null</code>, the asset key is unset/removed.</p>
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(assetId).append(assetKey).toHashCode();
    }

}
