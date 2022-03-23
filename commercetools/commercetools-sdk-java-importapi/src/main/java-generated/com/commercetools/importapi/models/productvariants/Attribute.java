
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This type represents the value of an attribute of a product variant.
*  The name and type property must match the name and type property of an attribute definition of the product type.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface Attribute {

    /**
    *  <p>The name of this attribute must match a name of the product types attribute definitions.
    *  The name is required if this type is used in a product variant and must not be set when
    *  used in a product variant patch.</p>
    */

    @JsonProperty("name")
    public String getName();

    @NotNull
    @JsonProperty("type")
    public String getType();

    public void setName(final String name);

    default <T> T withAttribute(Function<Attribute, T> helper) {
        return helper.apply(this);
    }
}
