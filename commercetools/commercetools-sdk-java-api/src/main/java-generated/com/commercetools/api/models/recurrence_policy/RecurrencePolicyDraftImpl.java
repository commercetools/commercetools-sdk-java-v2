
package com.commercetools.api.models.recurrence_policy;

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
 * RecurrencePolicyDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicyDraftImpl implements RecurrencePolicyDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft schedule;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RecurrencePolicyDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("schedule") final com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft schedule) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.schedule = schedule;
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
                .append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(schedule, that.schedule)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(name).append(description).append(schedule).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("name", name)
                .append("description", description)
                .append("schedule", schedule)
                .build();
    }

    @Override
    public RecurrencePolicyDraft copyDeep() {
        return RecurrencePolicyDraft.deepCopy(this);
    }
}
