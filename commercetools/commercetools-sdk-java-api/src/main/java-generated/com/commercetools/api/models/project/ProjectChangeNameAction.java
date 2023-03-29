
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeNameAction projectChangeNameAction = ProjectChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeNameActionImpl.class)
public interface ProjectChangeNameAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of ProjectChangeNameAction
     */
    public static ProjectChangeNameAction of() {
        return new ProjectChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeNameAction of(final ProjectChangeNameAction template) {
        ProjectChangeNameActionImpl instance = new ProjectChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeNameAction deepCopy(@Nullable final ProjectChangeNameAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeNameActionImpl instance = new ProjectChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for ProjectChangeNameAction
     * @return builder
     */
    public static ProjectChangeNameActionBuilder builder() {
        return ProjectChangeNameActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeNameActionBuilder builder(final ProjectChangeNameAction template) {
        return ProjectChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeNameAction(Function<ProjectChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeNameAction>";
            }
        };
    }
}
