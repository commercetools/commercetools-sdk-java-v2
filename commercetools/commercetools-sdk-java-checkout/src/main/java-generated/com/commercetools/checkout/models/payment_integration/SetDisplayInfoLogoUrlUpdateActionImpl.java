
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
 *  <p>Sets the display info logo URL of a PaymentIntegration.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDisplayInfoLogoUrlUpdateActionImpl implements SetDisplayInfoLogoUrlUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.common.LocalizedString logoUrl;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetDisplayInfoLogoUrlUpdateActionImpl(
            @JsonProperty("logoUrl") final com.commercetools.checkout.models.common.LocalizedString logoUrl) {
        this.logoUrl = logoUrl;
        this.action = SET_DISPLAY_INFO_LOGO_URL;
    }

    /**
     * create empty instance
     */
    public SetDisplayInfoLogoUrlUpdateActionImpl() {
        this.action = SET_DISPLAY_INFO_LOGO_URL;
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

    public com.commercetools.checkout.models.common.LocalizedString getLogoUrl() {
        return this.logoUrl;
    }

    public void setLogoUrl(final com.commercetools.checkout.models.common.LocalizedString logoUrl) {
        this.logoUrl = logoUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetDisplayInfoLogoUrlUpdateActionImpl that = (SetDisplayInfoLogoUrlUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(logoUrl, that.logoUrl)
                .append(action, that.action)
                .append(logoUrl, that.logoUrl)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(logoUrl).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("logoUrl", logoUrl)
                .build();
    }

    @Override
    public SetDisplayInfoLogoUrlUpdateAction copyDeep() {
        return SetDisplayInfoLogoUrlUpdateAction.deepCopy(this);
    }
}
