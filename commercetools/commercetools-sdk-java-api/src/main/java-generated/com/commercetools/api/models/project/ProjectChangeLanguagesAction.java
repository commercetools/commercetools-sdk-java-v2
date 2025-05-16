
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Removing a language used by a Store returns a LanguageUsedInStores error.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("changeLanguages")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeLanguagesActionImpl.class)
public interface ProjectChangeLanguagesAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeLanguagesAction
     */
    String CHANGE_LANGUAGES = "changeLanguages";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return languages
     */
    @NotNull
    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param languages values to be set
     */

    @JsonIgnore
    public void setLanguages(final String... languages);

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param languages values to be set
     */

    public void setLanguages(final List<String> languages);

    /**
     * factory method
     * @return instance of ProjectChangeLanguagesAction
     */
    public static ProjectChangeLanguagesAction of() {
        return new ProjectChangeLanguagesActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeLanguagesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeLanguagesAction of(final ProjectChangeLanguagesAction template) {
        ProjectChangeLanguagesActionImpl instance = new ProjectChangeLanguagesActionImpl();
        instance.setLanguages(template.getLanguages());
        return instance;
    }

    public ProjectChangeLanguagesAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectChangeLanguagesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeLanguagesAction deepCopy(@Nullable final ProjectChangeLanguagesAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeLanguagesActionImpl instance = new ProjectChangeLanguagesActionImpl();
        instance.setLanguages(Optional.ofNullable(template.getLanguages()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProjectChangeLanguagesAction
     * @return builder
     */
    public static ProjectChangeLanguagesActionBuilder builder() {
        return ProjectChangeLanguagesActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeLanguagesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeLanguagesActionBuilder builder(final ProjectChangeLanguagesAction template) {
        return ProjectChangeLanguagesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeLanguagesAction(Function<ProjectChangeLanguagesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeLanguagesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeLanguagesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeLanguagesAction>";
            }
        };
    }
}
