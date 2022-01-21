
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SetAssetSourcesChangeImpl implements SetAssetSourcesChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private java.util.List<com.commercetools.history.models.common.AssetSource> nextValue;

    private java.util.List<com.commercetools.history.models.common.AssetSource> previousValue;

    @JsonCreator
    SetAssetSourcesChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("asset") final com.commercetools.history.models.change_value.AssetChangeValue asset,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.AssetSource> nextValue,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.AssetSource> previousValue) {
        this.change = change;
        this.asset = asset;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_ASSET_SOURCES_CHANGE;
    }

    public SetAssetSourcesChangeImpl() {
        this.type = SET_ASSET_SOURCES_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setAssetSources</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    public java.util.List<com.commercetools.history.models.common.AssetSource> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.common.AssetSource> getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setAsset(final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
    }

    public void setNextValue(final com.commercetools.history.models.common.AssetSource... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<com.commercetools.history.models.common.AssetSource> nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.AssetSource... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.common.AssetSource> previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetAssetSourcesChangeImpl that = (SetAssetSourcesChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(asset, that.asset)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(asset)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
