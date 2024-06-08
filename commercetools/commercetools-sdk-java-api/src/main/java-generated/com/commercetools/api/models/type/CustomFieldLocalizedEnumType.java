
package com.commercetools.api.models.type;

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
 *  <p>Field type for localized enum values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldLocalizedEnumType customFieldLocalizedEnumType = CustomFieldLocalizedEnumType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldLocalizedEnumTypeImpl.class)
public interface CustomFieldLocalizedEnumType extends FieldType {

    /**
     * discriminator value for CustomFieldLocalizedEnumType
     */
    String LOCALIZED_ENUM = "LocalizedEnum";

    /**
     *  <p>Allowed values.</p>
     * @return values
     */
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<CustomFieldLocalizedEnumValue> getValues();

    /**
     *  <p>Allowed values.</p>
     * @param values values to be set
     */

    @JsonIgnore
    public void setValues(final CustomFieldLocalizedEnumValue... values);

    /**
     *  <p>Allowed values.</p>
     * @param values values to be set
     */

    public void setValues(final List<CustomFieldLocalizedEnumValue> values);

    /**
     * factory method
     * @return instance of CustomFieldLocalizedEnumType
     */
    public static CustomFieldLocalizedEnumType of() {
        return new CustomFieldLocalizedEnumTypeImpl();
    }

    /**
     * factory method to create a shallow copy CustomFieldLocalizedEnumType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldLocalizedEnumType of(final CustomFieldLocalizedEnumType template) {
        CustomFieldLocalizedEnumTypeImpl instance = new CustomFieldLocalizedEnumTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomFieldLocalizedEnumType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldLocalizedEnumType deepCopy(@Nullable final CustomFieldLocalizedEnumType template) {
        if (template == null) {
            return null;
        }
        CustomFieldLocalizedEnumTypeImpl instance = new CustomFieldLocalizedEnumTypeImpl();
        instance.setValues(Optional.ofNullable(template.getValues())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.type.CustomFieldLocalizedEnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomFieldLocalizedEnumType
     * @return builder
     */
    public static CustomFieldLocalizedEnumTypeBuilder builder() {
        return CustomFieldLocalizedEnumTypeBuilder.of();
    }

    /**
     * create builder for CustomFieldLocalizedEnumType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldLocalizedEnumTypeBuilder builder(final CustomFieldLocalizedEnumType template) {
        return CustomFieldLocalizedEnumTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldLocalizedEnumType(Function<CustomFieldLocalizedEnumType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldLocalizedEnumType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldLocalizedEnumType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldLocalizedEnumType>";
            }
        };
    }
}
