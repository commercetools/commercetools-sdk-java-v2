
package com.commercetools.api.models.recurring_order;

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
 *  <p>Configuration to track skips for a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CounterImpl implements Counter, ModelBase {

    private String type;

    private Integer totalToSkip;

    private Integer skipped;

    private java.time.ZonedDateTime lastSkippedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CounterImpl(@JsonProperty("totalToSkip") final Integer totalToSkip, @JsonProperty("skipped") final Integer skipped,
            @JsonProperty("lastSkippedAt") final java.time.ZonedDateTime lastSkippedAt) {
        this.totalToSkip = totalToSkip;
        this.skipped = skipped;
        this.lastSkippedAt = lastSkippedAt;
        this.type = COUNTER;
    }

    /**
     * create empty instance
     */
    public CounterImpl() {
        this.type = COUNTER;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Number of Orders that will be skipped.</p>
     */

    public Integer getTotalToSkip() {
        return this.totalToSkip;
    }

    /**
     *  <p>Number of Orders that were already skipped.</p>
     */

    public Integer getSkipped() {
        return this.skipped;
    }

    /**
     *  <p>Date and time (UTC) when the last Order creation was skipped.</p>
     */

    public java.time.ZonedDateTime getLastSkippedAt() {
        return this.lastSkippedAt;
    }

    public void setTotalToSkip(final Integer totalToSkip) {
        this.totalToSkip = totalToSkip;
    }

    public void setSkipped(final Integer skipped) {
        this.skipped = skipped;
    }

    public void setLastSkippedAt(final java.time.ZonedDateTime lastSkippedAt) {
        this.lastSkippedAt = lastSkippedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CounterImpl that = (CounterImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(totalToSkip, that.totalToSkip)
                .append(skipped, that.skipped)
                .append(lastSkippedAt, that.lastSkippedAt)
                .append(type, that.type)
                .append(totalToSkip, that.totalToSkip)
                .append(skipped, that.skipped)
                .append(lastSkippedAt, that.lastSkippedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(totalToSkip)
                .append(skipped)
                .append(lastSkippedAt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("totalToSkip", totalToSkip)
                .append("skipped", skipped)
                .append("lastSkippedAt", lastSkippedAt)
                .build();
    }

    @Override
    public Counter copyDeep() {
        return Counter.deepCopy(this);
    }
}
