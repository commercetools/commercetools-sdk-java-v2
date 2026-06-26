
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
 *  <p>Sets the description of an existing Asset on a Variant. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAssetDescriptionActionImpl implements VariantSetAssetDescriptionAction, ModelBase {

    private String action;

    private Boolean staged;

    private String assetId;

    private String assetKey;

    private com.commercetools.api.models.common.LocalizedString description;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantSetAssetDescriptionActionImpl(@JsonProperty("staged") final Boolean staged,
            @JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description) {
        this.staged = staged;
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.description = description;
        this.action = SET_ASSET_DESCRIPTION;
    }

    /**
     * create empty instance
     */
    public VariantSetAssetDescriptionActionImpl() {
        this.action = SET_ASSET_DESCRIPTION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
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

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantSetAssetDescriptionActionImpl that = (VariantSetAssetDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(staged, that.staged)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .append(description, that.description)
                .append(action, that.action)
                .append(staged, that.staged)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .append(description, that.description)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(staged)
                .append(assetId)
                .append(assetKey)
                .append(description)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("staged", staged)
                .append("assetId", assetId)
                .append("assetKey", assetKey)
                .append("description", description)
                .build();
    }

    @Override
    public VariantSetAssetDescriptionAction copyDeep() {
        return VariantSetAssetDescriptionAction.deepCopy(this);
    }
}
