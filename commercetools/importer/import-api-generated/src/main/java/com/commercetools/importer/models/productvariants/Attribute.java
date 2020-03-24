package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.productvariants.BooleanAttribute;
import com.commercetools.importer.models.productvariants.BooleanSetAttribute;
import com.commercetools.importer.models.productvariants.DateAttribute;
import com.commercetools.importer.models.productvariants.DateSetAttribute;
import com.commercetools.importer.models.productvariants.DateTimeAttribute;
import com.commercetools.importer.models.productvariants.DateTimeSetAttribute;
import com.commercetools.importer.models.productvariants.EnumAttribute;
import com.commercetools.importer.models.productvariants.EnumSetAttribute;
import com.commercetools.importer.models.productvariants.LocalizableEnumAttribute;
import com.commercetools.importer.models.productvariants.LocalizableEnumSetAttribute;
import com.commercetools.importer.models.productvariants.LocalizableTextAttribute;
import com.commercetools.importer.models.productvariants.LocalizableTextSetAttribute;
import com.commercetools.importer.models.productvariants.MoneyAttribute;
import com.commercetools.importer.models.productvariants.MoneySetAttribute;
import com.commercetools.importer.models.productvariants.NumberAttribute;
import com.commercetools.importer.models.productvariants.NumberSetAttribute;
import com.commercetools.importer.models.productvariants.ReferenceAttribute;
import com.commercetools.importer.models.productvariants.ReferenceSetAttribute;
import com.commercetools.importer.models.productvariants.TextAttribute;
import com.commercetools.importer.models.productvariants.TextSetAttribute;
import com.commercetools.importer.models.productvariants.TimeAttribute;
import com.commercetools.importer.models.productvariants.TimeSetAttribute;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>This type represents the value of an attribute of a product variant.
*  The name and type property must match the name and type property of an attribute definition of the product type.</p>
*/
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.BooleanAttributeImpl.class, name = "boolean"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.BooleanSetAttributeImpl.class, name = "boolean-set"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.DateAttributeImpl.class, name = "date"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.DateSetAttributeImpl.class, name = "date-set"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.DateTimeAttributeImpl.class, name = "datetime"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.DateTimeSetAttributeImpl.class, name = "datetime-set"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.EnumAttributeImpl.class, name = "enum"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.EnumSetAttributeImpl.class, name = "enum-set"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.LocalizableEnumAttributeImpl.class, name = "lenum"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.LocalizableEnumSetAttributeImpl.class, name = "lenum-set"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.LocalizableTextAttributeImpl.class, name = "ltext"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.LocalizableTextSetAttributeImpl.class, name = "ltext-set"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.MoneyAttributeImpl.class, name = "money"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.MoneySetAttributeImpl.class, name = "money-set"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.NumberAttributeImpl.class, name = "number"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.NumberSetAttributeImpl.class, name = "number-set"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.ReferenceAttributeImpl.class, name = "reference"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.ReferenceSetAttributeImpl.class, name = "reference-set"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.TextAttributeImpl.class, name = "text"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.TextSetAttributeImpl.class, name = "text-set"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.TimeAttributeImpl.class, name = "time"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.productvariants.TimeSetAttributeImpl.class, name = "time-set")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type",
   defaultImpl = AttributeImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface Attribute  {

   /**
   *  <p>The name of this attribute must match a name of the product types attribute definitions.
   *  The name is required if this type is used in a product variant and must not be set when
   *  used in a product variant patch.</p>
   */
   
   @JsonProperty("name")
   public String getName();

   public void setName(final String name);
   


}