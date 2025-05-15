
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Change Active update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceActiveChangedMessagePayloadImpl
        implements StandalonePriceActiveChangedMessagePayload, ModelBase {

    private String type;

    private Boolean active;

    private Boolean oldActive;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceActiveChangedMessagePayloadImpl(@JsonProperty("active") final Boolean active,
            @JsonProperty("oldActive") final Boolean oldActive) {
        this.active = active;
        this.oldActive = oldActive;
        this.type = STANDALONE_PRICE_ACTIVE_CHANGED;
    }

    /**
     * create empty instance
     */
    public StandalonePriceActiveChangedMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_ACTIVE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Value of the <code>active</code> field of the StandalonePrice after the Change Active update action.</p>
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     *  <p>Value of the <code>active</code> field of the StandalonePrice before the Change Active update action.</p>
     */

    public Boolean getOldActive() {
        return this.oldActive;
    }

    public void setActive(final Boolean active) {
        this.active = active;
    }

    public void setOldActive(final Boolean oldActive) {
        this.oldActive = oldActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceActiveChangedMessagePayloadImpl that = (StandalonePriceActiveChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(active, that.active)
                .append(oldActive, that.oldActive)
                .append(type, that.type)
                .append(active, that.active)
                .append(oldActive, that.oldActive)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(active).append(oldActive).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("active", active)
                .append("oldActive", oldActive)
                .build();
    }

    @Override
    public StandalonePriceActiveChangedMessagePayload copyDeep() {
        return StandalonePriceActiveChangedMessagePayload.deepCopy(this);
    }
}
