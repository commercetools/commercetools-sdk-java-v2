package com.commercetools.api.models.project;

import com.commercetools.api.models.message.MessageConfigurationDraft;
import com.commercetools.api.models.project.ProjectUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProjectChangeMessagesConfigurationActionImpl implements ProjectChangeMessagesConfigurationAction {

    private String action;
    
    private com.commercetools.api.models.message.MessageConfigurationDraft messagesConfiguration;

    @JsonCreator
    ProjectChangeMessagesConfigurationActionImpl(@JsonProperty("messagesConfiguration") final com.commercetools.api.models.message.MessageConfigurationDraft messagesConfiguration) {
        this.messagesConfiguration = messagesConfiguration;
        this.action = "changeMessagesConfiguration";
    }
    public ProjectChangeMessagesConfigurationActionImpl() {
        this.action = "changeMessagesConfiguration";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.message.MessageConfigurationDraft getMessagesConfiguration(){
        return this.messagesConfiguration;
    }

    public void setMessagesConfiguration(final com.commercetools.api.models.message.MessageConfigurationDraft messagesConfiguration){
        this.messagesConfiguration = messagesConfiguration;
    }

}
