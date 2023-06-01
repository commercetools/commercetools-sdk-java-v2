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
 *  <p>Returned when the Price, Tax Rate, or Shipping Rate of some Line Items changed since they were last added to the Cart.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
 *  </ul>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLPriceChangedErrorImpl implements GraphQLPriceChangedError, ModelBase {

    
    private String code;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private java.util.List<String> lineItems;
    
    
    private Boolean shipping;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLPriceChangedErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("lineItems") final java.util.List<String> lineItems, @JsonProperty("shipping") final Boolean shipping) {
        this.values = values;
        this.lineItems = lineItems;
        this.shipping = shipping;
        this.code =  PRICE_CHANGED;
    }
    /**
     * create empty instance
     */
    public GraphQLPriceChangedErrorImpl() {
        this.code =  PRICE_CHANGED;
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
     *  <p>Unique identifiers of the Line Items for which the Price or TaxRate has changed.</p>
     */
    
    public java.util.List<String> getLineItems(){
        return this.lineItems;
    }
    
    /**
     *  <p><code>true</code> if the ShippingRate has changed.</p>
     */
    
    public Boolean getShipping(){
        return this.shipping;
    }

    
    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }
    
    
    public void setLineItems(final String ...lineItems){
       this.lineItems = new ArrayList<>(Arrays.asList(lineItems));
    }
    
    
    public void setLineItems(final java.util.List<String> lineItems){
       this.lineItems = lineItems;
    }
    
    
    public void setShipping(final Boolean shipping){
        this.shipping = shipping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        GraphQLPriceChangedErrorImpl that = (GraphQLPriceChangedErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(values, that.values)
                .append(lineItems, that.lineItems)
                .append(shipping, that.shipping)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(values)
            .append(lineItems)
            .append(shipping)
            .toHashCode();
    }

}
