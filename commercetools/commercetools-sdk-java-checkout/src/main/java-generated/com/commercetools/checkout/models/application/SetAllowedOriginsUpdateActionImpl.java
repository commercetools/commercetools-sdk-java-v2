
package com.commercetools.checkout.models.application;

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
 * SetAllowedOriginsUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAllowedOriginsUpdateActionImpl implements SetAllowedOriginsUpdateAction, ModelBase {

    private String action;

    private com.commercetools.checkout.models.application.AllowedOrigins allowedOrigins;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetAllowedOriginsUpdateActionImpl(
            @JsonProperty("allowedOrigins") final com.commercetools.checkout.models.application.AllowedOrigins allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        this.action = SET_ALLOWED_ORIGINS;
    }

    /**
     * create empty instance
     */
    public SetAllowedOriginsUpdateActionImpl() {
        this.action = SET_ALLOWED_ORIGINS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New allowed origins configuration.</p>
     */

    public com.commercetools.checkout.models.application.AllowedOrigins getAllowedOrigins() {
        return this.allowedOrigins;
    }

    public void setAllowedOrigins(final com.commercetools.checkout.models.application.AllowedOrigins allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetAllowedOriginsUpdateActionImpl that = (SetAllowedOriginsUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(allowedOrigins, that.allowedOrigins)
                .append(action, that.action)
                .append(allowedOrigins, that.allowedOrigins)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(allowedOrigins).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("allowedOrigins", allowedOrigins)
                .build();
    }

    @Override
    public SetAllowedOriginsUpdateAction copyDeep() {
        return SetAllowedOriginsUpdateAction.deepCopy(this);
    }
}
