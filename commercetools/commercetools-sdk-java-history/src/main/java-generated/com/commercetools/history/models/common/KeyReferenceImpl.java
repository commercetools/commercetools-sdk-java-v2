package com.commercetools.history.models.common;

import com.commercetools.history.models.common.ReferenceTypeId;
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
 * KeyReference
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class KeyReferenceImpl implements KeyReference, ModelBase {

    
    private String key;
    
    
    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    KeyReferenceImpl(@JsonProperty("key") final String key, @JsonProperty("typeId") final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.key = key;
        this.typeId = typeId;
    }
    /**
     * create empty instance
     */
    public KeyReferenceImpl() {
    }

    /**
     *
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }

    
    public void setKey(final String key){
        this.key = key;
    }
    
    
    public void setTypeId(final com.commercetools.history.models.common.ReferenceTypeId typeId){
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        KeyReferenceImpl that = (KeyReferenceImpl) o;
    
        return new EqualsBuilder()
                .append(key, that.key)
                .append(typeId, that.typeId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(key)
            .append(typeId)
            .toHashCode();
    }

}
