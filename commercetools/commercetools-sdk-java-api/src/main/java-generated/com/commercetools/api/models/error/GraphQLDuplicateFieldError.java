
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
 *  <p>Returned when a field value conflicts with an existing value causing a duplicate.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateFieldError graphQLDuplicateFieldError = GraphQLDuplicateFieldError.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DuplicateField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLDuplicateFieldErrorImpl.class)
public interface GraphQLDuplicateFieldError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLDuplicateFieldError
     */
    String DUPLICATE_FIELD = "DuplicateField";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Name of the conflicting field.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p>Conflicting duplicate value.</p>
     * @return duplicateValue
     */
    @NotNull
    @JsonProperty("duplicateValue")
    public Object getDuplicateValue();

    /**
     *  <p>Name of the conflicting field.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     *  <p>Conflicting duplicate value.</p>
     * @param duplicateValue value to be set
     */

    public void setDuplicateValue(final Object duplicateValue);

    /**
     * factory method
     * @return instance of GraphQLDuplicateFieldError
     */
    public static GraphQLDuplicateFieldError of() {
        return new GraphQLDuplicateFieldErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLDuplicateFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLDuplicateFieldError of(final GraphQLDuplicateFieldError template) {
        GraphQLDuplicateFieldErrorImpl instance = new GraphQLDuplicateFieldErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        return instance;
    }

    public GraphQLDuplicateFieldError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLDuplicateFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLDuplicateFieldError deepCopy(@Nullable final GraphQLDuplicateFieldError template) {
        if (template == null) {
            return null;
        }
        GraphQLDuplicateFieldErrorImpl instance = new GraphQLDuplicateFieldErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        return instance;
    }

    /**
     * builder factory method for GraphQLDuplicateFieldError
     * @return builder
     */
    public static GraphQLDuplicateFieldErrorBuilder builder() {
        return GraphQLDuplicateFieldErrorBuilder.of();
    }

    /**
     * create builder for GraphQLDuplicateFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateFieldErrorBuilder builder(final GraphQLDuplicateFieldError template) {
        return GraphQLDuplicateFieldErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLDuplicateFieldError(Function<GraphQLDuplicateFieldError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLDuplicateFieldError>";
            }
        };
    }
}
