
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
 *  <p>Sets the SKU of the Variant. SKU cannot be changed or removed if it is associated with an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetSkuActionImpl implements VariantSetSkuAction, ModelBase {

    private String action;

    private String sku;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantSetSkuActionImpl(@JsonProperty("sku") final String sku, @JsonProperty("staged") final Boolean staged) {
        this.sku = sku;
        this.staged = staged;
        this.action = SET_SKU;
    }

    /**
     * create empty instance
     */
    public VariantSetSkuActionImpl() {
        this.action = SET_SKU;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Must be unique.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Whether only the staged <code>sku</code> is updated. If <code>false</code>, both the current and staged <code>sku</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setSku(final String sku) {
        this.sku = sku;
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

        VariantSetSkuActionImpl that = (VariantSetSkuActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(sku, that.sku)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(sku, that.sku)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(sku).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("sku", sku)
                .append("staged", staged)
                .build();
    }

    @Override
    public VariantSetSkuAction copyDeep() {
        return VariantSetSkuAction.deepCopy(this);
    }
}
