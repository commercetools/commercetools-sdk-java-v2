
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeMessagesConfigurationActionBuilder
        implements Builder<ProjectChangeMessagesConfigurationAction> {

    private com.commercetools.api.models.message.MessageConfigurationDraft messagesConfiguration;

    public ProjectChangeMessagesConfigurationActionBuilder messagesConfiguration(
            Function<com.commercetools.api.models.message.MessageConfigurationDraftBuilder, com.commercetools.api.models.message.MessageConfigurationDraftBuilder> builder) {
        this.messagesConfiguration = builder
                .apply(com.commercetools.api.models.message.MessageConfigurationDraftBuilder.of())
                .build();
        return this;
    }

    public ProjectChangeMessagesConfigurationActionBuilder messagesConfiguration(
            final com.commercetools.api.models.message.MessageConfigurationDraft messagesConfiguration) {
        this.messagesConfiguration = messagesConfiguration;
        return this;
    }

    public com.commercetools.api.models.message.MessageConfigurationDraft getMessagesConfiguration() {
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
