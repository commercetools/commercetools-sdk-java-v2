
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Attribute type for plain enum values. Useful for predefined language-agnostic values selectable in drop downs when only one value should be selected. Use <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of AttributeEnumType instead if multiple values can be selected from the list.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeEnumType attributeEnumType = AttributeEnumType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("enum")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeEnumTypeImpl.class)
public interface AttributeEnumType extends AttributeType {

    /**
     * discriminator value for AttributeEnumType
     */
    String ENUM = "enum";

    /**
     *  <p>Available values that can be assigned to Products.</p>
     * @return values
     */
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<AttributePlainEnumValue> getValues();

    /**
     *  <p>Available values that can be assigned to Products.</p>
     * @param values values to be set
     */

    @JsonIgnore
    public void setValues(final AttributePlainEnumValue... values);

    /**
     *  <p>Available values that can be assigned to Products.</p>
     * @param values values to be set
     */

    public void setValues(final List<AttributePlainEnumValue> values);

    /**
     * factory method
     * @return instance of AttributeEnumType
     */
    public static AttributeEnumType of() {
        return new AttributeEnumTypeImpl();
    }

    /**
     * factory method to create a shallow copy AttributeEnumType
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeEnumType of(final AttributeEnumType template) {
        AttributeEnumTypeImpl instance = new AttributeEnumTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    public AttributeEnumType copyDeep();

    /**
     * factory method to create a deep copy of AttributeEnumType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeEnumType deepCopy(@Nullable final AttributeEnumType template) {
        if (template == null) {
            return null;
        }
        AttributeEnumTypeImpl instance = new AttributeEnumTypeImpl();
        instance.setValues(Optional.ofNullable(template.getValues())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_type.AttributePlainEnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for AttributeEnumType
     * @return builder
     */
    public static AttributeEnumTypeBuilder builder() {
        return AttributeEnumTypeBuilder.of();
    }

    /**
     * create builder for AttributeEnumType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeEnumTypeBuilder builder(final AttributeEnumType template) {
        return AttributeEnumTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeEnumType(Function<AttributeEnumType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeEnumType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeEnumType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeEnumType>";
            }
        };
    }
}
