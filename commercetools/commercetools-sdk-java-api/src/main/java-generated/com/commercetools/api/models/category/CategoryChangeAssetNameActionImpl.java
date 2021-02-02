
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
public final class CategoryChangeAssetNameActionImpl implements CategoryChangeAssetNameAction {

    private String action;

    private String assetId;

    private String assetKey;

    private com.commercetools.api.models.common.LocalizedString name;

    @JsonCreator
    CategoryChangeAssetNameActionImpl(@JsonProperty("assetId") final String assetId,
            @JsonProperty("assetKey") final String assetKey,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.name = name;
        this.action = CHANGE_ASSET_NAME;
    }

    public CategoryChangeAssetNameActionImpl() {
        this.action = CHANGE_ASSET_NAME;
    }

    public String getAction() {
        return this.action;
    }

    public String getAssetId() {
        return this.assetId;
    }

    public String getAssetKey() {
        return this.assetKey;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public void setAssetId(final String assetId) {
        this.assetId = assetId;
    }

    public void setAssetKey(final String assetKey) {
        this.assetKey = assetKey;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategoryChangeAssetNameActionImpl that = (CategoryChangeAssetNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(assetId, that.assetId).append(assetKey,
            that.assetKey).append(name, that.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(assetId).append(assetKey).append(name).toHashCode();
    }

}
