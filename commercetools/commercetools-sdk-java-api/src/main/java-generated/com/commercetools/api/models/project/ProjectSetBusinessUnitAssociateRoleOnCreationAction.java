package com.commercetools.api.models.project;

import com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier;
import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl;

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
 * ProjectSetBusinessUnitAssociateRoleOnCreationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectSetBusinessUnitAssociateRoleOnCreationAction projectSetBusinessUnitAssociateRoleOnCreationAction = ProjectSetBusinessUnitAssociateRoleOnCreationAction.builder()
 *             .associateRole(associateRoleBuilder -> associateRoleBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl.class)
public interface ProjectSetBusinessUnitAssociateRoleOnCreationAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectSetBusinessUnitAssociateRoleOnCreationAction
     */
    String SET_MY_BUSINESS_UNIT_ASSOCIATE_ROLE_ON_CREATION = "setMyBusinessUnitAssociateRoleOnCreation";

    /**
     *  <p>Default Associate Role assigned to the Associate creating a Business Unit using the My Business Unit endpoint.</p>
     * @return associateRole
     */
    @NotNull
    @Valid
    @JsonProperty("associateRole")
    public AssociateRoleResourceIdentifier getAssociateRole();

    /**
     *  <p>Default Associate Role assigned to the Associate creating a Business Unit using the My Business Unit endpoint.</p>
     * @param associateRole value to be set
     */
    
    public void setAssociateRole(final AssociateRoleResourceIdentifier associateRole);
    

    /**
     * factory method
     * @return instance of ProjectSetBusinessUnitAssociateRoleOnCreationAction
     */
    public static ProjectSetBusinessUnitAssociateRoleOnCreationAction of(){
        return new ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl();
    }
    

    /**
     * factory method to create a shallow copy ProjectSetBusinessUnitAssociateRoleOnCreationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectSetBusinessUnitAssociateRoleOnCreationAction of(final ProjectSetBusinessUnitAssociateRoleOnCreationAction template) {
        ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl instance = new ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl();
        instance.setAssociateRole(template.getAssociateRole());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectSetBusinessUnitAssociateRoleOnCreationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectSetBusinessUnitAssociateRoleOnCreationAction deepCopy(@Nullable final ProjectSetBusinessUnitAssociateRoleOnCreationAction template) {
        if (template == null) {
            return null;
        }
        ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl instance = new ProjectSetBusinessUnitAssociateRoleOnCreationActionImpl();
        instance.setAssociateRole(com.commercetools.api.models.associate_role.AssociateRoleResourceIdentifier.deepCopy(template.getAssociateRole()));
        return instance;
    }

    /**
     * builder factory method for ProjectSetBusinessUnitAssociateRoleOnCreationAction
     * @return builder
     */
    public static ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder builder() {
        return ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder.of();
    }
    
    /**
     * create builder for ProjectSetBusinessUnitAssociateRoleOnCreationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder builder(final ProjectSetBusinessUnitAssociateRoleOnCreationAction template) {
        return ProjectSetBusinessUnitAssociateRoleOnCreationActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectSetBusinessUnitAssociateRoleOnCreationAction(Function<ProjectSetBusinessUnitAssociateRoleOnCreationAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectSetBusinessUnitAssociateRoleOnCreationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectSetBusinessUnitAssociateRoleOnCreationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectSetBusinessUnitAssociateRoleOnCreationAction>";
            }
        };
    }
}
