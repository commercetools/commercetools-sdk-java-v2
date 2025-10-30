
package com.commercetools.checkout.models.payment_integration;

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
 *  <p>Sets the display info description of a PaymentIntegration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDisplayInfoDescriptionUpdateActionImpl implements SetDisplayInfoDescriptionUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.common.LocalizedString description;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetDisplayInfoDescriptionUpdateActionImpl(
            @JsonProperty("description") final com.commercetools.checkout.models.common.LocalizedString description) {
        this.description = description;
        this.action = SET_DISPLAY_INFO_DESCRIPTION;
    }

    /**
     * create empty instance
     */
    public SetDisplayInfoDescriptionUpdateActionImpl() {
        this.action = SET_DISPLAY_INFO_DESCRIPTION;
    }

    /**
     *  <p>Type of update action to be performed on the PaymentIntegration.</p>
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.checkout.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public void setDescription(final com.commercetools.checkout.models.common.LocalizedString description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetDisplayInfoDescriptionUpdateActionImpl that = (SetDisplayInfoDescriptionUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(description, that.description)
                .append(action, that.action)
                .append(description, that.description)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(description).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("description", description)
                .build();
    }

    @Override
    public SetDisplayInfoDescriptionUpdateAction copyDeep() {
        return SetDisplayInfoDescriptionUpdateAction.deepCopy(this);
    }
}
