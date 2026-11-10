
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
 *  <p>Sets or removes a Custom Field on an existing Asset of a Variant. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAssetCustomFieldActionImpl implements VariantSetAssetCustomFieldAction, ModelBase {

    private String action;

    private Boolean staged;

    private String assetId;

    private String assetKey;

    private String name;

    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantSetAssetCustomFieldActionImpl(@JsonProperty("staged") final Boolean staged,
            @JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.staged = staged;
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.name = name;
        this.value = value;
        this.action = SET_ASSET_CUSTOM_FIELD;
    }

    /**
     * create empty instance
     */
    public VariantSetAssetCustomFieldActionImpl() {
        this.action = SET_ASSET_CUSTOM_FIELD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Whether only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     */

    public String getAssetKey() {
        return this.assetKey;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setAssetId(final String assetId) {
        this.assetId = assetId;
    }

    public void setAssetKey(final String assetKey) {
        this.assetKey = assetKey;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantSetAssetCustomFieldActionImpl that = (VariantSetAssetCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(staged, that.staged)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .append(name, that.name)
                .append(value, that.value)
                .append(action, that.action)
                .append(staged, that.staged)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(staged)
                .append(assetId)
                .append(assetKey)
                .append(name)
                .append(value)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("staged", staged)
                .append("assetId", assetId)
                .append("assetKey", assetKey)
                .append("name", name)
                .append("value", value)
                .build();
    }

    @Override
    public VariantSetAssetCustomFieldAction copyDeep() {
        return VariantSetAssetCustomFieldAction.deepCopy(this);
    }
}
