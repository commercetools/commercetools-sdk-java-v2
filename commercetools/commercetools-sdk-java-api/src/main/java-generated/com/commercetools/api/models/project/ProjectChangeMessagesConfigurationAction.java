package com.commercetools.api.models.project;

import com.commercetools.api.models.message.MessageConfigurationDraft;
import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeMessagesConfigurationActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProjectChangeMessagesConfigurationActionImpl.class)
public interface ProjectChangeMessagesConfigurationAction extends ProjectUpdateAction {

    String CHANGE_MESSAGES_CONFIGURATION = "changeMessagesConfiguration";

    
    @NotNull
    @Valid
    @JsonProperty("messagesConfiguration")
    public MessageConfigurationDraft getMessagesConfiguration();

    
    public void setMessagesConfiguration(final MessageConfigurationDraft messagesConfiguration);
    

    public static ProjectChangeMessagesConfigurationAction of(){
        return new ProjectChangeMessagesConfigurationActionImpl();
    }
    

    public static ProjectChangeMessagesConfigurationAction of(final ProjectChangeMessagesConfigurationAction template) {
        ProjectChangeMessagesConfigurationActionImpl instance = new ProjectChangeMessagesConfigurationActionImpl();
        instance.setMessagesConfiguration(template.getMessagesConfiguration());
        return instance;
    }

    public static ProjectChangeMessagesConfigurationActionBuilder builder(){
        return ProjectChangeMessagesConfigurationActionBuilder.of();
    }
    
    public static ProjectChangeMessagesConfigurationActionBuilder builder(final ProjectChangeMessagesConfigurationAction template){
        return ProjectChangeMessagesConfigurationActionBuilder.of(template);
    }
    

    default <T> T withProjectChangeMessagesConfigurationAction(Function<ProjectChangeMessagesConfigurationAction, T> helper) {
        return helper.apply(this);
    }
}
