package com.commercetools.api.models.project;

import com.commercetools.api.models.message.MessagesConfigurationDraft;
import com.commercetools.api.models.project.ProjectUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ProjectChangeMessagesConfigurationAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProjectChangeMessagesConfigurationActionImpl implements ProjectChangeMessagesConfigurationAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.message.MessagesConfigurationDraft messagesConfiguration;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectChangeMessagesConfigurationActionImpl(@JsonProperty("messagesConfiguration") final com.commercetools.api.models.message.MessagesConfigurationDraft messagesConfiguration) {
        this.messagesConfiguration = messagesConfiguration;
        this.action =  CHANGE_MESSAGES_CONFIGURATION;
    }
    /**
     * create empty instance
     */
    public ProjectChangeMessagesConfigurationActionImpl() {
        this.action =  CHANGE_MESSAGES_CONFIGURATION;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Configuration for the Messages Query feature.</p>
     */
    
    public com.commercetools.api.models.message.MessagesConfigurationDraft getMessagesConfiguration(){
        return this.messagesConfiguration;
    }

    
    public void setMessagesConfiguration(final com.commercetools.api.models.message.MessagesConfigurationDraft messagesConfiguration){
        this.messagesConfiguration = messagesConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProjectChangeMessagesConfigurationActionImpl that = (ProjectChangeMessagesConfigurationActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(messagesConfiguration, that.messagesConfiguration)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(messagesConfiguration)
            .toHashCode();
    }

}
