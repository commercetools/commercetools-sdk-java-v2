package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.order_edit.OrderEditPreviewFailure;
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
 *  <p>Returned when a preview to find an appropriate Shipping Method for an OrderEdit could not be generated.</p>
 *  <p>The error is returned as a failed response to the Get Shipping Methods for an OrderEdit request.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLEditPreviewFailedErrorImpl implements GraphQLEditPreviewFailedError, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private com.commercetools.api.models.order_edit.OrderEditPreviewFailure result;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLEditPreviewFailedErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("result") final com.commercetools.api.models.order_edit.OrderEditPreviewFailure result) {
        this.values = values;
        this.result = result;
        this.code =  EDIT_PREVIEW_FAILED;
    }
    /**
     * create empty instance
     */
    public GraphQLEditPreviewFailedErrorImpl() {
        this.code =  EDIT_PREVIEW_FAILED;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     */
    
    public Map<String,java.lang.Object> values() {
        return values;
    }
    
    /**
     *  <p>State of the OrderEdit where the <code>stagedActions</code> cannot be applied to the Order.</p>
     */
    
    public com.commercetools.api.models.order_edit.OrderEditPreviewFailure getResult(){
        return this.result;
    }

    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setResult(final com.commercetools.api.models.order_edit.OrderEditPreviewFailure result){
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLEditPreviewFailedErrorImpl that = (GraphQLEditPreviewFailedErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .append(result, that.result)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(values)
            .append(result)
            .toHashCode();
    }

}
