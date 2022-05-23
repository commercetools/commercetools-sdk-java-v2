
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>If a language is used by a Store, it cannot be deleted. Attempts to delete such language will lead to LanguageUsedInStores errors.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeLanguagesAction projectChangeLanguagesAction = ProjectChangeLanguagesAction.builder()
 *             .plusLanguages(languagesBuilder -> languagesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeLanguagesActionImpl.class)
public interface ProjectChangeLanguagesAction extends ProjectUpdateAction {

    String CHANGE_LANGUAGES = "changeLanguages";

    /**
     <*  <p>New value to set. Must not be empty.</p>>
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

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeLanguagesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeLanguagesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeLanguagesAction>";
            }
        };
    }
}
