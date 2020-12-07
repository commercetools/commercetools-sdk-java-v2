package com.commercetools.api.models.graph_ql;

import com.commercetools.api.models.graph_ql.GraphQLError;
import com.fasterxml.jackson.databind.JsonNode;
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
public final class GraphQLResponseImpl implements GraphQLResponse {

    private com.fasterxml.jackson.databind.JsonNode data;
    
    private java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> errors;

    @JsonCreator
    GraphQLResponseImpl(@JsonProperty("data") final com.fasterxml.jackson.databind.JsonNode data, @JsonProperty("errors") final java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> errors) {
        this.data = data;
        this.errors = errors;
    }
    public GraphQLResponseImpl() {
    }

    
    public com.fasterxml.jackson.databind.JsonNode getData(){
        return this.data;
    }
    
    
    public java.util.List<com.commercetools.api.models.graph_ql.GraphQLError> getErrors(){
        return this.errors;
    }

    public void setData(final com.fasterxml.jackson.databind.JsonNode data){
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
