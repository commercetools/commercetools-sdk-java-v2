
package com.commercetools.importapi.models.types;

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
 *  <p>Values of a SetType Custom Field are sets of values of the specified <code>elementType</code> (without duplicate elements).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldSetType customFieldSetType = CustomFieldSetType.builder()
 *             .elementType(elementTypeBuilder -> elementTypeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("Set")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldSetTypeImpl.class)
public interface CustomFieldSetType extends FieldType {

    /**
     * discriminator value for CustomFieldSetType
     */
    String SET = "Set";

    /**
     *  <p>Field type of the elements in the set.</p>
     * @return elementType
     */
    @NotNull
    @Valid
    @JsonProperty("elementType")
    public FieldType getElementType();

    /**
     *  <p>Field type of the elements in the set.</p>
     * @param elementType value to be set
     */

    public void setElementType(final FieldType elementType);

    /**
     * factory method
     * @return instance of CustomFieldSetType
     */
    public static CustomFieldSetType of() {
        return new CustomFieldSetTypeImpl();
    }

    /**
     * factory method to create a shallow copy CustomFieldSetType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldSetType of(final CustomFieldSetType template) {
        CustomFieldSetTypeImpl instance = new CustomFieldSetTypeImpl();
        instance.setElementType(template.getElementType());
        return instance;
    }

    public CustomFieldSetType copyDeep();

    /**
     * factory method to create a deep copy of CustomFieldSetType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldSetType deepCopy(@Nullable final CustomFieldSetType template) {
        if (template == null) {
            return null;
        }
        CustomFieldSetTypeImpl instance = new CustomFieldSetTypeImpl();
        instance.setElementType(com.commercetools.importapi.models.types.FieldType.deepCopy(template.getElementType()));
        return instance;
    }

    /**
     * builder factory method for CustomFieldSetType
     * @return builder
     */
    public static CustomFieldSetTypeBuilder builder() {
        return CustomFieldSetTypeBuilder.of();
    }

    /**
     * create builder for CustomFieldSetType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldSetTypeBuilder builder(final CustomFieldSetType template) {
        return CustomFieldSetTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldSetType(Function<CustomFieldSetType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldSetType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldSetType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldSetType>";
            }
        };
    }
}
