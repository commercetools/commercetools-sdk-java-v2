package com.commercetools.api.models.error;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.error.ErrorObject;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReferenceExistsErrorImpl implements ReferenceExistsError {

    private String code;
    
    private String message;
    
    private com.commercetools.api.models.common.ReferenceTypeId referencedBy;

    @JsonCreator
    ReferenceExistsErrorImpl(@JsonProperty("message") final String message, @JsonProperty("referencedBy") final com.commercetools.api.models.common.ReferenceTypeId referencedBy) {
        this.message = message;
        this.referencedBy = referencedBy;
        this.code = "ReferenceExists";
    }
    public ReferenceExistsErrorImpl() {
        this.code = "ReferenceExists";
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public com.commercetools.api.models.common.ReferenceTypeId getReferencedBy(){
        return this.referencedBy;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setReferencedBy(final com.commercetools.api.models.common.ReferenceTypeId referencedBy){
        this.referencedBy = referencedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ReferenceExistsErrorImpl that = (ReferenceExistsErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(referencedBy, that.referencedBy)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(referencedBy)
            .toHashCode();
    }

}
