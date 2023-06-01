package com.commercetools.api.models.project;

import com.commercetools.api.models.message.MessagesConfigurationDraft;
import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectChangeMessagesConfigurationActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * ProjectChangeMessagesConfigurationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeMessagesConfigurationAction projectChangeMessagesConfigurationAction = ProjectChangeMessagesConfigurationAction.builder()
 *             .messagesConfiguration(messagesConfigurationBuilder -> messagesConfigurationBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProjectChangeMessagesConfigurationActionImpl.class)
public interface ProjectChangeMessagesConfigurationAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeMessagesConfigurationAction
     */
    String CHANGE_MESSAGES_CONFIGURATION = "changeMessagesConfiguration";

    /**
     *  <p>Configuration for the Messages Query feature.</p>
     * @return messagesConfiguration
     */
    @NotNull
    @Valid
    @JsonProperty("messagesConfiguration")
    public MessagesConfigurationDraft getMessagesConfiguration();

    /**
     *  <p>Configuration for the Messages Query feature.</p>
     * @param messagesConfiguration value to be set
     */
    
    public void setMessagesConfiguration(final MessagesConfigurationDraft messagesConfiguration);
    

    /**
     * factory method
     * @return instance of ProjectChangeMessagesConfigurationAction
     */
    public static ProjectChangeMessagesConfigurationAction of(){
        return new ProjectChangeMessagesConfigurationActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ProjectChangeMessagesConfigurationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeMessagesConfigurationAction of(final ProjectChangeMessagesConfigurationAction template) {
        ProjectChangeMessagesConfigurationActionImpl instance = new ProjectChangeMessagesConfigurationActionImpl();
        instance.setMessagesConfiguration(template.getMessagesConfiguration());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectChangeMessagesConfigurationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeMessagesConfigurationAction deepCopy(@Nullable final ProjectChangeMessagesConfigurationAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeMessagesConfigurationActionImpl instance = new ProjectChangeMessagesConfigurationActionImpl();
        instance.setMessagesConfiguration(com.commercetools.api.models.message.MessagesConfigurationDraft.deepCopy(template.getMessagesConfiguration()));
        return instance;
    }

    /**
     * builder factory method for ProjectChangeMessagesConfigurationAction
     * @return builder
     */
    public static ProjectChangeMessagesConfigurationActionBuilder builder() {
        return ProjectChangeMessagesConfigurationActionBuilder.of();
    }
    
    /**
     * create builder for ProjectChangeMessagesConfigurationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeMessagesConfigurationActionBuilder builder(final ProjectChangeMessagesConfigurationAction template) {
        return ProjectChangeMessagesConfigurationActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeMessagesConfigurationAction(Function<ProjectChangeMessagesConfigurationAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeMessagesConfigurationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeMessagesConfigurationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeMessagesConfigurationAction>";
            }
        };
    }
}
