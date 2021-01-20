
package com.commercetools.api.models.project;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.project.ProjectChangeLanguagesActionImpl;
import com.commercetools.api.models.project.ProjectUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectChangeLanguagesActionImpl.class)
public interface ProjectChangeLanguagesAction extends ProjectUpdateAction {

    String CHANGE_LANGUAGES = "changeLanguages";

    /**
    *  <p>.</p>
    */
    @NotNull
    @JsonProperty("languages")
    public List<String> getLanguages();

    @JsonIgnore
    public void setLanguages(final String... languages);

    public void setLanguages(final List<String> languages);

    public static ProjectChangeLanguagesAction of() {
        return new ProjectChangeLanguagesActionImpl();
    }

    public static ProjectChangeLanguagesAction of(final ProjectChangeLanguagesAction template) {
        ProjectChangeLanguagesActionImpl instance = new ProjectChangeLanguagesActionImpl();
        instance.setLanguages(template.getLanguages());
        return instance;
    }

    public static ProjectChangeLanguagesActionBuilder builder() {
        return ProjectChangeLanguagesActionBuilder.of();
    }

    public static ProjectChangeLanguagesActionBuilder builder(final ProjectChangeLanguagesAction template) {
        return ProjectChangeLanguagesActionBuilder.of(template);
    }

    default <T> T withProjectChangeLanguagesAction(Function<ProjectChangeLanguagesAction, T> helper) {
        return helper.apply(this);
    }
}
