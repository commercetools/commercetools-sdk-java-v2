
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLError graphQLError = GraphQLError.builder()
 *             .message("{message}")
 *             .plusLocations(locationsBuilder -> locationsBuilder)
 *             .plusPath(pathBuilder -> pathBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLErrorImpl.class)
public interface GraphQLError {

    /**
     *
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *
     * @return locations
     */
    @NotNull
    @Valid
    @JsonProperty("locations")
    public List<GraphQLErrorLocation> getLocations();

    /**
     *
     * @return path
     */
    @NotNull
    @JsonProperty("path")
    public List<Object> getPath();

    /**
     * set message
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * set locations
     * @param locations values to be set
     */

    @JsonIgnore
    public void setLocations(final GraphQLErrorLocation... locations);

    /**
     * set locations
     * @param locations values to be set
     */

    public void setLocations(final List<GraphQLErrorLocation> locations);

    /**
     * set path
     * @param path values to be set
     */

    @JsonIgnore
    public void setPath(final Object... path);

    /**
     * set path
     * @param path values to be set
     */

    public void setPath(final List<Object> path);

    /**
     * factory method
     * @return instance of GraphQLError
     */
    public static GraphQLError of() {
        return new GraphQLErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLError of(final GraphQLError template) {
        GraphQLErrorImpl instance = new GraphQLErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setLocations(template.getLocations());
        instance.setPath(template.getPath());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLError deepCopy(@Nullable final GraphQLError template) {
        if (template == null) {
            return null;
        }
        GraphQLErrorImpl instance = new GraphQLErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setLocations(Optional.ofNullable(template.getLocations())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.graph_ql.GraphQLErrorLocation::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPath(Optional.ofNullable(template.getPath()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for GraphQLError
     * @return builder
     */
    public static GraphQLErrorBuilder builder() {
        return GraphQLErrorBuilder.of();
    }

    /**
     * create builder for GraphQLError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLErrorBuilder builder(final GraphQLError template) {
        return GraphQLErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLError(Function<GraphQLError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLError>";
            }
        };
    }
}
