
package com.commercetools.importapi.models.customfields;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Provides the value for a custom field of a specific type.</p>
*/
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.BooleanFieldImpl.class, name = BooleanField.BOOLEAN),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.BooleanSetFieldImpl.class, name = BooleanSetField.BOOLEAN_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.DateFieldImpl.class, name = DateField.DATE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.DateSetFieldImpl.class, name = DateSetField.DATE_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.DateTimeFieldImpl.class, name = DateTimeField.DATE_TIME),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.DateTimeSetFieldImpl.class, name = DateTimeSetField.DATE_TIME_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.EnumFieldImpl.class, name = EnumField.ENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.EnumSetFieldImpl.class, name = EnumSetField.ENUM_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.LocalizedEnumFieldImpl.class, name = LocalizedEnumField.LOCALIZED_ENUM),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.LocalizedEnumSetFieldImpl.class, name = LocalizedEnumSetField.LOCALIZED_ENUM_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.LocalizedStringFieldImpl.class, name = LocalizedStringField.LOCALIZED_STRING),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.LocalizedStringSetFieldImpl.class, name = LocalizedStringSetField.LOCALIZED_STRING_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.MoneyFieldImpl.class, name = MoneyField.MONEY),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.MoneySetFieldImpl.class, name = MoneySetField.MONEY_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.NumberFieldImpl.class, name = NumberField.NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.NumberSetFieldImpl.class, name = NumberSetField.NUMBER_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.ReferenceFieldImpl.class, name = ReferenceField.REFERENCE),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.ReferenceSetFieldImpl.class, name = ReferenceSetField.REFERENCE_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.StringFieldImpl.class, name = StringField.STRING),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.StringSetFieldImpl.class, name = StringSetField.STRING_SET),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.TimeFieldImpl.class, name = TimeField.TIME),
        @JsonSubTypes.Type(value = com.commercetools.importapi.models.customfields.TimeSetFieldImpl.class, name = TimeSetField.TIME_SET) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = CustomFieldImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface CustomField {

    /**
    *  <p>The type of this field.</p>
    */
    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withCustomField(Function<CustomField, T> helper) {
        return helper.apply(this);
    }
}
