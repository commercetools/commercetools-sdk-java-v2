
package com.commercetools.api.models.type;

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
 *  <p>Field type for enum values.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldEnumType customFieldEnumType = CustomFieldEnumType.builder()
 *             .plusValues(valuesBuilder -> valuesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomFieldEnumTypeImpl.class)
public interface CustomFieldEnumType extends FieldType {

    /**
     * discriminator value for CustomFieldEnumType
     */
    String ENUM = "Enum";

    /**
     *  <p>Allowed values.</p>
     * @return values
     */
    @NotNull
    @Valid
    @JsonProperty("values")
    public List<CustomFieldEnumValue> getValues();

    /**
     *  <p>Allowed values.</p>
     * @param values values to be set
     */

    @JsonIgnore
    public void setValues(final CustomFieldEnumValue... values);

    /**
     *  <p>Allowed values.</p>
     * @param values values to be set
     */

    public void setValues(final List<CustomFieldEnumValue> values);

    /**
     * factory method
     * @return instance of CustomFieldEnumType
     */
    public static CustomFieldEnumType of() {
        return new CustomFieldEnumTypeImpl();
    }

    /**
     * factory method to create a shallow copy CustomFieldEnumType
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomFieldEnumType of(final CustomFieldEnumType template) {
        CustomFieldEnumTypeImpl instance = new CustomFieldEnumTypeImpl();
        instance.setValues(template.getValues());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomFieldEnumType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomFieldEnumType deepCopy(@Nullable final CustomFieldEnumType template) {
        if (template == null) {
            return null;
        }
        CustomFieldEnumTypeImpl instance = new CustomFieldEnumTypeImpl();
        instance.setValues(Optional.ofNullable(template.getValues())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.type.CustomFieldEnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomFieldEnumType
     * @return builder
     */
    public static CustomFieldEnumTypeBuilder builder() {
        return CustomFieldEnumTypeBuilder.of();
    }

    /**
     * create builder for CustomFieldEnumType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldEnumTypeBuilder builder(final CustomFieldEnumType template) {
        return CustomFieldEnumTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomFieldEnumType(Function<CustomFieldEnumType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomFieldEnumType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomFieldEnumType>() {
            @Override
            public String toString() {
                return "TypeReference<CustomFieldEnumType>";
            }
        };
    }
}
