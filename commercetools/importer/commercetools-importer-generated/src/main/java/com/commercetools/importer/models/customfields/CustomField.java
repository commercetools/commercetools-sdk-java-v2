package com.commercetools.importer.models.customfields;

import com.commercetools.importer.models.customfields.BooleanField;
import com.commercetools.importer.models.customfields.BooleanSetField;
import com.commercetools.importer.models.customfields.DateField;
import com.commercetools.importer.models.customfields.DateSetField;
import com.commercetools.importer.models.customfields.DateTimeField;
import com.commercetools.importer.models.customfields.DateTimeSetField;
import com.commercetools.importer.models.customfields.EnumField;
import com.commercetools.importer.models.customfields.EnumSetField;
import com.commercetools.importer.models.customfields.LocalizedEnumField;
import com.commercetools.importer.models.customfields.LocalizedEnumSetField;
import com.commercetools.importer.models.customfields.LocalizedStringField;
import com.commercetools.importer.models.customfields.LocalizedStringSetField;
import com.commercetools.importer.models.customfields.MoneyField;
import com.commercetools.importer.models.customfields.MoneySetField;
import com.commercetools.importer.models.customfields.NumberField;
import com.commercetools.importer.models.customfields.NumberSetField;
import com.commercetools.importer.models.customfields.ReferenceField;
import com.commercetools.importer.models.customfields.ReferenceSetField;
import com.commercetools.importer.models.customfields.StringField;
import com.commercetools.importer.models.customfields.StringSetField;
import com.commercetools.importer.models.customfields.TimeField;
import com.commercetools.importer.models.customfields.TimeSetField;


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
*  <p>Provides the value for a custom field of a specific type.</p>
*/
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.BooleanFieldImpl.class, name = "Boolean"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.StringFieldImpl.class, name = "String"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.LocalizedStringFieldImpl.class, name = "LocalizedString"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.EnumFieldImpl.class, name = "Enum"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.LocalizedEnumFieldImpl.class, name = "LocalizedEnum"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.NumberFieldImpl.class, name = "Number"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.MoneyFieldImpl.class, name = "Money"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.DateFieldImpl.class, name = "Date"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.TimeFieldImpl.class, name = "Time"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.DateTimeFieldImpl.class, name = "DateTime"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.ReferenceFieldImpl.class, name = "Reference"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.BooleanSetFieldImpl.class, name = "BooleanSet"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.StringSetFieldImpl.class, name = "StringSet"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.LocalizedStringSetFieldImpl.class, name = "LocalizedStringSet"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.EnumSetFieldImpl.class, name = "EnumSet"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.LocalizedEnumSetFieldImpl.class, name = "LocalizedEnumSet"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.NumberSetFieldImpl.class, name = "NumberSet"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.MoneySetFieldImpl.class, name = "MoneySet"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.DateSetFieldImpl.class, name = "DateSet"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.TimeSetFieldImpl.class, name = "TimeSet"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.DateTimeSetFieldImpl.class, name = "DateTimeSet"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.customfields.ReferenceSetFieldImpl.class, name = "ReferenceSet")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = CustomFieldImpl.class
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface CustomField  {





}
