
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.JsonDeserialize;

/**
 * ProjectChangeCountriesAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeCountriesAction projectChangeCountriesAction = ProjectChangeCountriesAction.builder()
 *             .plusCountries(countriesBuilder -> countriesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeCountries")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeCountriesActionImpl.class)
public interface ProjectChangeCountriesAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeCountriesAction
     */
    String CHANGE_COUNTRIES = "changeCountries";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return countries
     */
    @NotNull
    @JsonProperty("countries")
    public List<String> getCountries();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param countries values to be set
     */

    @JsonIgnore
    public void setCountries(final String... countries);

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param countries values to be set
     */

    public void setCountries(final List<String> countries);

    /**
     * factory method
     * @return instance of ProjectChangeCountriesAction
     */
    public static ProjectChangeCountriesAction of() {
        return new ProjectChangeCountriesActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeCountriesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeCountriesAction of(final ProjectChangeCountriesAction template) {
        ProjectChangeCountriesActionImpl instance = new ProjectChangeCountriesActionImpl();
        instance.setCountries(template.getCountries());
        return instance;
    }

    public ProjectChangeCountriesAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectChangeCountriesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeCountriesAction deepCopy(@Nullable final ProjectChangeCountriesAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeCountriesActionImpl instance = new ProjectChangeCountriesActionImpl();
        instance.setCountries(Optional.ofNullable(template.getCountries()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProjectChangeCountriesAction
     * @return builder
     */
    public static ProjectChangeCountriesActionBuilder builder() {
        return ProjectChangeCountriesActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeCountriesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeCountriesActionBuilder builder(final ProjectChangeCountriesAction template) {
        return ProjectChangeCountriesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeCountriesAction(Function<ProjectChangeCountriesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ProjectChangeCountriesAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<ProjectChangeCountriesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeCountriesAction>";
            }
        };
    }
}
