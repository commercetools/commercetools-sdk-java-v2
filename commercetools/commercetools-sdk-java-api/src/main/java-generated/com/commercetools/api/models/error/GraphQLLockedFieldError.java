
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
 *  <p>Returned when two Customers are simultaneously created or updated with the same email address.</p>
 *  <p>To confirm if the operation was successful, repeat the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLLockedFieldError graphQLLockedFieldError = GraphQLLockedFieldError.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLLockedFieldErrorImpl.class)
public interface GraphQLLockedFieldError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLLockedFieldError
     */
    String LOCKED_FIELD = "LockedField";

    /**
     *  <p>Field that is currently locked.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Field that is currently locked.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     * factory method
     * @return instance of GraphQLLockedFieldError
     */
    public static GraphQLLockedFieldError of() {
        return new GraphQLLockedFieldErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLLockedFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLLockedFieldError of(final GraphQLLockedFieldError template) {
        GraphQLLockedFieldErrorImpl instance = new GraphQLLockedFieldErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLLockedFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLLockedFieldError deepCopy(@Nullable final GraphQLLockedFieldError template) {
        if (template == null) {
            return null;
        }
        GraphQLLockedFieldErrorImpl instance = new GraphQLLockedFieldErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        return instance;
    }

    /**
     * builder factory method for GraphQLLockedFieldError
     * @return builder
     */
    public static GraphQLLockedFieldErrorBuilder builder() {
        return GraphQLLockedFieldErrorBuilder.of();
    }

    /**
     * create builder for GraphQLLockedFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLLockedFieldErrorBuilder builder(final GraphQLLockedFieldError template) {
        return GraphQLLockedFieldErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLLockedFieldError(Function<GraphQLLockedFieldError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLLockedFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLLockedFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLLockedFieldError>";
            }
        };
    }
}
