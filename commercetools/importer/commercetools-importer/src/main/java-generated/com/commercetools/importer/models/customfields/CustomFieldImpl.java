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
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>Provides the value for a custom field of a specific type.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomFieldImpl implements CustomField {

    private String type;

    @JsonCreator
    CustomFieldImpl() {
        this.type = "null";
    }
    

    /**
    *  <p>The type of this field.</p>
    */
    public String getType(){
        return this.type;
    }


}
