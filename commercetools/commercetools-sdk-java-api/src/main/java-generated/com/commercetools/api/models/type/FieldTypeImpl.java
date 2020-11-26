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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FieldTypeImpl implements FieldType {

    private String name;

    @JsonCreator
    FieldTypeImpl(@JsonProperty("name") final String name) {
        this.name = name;
    }
    public FieldTypeImpl() {
    }

    
    public String getName(){
        return this.name;
    }


}
