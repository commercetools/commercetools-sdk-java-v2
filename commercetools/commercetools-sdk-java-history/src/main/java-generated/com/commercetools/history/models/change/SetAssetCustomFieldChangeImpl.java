
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
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CategorySetAssetCustomFieldAction" rel="nofollow">Set Asset CustomField</a> on Categories.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetAssetCustomFieldAction" rel="nofollow">Set Asset CustomField</a> on Products.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAssetCustomFieldChangeImpl implements SetAssetCustomFieldChange, ModelBase {

    private String type;

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    private String name;

    private String customTypeId;

    private com.commercetools.history.models.change_value.AssetChangeValue asset;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetAssetCustomFieldChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.lang.Object previousValue,
            @JsonProperty("nextValue") final java.lang.Object nextValue, @JsonProperty("name") final String name,
            @JsonProperty("customTypeId") final String customTypeId,
            @JsonProperty("asset") final com.commercetools.history.models.change_value.AssetChangeValue asset) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.name = name;
        this.customTypeId = customTypeId;
        this.asset = asset;
        this.type = SET_ASSET_CUSTOM_FIELD_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetAssetCustomFieldChangeImpl() {
        this.type = SET_ASSET_CUSTOM_FIELD_CHANGE;
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

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     */

    public String getCustomTypeId() {
        return this.customTypeId;
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

    public void setPreviousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetAssetCustomFieldChangeImpl that = (SetAssetCustomFieldChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(name, that.name)
                .append(customTypeId, that.customTypeId)
                .append(asset, that.asset)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(name, that.name)
                .append(customTypeId, that.customTypeId)
                .append(asset, that.asset)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(name)
                .append(customTypeId)
                .append(asset)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("name", name)
                .append("customTypeId", customTypeId)
                .append("asset", asset)
                .build();
    }

    @Override
    public SetAssetCustomFieldChange copyDeep() {
        return SetAssetCustomFieldChange.deepCopy(this);
    }
}
