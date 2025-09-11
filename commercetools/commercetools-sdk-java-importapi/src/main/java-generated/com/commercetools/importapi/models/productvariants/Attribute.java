
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents the value of an Attribute of a Product Variant.</p>
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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = AttributeImpl.class, visible = true)
@JsonDeserialize(as = AttributeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Attribute {

    /**
     *  <p>Required if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantImport" rel="nofollow">ProductVariantImport</a>. Must not be set if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatch" rel="nofollow">ProductVariantPatch</a>.</p>
     *  <p>Must match <code>name</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> of the Product Type.</p>
     * @return name
     */

    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Must match <code>type</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> of the Product Type. The type is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Required if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantImport" rel="nofollow">ProductVariantImport</a>. Must not be set if used for <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatch" rel="nofollow">ProductVariantPatch</a>.</p>
     *  <p>Must match <code>name</code> of an <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> of the Product Type.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    public Attribute copyDeep();

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

        if (!(template instanceof AttributeImpl)) {
            return template.copyDeep();
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
