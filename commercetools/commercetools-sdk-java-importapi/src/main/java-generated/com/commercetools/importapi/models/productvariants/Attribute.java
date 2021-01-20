
package com.commercetools.importapi.models.productvariants;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.productvariants.BooleanAttribute;
import com.commercetools.importapi.models.productvariants.BooleanSetAttribute;
import com.commercetools.importapi.models.productvariants.DateAttribute;
import com.commercetools.importapi.models.productvariants.DateSetAttribute;
import com.commercetools.importapi.models.productvariants.DateTimeAttribute;
import com.commercetools.importapi.models.productvariants.DateTimeSetAttribute;
import com.commercetools.importapi.models.productvariants.EnumAttribute;
import com.commercetools.importapi.models.productvariants.EnumSetAttribute;
import com.commercetools.importapi.models.productvariants.LocalizableEnumAttribute;
import com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttribute;
import com.commercetools.importapi.models.productvariants.LocalizableTextAttribute;
import com.commercetools.importapi.models.productvariants.LocalizableTextSetAttribute;
import com.commercetools.importapi.models.productvariants.MoneyAttribute;
import com.commercetools.importapi.models.productvariants.MoneySetAttribute;
import com.commercetools.importapi.models.productvariants.NumberAttribute;
import com.commercetools.importapi.models.productvariants.NumberSetAttribute;
import com.commercetools.importapi.models.productvariants.ReferenceAttribute;
import com.commercetools.importapi.models.productvariants.ReferenceSetAttribute;
import com.commercetools.importapi.models.productvariants.TextAttribute;
import com.commercetools.importapi.models.productvariants.TextSetAttribute;
import com.commercetools.importapi.models.productvariants.TimeAttribute;
import com.commercetools.importapi.models.productvariants.TimeSetAttribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This type represents the value of an attribute of a product variant.
*  The name and type property must match the name and type property of an attribute definition of the product type.</p>
*/
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.BooleanAttributeImpl.class, name = "boolean"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.BooleanSetAttributeImpl.class, name = "boolean-set"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.DateAttributeImpl.class, name = "date"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.DateSetAttributeImpl.class, name = "date-set"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.DateTimeAttributeImpl.class, name = "datetime"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.DateTimeSetAttributeImpl.class, name = "datetime-set"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.EnumAttributeImpl.class, name = "enum"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.EnumSetAttributeImpl.class, name = "enum-set"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.LocalizableEnumAttributeImpl.class, name = "lenum"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.LocalizableEnumSetAttributeImpl.class, name = "lenum-set"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.LocalizableTextAttributeImpl.class, name = "ltext"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.LocalizableTextSetAttributeImpl.class, name = "ltext-set"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.MoneyAttributeImpl.class, name = "money"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.MoneySetAttributeImpl.class, name = "money-set"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.NumberAttributeImpl.class, name = "number"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.NumberSetAttributeImpl.class, name = "number-set"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.ReferenceAttributeImpl.class, name = "reference"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.ReferenceSetAttributeImpl.class, name = "reference-set"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.TextAttributeImpl.class, name = "text"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.TextSetAttributeImpl.class, name = "text-set"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.TimeAttributeImpl.class, name = "time"),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.productvariants.TimeSetAttributeImpl.class, name = "time-set") })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = AttributeImpl.class, visible = true)
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
