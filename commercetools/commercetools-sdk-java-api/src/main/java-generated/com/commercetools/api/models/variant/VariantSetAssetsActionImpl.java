
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
 *  <p>Sets the assets of the Variant. Existing assets will be replaced with the new ones.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAssetsActionImpl implements VariantSetAssetsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantSetAssetsActionImpl(
            @JsonProperty("assets") final java.util.List<com.commercetools.api.models.common.AssetDraft> assets,
            @JsonProperty("staged") final Boolean staged) {
        this.assets = assets;
        this.staged = staged;
        this.action = SET_ASSETS;
    }

    /**
     * create empty instance
     */
    public VariantSetAssetsActionImpl() {
        this.action = SET_ASSETS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Assets to set for the Variant.</p>
     */

    public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Whether only the staged assets are set. If <code>false</code>, both the current and staged assets are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setAssets(final com.commercetools.api.models.common.AssetDraft... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
    }

    public void setAssets(final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.assets = assets;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantSetAssetsActionImpl that = (VariantSetAssetsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(assets, that.assets)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(assets, that.assets)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(assets).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("assets", assets)
                .append("staged", staged)
                .build();
    }

    @Override
    public VariantSetAssetsAction copyDeep() {
        return VariantSetAssetsAction.deepCopy(this);
    }
}
