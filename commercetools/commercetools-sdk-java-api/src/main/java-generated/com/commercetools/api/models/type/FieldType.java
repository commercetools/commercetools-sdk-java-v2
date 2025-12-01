
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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "name", defaultImpl = FieldTypeImpl.class, visible = true)
@JsonDeserialize(as = FieldTypeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface FieldType {

    /**
     *  <p>Discriminator that determines the type of the field.</p>
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
