
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    String PROJECT_NOT_CONFIGURED_FOR_LANGUAGES = "ProjectNotConfiguredForLanguages";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The project is not configured for given languages."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Languages configured for the Store.</p>
     */

    @JsonProperty("languages")
    public List<String> getLanguages();

    public void setMessage(final String message);

    @JsonIgnore
    public void setLanguages(final String... languages);

    public void setLanguages(final List<String> languages);

    public static ProjectNotConfiguredForLanguagesError of() {
        return new ProjectNotConfiguredForLanguagesErrorImpl();
    }

    public static ProjectNotConfiguredForLanguagesError of(final ProjectNotConfiguredForLanguagesError template) {
        ProjectNotConfiguredForLanguagesErrorImpl instance = new ProjectNotConfiguredForLanguagesErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setLanguages(template.getLanguages());
        return instance;
    }

    public static ProjectNotConfiguredForLanguagesErrorBuilder builder() {
        return ProjectNotConfiguredForLanguagesErrorBuilder.of();
    }

    public static ProjectNotConfiguredForLanguagesErrorBuilder builder(
            final ProjectNotConfiguredForLanguagesError template) {
        return ProjectNotConfiguredForLanguagesErrorBuilder.of(template);
    }

    default <T> T withProjectNotConfiguredForLanguagesError(Function<ProjectNotConfiguredForLanguagesError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectNotConfiguredForLanguagesError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectNotConfiguredForLanguagesError>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectNotConfiguredForLanguagesError>";
            }
        };
    }
}
