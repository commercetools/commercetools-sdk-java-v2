package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.customfields.BooleanField;
import com.commercetools.importapi.models.customfields.BooleanSetField;
import com.commercetools.importapi.models.customfields.DateField;
import com.commercetools.importapi.models.customfields.DateSetField;
import com.commercetools.importapi.models.customfields.DateTimeField;
import com.commercetools.importapi.models.customfields.DateTimeSetField;
import com.commercetools.importapi.models.customfields.EnumField;
import com.commercetools.importapi.models.customfields.EnumSetField;
import com.commercetools.importapi.models.customfields.LocalizedEnumField;
import com.commercetools.importapi.models.customfields.LocalizedEnumSetField;
import com.commercetools.importapi.models.customfields.LocalizedStringField;
import com.commercetools.importapi.models.customfields.LocalizedStringSetField;
import com.commercetools.importapi.models.customfields.MoneyField;
import com.commercetools.importapi.models.customfields.MoneySetField;
import com.commercetools.importapi.models.customfields.NumberField;
import com.commercetools.importapi.models.customfields.NumberSetField;
import com.commercetools.importapi.models.customfields.ReferenceField;
import com.commercetools.importapi.models.customfields.ReferenceSetField;
import com.commercetools.importapi.models.customfields.StringField;
import com.commercetools.importapi.models.customfields.StringSetField;
import com.commercetools.importapi.models.customfields.TimeField;
import com.commercetools.importapi.models.customfields.TimeSetField;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>Provides the value for a custom field of a specific type.</p>
*/
@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.BooleanFieldImpl.class, name = "Boolean"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.StringFieldImpl.class, name = "String"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.LocalizedStringFieldImpl.class, name = "LocalizedString"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.EnumFieldImpl.class, name = "Enum"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.LocalizedEnumFieldImpl.class, name = "LocalizedEnum"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.NumberFieldImpl.class, name = "Number"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.MoneyFieldImpl.class, name = "Money"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.DateFieldImpl.class, name = "Date"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.TimeFieldImpl.class, name = "Time"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.DateTimeFieldImpl.class, name = "DateTime"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.ReferenceFieldImpl.class, name = "Reference"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.BooleanSetFieldImpl.class, name = "BooleanSet"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.StringSetFieldImpl.class, name = "StringSet"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.LocalizedStringSetFieldImpl.class, name = "LocalizedStringSet"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.EnumSetFieldImpl.class, name = "EnumSet"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.LocalizedEnumSetFieldImpl.class, name = "LocalizedEnumSet"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.NumberSetFieldImpl.class, name = "NumberSet"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.MoneySetFieldImpl.class, name = "MoneySet"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.DateSetFieldImpl.class, name = "DateSet"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.TimeSetFieldImpl.class, name = "TimeSet"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.DateTimeSetFieldImpl.class, name = "DateTimeSet"),
   @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.ReferenceSetFieldImpl.class, name = "ReferenceSet")
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





    default <T extends Accessor<CustomField>> T withCustomField(Function<CustomField, T> helper) {
        return helper.apply(this);
    }
}
