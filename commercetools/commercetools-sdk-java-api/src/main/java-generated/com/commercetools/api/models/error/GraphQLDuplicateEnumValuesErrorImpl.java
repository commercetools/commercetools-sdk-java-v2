package com.commercetools.api.models.error;

import com.commercetools.api.models.error.GraphQLErrorObject;
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
 *  <p>Returned when an AttributeEnumType or AttributeLocalizedEnumType contains duplicate keys.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLDuplicateEnumValuesErrorImpl implements GraphQLDuplicateEnumValuesError, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private java.util.List<String> duplicates;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLDuplicateEnumValuesErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("duplicates") final java.util.List<String> duplicates) {
        this.values = values;
        this.duplicates = duplicates;
        this.code =  DUPLICATE_ENUM_VALUES;
    }
    /**
     * create empty instance
     */
    public GraphQLDuplicateEnumValuesErrorImpl() {
        this.code =  DUPLICATE_ENUM_VALUES;
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
     *  <p>Duplicate keys.</p>
     */
    
    public java.util.List<String> getDuplicates(){
        return this.duplicates;
    }

    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setDuplicates(final String ...duplicates){
       this.duplicates = new ArrayList<>(Arrays.asList(duplicates));
    }
    
    
    public void setDuplicates(final java.util.List<String> duplicates){
       this.duplicates = duplicates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLDuplicateEnumValuesErrorImpl that = (GraphQLDuplicateEnumValuesErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .append(duplicates, that.duplicates)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(values)
            .append(duplicates)
            .toHashCode();
    }

}
