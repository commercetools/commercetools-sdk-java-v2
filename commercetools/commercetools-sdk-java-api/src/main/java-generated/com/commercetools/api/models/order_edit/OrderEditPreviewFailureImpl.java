package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.order_edit.OrderEditResult;
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
 * OrderEditPreviewFailure
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderEditPreviewFailureImpl implements OrderEditPreviewFailure, ModelBase {

    
    private String type;
    
    
    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderEditPreviewFailureImpl(@JsonProperty("errors") final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        this.type =  PREVIEW_FAILURE;
    }
    /**
     * create empty instance
     */
    public OrderEditPreviewFailureImpl() {
        this.type =  PREVIEW_FAILURE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors(){
        return this.errors;
    }

    
    public void setErrors(final com.commercetools.api.models.error.ErrorObject ...errors){
       this.errors = new ArrayList<>(Arrays.asList(errors));
    }
    
    
    public void setErrors(final java.util.List<com.commercetools.api.models.error.ErrorObject> errors){
       this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderEditPreviewFailureImpl that = (OrderEditPreviewFailureImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(errors, that.errors)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(errors)
            .toHashCode();
    }

}
