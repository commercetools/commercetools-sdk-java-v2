package com.commercetools.api.models.store;

import com.commercetools.api.models.common.KeyReference;
import com.commercetools.api.models.common.ReferenceTypeId;
import io.vrap.rmf.base.client.utils.Generated;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoreKeyReferenceImpl implements StoreKeyReference {

    
    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    
    private String key;

    @JsonCreator
    StoreKeyReferenceImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.typeId = ReferenceTypeId.findEnum("store");
    }
    public StoreKeyReferenceImpl() {
        this.typeId = ReferenceTypeId.findEnum("store");
    }

    
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    
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
    
        StoreKeyReferenceImpl that = (StoreKeyReferenceImpl) o;
    
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
