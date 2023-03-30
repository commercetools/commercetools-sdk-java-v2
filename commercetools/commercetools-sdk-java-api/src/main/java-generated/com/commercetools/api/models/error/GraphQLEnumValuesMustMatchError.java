
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
 *  <p>Returned when during an order update of AttributeEnumType or AttributeLocalizedEnumType the new enum values do not match the existing ones.</p>
 *  <p>The error is returned as a failed response to the Change the order of EnumValues and Change the order of LocalizedEnumValues update actions.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLEnumValuesMustMatchError graphQLEnumValuesMustMatchError = GraphQLEnumValuesMustMatchError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLEnumValuesMustMatchErrorImpl.class)
public interface GraphQLEnumValuesMustMatchError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLEnumValuesMustMatchError
     */
    String ENUM_VALUES_MUST_MATCH = "EnumValuesMustMatch";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLEnumValuesMustMatchError
     */
    public static GraphQLEnumValuesMustMatchError of() {
        return new GraphQLEnumValuesMustMatchErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLEnumValuesMustMatchError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLEnumValuesMustMatchError of(final GraphQLEnumValuesMustMatchError template) {
        GraphQLEnumValuesMustMatchErrorImpl instance = new GraphQLEnumValuesMustMatchErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLEnumValuesMustMatchError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLEnumValuesMustMatchError deepCopy(@Nullable final GraphQLEnumValuesMustMatchError template) {
        if (template == null) {
            return null;
        }
        GraphQLEnumValuesMustMatchErrorImpl instance = new GraphQLEnumValuesMustMatchErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLEnumValuesMustMatchError
     * @return builder
     */
    public static GraphQLEnumValuesMustMatchErrorBuilder builder() {
        return GraphQLEnumValuesMustMatchErrorBuilder.of();
    }

    /**
     * create builder for GraphQLEnumValuesMustMatchError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLEnumValuesMustMatchErrorBuilder builder(final GraphQLEnumValuesMustMatchError template) {
        return GraphQLEnumValuesMustMatchErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLEnumValuesMustMatchError(Function<GraphQLEnumValuesMustMatchError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLEnumValuesMustMatchError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLEnumValuesMustMatchError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLEnumValuesMustMatchError>";
            }
        };
    }
}
