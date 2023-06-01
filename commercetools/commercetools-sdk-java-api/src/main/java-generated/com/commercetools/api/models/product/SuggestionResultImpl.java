package com.commercetools.api.models.product;

import com.commercetools.api.models.product.Suggestion;
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
 * SuggestionResult
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SuggestionResultImpl implements SuggestionResult, ModelBase {

    
    private Map<String, java.util.List<com.commercetools.api.models.product.Suggestion>> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SuggestionResultImpl(@JsonProperty("values") final Map<String, java.util.List<com.commercetools.api.models.product.Suggestion>> values) {
        this.values = values;
    }
    /**
     * create empty instance
     */
    public SuggestionResultImpl() {
    }

    /**
     *
     */
    
    public Map<String,java.util.List<com.commercetools.api.models.product.Suggestion>> values() {
        return values;
    }

    
    public void setValue(String key, java.util.List<com.commercetools.api.models.product.Suggestion> value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SuggestionResultImpl that = (SuggestionResultImpl) o;
    
        return new EqualsBuilder()
                .append(values, that.values)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(values)
            .toHashCode();
    }

}
