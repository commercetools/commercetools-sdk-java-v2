
package com.commercetools.api.models.product;

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
 *  <p>Sets the <span>defaultVariant</span> of the Product. Only available for Projects with <span>productCatalogModel</span> set to <code>Modular</code>. The Variant must belong to the Product. If <code>variant</code> is omitted, any existing default Variant is cleared.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetDefaultVariantActionImpl implements ProductSetDefaultVariantAction, ModelBase {

    private String action;

    private com.commercetools.api.models.variant.VariantResourceIdentifier variant;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSetDefaultVariantActionImpl(
            @JsonProperty("variant") final com.commercetools.api.models.variant.VariantResourceIdentifier variant,
            @JsonProperty("staged") final Boolean staged) {
        this.variant = variant;
        this.staged = staged;
        this.action = SET_DEFAULT_VARIANT;
    }

    /**
     * create empty instance
     */
    public ProductSetDefaultVariantActionImpl() {
        this.action = SET_DEFAULT_VARIANT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The Variant to set as default. If omitted, any existing value is removed.</p>
     */

    public com.commercetools.api.models.variant.VariantResourceIdentifier getVariant() {
        return this.variant;
    }

    /**
     *  <p>Whether only the staged <code>defaultVariant</code> is updated. If <code>false</code>, both the current and staged <code>defaultVariant</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setVariant(final com.commercetools.api.models.variant.VariantResourceIdentifier variant) {
        this.variant = variant;
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

        ProductSetDefaultVariantActionImpl that = (ProductSetDefaultVariantActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(variant, that.variant)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(variant, that.variant)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(variant).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("variant", variant)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductSetDefaultVariantAction copyDeep() {
        return ProductSetDefaultVariantAction.deepCopy(this);
    }
}
