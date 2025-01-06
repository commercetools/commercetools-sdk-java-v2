
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
 * ProjectChangeBusinessUnitSearchStatusAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeBusinessUnitSearchStatusAction projectChangeBusinessUnitSearchStatusAction = ProjectChangeBusinessUnitSearchStatusAction.builder()
 *             .status(BusinessUnitSearchStatus.ACTIVATED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeBusinessUnitSearchStatusActionImpl.class)
public interface ProjectChangeBusinessUnitSearchStatusAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeBusinessUnitSearchStatusAction
     */
    String CHANGE_BUSINESS_UNIT_SEARCH_STATUS = "changeBusinessUnitSearchStatus";

    /**
     *  <p>Activates or deactivates the Search Business Units feature. Activation will trigger building a search index for the Business Units in the Project.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public BusinessUnitSearchStatus getStatus();

    /**
     *  <p>Activates or deactivates the Search Business Units feature. Activation will trigger building a search index for the Business Units in the Project.</p>
     * @param status value to be set
     */

    public void setStatus(final BusinessUnitSearchStatus status);

    /**
     * factory method
     * @return instance of ProjectChangeBusinessUnitSearchStatusAction
     */
    public static ProjectChangeBusinessUnitSearchStatusAction of() {
        return new ProjectChangeBusinessUnitSearchStatusActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeBusinessUnitSearchStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeBusinessUnitSearchStatusAction of(
            final ProjectChangeBusinessUnitSearchStatusAction template) {
        ProjectChangeBusinessUnitSearchStatusActionImpl instance = new ProjectChangeBusinessUnitSearchStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectChangeBusinessUnitSearchStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeBusinessUnitSearchStatusAction deepCopy(
            @Nullable final ProjectChangeBusinessUnitSearchStatusAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeBusinessUnitSearchStatusActionImpl instance = new ProjectChangeBusinessUnitSearchStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for ProjectChangeBusinessUnitSearchStatusAction
     * @return builder
     */
    public static ProjectChangeBusinessUnitSearchStatusActionBuilder builder() {
        return ProjectChangeBusinessUnitSearchStatusActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeBusinessUnitSearchStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeBusinessUnitSearchStatusActionBuilder builder(
            final ProjectChangeBusinessUnitSearchStatusAction template) {
        return ProjectChangeBusinessUnitSearchStatusActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeBusinessUnitSearchStatusAction(
            Function<ProjectChangeBusinessUnitSearchStatusAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeBusinessUnitSearchStatusAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeBusinessUnitSearchStatusAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeBusinessUnitSearchStatusAction>";
            }
        };
    }
}
