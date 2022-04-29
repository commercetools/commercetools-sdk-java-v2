
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProjectChangeLanguagesActionBuilder implements Builder<ProjectChangeLanguagesAction> {

    private java.util.List<String> languages;

    public ProjectChangeLanguagesActionBuilder languages(final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    public ProjectChangeLanguagesActionBuilder languages(final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    public ProjectChangeLanguagesActionBuilder plusLanguages(final String... languages) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.addAll(Arrays.asList(languages));
        return this;
    }

    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public ProjectChangeLanguagesAction build() {
        Objects.requireNonNull(languages, ProjectChangeLanguagesAction.class + ": languages is missing");
        return new ProjectChangeLanguagesActionImpl(languages);
    }

    /**
     * builds ProjectChangeLanguagesAction without checking for non null required values
     */
    public ProjectChangeLanguagesAction buildUnchecked() {
        return new ProjectChangeLanguagesActionImpl(languages);
    }

    public static ProjectChangeLanguagesActionBuilder of() {
        return new ProjectChangeLanguagesActionBuilder();
    }

    public static ProjectChangeLanguagesActionBuilder of(final ProjectChangeLanguagesAction template) {
        ProjectChangeLanguagesActionBuilder builder = new ProjectChangeLanguagesActionBuilder();
        builder.languages = template.getLanguages();
        return builder;
    }

}
