
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
 * SetAllowAllOriginsUpdateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAllowAllOriginsUpdateActionImpl implements SetAllowAllOriginsUpdateAction, ModelBase {

    private String action;

    private Boolean allowAll;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetAllowAllOriginsUpdateActionImpl(@JsonProperty("allowAll") final Boolean allowAll) {
        this.allowAll = allowAll;
        this.action = SET_ALLOW_ALL_ORIGINS;
    }

    /**
     * create empty instance
     */
    public SetAllowAllOriginsUpdateActionImpl() {
        this.action = SET_ALLOW_ALL_ORIGINS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Whether to allow all origins or not.</p>
     */

    public Boolean getAllowAll() {
        return this.allowAll;
    }

    public void setAllowAll(final Boolean allowAll) {
        this.allowAll = allowAll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetAllowAllOriginsUpdateActionImpl that = (SetAllowAllOriginsUpdateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(allowAll, that.allowAll)
                .append(action, that.action)
                .append(allowAll, that.allowAll)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(allowAll).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("allowAll", allowAll)
                .build();
    }

    @Override
    public SetAllowAllOriginsUpdateAction copyDeep() {
        return SetAllowAllOriginsUpdateAction.deepCopy(this);
    }
}
