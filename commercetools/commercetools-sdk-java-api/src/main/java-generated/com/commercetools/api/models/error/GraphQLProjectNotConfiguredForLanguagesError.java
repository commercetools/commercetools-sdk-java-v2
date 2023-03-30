
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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
 *     GraphQLProjectNotConfiguredForLanguagesError graphQLProjectNotConfiguredForLanguagesError = GraphQLProjectNotConfiguredForLanguagesError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLProjectNotConfiguredForLanguagesErrorImpl.class)
public interface GraphQLProjectNotConfiguredForLanguagesError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLProjectNotConfiguredForLanguagesError
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
     *  <p>Languages configured for the Store.</p>
     * @return languages
     */

    @JsonProperty("languages")
    public List<String> getLanguages();

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
     * @return instance of GraphQLProjectNotConfiguredForLanguagesError
     */
    public static GraphQLProjectNotConfiguredForLanguagesError of() {
        return new GraphQLProjectNotConfiguredForLanguagesErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLProjectNotConfiguredForLanguagesError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLProjectNotConfiguredForLanguagesError of(
            final GraphQLProjectNotConfiguredForLanguagesError template) {
        GraphQLProjectNotConfiguredForLanguagesErrorImpl instance = new GraphQLProjectNotConfiguredForLanguagesErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLanguages(template.getLanguages());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLProjectNotConfiguredForLanguagesError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLProjectNotConfiguredForLanguagesError deepCopy(
            @Nullable final GraphQLProjectNotConfiguredForLanguagesError template) {
        if (template == null) {
            return null;
        }
        GraphQLProjectNotConfiguredForLanguagesErrorImpl instance = new GraphQLProjectNotConfiguredForLanguagesErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLanguages(Optional.ofNullable(template.getLanguages()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for GraphQLProjectNotConfiguredForLanguagesError
     * @return builder
     */
    public static GraphQLProjectNotConfiguredForLanguagesErrorBuilder builder() {
        return GraphQLProjectNotConfiguredForLanguagesErrorBuilder.of();
    }

    /**
     * create builder for GraphQLProjectNotConfiguredForLanguagesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLProjectNotConfiguredForLanguagesErrorBuilder builder(
            final GraphQLProjectNotConfiguredForLanguagesError template) {
        return GraphQLProjectNotConfiguredForLanguagesErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLProjectNotConfiguredForLanguagesError(
            Function<GraphQLProjectNotConfiguredForLanguagesError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLProjectNotConfiguredForLanguagesError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLProjectNotConfiguredForLanguagesError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLProjectNotConfiguredForLanguagesError>";
            }
        };
    }
}
