
package com.commercetools.api.models.recurrence_policy;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 * RecurrencePolicyDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicyDraftImpl implements RecurrencePolicyDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft schedule;

    private Integer minDaysBetweenOrders;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurrencePolicyDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("schedule") final com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft schedule,
            @JsonProperty("minDaysBetweenOrders") final Integer minDaysBetweenOrders) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.schedule = schedule;
        this.minDaysBetweenOrders = minDaysBetweenOrders;
    }

    /**
     * create empty instance
     */
    public RecurrencePolicyDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the RecurrencePolicy.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the RecurrencePolicy.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the RecurrencePolicy.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Schedule where the recurrence is defined.</p>
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft getSchedule() {
        return this.schedule;
    }

    /**
     *  <p>Minimum number of days that must pass since the last Order of a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderRequestOrderNowAction" rel="nofollow">Request Order Now</a> update action is allowed. If not set, there is no limit.</p>
     *  <p>This value does not affect the recurrence schedule. For example, a weekly RecurrencePolicy with a value of <code>30</code> still creates Orders weekly. The time is measured in multiples of 24 hours from <code>lastOrderAt</code> of the Recurring Order, regardless of whether the last Order was created on schedule or early.</p>
     *  <p>The limit applies to all Recurring Orders that use this RecurrencePolicy, and changes take effect immediately. It is ignored when the RecurrencePolicy is attached to a Price.</p>
     */

    public Integer getMinDaysBetweenOrders() {
        return this.minDaysBetweenOrders;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setSchedule(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft schedule) {
        this.schedule = schedule;
    }

    public void setMinDaysBetweenOrders(final Integer minDaysBetweenOrders) {
        this.minDaysBetweenOrders = minDaysBetweenOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurrencePolicyDraftImpl that = (RecurrencePolicyDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(schedule, that.schedule)
                .append(minDaysBetweenOrders, that.minDaysBetweenOrders)
                .append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(schedule, that.schedule)
                .append(minDaysBetweenOrders, that.minDaysBetweenOrders)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
                .append(description)
                .append(schedule)
                .append(minDaysBetweenOrders)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("name", name)
                .append("description", description)
                .append("schedule", schedule)
                .append("minDaysBetweenOrders", minDaysBetweenOrders)
                .build();
    }

    @Override
    public RecurrencePolicyDraft copyDeep() {
        return RecurrencePolicyDraft.deepCopy(this);
    }
}
