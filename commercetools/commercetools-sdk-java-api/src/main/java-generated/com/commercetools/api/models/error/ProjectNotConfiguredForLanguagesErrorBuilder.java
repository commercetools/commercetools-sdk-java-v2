
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProjectNotConfiguredForLanguagesErrorBuilder
        implements Builder<ProjectNotConfiguredForLanguagesError> {

    private String message;

    @Nullable
    private java.util.List<String> languages;

    public ProjectNotConfiguredForLanguagesErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public ProjectNotConfiguredForLanguagesErrorBuilder languages(@Nullable final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    public ProjectNotConfiguredForLanguagesErrorBuilder languages(@Nullable final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Nullable
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public ProjectNotConfiguredForLanguagesError build() {
        Objects.requireNonNull(message, ProjectNotConfiguredForLanguagesError.class + ": message is missing");
        return new ProjectNotConfiguredForLanguagesErrorImpl(message, languages);
    }

    /**
     * builds ProjectNotConfiguredForLanguagesError without checking for non null required values
     */
    public ProjectNotConfiguredForLanguagesError buildUnchecked() {
        return new ProjectNotConfiguredForLanguagesErrorImpl(message, languages);
    }

    public static ProjectNotConfiguredForLanguagesErrorBuilder of() {
        return new ProjectNotConfiguredForLanguagesErrorBuilder();
    }

    public static ProjectNotConfiguredForLanguagesErrorBuilder of(
            final ProjectNotConfiguredForLanguagesError template) {
        ProjectNotConfiguredForLanguagesErrorBuilder builder = new ProjectNotConfiguredForLanguagesErrorBuilder();
        builder.message = template.getMessage();
        builder.languages = template.getLanguages();
        return builder;
    }

}
