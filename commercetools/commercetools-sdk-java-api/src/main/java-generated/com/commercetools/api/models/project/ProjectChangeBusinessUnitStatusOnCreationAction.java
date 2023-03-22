
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeBusinessUnitStatusOnCreationActionImpl.class)
public interface ProjectChangeBusinessUnitStatusOnCreationAction extends ProjectUpdateAction {

    String CHANGE_MY_BUSINESS_UNIT_STATUS_ON_CREATION = "changeMyBusinessUnitStatusOnCreation";

    /**
     *  <p>Status for Business Units created using the My Business Unit endpoint.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public BusinessUnitConfigurationStatus getStatus();

    public void setStatus(final BusinessUnitConfigurationStatus status);

    public static ProjectChangeBusinessUnitStatusOnCreationAction of() {
        return new ProjectChangeBusinessUnitStatusOnCreationActionImpl();
    }

    public static ProjectChangeBusinessUnitStatusOnCreationAction of(
            final ProjectChangeBusinessUnitStatusOnCreationAction template) {
        ProjectChangeBusinessUnitStatusOnCreationActionImpl instance = new ProjectChangeBusinessUnitStatusOnCreationActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    public static ProjectChangeBusinessUnitStatusOnCreationActionBuilder builder() {
        return ProjectChangeBusinessUnitStatusOnCreationActionBuilder.of();
    }

    public static ProjectChangeBusinessUnitStatusOnCreationActionBuilder builder(
            final ProjectChangeBusinessUnitStatusOnCreationAction template) {
        return ProjectChangeBusinessUnitStatusOnCreationActionBuilder.of(template);
    }

    default <T> T withProjectChangeBusinessUnitStatusOnCreationAction(
            Function<ProjectChangeBusinessUnitStatusOnCreationAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeBusinessUnitStatusOnCreationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeBusinessUnitStatusOnCreationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeBusinessUnitStatusOnCreationAction>";
            }
        };
    }
}
