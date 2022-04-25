
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectNotConfiguredForLanguagesErrorImpl.class)
public interface ProjectNotConfiguredForLanguagesError extends ErrorObject {

    String PROJECT_NOT_CONFIGURED_FOR_LANGUAGES = "ProjectNotConfiguredForLanguages";

    @JsonProperty("languages")
    public List<String> getLanguages();

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
