
package com.commercetools.api.models.shipping_method;

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
 * ShippingMethodSetLocalizedNameAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetLocalizedNameActionImpl implements ShippingMethodSetLocalizedNameAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString localizedName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodSetLocalizedNameActionImpl(
            @JsonProperty("localizedName") final com.commercetools.api.models.common.LocalizedString localizedName) {
        this.localizedName = localizedName;
        this.action = SET_LOCALIZED_NAME;
    }

    /**
     * create empty instance
     */
    public ShippingMethodSetLocalizedNameActionImpl() {
        this.action = SET_LOCALIZED_NAME;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getLocalizedName() {
        return this.localizedName;
    }

    public void setLocalizedName(final com.commercetools.api.models.common.LocalizedString localizedName) {
        this.localizedName = localizedName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodSetLocalizedNameActionImpl that = (ShippingMethodSetLocalizedNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(localizedName, that.localizedName)
                .append(action, that.action)
                .append(localizedName, that.localizedName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(localizedName).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("localizedName", localizedName)
                .build();
    }

    @Override
    public ShippingMethodSetLocalizedNameAction copyDeep() {
        return ShippingMethodSetLocalizedNameAction.deepCopy(this);
    }
}
