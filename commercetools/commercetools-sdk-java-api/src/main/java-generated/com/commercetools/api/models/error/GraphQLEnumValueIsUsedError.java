
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
 *  <p>Returned when an enum value cannot be removed from an Attribute as it is being used by a Product.</p>
 *  <p>The error is returned as a failed response to the Remove EnumValues from AttributeDefinition update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLEnumValueIsUsedError graphQLEnumValueIsUsedError = GraphQLEnumValueIsUsedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("EnumValueIsUsed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLEnumValueIsUsedErrorImpl.class)
public interface GraphQLEnumValueIsUsedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLEnumValueIsUsedError
     */
    String ENUM_VALUE_IS_USED = "EnumValueIsUsed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLEnumValueIsUsedError
     */
    public static GraphQLEnumValueIsUsedError of() {
        return new GraphQLEnumValueIsUsedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLEnumValueIsUsedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLEnumValueIsUsedError of(final GraphQLEnumValueIsUsedError template) {
        GraphQLEnumValueIsUsedErrorImpl instance = new GraphQLEnumValueIsUsedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLEnumValueIsUsedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLEnumValueIsUsedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLEnumValueIsUsedError deepCopy(@Nullable final GraphQLEnumValueIsUsedError template) {
        if (template == null) {
            return null;
        }
        GraphQLEnumValueIsUsedErrorImpl instance = new GraphQLEnumValueIsUsedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLEnumValueIsUsedError
     * @return builder
     */
    public static GraphQLEnumValueIsUsedErrorBuilder builder() {
        return GraphQLEnumValueIsUsedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLEnumValueIsUsedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLEnumValueIsUsedErrorBuilder builder(final GraphQLEnumValueIsUsedError template) {
        return GraphQLEnumValueIsUsedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLEnumValueIsUsedError(Function<GraphQLEnumValueIsUsedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLEnumValueIsUsedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLEnumValueIsUsedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLEnumValueIsUsedError>";
            }
        };
    }
}
