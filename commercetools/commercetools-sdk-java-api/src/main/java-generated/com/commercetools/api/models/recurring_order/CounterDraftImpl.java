
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
 *  <p>Configuration that uses a counter to track the number of Orders that will be skipped.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CounterDraftImpl implements CounterDraft, ModelBase {

    private String type;

    private Integer totalToSkip;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CounterDraftImpl(@JsonProperty("totalToSkip") final Integer totalToSkip) {
        this.totalToSkip = totalToSkip;
        this.type = COUNTER;
    }

    /**
     * create empty instance
     */
    public CounterDraftImpl() {
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

    public void setTotalToSkip(final Integer totalToSkip) {
        this.totalToSkip = totalToSkip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CounterDraftImpl that = (CounterDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(totalToSkip, that.totalToSkip)
                .append(type, that.type)
                .append(totalToSkip, that.totalToSkip)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(totalToSkip).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("totalToSkip", totalToSkip)
                .build();
    }

    @Override
    public CounterDraft copyDeep() {
        return CounterDraft.deepCopy(this);
    }
}
