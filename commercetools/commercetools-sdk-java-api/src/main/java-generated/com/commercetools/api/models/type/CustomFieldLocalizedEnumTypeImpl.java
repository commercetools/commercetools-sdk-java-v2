package com.commercetools.api.models.type;

import com.commercetools.api.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.api.models.type.FieldType;
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
 *  <p>Field type for localized enum values.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomFieldLocalizedEnumTypeImpl implements CustomFieldLocalizedEnumType, ModelBase {

    
    private String name;
    
    
    private java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomFieldLocalizedEnumTypeImpl(@JsonProperty("values") final java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values) {
        this.values = values;
        this.name =  LOCALIZED_ENUM;
    }
    /**
     * create empty instance
     */
    public CustomFieldLocalizedEnumTypeImpl() {
        this.name =  LOCALIZED_ENUM;
    }

    /**
     *
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>Allowed values.</p>
     */
    
    public java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> getValues(){
        return this.values;
    }

    
    public void setValues(final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue ...values){
       this.values = new ArrayList<>(Arrays.asList(values));
    }
    
    
    public void setValues(final java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values){
       this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomFieldLocalizedEnumTypeImpl that = (CustomFieldLocalizedEnumTypeImpl) o;
    
        return new EqualsBuilder()
                .append(name, that.name)
                .append(values, that.values)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(name)
            .append(values)
            .toHashCode();
    }

}
