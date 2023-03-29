
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeLocalizedEnumType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeLocalizedEnumType attributeLocalizedEnumType = AttributeLocalizedEnumType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeLocalizedEnumTypeImpl.class)
public interface AttributeLocalizedEnumType extends AttributeType {

    /**
     * discriminator value for AttributeLocalizedEnumType
     */
    String LENUM = "lenum";

    /**
     *
     * @return values
     */
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<AttributeLocalizedEnumValue> getValues();

    /**
     * set values
     * @param values values to be set
     */

    @JsonIgnore
    public void setValues(final AttributeLocalizedEnumValue... values);

    /**
     * set values
     * @param values values to be set
     */

    public void setValues(final List<AttributeLocalizedEnumValue> values);

    /**
     * factory method
     * @return instance of AttributeLocalizedEnumType
     */
    public static AttributeLocalizedEnumType of() {
        return new AttributeLocalizedEnumTypeImpl();
    }

    /**
     * factory method to create a shallow copy AttributeLocalizedEnumType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeLocalizedEnumType of(final AttributeLocalizedEnumType template) {
        AttributeLocalizedEnumTypeImpl instance = new AttributeLocalizedEnumTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeLocalizedEnumType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeLocalizedEnumType deepCopy(@Nullable final AttributeLocalizedEnumType template) {
        if (template == null) {
            return null;
        }
        AttributeLocalizedEnumTypeImpl instance = new AttributeLocalizedEnumTypeImpl();
        instance.setValues(Optional.ofNullable(template.getValues())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for AttributeLocalizedEnumType
     * @return builder
     */
    public static AttributeLocalizedEnumTypeBuilder builder() {
        return AttributeLocalizedEnumTypeBuilder.of();
    }

    /**
     * create builder for AttributeLocalizedEnumType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeLocalizedEnumTypeBuilder builder(final AttributeLocalizedEnumType template) {
        return AttributeLocalizedEnumTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeLocalizedEnumType(Function<AttributeLocalizedEnumType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeLocalizedEnumType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeLocalizedEnumType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeLocalizedEnumType>";
            }
        };
    }
}
