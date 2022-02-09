
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProjectChangeMessagesConfigurationActionBuilder
        implements Builder<ProjectChangeMessagesConfigurationAction> {

    private com.commercetools.api.models.message.MessagesConfigurationDraft messagesConfiguration;

    public ProjectChangeMessagesConfigurationActionBuilder messagesConfiguration(
            Function<com.commercetools.api.models.message.MessagesConfigurationDraftBuilder, com.commercetools.api.models.message.MessagesConfigurationDraftBuilder> builder) {
        this.messagesConfiguration = builder
                .apply(com.commercetools.api.models.message.MessagesConfigurationDraftBuilder.of())
                .build();
        return this;
    }

    public ProjectChangeMessagesConfigurationActionBuilder messagesConfiguration(
            final com.commercetools.api.models.message.MessagesConfigurationDraft messagesConfiguration) {
        this.messagesConfiguration = messagesConfiguration;
        return this;
    }

    public com.commercetools.api.models.message.MessagesConfigurationDraft getMessagesConfiguration() {
        return this.messagesConfiguration;
    }

    public ProjectChangeMessagesConfigurationAction build() {
        Objects.requireNonNull(messagesConfiguration,
            ProjectChangeMessagesConfigurationAction.class + ": messagesConfiguration is missing");
        return new ProjectChangeMessagesConfigurationActionImpl(messagesConfiguration);
    }

    /**
     * builds ProjectChangeMessagesConfigurationAction without checking for non null required values
     */
    public ProjectChangeMessagesConfigurationAction buildUnchecked() {
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
