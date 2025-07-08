
package com.commercetools.importapi.models.types;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Defines the data type of a Custom Field. Maps to <code>Type.FieldDefinition.type</code>. The <code>discriminator</code> is used to determine the type of the field.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldType fieldType = FieldType.booleanBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "name", defaultImpl = FieldTypeImpl.class, visible = true)
@JsonDeserialize(as = FieldTypeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface FieldType {

    /**
     *  <p>Name of the field type. Must be unique for a given ResourceTypeId. In case there is a FieldDefinition with the same <code>name</code> in another Type, both FieldDefinitions must have the same <code>type</code>. This value cannot be changed after the Type is imported.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    public FieldType copyDeep();

    /**
     * factory method to create a deep copy of FieldType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static FieldType deepCopy(@Nullable final FieldType template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof FieldTypeImpl)) {
            return template.copyDeep();
        }
        FieldTypeImpl instance = new FieldTypeImpl();
        return instance;
    }

    /**
     * builder for boolean subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.types.CustomFieldBooleanTypeBuilder booleanBuilder() {
        return com.commercetools.importapi.models.types.CustomFieldBooleanTypeBuilder.of();
    }

    /**
     * builder for dateTime subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.types.CustomFieldDateTimeTypeBuilder dateTimeBuilder() {
        return com.commercetools.importapi.models.types.CustomFieldDateTimeTypeBuilder.of();
    }

    /**
     * builder for date subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.types.CustomFieldDateTypeBuilder dateBuilder() {
        return com.commercetools.importapi.models.types.CustomFieldDateTypeBuilder.of();
    }

    /**
     * builder for enum subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.types.CustomFieldEnumTypeBuilder enumBuilder() {
        return com.commercetools.importapi.models.types.CustomFieldEnumTypeBuilder.of();
    }

    /**
     * builder for localizedEnum subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.types.CustomFieldLocalizedEnumTypeBuilder localizedEnumBuilder() {
        return com.commercetools.importapi.models.types.CustomFieldLocalizedEnumTypeBuilder.of();
    }

    /**
     * builder for localizedString subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.types.CustomFieldLocalizedStringTypeBuilder localizedStringBuilder() {
        return com.commercetools.importapi.models.types.CustomFieldLocalizedStringTypeBuilder.of();
    }

    /**
     * builder for money subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.types.CustomFieldMoneyTypeBuilder moneyBuilder() {
        return com.commercetools.importapi.models.types.CustomFieldMoneyTypeBuilder.of();
    }

    /**
     * builder for number subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.types.CustomFieldNumberTypeBuilder numberBuilder() {
        return com.commercetools.importapi.models.types.CustomFieldNumberTypeBuilder.of();
    }

    /**
     * builder for reference subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.types.CustomFieldReferenceTypeBuilder referenceBuilder() {
        return com.commercetools.importapi.models.types.CustomFieldReferenceTypeBuilder.of();
    }

    /**
     * builder for set subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.types.CustomFieldSetTypeBuilder setBuilder() {
        return com.commercetools.importapi.models.types.CustomFieldSetTypeBuilder.of();
    }

    /**
     * builder for string subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.types.CustomFieldStringTypeBuilder stringBuilder() {
        return com.commercetools.importapi.models.types.CustomFieldStringTypeBuilder.of();
    }

    /**
     * builder for time subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.types.CustomFieldTimeTypeBuilder timeBuilder() {
        return com.commercetools.importapi.models.types.CustomFieldTimeTypeBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withFieldType(Function<FieldType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<FieldType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FieldType>() {
            @Override
            public String toString() {
                return "TypeReference<FieldType>";
            }
        };
    }
}
