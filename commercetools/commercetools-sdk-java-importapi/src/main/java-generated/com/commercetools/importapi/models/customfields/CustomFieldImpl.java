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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


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
    CustomFieldImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    public CustomFieldImpl() {
    }

    /**
    *  <p>The type of this field.</p>
    */
    public String getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomFieldImpl that = (CustomFieldImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .toHashCode();
    }

}
