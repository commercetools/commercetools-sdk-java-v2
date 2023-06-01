package com.commercetools.importapi.models.types;

import com.commercetools.importapi.models.types.CustomFieldBooleanType;
import com.commercetools.importapi.models.types.CustomFieldDateTimeType;
import com.commercetools.importapi.models.types.CustomFieldDateType;
import com.commercetools.importapi.models.types.CustomFieldEnumType;
import com.commercetools.importapi.models.types.CustomFieldLocalizedEnumType;
import com.commercetools.importapi.models.types.CustomFieldLocalizedStringType;
import com.commercetools.importapi.models.types.CustomFieldMoneyType;
import com.commercetools.importapi.models.types.CustomFieldNumberType;
import com.commercetools.importapi.models.types.CustomFieldReferenceType;
import com.commercetools.importapi.models.types.CustomFieldSetType;
import com.commercetools.importapi.models.types.CustomFieldStringType;
import com.commercetools.importapi.models.types.CustomFieldTimeType;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * FieldType
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class FieldTypeImpl implements FieldType, ModelBase {

    
    private String name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    FieldTypeImpl(@JsonProperty("name") final String name) {
        this.name = name;
    }
    /**
     * create empty instance
     */
    public FieldTypeImpl() {
    }

    /**
     *
     */
    
    public String getName(){
        return this.name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        FieldTypeImpl that = (FieldTypeImpl) o;
    
        return new EqualsBuilder()
                .append(name, that.name)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .toHashCode();
    }

}
