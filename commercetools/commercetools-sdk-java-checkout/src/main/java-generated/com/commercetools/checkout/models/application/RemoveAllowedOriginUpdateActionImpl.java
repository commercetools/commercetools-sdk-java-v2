
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
 * RemoveAllowedOriginUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveAllowedOriginUpdateActionImpl implements RemoveAllowedOriginUpdateAction, ModelBase {

    private String action;

    private String origin;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RemoveAllowedOriginUpdateActionImpl(@JsonProperty("origin") final String origin) {
        this.origin = origin;
        this.action = REMOVE_ALLOWED_ORIGIN;
    }

    /**
     * create empty instance
     */
    public RemoveAllowedOriginUpdateActionImpl() {
        this.action = REMOVE_ALLOWED_ORIGIN;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Origin URL to remove from the allowed origins list.</p>
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

        RemoveAllowedOriginUpdateActionImpl that = (RemoveAllowedOriginUpdateActionImpl) o;

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
    public RemoveAllowedOriginUpdateAction copyDeep() {
        return RemoveAllowedOriginUpdateAction.deepCopy(this);
    }
}
