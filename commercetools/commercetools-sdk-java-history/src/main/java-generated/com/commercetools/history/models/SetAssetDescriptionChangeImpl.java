
package com.commercetools.history.models;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAssetDescriptionChangeImpl implements SetAssetDescriptionChange {

    private String type;

    private String change;

    private com.commercetools.history.models.AssetChangeValue asset;

    private com.commercetools.history.models.LocalizedString nextValue;

    private com.commercetools.history.models.LocalizedString previousValue;

    @JsonCreator
    SetAssetDescriptionChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("asset") final com.commercetools.history.models.AssetChangeValue asset,
            @JsonProperty("nextValue") final com.commercetools.history.models.LocalizedString nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.LocalizedString previousValue) {
        this.change = change;
        this.asset = asset;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_ASSET_DESCRIPTION_CHANGE;
    }

    public SetAssetDescriptionChangeImpl() {
        this.type = SET_ASSET_DESCRIPTION_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setAssetDescription</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.AssetChangeValue getAsset() {
        return this.asset;
    }

    public com.commercetools.history.models.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setAsset(final com.commercetools.history.models.AssetChangeValue asset) {
        this.asset = asset;
    }

    public void setNextValue(final com.commercetools.history.models.LocalizedString nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.LocalizedString previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetAssetDescriptionChangeImpl that = (SetAssetDescriptionChangeImpl) o;

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
