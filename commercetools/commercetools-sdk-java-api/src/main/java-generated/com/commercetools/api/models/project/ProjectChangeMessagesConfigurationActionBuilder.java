
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeMessagesConfigurationActionBuilder {

    private com.commercetools.api.models.message.MessageConfigurationDraft messagesConfiguration;

    public ProjectChangeMessagesConfigurationActionBuilder messagesConfiguration(
            final com.commercetools.api.models.message.MessageConfigurationDraft messagesConfiguration) {
        this.messagesConfiguration = messagesConfiguration;
        return this;
    }

    public com.commercetools.api.models.message.MessageConfigurationDraft getMessagesConfiguration() {
        return this.messagesConfiguration;
    }

    public ProjectChangeMessagesConfigurationAction build() {
        return new ProjectChangeMessagesConfigurationActionImpl(messagesConfiguration);
    }

    public static ProjectChangeMessagesConfigurationActionBuilder of() {
        return new ProjectChangeMessagesConfigurationActionBuilder();
    }

    public static ProjectChangeMessagesConfigurationActionBuilder of(
            final ProjectChangeMessagesConfigurationAction template) {
        ProjectChangeMessagesConfigurationActionBuilder builder = new ProjectChangeMessagesConfigurationActionBuilder();
        builder.messagesConfiguration = template.getMessagesConfiguration();
        return builder;
    }

}
