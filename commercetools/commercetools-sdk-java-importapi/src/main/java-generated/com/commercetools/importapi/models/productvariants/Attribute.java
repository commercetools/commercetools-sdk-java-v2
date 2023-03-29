
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This type represents the value of an attribute of a product variant. The name and type property must match the name and type property of an attribute definition of the product type.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Attribute attribute = Attribute.booleanBuilder()
 *             value(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.BooleanAttributeImpl.class, name = BooleanAttribute.BOOLEAN),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.BooleanSetAttributeImpl.class, name = BooleanSetAttribute.BOOLEAN_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.DateAttributeImpl.class, name = DateAttribute.DATE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.DateSetAttributeImpl.class, name = DateSetAttribute.DATE_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.DateTimeAttributeImpl.class, name = DateTimeAttribute.DATETIME),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.DateTimeSetAttributeImpl.class, name = DateTimeSetAttribute.DATETIME_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.EnumAttributeImpl.class, name = EnumAttribute.ENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.EnumSetAttributeImpl.class, name = EnumSetAttribute.ENUM_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.LocalizableEnumAttributeImpl.class, name = LocalizableEnumAttribute.LENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttributeImpl.class, name = LocalizableEnumSetAttribute.LENUM_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.LocalizableTextAttributeImpl.class, name = LocalizableTextAttribute.LTEXT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.LocalizableTextSetAttributeImpl.class, name = LocalizableTextSetAttribute.LTEXT_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.MoneyAttributeImpl.class, name = MoneyAttribute.MONEY),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.MoneySetAttributeImpl.class, name = MoneySetAttribute.MONEY_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.NumberAttributeImpl.class, name = NumberAttribute.NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.NumberSetAttributeImpl.class, name = NumberSetAttribute.NUMBER_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.ReferenceAttributeImpl.class, name = ReferenceAttribute.REFERENCE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.ReferenceSetAttributeImpl.class, name = ReferenceSetAttribute.REFERENCE_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.TextAttributeImpl.class, name = TextAttribute.TEXT),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.TextSetAttributeImpl.class, name = TextSetAttribute.TEXT_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.TimeAttributeImpl.class, name = TimeAttribute.TIME),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.TimeSetAttributeImpl.class, name = TimeSetAttribute.TIME_SET) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = AttributeImpl.class, visible = true)
