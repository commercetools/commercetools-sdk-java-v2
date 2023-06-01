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
 *  <p>Returned when the Cart contains a ShippingMethod that is not allowed for the Cart. In this case, the ShippingMethodState value is <code>DoesNotMatchCart</code>.</p>
 *  <p>The error is returned as a failed response to the Create Order from Cart or Create Order in Store from Cart requests.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLShippingMethodDoesNotMatchCartErrorImpl implements GraphQLShippingMethodDoesNotMatchCartError, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLShippingMethodDoesNotMatchCartErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values) {
        this.values = values;
        this.code =  SHIPPING_METHOD_DOES_NOT_MATCH_CART;
    }
    /**
     * create empty instance
     */
    public GraphQLShippingMethodDoesNotMatchCartErrorImpl() {
        this.code =  SHIPPING_METHOD_DOES_NOT_MATCH_CART;
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

    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLShippingMethodDoesNotMatchCartErrorImpl that = (GraphQLShippingMethodDoesNotMatchCartErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(values)
            .toHashCode();
    }

}
