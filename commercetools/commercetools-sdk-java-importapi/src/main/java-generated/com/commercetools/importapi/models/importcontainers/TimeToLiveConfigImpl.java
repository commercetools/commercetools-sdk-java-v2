
package com.commercetools.importapi.models.importcontainers;

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
 * TimeToLiveConfig
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TimeToLiveConfigImpl implements TimeToLiveConfig, ModelBase {

    private String timeToLive;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TimeToLiveConfigImpl(@JsonProperty("timeToLive") final String timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * create empty instance
     */
    public TimeToLiveConfigImpl() {
    }

    /**
     *  <p>The time to live of the ImportContainer. Used to generate the <code>expiresAt</code> value of the ImportContainer. The lowest accepted value is <code>1h</code> and the highest accepted value is <code>30d</code>.</p>
     */

    public String getTimeToLive() {
        return this.timeToLive;
    }

    public void setTimeToLive(final String timeToLive) {
        this.timeToLive = timeToLive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TimeToLiveConfigImpl that = (TimeToLiveConfigImpl) o;

        return new EqualsBuilder().append(timeToLive, that.timeToLive).append(timeToLive, that.timeToLive).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(timeToLive).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("timeToLive", timeToLive).build();
    }

    @Override
    public TimeToLiveConfig copyDeep() {
        return TimeToLiveConfig.deepCopy(this);
    }
}
