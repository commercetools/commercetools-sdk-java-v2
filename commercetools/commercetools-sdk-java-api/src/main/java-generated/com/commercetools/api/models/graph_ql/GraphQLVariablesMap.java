package com.commercetools.api.models.graph_ql;

import java.lang.Object;
import com.commercetools.api.models.graph_ql.GraphQLVariablesMapImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * GraphQLVariablesMap
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLVariablesMap graphQLVariablesMap = GraphQLVariablesMap.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLVariablesMapImpl.class)
public interface GraphQLVariablesMap  {


    /**
     *
     * @return map of the pattern property values
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, Object> values();

    /**
     * set pattern property
     * @param key property name
     * @param value property value
     */
    
    @JsonAnySetter
    public void setValue(String key, Object value);

    /**
     * factory method
     * @return instance of GraphQLVariablesMap
     */
    public static GraphQLVariablesMap of(){
        return new GraphQLVariablesMapImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLVariablesMap
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLVariablesMap of(final GraphQLVariablesMap template) {
        GraphQLVariablesMapImpl instance = new GraphQLVariablesMapImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLVariablesMap
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLVariablesMap deepCopy(@Nullable final GraphQLVariablesMap template) {
        if (template == null) {
            return null;
        }
        GraphQLVariablesMapImpl instance = new GraphQLVariablesMapImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLVariablesMap
     * @return builder
     */
    public static GraphQLVariablesMapBuilder builder() {
        return GraphQLVariablesMapBuilder.of();
    }
    
    /**
     * create builder for GraphQLVariablesMap instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLVariablesMapBuilder builder(final GraphQLVariablesMap template) {
        return GraphQLVariablesMapBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLVariablesMap(Function<GraphQLVariablesMap, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLVariablesMap> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLVariablesMap>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLVariablesMap>";
            }
        };
    }
}
