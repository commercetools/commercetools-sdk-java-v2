
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
 *  <p>Changes the order of Assets on a Variant.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantChangeAssetOrderActionImpl implements VariantChangeAssetOrderAction, ModelBase {

    private String action;

    private Boolean staged;

    private java.util.List<String> assetOrder;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantChangeAssetOrderActionImpl(@JsonProperty("staged") final Boolean staged,
            @JsonProperty("assetOrder") final java.util.List<String> assetOrder) {
        this.staged = staged;
        this.assetOrder = assetOrder;
        this.action = CHANGE_ASSET_ORDER;
    }

    /**
     * create empty instance
     */
    public VariantChangeAssetOrderActionImpl() {
        this.action = CHANGE_ASSET_ORDER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Whether only the staged <code>assets</code> is updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the Variant in the desired new order.</p>
     */

    public java.util.List<String> getAssetOrder() {
        return this.assetOrder;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setAssetOrder(final String... assetOrder) {
        this.assetOrder = new ArrayList<>(Arrays.asList(assetOrder));
    }

    public void setAssetOrder(final java.util.List<String> assetOrder) {
        this.assetOrder = assetOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantChangeAssetOrderActionImpl that = (VariantChangeAssetOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(staged, that.staged)
                .append(assetOrder, that.assetOrder)
                .append(action, that.action)
                .append(staged, that.staged)
                .append(assetOrder, that.assetOrder)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(staged).append(assetOrder).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("staged", staged)
                .append("assetOrder", assetOrder)
                .build();
    }

    @Override
    public VariantChangeAssetOrderAction copyDeep() {
        return VariantChangeAssetOrderAction.deepCopy(this);
    }
}
