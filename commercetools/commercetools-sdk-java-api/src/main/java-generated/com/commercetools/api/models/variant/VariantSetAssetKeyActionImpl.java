
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
 *  <p>Sets the key of an existing Asset on a Variant.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAssetKeyActionImpl implements VariantSetAssetKeyAction, ModelBase {

    private String action;

    private Boolean staged;

    private String assetId;

    private String assetKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantSetAssetKeyActionImpl(@JsonProperty("staged") final Boolean staged,
            @JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey) {
        this.staged = staged;
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.action = SET_ASSET_KEY;
    }

    /**
     * create empty instance
     */
    public VariantSetAssetKeyActionImpl() {
        this.action = SET_ASSET_KEY;
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
     *  <p>Value to set. If omitted, any existing value is removed.</p>
     */

    public String getAssetKey() {
        return this.assetKey;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantSetAssetKeyActionImpl that = (VariantSetAssetKeyActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(staged, that.staged)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .append(action, that.action)
                .append(staged, that.staged)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(staged).append(assetId).append(assetKey).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("staged", staged)
                .append("assetId", assetId)
                .append("assetKey", assetKey)
                .build();
    }

    @Override
    public VariantSetAssetKeyAction copyDeep() {
        return VariantSetAssetKeyAction.deepCopy(this);
    }
}
