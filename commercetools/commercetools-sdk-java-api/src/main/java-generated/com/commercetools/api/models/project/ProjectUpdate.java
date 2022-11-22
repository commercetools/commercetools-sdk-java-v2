
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *  <p>Expected version of the Project on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Project.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProjectUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ProjectUpdateAction... actions);

    public void setActions(final List<ProjectUpdateAction> actions);

    public static ProjectUpdate of() {
        return new ProjectUpdateImpl();
    }

    public static ProjectUpdate of(final ProjectUpdate template) {
        ProjectUpdateImpl instance = new ProjectUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ProjectUpdateBuilder builder() {
        return ProjectUpdateBuilder.of();
    }

    public static ProjectUpdateBuilder builder(final ProjectUpdate template) {
        return ProjectUpdateBuilder.of(template);
    }

    default <T> T withProjectUpdate(Function<ProjectUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectUpdate>";
            }
        };
    }
}