@JsonDeserialize(as = AttributeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Attribute {

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @return name
     */

    @JsonProperty("name")
    public String getName();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method to create a deep copy of Attribute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Attribute deepCopy(@Nullable final Attribute template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.BooleanAttribute) {
            return com.commercetools.importapi.models.productvariants.BooleanAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.BooleanAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.BooleanSetAttribute) {
            return com.commercetools.importapi.models.productvariants.BooleanSetAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.BooleanSetAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.DateAttribute) {
            return com.commercetools.importapi.models.productvariants.DateAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.DateAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.DateSetAttribute) {
            return com.commercetools.importapi.models.productvariants.DateSetAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.DateSetAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.DateTimeAttribute) {
            return com.commercetools.importapi.models.productvariants.DateTimeAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.DateTimeAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.DateTimeSetAttribute) {
            return com.commercetools.importapi.models.productvariants.DateTimeSetAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.DateTimeSetAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.EnumAttribute) {
            return com.commercetools.importapi.models.productvariants.EnumAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.EnumAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.EnumSetAttribute) {
            return com.commercetools.importapi.models.productvariants.EnumSetAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.EnumSetAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.LocalizableEnumAttribute) {
            return com.commercetools.importapi.models.productvariants.LocalizableEnumAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.LocalizableEnumAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttribute) {
            return com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttribute.deepCopy(
                (com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.LocalizableTextAttribute) {
            return com.commercetools.importapi.models.productvariants.LocalizableTextAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.LocalizableTextAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.LocalizableTextSetAttribute) {
            return com.commercetools.importapi.models.productvariants.LocalizableTextSetAttribute.deepCopy(
                (com.commercetools.importapi.models.productvariants.LocalizableTextSetAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.MoneyAttribute) {
            return com.commercetools.importapi.models.productvariants.MoneyAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.MoneyAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.MoneySetAttribute) {
            return com.commercetools.importapi.models.productvariants.MoneySetAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.MoneySetAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.NumberAttribute) {
            return com.commercetools.importapi.models.productvariants.NumberAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.NumberAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.NumberSetAttribute) {
            return com.commercetools.importapi.models.productvariants.NumberSetAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.NumberSetAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.ReferenceAttribute) {
            return com.commercetools.importapi.models.productvariants.ReferenceAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.ReferenceAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.ReferenceSetAttribute) {
            return com.commercetools.importapi.models.productvariants.ReferenceSetAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.ReferenceSetAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.TextAttribute) {
            return com.commercetools.importapi.models.productvariants.TextAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.TextAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.TextSetAttribute) {
            return com.commercetools.importapi.models.productvariants.TextSetAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.TextSetAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.TimeAttribute) {
            return com.commercetools.importapi.models.productvariants.TimeAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.TimeAttribute) template);
        }
        if (template instanceof com.commercetools.importapi.models.productvariants.TimeSetAttribute) {
            return com.commercetools.importapi.models.productvariants.TimeSetAttribute
                    .deepCopy((com.commercetools.importapi.models.productvariants.TimeSetAttribute) template);
        }
        AttributeImpl instance = new AttributeImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder for boolean subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.BooleanAttributeBuilder booleanBuilder() {
        return com.commercetools.importapi.models.productvariants.BooleanAttributeBuilder.of();
    }

    /**
     * builder for booleanSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.BooleanSetAttributeBuilder booleanSetBuilder() {
        return com.commercetools.importapi.models.productvariants.BooleanSetAttributeBuilder.of();
    }

    /**
     * builder for date subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.DateAttributeBuilder dateBuilder() {
        return com.commercetools.importapi.models.productvariants.DateAttributeBuilder.of();
    }

    /**
     * builder for dateSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.DateSetAttributeBuilder dateSetBuilder() {
        return com.commercetools.importapi.models.productvariants.DateSetAttributeBuilder.of();
    }

    /**
     * builder for datetime subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.DateTimeAttributeBuilder datetimeBuilder() {
        return com.commercetools.importapi.models.productvariants.DateTimeAttributeBuilder.of();
    }

    /**
     * builder for datetimeSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.DateTimeSetAttributeBuilder datetimeSetBuilder() {
        return com.commercetools.importapi.models.productvariants.DateTimeSetAttributeBuilder.of();
    }

    /**
     * builder for enum subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.EnumAttributeBuilder enumBuilder() {
        return com.commercetools.importapi.models.productvariants.EnumAttributeBuilder.of();
    }

    /**
     * builder for enumSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.EnumSetAttributeBuilder enumSetBuilder() {
        return com.commercetools.importapi.models.productvariants.EnumSetAttributeBuilder.of();
    }

    /**
     * builder for lenum subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.LocalizableEnumAttributeBuilder lenumBuilder() {
        return com.commercetools.importapi.models.productvariants.LocalizableEnumAttributeBuilder.of();
    }

    /**
     * builder for lenumSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttributeBuilder lenumSetBuilder() {
        return com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttributeBuilder.of();
    }

    /**
     * builder for ltext subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.LocalizableTextAttributeBuilder ltextBuilder() {
        return com.commercetools.importapi.models.productvariants.LocalizableTextAttributeBuilder.of();
    }

    /**
     * builder for ltextSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.LocalizableTextSetAttributeBuilder ltextSetBuilder() {
        return com.commercetools.importapi.models.productvariants.LocalizableTextSetAttributeBuilder.of();
    }

    /**
     * builder for money subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.MoneyAttributeBuilder moneyBuilder() {
        return com.commercetools.importapi.models.productvariants.MoneyAttributeBuilder.of();
    }

    /**
     * builder for moneySet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.MoneySetAttributeBuilder moneySetBuilder() {
        return com.commercetools.importapi.models.productvariants.MoneySetAttributeBuilder.of();
    }

    /**
     * builder for number subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.NumberAttributeBuilder numberBuilder() {
        return com.commercetools.importapi.models.productvariants.NumberAttributeBuilder.of();
    }

    /**
     * builder for numberSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.NumberSetAttributeBuilder numberSetBuilder() {
        return com.commercetools.importapi.models.productvariants.NumberSetAttributeBuilder.of();
    }

    /**
     * builder for reference subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.ReferenceAttributeBuilder referenceBuilder() {
        return com.commercetools.importapi.models.productvariants.ReferenceAttributeBuilder.of();
    }

    /**
     * builder for referenceSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.ReferenceSetAttributeBuilder referenceSetBuilder() {
        return com.commercetools.importapi.models.productvariants.ReferenceSetAttributeBuilder.of();
    }

    /**
     * builder for text subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.TextAttributeBuilder textBuilder() {
        return com.commercetools.importapi.models.productvariants.TextAttributeBuilder.of();
    }

    /**
     * builder for textSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.TextSetAttributeBuilder textSetBuilder() {
        return com.commercetools.importapi.models.productvariants.TextSetAttributeBuilder.of();
    }

    /**
     * builder for time subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.TimeAttributeBuilder timeBuilder() {
        return com.commercetools.importapi.models.productvariants.TimeAttributeBuilder.of();
    }

    /**
     * builder for timeSet subtype
     * @return builder
     */
    public static com.commercetools.importapi.models.productvariants.TimeSetAttributeBuilder timeSetBuilder() {
        return com.commercetools.importapi.models.productvariants.TimeSetAttributeBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttribute(Function<Attribute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Attribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Attribute>() {
            @Override
            public String toString() {
                return "TypeReference<Attribute>";
            }
        };
    }
}
