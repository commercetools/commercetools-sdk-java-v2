
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
 *  <p>Returned when an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> does not exist for an Attribute <code>name</code>.</p>
 *  <p>The error is returned as a failed response to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTypeChangeAttributeNameAction" rel="nofollow">Change AttributeDefinition Name</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAttributeNameDoesNotExistError graphQLAttributeNameDoesNotExistError = GraphQLAttributeNameDoesNotExistError.builder()
 *             .invalidAttributeName("{invalidAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AttributeNameDoesNotExist")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAttributeNameDoesNotExistErrorImpl.class)
public interface GraphQLAttributeNameDoesNotExistError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAttributeNameDoesNotExistError
     */
    String ATTRIBUTE_NAME_DOES_NOT_EXIST = "AttributeNameDoesNotExist";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Non-existent Attribute name.</p>
     * @return invalidAttributeName
     */
    @NotNull
    @JsonProperty("invalidAttributeName")
    public String getInvalidAttributeName();

    /**
     *  <p>Non-existent Attribute name.</p>
     * @param invalidAttributeName value to be set
     */

    public void setInvalidAttributeName(final String invalidAttributeName);

    /**
     * factory method
     * @return instance of GraphQLAttributeNameDoesNotExistError
     */
    public static GraphQLAttributeNameDoesNotExistError of() {
        return new GraphQLAttributeNameDoesNotExistErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAttributeNameDoesNotExistError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAttributeNameDoesNotExistError of(final GraphQLAttributeNameDoesNotExistError template) {
        GraphQLAttributeNameDoesNotExistErrorImpl instance = new GraphQLAttributeNameDoesNotExistErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setInvalidAttributeName(template.getInvalidAttributeName());
        return instance;
    }

    public GraphQLAttributeNameDoesNotExistError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAttributeNameDoesNotExistError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAttributeNameDoesNotExistError deepCopy(
            @Nullable final GraphQLAttributeNameDoesNotExistError template) {
        if (template == null) {
            return null;
        }
        GraphQLAttributeNameDoesNotExistErrorImpl instance = new GraphQLAttributeNameDoesNotExistErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setInvalidAttributeName(template.getInvalidAttributeName());
        return instance;
    }

    /**
     * builder factory method for GraphQLAttributeNameDoesNotExistError
     * @return builder
     */
    public static GraphQLAttributeNameDoesNotExistErrorBuilder builder() {
        return GraphQLAttributeNameDoesNotExistErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAttributeNameDoesNotExistError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAttributeNameDoesNotExistErrorBuilder builder(
            final GraphQLAttributeNameDoesNotExistError template) {
        return GraphQLAttributeNameDoesNotExistErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAttributeNameDoesNotExistError(Function<GraphQLAttributeNameDoesNotExistError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLAttributeNameDoesNotExistError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLAttributeNameDoesNotExistError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAttributeNameDoesNotExistError>";
            }
        };
    }
}
