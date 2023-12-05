
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
 * ShippingMethodSetLocalizedDescriptionAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetLocalizedDescriptionActionImpl
        implements ShippingMethodSetLocalizedDescriptionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString localizedDescription;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodSetLocalizedDescriptionActionImpl(
            @JsonProperty("localizedDescription") final com.commercetools.api.models.common.LocalizedString localizedDescription) {
        this.localizedDescription = localizedDescription;
        this.action = SET_LOCALIZED_DESCRIPTION;
    }

    /**
     * create empty instance
     */
    public ShippingMethodSetLocalizedDescriptionActionImpl() {
        this.action = SET_LOCALIZED_DESCRIPTION;
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

    public com.commercetools.api.models.common.LocalizedString getLocalizedDescription() {
        return this.localizedDescription;
    }

    public void setLocalizedDescription(
            final com.commercetools.api.models.common.LocalizedString localizedDescription) {
        this.localizedDescription = localizedDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingMethodSetLocalizedDescriptionActionImpl that = (ShippingMethodSetLocalizedDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(localizedDescription, that.localizedDescription)
                .append(action, that.action)
                .append(localizedDescription, that.localizedDescription)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(localizedDescription).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("localizedDescription", localizedDescription)
                .build();
    }

}
