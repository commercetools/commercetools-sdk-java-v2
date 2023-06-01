package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.TypeKeyReference;
import com.commercetools.importapi.models.customfields.FieldContainer;
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
 *  <p>The representation to be sent to the server when creating a resource with custom fields.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomImpl implements Custom, ModelBase {

    
    private com.commercetools.importapi.models.common.TypeKeyReference type;
    
    
    private com.commercetools.importapi.models.customfields.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomImpl(@JsonProperty("type") final com.commercetools.importapi.models.common.TypeKeyReference type, @JsonProperty("fields") final com.commercetools.importapi.models.customfields.FieldContainer fields) {
        this.type = type;
        this.fields = fields;
    }
    /**
     * create empty instance
     */
    public CustomImpl() {
    }

    /**
     *  <p>The type that provides the field definitions for this object.</p>
     */
    
    public com.commercetools.importapi.models.common.TypeKeyReference getType(){
        return this.type;
    }
    
    /**
     *  <p>The custom fields of this object.</p>
     */
    
    public com.commercetools.importapi.models.customfields.FieldContainer getFields(){
        return this.fields;
    }

    
    public void setType(final com.commercetools.importapi.models.common.TypeKeyReference type){
        this.type = type;
    }
    
    
    public void setFields(final com.commercetools.importapi.models.customfields.FieldContainer fields){
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomImpl that = (CustomImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(fields)
            .toHashCode();
    }

}
