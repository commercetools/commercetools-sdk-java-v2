
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldBooleanTypeImpl.class, name = CustomFieldBooleanType.BOOLEAN),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldDateTimeTypeImpl.class, name = CustomFieldDateTimeType.DATE_TIME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldDateTypeImpl.class, name = CustomFieldDateType.DATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldEnumTypeImpl.class, name = CustomFieldEnumType.ENUM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldLocalizedEnumTypeImpl.class, name = CustomFieldLocalizedEnumType.LOCALIZED_ENUM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldLocalizedStringTypeImpl.class, name = CustomFieldLocalizedStringType.LOCALIZED_STRING),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldMoneyTypeImpl.class, name = CustomFieldMoneyType.MONEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldNumberTypeImpl.class, name = CustomFieldNumberType.NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldReferenceTypeImpl.class, name = CustomFieldReferenceType.REFERENCE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldSetTypeImpl.class, name = CustomFieldSetType.SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldStringTypeImpl.class, name = CustomFieldStringType.STRING),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldTimeTypeImpl.class, name = CustomFieldTimeType.TIME) })
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
        if (template instanceof com.commercetools.api.models.type.CustomFieldBooleanType) {
            return com.commercetools.api.models.type.CustomFieldBooleanType
                    .deepCopy((com.commercetools.api.models.type.CustomFieldBooleanType) template);
        }
        if (template instanceof com.commercetools.api.models.type.CustomFieldDateTimeType) {
            return com.commercetools.api.models.type.CustomFieldDateTimeType
                    .deepCopy((com.commercetools.api.models.type.CustomFieldDateTimeType) template);
        }
        if (template instanceof com.commercetools.api.models.type.CustomFieldDateType) {
            return com.commercetools.api.models.type.CustomFieldDateType
                    .deepCopy((com.commercetools.api.models.type.CustomFieldDateType) template);
        }
        if (template instanceof com.commercetools.api.models.type.CustomFieldEnumType) {
            return com.commercetools.api.models.type.CustomFieldEnumType
                    .deepCopy((com.commercetools.api.models.type.CustomFieldEnumType) template);
        }
        if (template instanceof com.commercetools.api.models.type.CustomFieldLocalizedEnumType) {
            return com.commercetools.api.models.type.CustomFieldLocalizedEnumType
                    .deepCopy((com.commercetools.api.models.type.CustomFieldLocalizedEnumType) template);
        }
        if (template instanceof com.commercetools.api.models.type.CustomFieldLocalizedStringType) {
            return com.commercetools.api.models.type.CustomFieldLocalizedStringType
                    .deepCopy((com.commercetools.api.models.type.CustomFieldLocalizedStringType) template);
        }
        if (template instanceof com.commercetools.api.models.type.CustomFieldMoneyType) {
            return com.commercetools.api.models.type.CustomFieldMoneyType
                    .deepCopy((com.commercetools.api.models.type.CustomFieldMoneyType) template);
        }
        if (template instanceof com.commercetools.api.models.type.CustomFieldNumberType) {
            return com.commercetools.api.models.type.CustomFieldNumberType
                    .deepCopy((com.commercetools.api.models.type.CustomFieldNumberType) template);
        }
        if (template instanceof com.commercetools.api.models.type.CustomFieldReferenceType) {
            return com.commercetools.api.models.type.CustomFieldReferenceType
                    .deepCopy((com.commercetools.api.models.type.CustomFieldReferenceType) template);
        }
        if (template instanceof com.commercetools.api.models.type.CustomFieldSetType) {
            return com.commercetools.api.models.type.CustomFieldSetType
                    .deepCopy((com.commercetools.api.models.type.CustomFieldSetType) template);
        }
        if (template instanceof com.commercetools.api.models.type.CustomFieldStringType) {
            return com.commercetools.api.models.type.CustomFieldStringType
                    .deepCopy((com.commercetools.api.models.type.CustomFieldStringType) template);
        }
        if (template instanceof com.commercetools.api.models.type.CustomFieldTimeType) {
            return com.commercetools.api.models.type.CustomFieldTimeType
                    .deepCopy((com.commercetools.api.models.type.CustomFieldTimeType) template);
        }
        FieldTypeImpl instance = new FieldTypeImpl();
        return instance;
    }

    /**
     * builder for boolean subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.CustomFieldBooleanTypeBuilder booleanBuilder() {
        return com.commercetools.api.models.type.CustomFieldBooleanTypeBuilder.of();
    }

    /**
     * builder for dateTime subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.CustomFieldDateTimeTypeBuilder dateTimeBuilder() {
        return com.commercetools.api.models.type.CustomFieldDateTimeTypeBuilder.of();
    }

    /**
     * builder for date subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.CustomFieldDateTypeBuilder dateBuilder() {
        return com.commercetools.api.models.type.CustomFieldDateTypeBuilder.of();
    }

    /**
     * builder for enum subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.CustomFieldEnumTypeBuilder enumBuilder() {
        return com.commercetools.api.models.type.CustomFieldEnumTypeBuilder.of();
    }

    /**
     * builder for localizedEnum subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.CustomFieldLocalizedEnumTypeBuilder localizedEnumBuilder() {
        return com.commercetools.api.models.type.CustomFieldLocalizedEnumTypeBuilder.of();
    }

    /**
     * builder for localizedString subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.CustomFieldLocalizedStringTypeBuilder localizedStringBuilder() {
        return com.commercetools.api.models.type.CustomFieldLocalizedStringTypeBuilder.of();
    }

    /**
     * builder for money subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.CustomFieldMoneyTypeBuilder moneyBuilder() {
        return com.commercetools.api.models.type.CustomFieldMoneyTypeBuilder.of();
    }

    /**
     * builder for number subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.CustomFieldNumberTypeBuilder numberBuilder() {
        return com.commercetools.api.models.type.CustomFieldNumberTypeBuilder.of();
    }

    /**
     * builder for reference subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.CustomFieldReferenceTypeBuilder referenceBuilder() {
        return com.commercetools.api.models.type.CustomFieldReferenceTypeBuilder.of();
    }

    /**
     * builder for set subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.CustomFieldSetTypeBuilder setBuilder() {
        return com.commercetools.api.models.type.CustomFieldSetTypeBuilder.of();
    }

    /**
     * builder for string subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.CustomFieldStringTypeBuilder stringBuilder() {
        return com.commercetools.api.models.type.CustomFieldStringTypeBuilder.of();
    }

    /**
     * builder for time subtype
     * @return builder
     */
    public static com.commercetools.api.models.type.CustomFieldTimeTypeBuilder timeBuilder() {
        return com.commercetools.api.models.type.CustomFieldTimeTypeBuilder.of();
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
