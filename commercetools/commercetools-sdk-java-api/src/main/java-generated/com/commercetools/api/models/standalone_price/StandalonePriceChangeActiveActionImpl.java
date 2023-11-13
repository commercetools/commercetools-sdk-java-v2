
package com.commercetools.api.models.standalone_price;

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
 *  <p>Updating the value of a StandalonePrice produces the StandalonePriceActiveChangedMessage.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceChangeActiveActionImpl implements StandalonePriceChangeActiveAction, ModelBase {

    private String action;

    private Boolean active;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceChangeActiveActionImpl(@JsonProperty("active") final Boolean active) {
        this.active = active;
        this.action = CHANGE_ACTIVE;
    }

    /**
     * create empty instance
     */
    public StandalonePriceChangeActiveActionImpl() {
        this.action = CHANGE_ACTIVE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set for the <code>active</code> field of the StandalonePrice.</p>
     */

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(final Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceChangeActiveActionImpl that = (StandalonePriceChangeActiveActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(active, that.active)
                .append(action, that.action)
                .append(active, that.active)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(active).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("active", active)
                .build();
    }

}
