
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
 *  <p>Returned when an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">AttributeEnumType</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumType" rel="nofollow">AttributeLocalizedEnumType</a> contains duplicate keys.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateEnumValuesError graphQLDuplicateEnumValuesError = GraphQLDuplicateEnumValuesError.builder()
 *             .plusDuplicates(duplicatesBuilder -> duplicatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DuplicateEnumValues")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLDuplicateEnumValuesErrorImpl.class)
public interface GraphQLDuplicateEnumValuesError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLDuplicateEnumValuesError
     */
    String DUPLICATE_ENUM_VALUES = "DuplicateEnumValues";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Duplicate keys.</p>
     * @return duplicates
     */
    @NotNull
    @JsonProperty("duplicates")
    public List<String> getDuplicates();

    /**
     *  <p>Duplicate keys.</p>
     * @param duplicates values to be set
     */

    @JsonIgnore
    public void setDuplicates(final String... duplicates);

    /**
     *  <p>Duplicate keys.</p>
     * @param duplicates values to be set
     */

    public void setDuplicates(final List<String> duplicates);

    /**
     * factory method
     * @return instance of GraphQLDuplicateEnumValuesError
     */
    public static GraphQLDuplicateEnumValuesError of() {
        return new GraphQLDuplicateEnumValuesErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLDuplicateEnumValuesError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLDuplicateEnumValuesError of(final GraphQLDuplicateEnumValuesError template) {
        GraphQLDuplicateEnumValuesErrorImpl instance = new GraphQLDuplicateEnumValuesErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setDuplicates(template.getDuplicates());
        return instance;
    }

    public GraphQLDuplicateEnumValuesError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLDuplicateEnumValuesError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLDuplicateEnumValuesError deepCopy(@Nullable final GraphQLDuplicateEnumValuesError template) {
        if (template == null) {
            return null;
        }
        GraphQLDuplicateEnumValuesErrorImpl instance = new GraphQLDuplicateEnumValuesErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setDuplicates(Optional.ofNullable(template.getDuplicates()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for GraphQLDuplicateEnumValuesError
     * @return builder
     */
    public static GraphQLDuplicateEnumValuesErrorBuilder builder() {
        return GraphQLDuplicateEnumValuesErrorBuilder.of();
    }

    /**
     * create builder for GraphQLDuplicateEnumValuesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateEnumValuesErrorBuilder builder(final GraphQLDuplicateEnumValuesError template) {
        return GraphQLDuplicateEnumValuesErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLDuplicateEnumValuesError(Function<GraphQLDuplicateEnumValuesError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateEnumValuesError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateEnumValuesError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLDuplicateEnumValuesError>";
            }
        };
    }
}
