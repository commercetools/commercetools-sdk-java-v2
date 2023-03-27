
package com.commercetools.importapi.models.producttypes;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeType
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeType attributeType = AttributeType.booleanBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeBooleanTypeImpl.class, name = AttributeBooleanType.BOOLEAN),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeDateTimeTypeImpl.class, name = AttributeDateTimeType.DATETIME),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeDateTypeImpl.class, name = AttributeDateType.DATE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeEnumTypeImpl.class, name = AttributeEnumType.ENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeLocalizableTextTypeImpl.class, name = AttributeLocalizableTextType.LTEXT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumTypeImpl.class, name = AttributeLocalizedEnumType.LENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeMoneyTypeImpl.class, name = AttributeMoneyType.MONEY),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeNestedTypeImpl.class, name = AttributeNestedType.NESTED),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeNumberTypeImpl.class, name = AttributeNumberType.NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeReferenceTypeImpl.class, name = AttributeReferenceType.REFERENCE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeSetTypeImpl.class, name = AttributeSetType.SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeTextTypeImpl.class, name = AttributeTextType.TEXT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.producttypes.AttributeTimeTypeImpl.class, name = AttributeTimeType.TIME) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "name", defaultImpl = AttributeTypeImpl.class, visible = true)
@JsonDeserialize(as = AttributeTypeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AttributeType {

    /**
     *
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     * builder for boolean subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeBooleanTypeBuilder booleanBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeBooleanTypeBuilder.of();
    }

    /**
     * builder for datetime subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeDateTimeTypeBuilder datetimeBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeDateTimeTypeBuilder.of();
    }

    /**
     * builder for date subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeDateTypeBuilder dateBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeDateTypeBuilder.of();
    }

    /**
     * builder for enum subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeEnumTypeBuilder enumBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeEnumTypeBuilder.of();
    }

    /**
     * builder for ltext subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeLocalizableTextTypeBuilder ltextBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeLocalizableTextTypeBuilder.of();
    }

    /**
     * builder for lenum subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumTypeBuilder lenumBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeLocalizedEnumTypeBuilder.of();
    }

    /**
     * builder for money subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeMoneyTypeBuilder moneyBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeMoneyTypeBuilder.of();
    }

    /**
     * builder for nested subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeNestedTypeBuilder nestedBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeNestedTypeBuilder.of();
    }

    /**
     * builder for number subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeNumberTypeBuilder numberBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeNumberTypeBuilder.of();
    }

    /**
     * builder for reference subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeReferenceTypeBuilder referenceBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeReferenceTypeBuilder.of();
    }

    /**
     * builder for set subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeSetTypeBuilder setBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeSetTypeBuilder.of();
    }

    /**
     * builder for text subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeTextTypeBuilder textBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeTextTypeBuilder.of();
    }

    /**
     * builder for time subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.producttypes.AttributeTimeTypeBuilder timeBuilder() {
        return com.commercetools.importapi.models.producttypes.AttributeTimeTypeBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeType(Function<AttributeType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeType>";
            }
        };
    }
}
