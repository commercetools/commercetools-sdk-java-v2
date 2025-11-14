
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
 * AddAllowedOriginUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddAllowedOriginUpdateActionImpl implements AddAllowedOriginUpdateAction, ModelBase {

    private String action;

    private String origin;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AddAllowedOriginUpdateActionImpl(@JsonProperty("origin") final String origin) {
        this.origin = origin;
        this.action = ADD_ALLOWED_ORIGIN;
    }

    /**
     * create empty instance
     */
    public AddAllowedOriginUpdateActionImpl() {
        this.action = ADD_ALLOWED_ORIGIN;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Origin URL to add to the allowed origins list.</p>
     */

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(final String origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AddAllowedOriginUpdateActionImpl that = (AddAllowedOriginUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(origin, that.origin)
                .append(action, that.action)
                .append(origin, that.origin)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(origin).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("origin", origin)
                .build();
    }

    @Override
    public AddAllowedOriginUpdateAction copyDeep() {
        return AddAllowedOriginUpdateAction.deepCopy(this);
    }
}
