
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAssetCustomFieldChangeImpl implements SetAssetCustomFieldChange {

    private String type;

    private String change;

    private String name;

    private String customTypeId;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    @JsonCreator
    SetAssetCustomFieldChangeImpl(@JsonProperty("change") final String change, @JsonProperty("name") final String name,
            @JsonProperty("customTypeId") final String customTypeId,
            @JsonProperty("asset") final com.commercetools.history.models.change_value.AssetChangeValue asset,
            @JsonProperty("nextValue") final java.lang.Object nextValue,
            @JsonProperty("previousValue") final java.lang.Object previousValue) {
        this.change = change;
        this.name = name;
        this.customTypeId = customTypeId;
        this.asset = asset;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_ASSET_CUSTOM_FIELD_CHANGE;
    }

    public SetAssetCustomFieldChangeImpl() {
        this.type = SET_ASSET_CUSTOM_FIELD_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setAssetCustomField</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public String getName() {
        return this.name;
    }

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setCustomTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
    }

    public void setAsset(final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
    }

    public void setNextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetAssetCustomFieldChangeImpl that = (SetAssetCustomFieldChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(name, that.name)
                .append(customTypeId, that.customTypeId)
                .append(asset, that.asset)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(name)
                .append(customTypeId)
                .append(asset)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
