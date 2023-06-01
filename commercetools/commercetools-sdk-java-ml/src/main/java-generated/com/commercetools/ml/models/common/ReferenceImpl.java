package com.commercetools.ml.models.common;

import com.commercetools.ml.models.common.CategoryReference;
import com.commercetools.ml.models.common.ProductReference;
import com.commercetools.ml.models.common.ProductTypeReference;
import com.commercetools.ml.models.common.ReferenceTypeId;
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
 * Reference
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReferenceImpl implements Reference, ModelBase {

    
    private com.commercetools.ml.models.common.ReferenceTypeId typeId;
    
    
    private String id;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReferenceImpl(@JsonProperty("typeId") final com.commercetools.ml.models.common.ReferenceTypeId typeId, @JsonProperty("id") final String id) {
        this.typeId = typeId;
        this.id = id;
    }
    /**
     * create empty instance
     */
    public ReferenceImpl() {
    }

    /**
     *
     */
    
    public com.commercetools.ml.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    /**
     *
     */
    
    public String getId(){
        return this.id;
    }

    
    public void setId(final String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ReferenceImpl that = (ReferenceImpl) o;
    
        return new EqualsBuilder()
                .append(typeId, that.typeId)
                .append(id, that.id)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(typeId)
            .append(id)
            .toHashCode();
    }

}
