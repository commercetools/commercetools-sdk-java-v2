
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the languages set for a Store are not supported by the Project.</p>
 *  <p>The error is returned as a failed response to the Set Languages update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectNotConfiguredForLanguagesError projectNotConfiguredForLanguagesError = ProjectNotConfiguredForLanguagesError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectNotConfiguredForLanguagesErrorImpl.class)
public interface ProjectNotConfiguredForLanguagesError extends ErrorObject {

    /**
     * discriminator value for ProjectNotConfiguredForLanguagesError
     */
    String PROJECT_NOT_CONFIGURED_FOR_LANGUAGES = "ProjectNotConfiguredForLanguages";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The project is not configured for given languages."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Languages configured for the Store.</p>
     * @return languages
     */

    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
     *  <p><code>"The project is not configured for given languages."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Languages configured for the Store.</p>
     * @param languages values to be set
     */

    @JsonIgnore
    public void setLanguages(final String... languages);

    /**
     *  <p>Languages configured for the Store.</p>
     * @param languages values to be set
     */

    public void setLanguages(final List<String> languages);

    /**
     * factory method
     * @return instance of ProjectNotConfiguredForLanguagesError
     */
    public static ProjectNotConfiguredForLanguagesError of() {
        return new ProjectNotConfiguredForLanguagesErrorImpl();
    }

    /**
     * factory method to create a shallow copy ProjectNotConfiguredForLanguagesError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectNotConfiguredForLanguagesError of(final ProjectNotConfiguredForLanguagesError template) {
        ProjectNotConfiguredForLanguagesErrorImpl instance = new ProjectNotConfiguredForLanguagesErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLanguages(template.getLanguages());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectNotConfiguredForLanguagesError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectNotConfiguredForLanguagesError deepCopy(
            @Nullable final ProjectNotConfiguredForLanguagesError template) {
        if (template == null) {
            return null;
        }
        ProjectNotConfiguredForLanguagesErrorImpl instance = new ProjectNotConfiguredForLanguagesErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLanguages(Optional.ofNullable(template.getLanguages()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProjectNotConfiguredForLanguagesError
     * @return builder
     */
    public static ProjectNotConfiguredForLanguagesErrorBuilder builder() {
        return ProjectNotConfiguredForLanguagesErrorBuilder.of();
    }

    /**
     * create builder for ProjectNotConfiguredForLanguagesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectNotConfiguredForLanguagesErrorBuilder builder(
            final ProjectNotConfiguredForLanguagesError template) {
        return ProjectNotConfiguredForLanguagesErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectNotConfiguredForLanguagesError(Function<ProjectNotConfiguredForLanguagesError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectNotConfiguredForLanguagesError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectNotConfiguredForLanguagesError>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectNotConfiguredForLanguagesError>";
            }
        };
    }
}
