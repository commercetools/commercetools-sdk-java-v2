
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MessageConfigurationDraftImpl implements MessageConfigurationDraft {

    private Boolean enabled;

    private Integer deleteDaysAfterCreation;

    @JsonCreator
    MessageConfigurationDraftImpl(@JsonProperty("enabled") final Boolean enabled,
            @JsonProperty("deleteDaysAfterCreation") final Integer deleteDaysAfterCreation) {
        this.enabled = enabled;
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
    }

    public MessageConfigurationDraftImpl() {
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Integer getDeleteDaysAfterCreation() {
        return this.deleteDaysAfterCreation;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public void setDeleteDaysAfterCreation(final Integer deleteDaysAfterCreation) {
        this.deleteDaysAfterCreation = deleteDaysAfterCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MessageConfigurationDraftImpl that = (MessageConfigurationDraftImpl) o;

        return new EqualsBuilder().append(enabled, that.enabled).append(deleteDaysAfterCreation,
            that.deleteDaysAfterCreation).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(enabled).append(deleteDaysAfterCreation).toHashCode();
    }

}
