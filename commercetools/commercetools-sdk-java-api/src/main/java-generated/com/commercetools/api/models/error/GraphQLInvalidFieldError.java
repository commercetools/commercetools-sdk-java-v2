
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
 *  <p>Returned when a field has an invalid value.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidFieldError graphQLInvalidFieldError = GraphQLInvalidFieldError.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLInvalidFieldErrorImpl.class)
public interface GraphQLInvalidFieldError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLInvalidFieldError
     */
    String INVALID_FIELD = "InvalidField";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Name of the field with the invalid value.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p>Value invalid for the field.</p>
     * @return invalidValue
     */
    @NotNull
    @JsonProperty("invalidValue")
    public Object getInvalidValue();

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @return allowedValues
     */

    @JsonProperty("allowedValues")
    public List<Object> getAllowedValues();

    /**
     *  <p>Name of the field with the invalid value.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     *  <p>Value invalid for the field.</p>
     * @param invalidValue value to be set
     */

    public void setInvalidValue(final Object invalidValue);

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @param allowedValues values to be set
     */

    @JsonIgnore
    public void setAllowedValues(final Object... allowedValues);

    /**
     *  <p>Fixed set of allowed values for the field, if any.</p>
     * @param allowedValues values to be set
     */

    public void setAllowedValues(final List<Object> allowedValues);

    /**
     * factory method
     * @return instance of GraphQLInvalidFieldError
     */
    public static GraphQLInvalidFieldError of() {
        return new GraphQLInvalidFieldErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLInvalidFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLInvalidFieldError of(final GraphQLInvalidFieldError template) {
        GraphQLInvalidFieldErrorImpl instance = new GraphQLInvalidFieldErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        instance.setInvalidValue(template.getInvalidValue());
        instance.setAllowedValues(template.getAllowedValues());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLInvalidFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLInvalidFieldError deepCopy(@Nullable final GraphQLInvalidFieldError template) {
        if (template == null) {
            return null;
        }
        GraphQLInvalidFieldErrorImpl instance = new GraphQLInvalidFieldErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        instance.setInvalidValue(template.getInvalidValue());
        instance.setAllowedValues(Optional.ofNullable(template.getAllowedValues()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for GraphQLInvalidFieldError
     * @return builder
     */
    public static GraphQLInvalidFieldErrorBuilder builder() {
        return GraphQLInvalidFieldErrorBuilder.of();
    }

    /**
     * create builder for GraphQLInvalidFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidFieldErrorBuilder builder(final GraphQLInvalidFieldError template) {
        return GraphQLInvalidFieldErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLInvalidFieldError(Function<GraphQLInvalidFieldError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLInvalidFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLInvalidFieldError>";
            }
        };
    }
}
