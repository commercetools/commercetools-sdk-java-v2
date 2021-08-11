
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeMessagesEnabledActionBuilder implements Builder<ProjectChangeMessagesEnabledAction> {

    private Boolean messagesEnabled;

    public ProjectChangeMessagesEnabledActionBuilder messagesEnabled(final Boolean messagesEnabled) {
        this.messagesEnabled = messagesEnabled;
        return this;
    }

    public Boolean getMessagesEnabled() {
        return this.messagesEnabled;
    }

    public ProjectChangeMessagesEnabledAction build() {
        Objects.requireNonNull(messagesEnabled,
            ProjectChangeMessagesEnabledAction.class + ": messagesEnabled is missing");
        return new ProjectChangeMessagesEnabledActionImpl(messagesEnabled);
    }

    /**
     * builds ProjectChangeMessagesEnabledAction without checking for non null required values
     */
    public ProjectChangeMessagesEnabledAction buildUnchecked() {
        return new ProjectChangeMessagesEnabledActionImpl(messagesEnabled);
    }

    public static ProjectChangeMessagesEnabledActionBuilder of() {
        return new ProjectChangeMessagesEnabledActionBuilder();
    }

    public static ProjectChangeMessagesEnabledActionBuilder of(final ProjectChangeMessagesEnabledAction template) {
        ProjectChangeMessagesEnabledActionBuilder builder = new ProjectChangeMessagesEnabledActionBuilder();
        builder.messagesEnabled = template.getMessagesEnabled();
        return builder;
    }

}
