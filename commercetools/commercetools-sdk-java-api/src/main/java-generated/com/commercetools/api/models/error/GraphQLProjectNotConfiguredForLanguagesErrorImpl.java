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
 *  <p>Returned when the languages set for a Store are not supported by the Project.</p>
 *  <p>The error is returned as a failed response to the Set Languages update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLProjectNotConfiguredForLanguagesErrorImpl implements GraphQLProjectNotConfiguredForLanguagesError, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private java.util.List<String> languages;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLProjectNotConfiguredForLanguagesErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("languages") final java.util.List<String> languages) {
        this.values = values;
        this.languages = languages;
        this.code =  PROJECT_NOT_CONFIGURED_FOR_LANGUAGES;
    }
    /**
     * create empty instance
     */
    public GraphQLProjectNotConfiguredForLanguagesErrorImpl() {
        this.code =  PROJECT_NOT_CONFIGURED_FOR_LANGUAGES;
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
     *  <p>Languages configured for the Store.</p>
     */
    
    public java.util.List<String> getLanguages(){
        return this.languages;
    }

    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setLanguages(final String ...languages){
       this.languages = new ArrayList<>(Arrays.asList(languages));
    }
    
    
    public void setLanguages(final java.util.List<String> languages){
       this.languages = languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLProjectNotConfiguredForLanguagesErrorImpl that = (GraphQLProjectNotConfiguredForLanguagesErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .append(languages, that.languages)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(values)
            .append(languages)
            .toHashCode();
    }

}
