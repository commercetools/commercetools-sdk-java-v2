
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setMessage(final String message);

    @JsonIgnore
    public void setLocations(final GraphQLErrorLocation... locations);

    public void setLocations(final List<GraphQLErrorLocation> locations);

    @JsonIgnore
    public void setPath(final Object... path);

    public void setPath(final List<Object> path);

    public static GraphQLError of() {
        return new GraphQLErrorImpl();
    }

    public static GraphQLError of(final GraphQLError template) {
        GraphQLErrorImpl instance = new GraphQLErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setLocations(template.getLocations());
        instance.setPath(template.getPath());
        return instance;
    }

    public static GraphQLErrorBuilder builder() {
        return GraphQLErrorBuilder.of();
    }

    public static GraphQLErrorBuilder builder(final GraphQLError template) {
        return GraphQLErrorBuilder.of(template);
    }

    default <T> T withGraphQLError(Function<GraphQLError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLError>";
            }
        };
    }
}
