
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the current password of the Customer does not match.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Change Customer Password and Change Customer Password in a Store requests on Customers.</li>
 *   <li>Change Customer Password and Change Customer Password in a Store requests on My Customer Profile.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidCurrentPasswordError graphQLInvalidCurrentPasswordError = GraphQLInvalidCurrentPasswordError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InvalidCurrentPassword")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLInvalidCurrentPasswordErrorImpl.class)
public interface GraphQLInvalidCurrentPasswordError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLInvalidCurrentPasswordError
     */
    String INVALID_CURRENT_PASSWORD = "InvalidCurrentPassword";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLInvalidCurrentPasswordError
     */
    public static GraphQLInvalidCurrentPasswordError of() {
        return new GraphQLInvalidCurrentPasswordErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLInvalidCurrentPasswordError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLInvalidCurrentPasswordError of(final GraphQLInvalidCurrentPasswordError template) {
        GraphQLInvalidCurrentPasswordErrorImpl instance = new GraphQLInvalidCurrentPasswordErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLInvalidCurrentPasswordError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLInvalidCurrentPasswordError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLInvalidCurrentPasswordError deepCopy(
            @Nullable final GraphQLInvalidCurrentPasswordError template) {
        if (template == null) {
            return null;
        }
        GraphQLInvalidCurrentPasswordErrorImpl instance = new GraphQLInvalidCurrentPasswordErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLInvalidCurrentPasswordError
     * @return builder
     */
    public static GraphQLInvalidCurrentPasswordErrorBuilder builder() {
        return GraphQLInvalidCurrentPasswordErrorBuilder.of();
    }

    /**
     * create builder for GraphQLInvalidCurrentPasswordError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidCurrentPasswordErrorBuilder builder(final GraphQLInvalidCurrentPasswordError template) {
        return GraphQLInvalidCurrentPasswordErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLInvalidCurrentPasswordError(Function<GraphQLInvalidCurrentPasswordError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidCurrentPasswordError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidCurrentPasswordError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLInvalidCurrentPasswordError>";
            }
        };
    }
}
