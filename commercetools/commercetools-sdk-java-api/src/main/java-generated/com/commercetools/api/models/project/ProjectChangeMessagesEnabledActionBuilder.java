
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectChangeMessagesEnabledActionBuilder {

    private Boolean messagesEnabled;

    public ProjectChangeMessagesEnabledActionBuilder messagesEnabled(final Boolean messagesEnabled) {
        this.messagesEnabled = messagesEnabled;
        return this;
    }

    public Boolean getMessagesEnabled() {
        return this.messagesEnabled;
    }

    public ProjectChangeMessagesEnabledAction build() {
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
