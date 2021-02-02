
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldBooleanTypeImpl.class, name = CustomFieldBooleanType.BOOLEAN),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldDateTimeTypeImpl.class, name = CustomFieldDateTimeType.DATE_TIME),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldDateTypeImpl.class, name = CustomFieldDateType.DATE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldEnumTypeImpl.class, name = CustomFieldEnumType.ENUM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldLocalizedEnumTypeImpl.class, name = CustomFieldLocalizedEnumType.LOCALIZED_ENUM),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldLocalizedStringTypeImpl.class, name = CustomFieldLocalizedStringType.LOCALIZED_STRING),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldMoneyTypeImpl.class, name = CustomFieldMoneyType.MONEY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldNumberTypeImpl.class, name = CustomFieldNumberType.NUMBER),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldReferenceTypeImpl.class, name = CustomFieldReferenceType.REFERENCE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldSetTypeImpl.class, name = CustomFieldSetType.SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldStringTypeImpl.class, name = CustomFieldStringType.STRING),
        @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldTimeTypeImpl.class, name = CustomFieldTimeType.TIME) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "name", defaultImpl = FieldTypeImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface FieldType {

    @NotNull
    @JsonProperty("name")
    public String getName();

    default <T> T withFieldType(Function<FieldType, T> helper) {
        return helper.apply(this);
    }
}
