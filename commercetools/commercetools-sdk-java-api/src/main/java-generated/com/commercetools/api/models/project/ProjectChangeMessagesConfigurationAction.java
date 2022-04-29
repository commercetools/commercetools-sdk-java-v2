
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.message.MessagesConfigurationDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectChangeMessagesConfigurationActionImpl.class)
public interface ProjectChangeMessagesConfigurationAction extends ProjectUpdateAction {

    String CHANGE_MESSAGES_CONFIGURATION = "changeMessagesConfiguration";

    /**
    *  <p>Configuration for the <a href="/../api/projects/messages">Messages Query</a> feature.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("messagesConfiguration")
    public MessagesConfigurationDraft getMessagesConfiguration();

    public void setMessagesConfiguration(final MessagesConfigurationDraft messagesConfiguration);

    public static ProjectChangeMessagesConfigurationAction of() {
        return new ProjectChangeMessagesConfigurationActionImpl();
    }

    public static ProjectChangeMessagesConfigurationAction of(final ProjectChangeMessagesConfigurationAction template) {
        ProjectChangeMessagesConfigurationActionImpl instance = new ProjectChangeMessagesConfigurationActionImpl();
        instance.setMessagesConfiguration(template.getMessagesConfiguration());
        return instance;
    }

    public static ProjectChangeMessagesConfigurationActionBuilder builder() {
        return ProjectChangeMessagesConfigurationActionBuilder.of();
    }

    public static ProjectChangeMessagesConfigurationActionBuilder builder(
            final ProjectChangeMessagesConfigurationAction template) {
        return ProjectChangeMessagesConfigurationActionBuilder.of(template);
    }

    default <T> T withProjectChangeMessagesConfigurationAction(
            Function<ProjectChangeMessagesConfigurationAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeMessagesConfigurationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeMessagesConfigurationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeMessagesConfigurationAction>";
            }
        };
    }
}
