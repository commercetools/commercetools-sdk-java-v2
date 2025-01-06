
package com.commercetools.history.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents a single error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLErrorObject graphQLErrorObject = GraphQLErrorObject.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface GraphQLErrorObject {

    /**
     *  <p>One of the error codes that is listed on the Errors page.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Error-specific additional fields.</p>
     * @return map of the pattern property values
     */
    @NotNull
    @JsonAnyGetter
    public Map<String, Object> values();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     */

    @JsonAnySetter
    public void setValue(String key, Object value);

    /**
     * factory method to create a deep copy of GraphQLErrorObject
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLErrorObject deepCopy(@Nullable final GraphQLErrorObject template) {
        if (template == null) {
            return null;
        }
        GraphQLErrorObjectImpl instance = new GraphQLErrorObjectImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLErrorObject(Function<GraphQLErrorObject, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLErrorObject> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLErrorObject>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLErrorObject>";
            }
        };
    }
}
