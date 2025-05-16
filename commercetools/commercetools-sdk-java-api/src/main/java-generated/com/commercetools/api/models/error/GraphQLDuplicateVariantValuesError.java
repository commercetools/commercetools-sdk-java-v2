
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a Product Variant value conflicts with an existing one during an Update Product request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateVariantValuesError graphQLDuplicateVariantValuesError = GraphQLDuplicateVariantValuesError.builder()
 *             .variantValues(variantValuesBuilder -> variantValuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DuplicateVariantValues")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLDuplicateVariantValuesErrorImpl.class)
public interface GraphQLDuplicateVariantValuesError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLDuplicateVariantValuesError
     */
    String DUPLICATE_VARIANT_VALUES = "DuplicateVariantValues";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Every Product Variant must have a distinct combination of SKU, prices, and custom Attribute values.</p>
     * @return variantValues
     */
    @NotNull
    @Valid
    @JsonProperty("variantValues")
    public VariantValues getVariantValues();

    /**
     *  <p>Every Product Variant must have a distinct combination of SKU, prices, and custom Attribute values.</p>
     * @param variantValues value to be set
     */

    public void setVariantValues(final VariantValues variantValues);

    /**
     * factory method
     * @return instance of GraphQLDuplicateVariantValuesError
     */
    public static GraphQLDuplicateVariantValuesError of() {
        return new GraphQLDuplicateVariantValuesErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLDuplicateVariantValuesError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLDuplicateVariantValuesError of(final GraphQLDuplicateVariantValuesError template) {
        GraphQLDuplicateVariantValuesErrorImpl instance = new GraphQLDuplicateVariantValuesErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setVariantValues(template.getVariantValues());
        return instance;
    }

    public GraphQLDuplicateVariantValuesError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLDuplicateVariantValuesError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLDuplicateVariantValuesError deepCopy(
            @Nullable final GraphQLDuplicateVariantValuesError template) {
        if (template == null) {
            return null;
        }
        GraphQLDuplicateVariantValuesErrorImpl instance = new GraphQLDuplicateVariantValuesErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setVariantValues(
            com.commercetools.api.models.error.VariantValues.deepCopy(template.getVariantValues()));
        return instance;
    }

    /**
     * builder factory method for GraphQLDuplicateVariantValuesError
     * @return builder
     */
    public static GraphQLDuplicateVariantValuesErrorBuilder builder() {
        return GraphQLDuplicateVariantValuesErrorBuilder.of();
    }

    /**
     * create builder for GraphQLDuplicateVariantValuesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateVariantValuesErrorBuilder builder(final GraphQLDuplicateVariantValuesError template) {
        return GraphQLDuplicateVariantValuesErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLDuplicateVariantValuesError(Function<GraphQLDuplicateVariantValuesError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateVariantValuesError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateVariantValuesError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLDuplicateVariantValuesError>";
            }
        };
    }
}
