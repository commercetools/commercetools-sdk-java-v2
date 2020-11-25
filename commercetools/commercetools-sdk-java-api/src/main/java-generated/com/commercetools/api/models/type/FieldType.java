package com.commercetools.api.models.type;

import com.commercetools.api.models.type.CustomFieldBooleanType;
import com.commercetools.api.models.type.CustomFieldDateTimeType;
import com.commercetools.api.models.type.CustomFieldDateType;
import com.commercetools.api.models.type.CustomFieldEnumType;
import com.commercetools.api.models.type.CustomFieldLocalizedEnumType;
import com.commercetools.api.models.type.CustomFieldLocalizedStringType;
import com.commercetools.api.models.type.CustomFieldMoneyType;
import com.commercetools.api.models.type.CustomFieldNumberType;
import com.commercetools.api.models.type.CustomFieldReferenceType;
import com.commercetools.api.models.type.CustomFieldSetType;
import com.commercetools.api.models.type.CustomFieldStringType;
import com.commercetools.api.models.type.CustomFieldTimeType;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldLocalizedStringTypeImpl.class, name = "LocalizedString"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldEnumTypeImpl.class, name = "Enum"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldStringTypeImpl.class, name = "String"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldBooleanTypeImpl.class, name = "Boolean"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldDateTypeImpl.class, name = "Date"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldReferenceTypeImpl.class, name = "Reference"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldMoneyTypeImpl.class, name = "Money"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldLocalizedEnumTypeImpl.class, name = "LocalizedEnum"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldDateTimeTypeImpl.class, name = "DateTime"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldNumberTypeImpl.class, name = "Number"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldTimeTypeImpl.class, name = "Time"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.type.CustomFieldSetTypeImpl.class, name = "Set")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "name",
    defaultImpl = FieldTypeImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface FieldType  {

    
    @NotNull
    @JsonProperty("name")
    public String getName();




    default <T> T withFieldType(Function<FieldType, T> helper) {
        return helper.apply(this);
    }
}
