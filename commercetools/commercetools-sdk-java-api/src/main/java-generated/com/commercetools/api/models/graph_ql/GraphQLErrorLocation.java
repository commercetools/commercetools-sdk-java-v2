
package com.commercetools.api.models.graph_ql;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLErrorLocation
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLErrorLocation graphQLErrorLocation = GraphQLErrorLocation.builder()
 *             .line(1)
 *             .column(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLErrorLocationImpl.class)
public interface GraphQLErrorLocation {

    /**
     *
     * @return line
     */
    @NotNull
    @JsonProperty("line")
    public Integer getLine();

    /**
     *
     * @return column
     */
    @NotNull
    @JsonProperty("column")
    public Integer getColumn();

    /**
     * set line
     * @param line value to be set
     */

    public void setLine(final Integer line);

    /**
     * set column
     * @param column value to be set
     */

    public void setColumn(final Integer column);

    /**
     * factory method
     * @return instance of GraphQLErrorLocation
     */
    public static GraphQLErrorLocation of() {
        return new GraphQLErrorLocationImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLErrorLocation
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLErrorLocation of(final GraphQLErrorLocation template) {
        GraphQLErrorLocationImpl instance = new GraphQLErrorLocationImpl();
        instance.setLine(template.getLine());
        instance.setColumn(template.getColumn());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLErrorLocation
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLErrorLocation deepCopy(@Nullable final GraphQLErrorLocation template) {
        if (template == null) {
            return null;
        }
        GraphQLErrorLocationImpl instance = new GraphQLErrorLocationImpl();
        instance.setLine(template.getLine());
        instance.setColumn(template.getColumn());
        return instance;
    }

    /**
     * builder factory method for GraphQLErrorLocation
     * @return builder
     */
    public static GraphQLErrorLocationBuilder builder() {
        return GraphQLErrorLocationBuilder.of();
    }

    /**
     * create builder for GraphQLErrorLocation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLErrorLocationBuilder builder(final GraphQLErrorLocation template) {
        return GraphQLErrorLocationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLErrorLocation(Function<GraphQLErrorLocation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLErrorLocation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLErrorLocation>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLErrorLocation>";
            }
        };
    }
}
