package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLRequiredFieldErrorImpl;

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
 *  <p>Returned when a value is not defined for a required field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLRequiredFieldError graphQLRequiredFieldError = GraphQLRequiredFieldError.builder()
 *             .field("{field}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLRequiredFieldErrorImpl.class)
public interface GraphQLRequiredFieldError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLRequiredFieldError
     */
    String REQUIRED_FIELD = "RequiredField";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p>Name of the field missing the value.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p>Name of the field missing the value.</p>
     * @param field value to be set
     */
    
    public void setField(final String field);
    

    /**
     * factory method
     * @return instance of GraphQLRequiredFieldError
     */
    public static GraphQLRequiredFieldError of(){
        return new GraphQLRequiredFieldErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLRequiredFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLRequiredFieldError of(final GraphQLRequiredFieldError template) {
        GraphQLRequiredFieldErrorImpl instance = new GraphQLRequiredFieldErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLRequiredFieldError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLRequiredFieldError deepCopy(@Nullable final GraphQLRequiredFieldError template) {
        if (template == null) {
            return null;
        }
        GraphQLRequiredFieldErrorImpl instance = new GraphQLRequiredFieldErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        return instance;
    }

    /**
     * builder factory method for GraphQLRequiredFieldError
     * @return builder
     */
    public static GraphQLRequiredFieldErrorBuilder builder() {
        return GraphQLRequiredFieldErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLRequiredFieldError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLRequiredFieldErrorBuilder builder(final GraphQLRequiredFieldError template) {
        return GraphQLRequiredFieldErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLRequiredFieldError(Function<GraphQLRequiredFieldError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLRequiredFieldError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLRequiredFieldError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLRequiredFieldError>";
            }
        };
    }
}
