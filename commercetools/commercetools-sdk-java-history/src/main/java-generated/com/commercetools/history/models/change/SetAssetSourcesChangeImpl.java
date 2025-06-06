
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Asset Sources on Categories.</li>
 *   <li>Set Asset Sources on Products.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAssetSourcesChangeImpl implements SetAssetSourcesChange, ModelBase {

    private String type;

    private String change;

    private java.util.List<com.commercetools.history.models.common.AssetSource> previousValue;

    private java.util.List<com.commercetools.history.models.common.AssetSource> nextValue;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetAssetSourcesChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.AssetSource> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.AssetSource> nextValue,
            @JsonProperty("asset") final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.asset = asset;
        this.type = SET_ASSET_SOURCES_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetAssetSourcesChangeImpl() {
        this.type = SET_ASSET_SOURCES_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.AssetSource> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.AssetSource> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Information about the updated Asset.</p>
     */

    public com.commercetools.history.models.change_value.AssetChangeValue getAsset() {
        return this.asset;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.AssetSource... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.common.AssetSource> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.AssetSource... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<com.commercetools.history.models.common.AssetSource> nextValue) {
        this.nextValue = nextValue;
    }

    public void setAsset(final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.asset = asset;
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
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(asset, that.asset)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(asset, that.asset)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(asset)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("asset", asset)
                .build();
    }

    @Override
    public SetAssetSourcesChange copyDeep() {
        return SetAssetSourcesChange.deepCopy(this);
    }
}
