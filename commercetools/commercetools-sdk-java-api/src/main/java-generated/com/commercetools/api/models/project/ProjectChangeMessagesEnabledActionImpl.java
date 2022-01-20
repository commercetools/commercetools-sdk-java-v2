
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProjectChangeMessagesEnabledActionImpl implements ProjectChangeMessagesEnabledAction, ModelBase {

    private String action;

    private Boolean messagesEnabled;

    @JsonCreator
    ProjectChangeMessagesEnabledActionImpl(@JsonProperty("messagesEnabled") final Boolean messagesEnabled) {
        this.messagesEnabled = messagesEnabled;
        this.action = CHANGE_MESSAGES_ENABLED;
    }

    public ProjectChangeMessagesEnabledActionImpl() {
        this.action = CHANGE_MESSAGES_ENABLED;
    }

    public String getAction() {
        return this.action;
    }

    public Boolean getMessagesEnabled() {
        return this.messagesEnabled;
    }

    public void setMessagesEnabled(final Boolean messagesEnabled) {
        this.messagesEnabled = messagesEnabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectChangeMessagesEnabledActionImpl that = (ProjectChangeMessagesEnabledActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(messagesEnabled, that.messagesEnabled).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(messagesEnabled).toHashCode();
    }

}
