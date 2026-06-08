
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
 *  <p>The retention policy of the ImportContainer. If not set, the ImportContainer does not expire.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RetentionPolicyImpl implements RetentionPolicy, ModelBase {

    private com.commercetools.importapi.models.importcontainers.StrategyEnum strategy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RetentionPolicyImpl(
            @JsonProperty("strategy") final com.commercetools.importapi.models.importcontainers.StrategyEnum strategy) {
        this.strategy = strategy;
    }

    /**
     * create empty instance
     */
    public RetentionPolicyImpl() {
    }

    /**
     *  <p>The strategy of the retention policy. Used to determine how the ImportContainer should be retained.</p>
     */

    public com.commercetools.importapi.models.importcontainers.StrategyEnum getStrategy() {
        return this.strategy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RetentionPolicyImpl that = (RetentionPolicyImpl) o;

        return new EqualsBuilder().append(strategy, that.strategy).append(strategy, that.strategy).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(strategy).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("strategy", strategy).build();
    }

    @Override
    public RetentionPolicy copyDeep() {
        return RetentionPolicy.deepCopy(this);
    }
}
