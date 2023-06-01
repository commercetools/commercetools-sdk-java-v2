package com.commercetools.api.models.common;

import com.commercetools.api.models.associate_role.AssociateRoleKeyReference;
import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.store.StoreKeyReference;
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
 *  <p>A KeyReference represents a loose reference to another resource in the same Project identified by the resource's <code>key</code> field. If available, the <code>key</code> is immutable and mandatory. KeyReferences do not support Reference Expansion.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class KeyReferenceImpl implements KeyReference, ModelBase {

    
    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    
    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    KeyReferenceImpl(@JsonProperty("typeId") final com.commercetools.api.models.common.ReferenceTypeId typeId, @JsonProperty("key") final String key) {
        this.typeId = typeId;
        this.key = key;
    }
    /**
     * create empty instance
     */
    public KeyReferenceImpl() {
    }

    /**
     *  <p>Type of referenced resource.</p>
     */
    
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    /**
     *  <p>User-defined unique and immutable key of the referenced resource.</p>
     */
    
    public String getKey(){
        return this.key;
    }

    
    public void setKey(final String key){
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        KeyReferenceImpl that = (KeyReferenceImpl) o;
    
        return new EqualsBuilder()
                .append(typeId, that.typeId)
                .append(key, that.key)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(typeId)
            .append(key)
            .toHashCode();
    }

}
