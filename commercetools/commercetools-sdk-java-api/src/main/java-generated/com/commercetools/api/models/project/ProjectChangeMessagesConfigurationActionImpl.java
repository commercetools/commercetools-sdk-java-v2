
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
public class ProjectChangeMessagesConfigurationActionImpl
        implements ProjectChangeMessagesConfigurationAction, ModelBase {

    private String action;

    private com.commercetools.api.models.message.MessagesConfigurationDraft messagesConfiguration;

    @JsonCreator
    ProjectChangeMessagesConfigurationActionImpl(
            @JsonProperty("messagesConfiguration") final com.commercetools.api.models.message.MessagesConfigurationDraft messagesConfiguration) {
        this.messagesConfiguration = messagesConfiguration;
        this.action = CHANGE_MESSAGES_CONFIGURATION;
    }

    public ProjectChangeMessagesConfigurationActionImpl() {
        this.action = CHANGE_MESSAGES_CONFIGURATION;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Configuration for the <a href="/../api/projects/messages">Messages Query</a> feature.</p>
    */
    public com.commercetools.api.models.message.MessagesConfigurationDraft getMessagesConfiguration() {
        return this.messagesConfiguration;
    }

    public void setMessagesConfiguration(
            final com.commercetools.api.models.message.MessagesConfigurationDraft messagesConfiguration) {
        this.messagesConfiguration = messagesConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectChangeMessagesConfigurationActionImpl that = (ProjectChangeMessagesConfigurationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(messagesConfiguration, that.messagesConfiguration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(messagesConfiguration).toHashCode();
    }

}
