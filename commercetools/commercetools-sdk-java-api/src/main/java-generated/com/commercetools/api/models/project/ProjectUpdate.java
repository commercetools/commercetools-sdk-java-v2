
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProjectUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectUpdate projectUpdate = ProjectUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectUpdateImpl.class)
public interface ProjectUpdate
        extends com.commercetools.api.models.ResourceUpdate<ProjectUpdate, ProjectUpdateAction, ProjectUpdateBuilder> {

    /**
     *  <p>Expected version of the Project on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Project.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProjectUpdateAction> getActions();

    /**
     *  <p>Expected version of the Project on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Project.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final ProjectUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Project.</p>
     * @param actions values to be set
     */

    public void setActions(final List<ProjectUpdateAction> actions);

    /**
     * factory method
     * @return instance of ProjectUpdate
     */
    public static ProjectUpdate of() {
        return new ProjectUpdateImpl();
    }

    /**
     * factory method to create a shallow copy ProjectUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectUpdate of(final ProjectUpdate template) {
        ProjectUpdateImpl instance = new ProjectUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectUpdate deepCopy(@Nullable final ProjectUpdate template) {
        if (template == null) {
            return null;
        }
        ProjectUpdateImpl instance = new ProjectUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.project.ProjectUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProjectUpdate
     * @return builder
     */
    public static ProjectUpdateBuilder builder() {
        return ProjectUpdateBuilder.of();
    }

    /**
     * create builder for ProjectUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectUpdateBuilder builder(final ProjectUpdate template) {
        return ProjectUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectUpdate(Function<ProjectUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectUpdate>";
            }
        };
    }
}
