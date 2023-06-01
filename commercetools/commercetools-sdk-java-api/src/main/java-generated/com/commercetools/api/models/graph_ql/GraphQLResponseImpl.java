package com.commercetools.api.models.graph_ql;

import com.commercetools.api.models.graph_ql.GraphQLError;
import java.lang.Object;
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
 * GraphQLResponse
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLResponseImpl implements GraphQLResponse, ModelBase {

    
    private java.lang.Object data;
    
    
    private java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLResponseImpl(@JsonProperty("data") final java.lang.Object data, @JsonProperty("errors") final java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> errors) {
        this.data = data;
        this.errors = errors;
    }
    /**
     * create empty instance
     */
    public GraphQLResponseImpl() {
    }

    /**
     *
     */
    
    public java.lang.Object getData(){
        return this.data;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> getErrors(){
        return this.errors;
    }

    
    public void setData(final java.lang.Object data){
        this.data = data;
    }
    
    
    public void setErrors(final com.commercetools.api.models.graph_ql.GraphQLError ...errors){
       this.errors = new ArrayList<>(Arrays.asList(errors));
    }
    
    
    public void setErrors(final java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> errors){
       this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLResponseImpl that = (GraphQLResponseImpl) o;
    
        return new EqualsBuilder()
                .append(data, that.data)
                .append(errors, that.errors)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(data)
            .append(errors)
            .toHashCode();
    }

}
