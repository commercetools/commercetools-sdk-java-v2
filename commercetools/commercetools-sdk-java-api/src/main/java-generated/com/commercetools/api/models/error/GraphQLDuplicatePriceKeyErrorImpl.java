package com.commercetools.api.models.error;

import com.commercetools.api.models.common.Price;
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
 *  <p>Returned when a Price key conflicts with an existing key.</p>
 *  <p>Keys of Embedded Prices must be unique per ProductVariant.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLDuplicatePriceKeyErrorImpl implements GraphQLDuplicatePriceKeyError, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private com.commercetools.api.models.common.Price conflictingPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLDuplicatePriceKeyErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("conflictingPrice") final com.commercetools.api.models.common.Price conflictingPrice) {
        this.values = values;
        this.conflictingPrice = conflictingPrice;
        this.code =  DUPLICATE_PRICE_KEY;
    }
    /**
     * create empty instance
     */
    public GraphQLDuplicatePriceKeyErrorImpl() {
        this.code =  DUPLICATE_PRICE_KEY;
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
     *  <p>Conflicting Embedded Price.</p>
     */
    
    public com.commercetools.api.models.common.Price getConflictingPrice(){
        return this.conflictingPrice;
    }

    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setConflictingPrice(final com.commercetools.api.models.common.Price conflictingPrice){
        this.conflictingPrice = conflictingPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLDuplicatePriceKeyErrorImpl that = (GraphQLDuplicatePriceKeyErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .append(conflictingPrice, that.conflictingPrice)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(values)
            .append(conflictingPrice)
            .toHashCode();
    }

}
