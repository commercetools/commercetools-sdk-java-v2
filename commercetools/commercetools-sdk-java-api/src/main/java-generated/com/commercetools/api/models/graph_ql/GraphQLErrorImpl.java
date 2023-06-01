package com.commercetools.api.models.graph_ql;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.commercetools.api.models.graph_ql.GraphQLErrorLocation;
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
 * GraphQLError
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLErrorImpl implements GraphQLError, ModelBase {

    
    private String message;
    
    
    private java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> locations;
    
    
    private java.util.List<java.lang.Object> path;
    
    
    private com.commercetools.api.models.error.GraphQLErrorObject extensions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLErrorImpl(@JsonProperty("message") final String message, @JsonProperty("locations") final java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> locations, @JsonProperty("path") final java.util.List<java.lang.Object> path, @JsonProperty("extensions") final com.commercetools.api.models.error.GraphQLErrorObject extensions) {
        this.message = message;
        this.locations = locations;
        this.path = path;
        this.extensions = extensions;
    }
    /**
     * create empty instance
     */
    public GraphQLErrorImpl() {
    }

    /**
     *
     */
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> getLocations(){
        return this.locations;
    }
    
    /**
     *
     */
    
    public java.util.List<java.lang.Object> getPath(){
        return this.path;
    }
    
    /**
     *  <p>Represents a single error.</p>
     */
    
    public com.commercetools.api.models.error.GraphQLErrorObject getExtensions(){
        return this.extensions;
    }

    
    public void setMessage(final String message){
        this.message = message;
    }
    
    
    public void setLocations(final com.commercetools.api.models.graph_ql.GraphQLErrorLocation ...locations){
       this.locations = new ArrayList<>(Arrays.asList(locations));
    }
    
    
    public void setLocations(final java.util.List<com.commercetools.api.models.graph_ql.GraphQLErrorLocation> locations){
       this.locations = locations;
    }
    
    
    public void setPath(final java.lang.Object ...path){
       this.path = new ArrayList<>(Arrays.asList(path));
    }
    
    
    public void setPath(final java.util.List<java.lang.Object> path){
       this.path = path;
    }
    
    
    public void setExtensions(final com.commercetools.api.models.error.GraphQLErrorObject extensions){
        this.extensions = extensions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLErrorImpl that = (GraphQLErrorImpl) o;
    
        return new EqualsBuilder()
                .append(message, that.message)
                .append(locations, that.locations)
                .append(path, that.path)
                .append(extensions, that.extensions)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(message)
            .append(locations)
            .append(path)
            .append(extensions)
            .toHashCode();
    }

}
