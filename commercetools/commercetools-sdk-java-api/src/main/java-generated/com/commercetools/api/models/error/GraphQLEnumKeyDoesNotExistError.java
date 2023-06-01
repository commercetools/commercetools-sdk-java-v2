package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.error.GraphQLEnumKeyDoesNotExistErrorImpl;

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
 *  <p>Returned when an AttributeEnumType or AttributeLocalizedEnumType already contains a value with the given key.</p>
 *  <p>The error is returned as a failed response to the Change the key of an EnumValue update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLEnumKeyDoesNotExistError graphQLEnumKeyDoesNotExistError = GraphQLEnumKeyDoesNotExistError.builder()
 *             .conflictingEnumKey("{conflictingEnumKey}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = GraphQLEnumKeyDoesNotExistErrorImpl.class)
public interface GraphQLEnumKeyDoesNotExistError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLEnumKeyDoesNotExistError
     */
    String ENUM_KEY_DOES_NOT_EXIST = "EnumKeyDoesNotExist";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();
    /**
     *  <p>Conflicting enum key.</p>
     * @return conflictingEnumKey
     */
    @NotNull
    @JsonProperty("conflictingEnumKey")
    public String getConflictingEnumKey();
    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @return conflictingAttributeName
     */
    @NotNull
    @JsonProperty("conflictingAttributeName")
    public String getConflictingAttributeName();

    /**
     *  <p>Conflicting enum key.</p>
     * @param conflictingEnumKey value to be set
     */
    
    public void setConflictingEnumKey(final String conflictingEnumKey);
    
    
    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @param conflictingAttributeName value to be set
     */
    
    public void setConflictingAttributeName(final String conflictingAttributeName);
    

    /**
     * factory method
     * @return instance of GraphQLEnumKeyDoesNotExistError
     */
    public static GraphQLEnumKeyDoesNotExistError of(){
        return new GraphQLEnumKeyDoesNotExistErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy GraphQLEnumKeyDoesNotExistError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLEnumKeyDoesNotExistError of(final GraphQLEnumKeyDoesNotExistError template) {
        GraphQLEnumKeyDoesNotExistErrorImpl instance = new GraphQLEnumKeyDoesNotExistErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLEnumKeyDoesNotExistError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLEnumKeyDoesNotExistError deepCopy(@Nullable final GraphQLEnumKeyDoesNotExistError template) {
        if (template == null) {
            return null;
        }
        GraphQLEnumKeyDoesNotExistErrorImpl instance = new GraphQLEnumKeyDoesNotExistErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * builder factory method for GraphQLEnumKeyDoesNotExistError
     * @return builder
     */
    public static GraphQLEnumKeyDoesNotExistErrorBuilder builder() {
        return GraphQLEnumKeyDoesNotExistErrorBuilder.of();
    }
    
    /**
     * create builder for GraphQLEnumKeyDoesNotExistError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLEnumKeyDoesNotExistErrorBuilder builder(final GraphQLEnumKeyDoesNotExistError template) {
        return GraphQLEnumKeyDoesNotExistErrorBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLEnumKeyDoesNotExistError(Function<GraphQLEnumKeyDoesNotExistError, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLEnumKeyDoesNotExistError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLEnumKeyDoesNotExistError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLEnumKeyDoesNotExistError>";
            }
        };
    }
}
