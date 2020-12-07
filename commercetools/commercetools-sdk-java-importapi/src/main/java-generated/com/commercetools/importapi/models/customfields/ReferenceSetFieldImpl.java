package com.commercetools.importapi.models.customfields;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.customfields.CustomField;
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
*  <p>A field with a reference set value.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReferenceSetFieldImpl implements ReferenceSetField {

    private String type;
    
    private java.util.List<com.commercetools.importapi.models.common.KeyReference> value;

    @JsonCreator
    ReferenceSetFieldImpl(@JsonProperty("value") final java.util.List<com.commercetools.importapi.models.common.KeyReference> value) {
        this.value = value;
        this.type = "ReferenceSet";
    }
    public ReferenceSetFieldImpl() {
        this.type = "ReferenceSet";
    }

    /**
    *  <p>The type of this field.</p>
    */
    public String getType(){
        return this.type;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.common.KeyReference> getValue(){
        return this.value;
    }

    public void setValue(final com.commercetools.importapi.models.common.KeyReference ...value){
       this.value = new ArrayList<>(Arrays.asList(value));
    }
    
    public void setValue(final java.util.List<com.commercetools.importapi.models.common.KeyReference> value){
       this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ReferenceSetFieldImpl that = (ReferenceSetFieldImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(value, that.value)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(value)
            .toHashCode();
    }

}
