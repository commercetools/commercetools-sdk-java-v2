package com.commercetools.api.models.project;

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
public final class ProjectChangeMessagesEnabledActionImpl implements ProjectChangeMessagesEnabledAction {

    private String action;
    
    private Boolean messagesEnabled;

    @JsonCreator
    ProjectChangeMessagesEnabledActionImpl(@JsonProperty("messagesEnabled") final Boolean messagesEnabled) {
        this.messagesEnabled = messagesEnabled;
        this.action = "changeMessagesEnabled";
    }
    public ProjectChangeMessagesEnabledActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public Boolean getMessagesEnabled(){
        return this.messagesEnabled;
    }

    public void setMessagesEnabled(final Boolean messagesEnabled){
        this.messagesEnabled = messagesEnabled;
    }

}
