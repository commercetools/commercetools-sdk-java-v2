
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
 *  <p>Set a time to live retention policy for the ImportContainer.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TimeToLiveRetentionPolicyImpl implements TimeToLiveRetentionPolicy, ModelBase {

    private com.commercetools.importapi.models.importcontainers.StrategyEnum strategy;

    private com.commercetools.importapi.models.importcontainers.TimeToLiveConfig config;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TimeToLiveRetentionPolicyImpl(
            @JsonProperty("config") final com.commercetools.importapi.models.importcontainers.TimeToLiveConfig config) {
        this.config = config;
        this.strategy = StrategyEnum.findEnum("ttl");
    }

    /**
     * create empty instance
     */
    public TimeToLiveRetentionPolicyImpl() {
        this.strategy = StrategyEnum.findEnum("ttl");
    }

    /**
     *  <p>The strategy of the retention policy. Used to determine how the ImportContainer should be retained.</p>
     */

    public com.commercetools.importapi.models.importcontainers.StrategyEnum getStrategy() {
        return this.strategy;
    }

    /**
     *  <p>The configuration of the time to live retention policy.</p>
     */

    public com.commercetools.importapi.models.importcontainers.TimeToLiveConfig getConfig() {
        return this.config;
    }

    public void setConfig(final com.commercetools.importapi.models.importcontainers.TimeToLiveConfig config) {
        this.config = config;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TimeToLiveRetentionPolicyImpl that = (TimeToLiveRetentionPolicyImpl) o;

        return new EqualsBuilder().append(strategy, that.strategy)
                .append(config, that.config)
                .append(strategy, that.strategy)
                .append(config, that.config)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(strategy).append(config).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("strategy", strategy)
                .append("config", config)
                .build();
    }

    @Override
    public TimeToLiveRetentionPolicy copyDeep() {
        return TimeToLiveRetentionPolicy.deepCopy(this);
    }
}
