
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectChangeMessagesEnabledActionImpl.class)
public interface ProjectChangeMessagesEnabledAction extends ProjectUpdateAction {

    String CHANGE_MESSAGES_ENABLED = "changeMessagesEnabled";

    @NotNull
    @JsonProperty("messagesEnabled")
    public Boolean getMessagesEnabled();

    public void setMessagesEnabled(final Boolean messagesEnabled);

    public static ProjectChangeMessagesEnabledAction of() {
        return new ProjectChangeMessagesEnabledActionImpl();
    }

    public static ProjectChangeMessagesEnabledAction of(final ProjectChangeMessagesEnabledAction template) {
        ProjectChangeMessagesEnabledActionImpl instance = new ProjectChangeMessagesEnabledActionImpl();
        instance.setMessagesEnabled(template.getMessagesEnabled());
        return instance;
    }

    public static ProjectChangeMessagesEnabledActionBuilder builder() {
        return ProjectChangeMessagesEnabledActionBuilder.of();
    }

    public static ProjectChangeMessagesEnabledActionBuilder builder(final ProjectChangeMessagesEnabledAction template) {
        return ProjectChangeMessagesEnabledActionBuilder.of(template);
    }

    default <T> T withProjectChangeMessagesEnabledAction(Function<ProjectChangeMessagesEnabledAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeMessagesEnabledAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeMessagesEnabledAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeMessagesEnabledAction>";
            }
        };
    }
}
