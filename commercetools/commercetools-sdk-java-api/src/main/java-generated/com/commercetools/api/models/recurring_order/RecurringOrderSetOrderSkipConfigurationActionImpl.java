
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
 * RecurringOrderSetOrderSkipConfigurationAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderSetOrderSkipConfigurationActionImpl
        implements RecurringOrderSetOrderSkipConfigurationAction, ModelBase {

    private String action;

    private com.commercetools.api.models.recurring_order.SkipConfigurationDraft skipConfigurationInputDraft;

    private java.time.ZonedDateTime updatedExpiresAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurringOrderSetOrderSkipConfigurationActionImpl(
            @JsonProperty("skipConfigurationInputDraft") final com.commercetools.api.models.recurring_order.SkipConfigurationDraft skipConfigurationInputDraft,
            @JsonProperty("updatedExpiresAt") final java.time.ZonedDateTime updatedExpiresAt) {
        this.skipConfigurationInputDraft = skipConfigurationInputDraft;
        this.updatedExpiresAt = updatedExpiresAt;
        this.action = SET_ORDER_SKIP_CONFIGURATION;
    }

    /**
     * create empty instance
     */
    public RecurringOrderSetOrderSkipConfigurationActionImpl() {
        this.action = SET_ORDER_SKIP_CONFIGURATION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Configuration for skipping future orders of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a>.</p>
     */

    public com.commercetools.api.models.recurring_order.SkipConfigurationDraft getSkipConfigurationInputDraft() {
        return this.skipConfigurationInputDraft;
    }

    /**
     *  <p>Date and time (UTC) the Recurring Order will expire and stop generating new orders.</p>
     */

    public java.time.ZonedDateTime getUpdatedExpiresAt() {
        return this.updatedExpiresAt;
    }

    public void setSkipConfigurationInputDraft(
            final com.commercetools.api.models.recurring_order.SkipConfigurationDraft skipConfigurationInputDraft) {
        this.skipConfigurationInputDraft = skipConfigurationInputDraft;
    }

    public void setUpdatedExpiresAt(final java.time.ZonedDateTime updatedExpiresAt) {
        this.updatedExpiresAt = updatedExpiresAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecurringOrderSetOrderSkipConfigurationActionImpl that = (RecurringOrderSetOrderSkipConfigurationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(skipConfigurationInputDraft, that.skipConfigurationInputDraft)
                .append(updatedExpiresAt, that.updatedExpiresAt)
                .append(action, that.action)
                .append(skipConfigurationInputDraft, that.skipConfigurationInputDraft)
                .append(updatedExpiresAt, that.updatedExpiresAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(skipConfigurationInputDraft)
                .append(updatedExpiresAt)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("skipConfigurationInputDraft", skipConfigurationInputDraft)
                .append("updatedExpiresAt", updatedExpiresAt)
                .build();
    }

    @Override
    public RecurringOrderSetOrderSkipConfigurationAction copyDeep() {
        return RecurringOrderSetOrderSkipConfigurationAction.deepCopy(this);
    }
}
