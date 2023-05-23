
package com.commercetools.importapi.models.types;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * FieldType
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
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.types.CustomFieldBooleanTypeImpl.class, name = CustomFieldBooleanType.BOOLEAN),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.types.CustomFieldDateTimeTypeImpl.class, name = CustomFieldDateTimeType.DATE_TIME),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.types.CustomFieldDateTypeImpl.class, name = CustomFieldDateType.DATE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.types.CustomFieldEnumTypeImpl.class, name = CustomFieldEnumType.ENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.types.CustomFieldLocalizedEnumTypeImpl.class, name = CustomFieldLocalizedEnumType.LOCALIZED_ENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.types.CustomFieldLocalizedStringTypeImpl.class, name = CustomFieldLocalizedStringType.LOCALIZED_STRING),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.types.CustomFieldMoneyTypeImpl.class, name = CustomFieldMoneyType.MONEY),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.types.CustomFieldNumberTypeImpl.class, name = CustomFieldNumberType.NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.types.CustomFieldReferenceTypeImpl.class, name = CustomFieldReferenceType.REFERENCE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.types.CustomFieldSetTypeImpl.class, name = CustomFieldSetType.SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.types.CustomFieldStringTypeImpl.class, name = CustomFieldStringType.STRING),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.types.CustomFieldTimeTypeImpl.class, name = CustomFieldTimeType.TIME) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "name", defaultImpl = FieldTypeImpl.class, visible = true)
@JsonDeserialize(as = FieldTypeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface FieldType {

    /**
     *
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

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
        if (template instanceof com.commercetools.importapi.models.types.CustomFieldBooleanType) {
            return com.commercetools.importapi.models.types.CustomFieldBooleanType
                    .deepCopy((com.commercetools.importapi.models.types.CustomFieldBooleanType) template);
        }
        if (template instanceof com.commercetools.importapi.models.types.CustomFieldDateTimeType) {
            return com.commercetools.importapi.models.types.CustomFieldDateTimeType
                    .deepCopy((com.commercetools.importapi.models.types.CustomFieldDateTimeType) template);
        }
        if (template instanceof com.commercetools.importapi.models.types.CustomFieldDateType) {
            return com.commercetools.importapi.models.types.CustomFieldDateType
                    .deepCopy((com.commercetools.importapi.models.types.CustomFieldDateType) template);
        }
        if (template instanceof com.commercetools.importapi.models.types.CustomFieldEnumType) {
            return com.commercetools.importapi.models.types.CustomFieldEnumType
                    .deepCopy((com.commercetools.importapi.models.types.CustomFieldEnumType) template);
        }
        if (template instanceof com.commercetools.importapi.models.types.CustomFieldLocalizedEnumType) {
            return com.commercetools.importapi.models.types.CustomFieldLocalizedEnumType
                    .deepCopy((com.commercetools.importapi.models.types.CustomFieldLocalizedEnumType) template);
        }
        if (template instanceof com.commercetools.importapi.models.types.CustomFieldLocalizedStringType) {
            return com.commercetools.importapi.models.types.CustomFieldLocalizedStringType
                    .deepCopy((com.commercetools.importapi.models.types.CustomFieldLocalizedStringType) template);
        }
        if (template instanceof com.commercetools.importapi.models.types.CustomFieldMoneyType) {
            return com.commercetools.importapi.models.types.CustomFieldMoneyType
                    .deepCopy((com.commercetools.importapi.models.types.CustomFieldMoneyType) template);
        }
        if (template instanceof com.commercetools.importapi.models.types.CustomFieldNumberType) {
            return com.commercetools.importapi.models.types.CustomFieldNumberType
                    .deepCopy((com.commercetools.importapi.models.types.CustomFieldNumberType) template);
        }
        if (template instanceof com.commercetools.importapi.models.types.CustomFieldReferenceType) {
            return com.commercetools.importapi.models.types.CustomFieldReferenceType
                    .deepCopy((com.commercetools.importapi.models.types.CustomFieldReferenceType) template);
        }
        if (template instanceof com.commercetools.importapi.models.types.CustomFieldSetType) {
            return com.commercetools.importapi.models.types.CustomFieldSetType
                    .deepCopy((com.commercetools.importapi.models.types.CustomFieldSetType) template);
        }
        if (template instanceof com.commercetools.importapi.models.types.CustomFieldStringType) {
            return com.commercetools.importapi.models.types.CustomFieldStringType
                    .deepCopy((com.commercetools.importapi.models.types.CustomFieldStringType) template);
        }
        if (template instanceof com.commercetools.importapi.models.types.CustomFieldTimeType) {
            return com.commercetools.importapi.models.types.CustomFieldTimeType
                    .deepCopy((com.commercetools.importapi.models.types.CustomFieldTimeType) template);
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
