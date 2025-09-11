
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProjectChangeBusinessUnitStatusOnCreationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeBusinessUnitStatusOnCreationAction projectChangeBusinessUnitStatusOnCreationAction = ProjectChangeBusinessUnitStatusOnCreationAction.builder()
 *             .status(BusinessUnitConfigurationStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeMyBusinessUnitStatusOnCreation")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeBusinessUnitStatusOnCreationActionImpl.class)
public interface ProjectChangeBusinessUnitStatusOnCreationAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeBusinessUnitStatusOnCreationAction
     */
    String CHANGE_MY_BUSINESS_UNIT_STATUS_ON_CREATION = "changeMyBusinessUnitStatusOnCreation";

    /**
     *  <p>Status for Business Units created using the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/business-units:POST" rel="nofollow">My Business Unit endpoint</a>.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public BusinessUnitConfigurationStatus getStatus();

    /**
     *  <p>Status for Business Units created using the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/me/business-units:POST" rel="nofollow">My Business Unit endpoint</a>.</p>
     * @param status value to be set
     */

    public void setStatus(final BusinessUnitConfigurationStatus status);

    /**
     * factory method
     * @return instance of ProjectChangeBusinessUnitStatusOnCreationAction
     */
    public static ProjectChangeBusinessUnitStatusOnCreationAction of() {
        return new ProjectChangeBusinessUnitStatusOnCreationActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeBusinessUnitStatusOnCreationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeBusinessUnitStatusOnCreationAction of(
            final ProjectChangeBusinessUnitStatusOnCreationAction template) {
        ProjectChangeBusinessUnitStatusOnCreationActionImpl instance = new ProjectChangeBusinessUnitStatusOnCreationActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    public ProjectChangeBusinessUnitStatusOnCreationAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectChangeBusinessUnitStatusOnCreationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeBusinessUnitStatusOnCreationAction deepCopy(
            @Nullable final ProjectChangeBusinessUnitStatusOnCreationAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeBusinessUnitStatusOnCreationActionImpl instance = new ProjectChangeBusinessUnitStatusOnCreationActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for ProjectChangeBusinessUnitStatusOnCreationAction
     * @return builder
     */
    public static ProjectChangeBusinessUnitStatusOnCreationActionBuilder builder() {
        return ProjectChangeBusinessUnitStatusOnCreationActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeBusinessUnitStatusOnCreationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeBusinessUnitStatusOnCreationActionBuilder builder(
            final ProjectChangeBusinessUnitStatusOnCreationAction template) {
        return ProjectChangeBusinessUnitStatusOnCreationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeBusinessUnitStatusOnCreationAction(
            Function<ProjectChangeBusinessUnitStatusOnCreationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeBusinessUnitStatusOnCreationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeBusinessUnitStatusOnCreationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeBusinessUnitStatusOnCreationAction>";
            }
        };
    }
}
