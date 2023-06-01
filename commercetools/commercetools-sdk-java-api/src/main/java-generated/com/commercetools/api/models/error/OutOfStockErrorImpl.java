package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
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
 *  <p>Returned when some of the Line Items are out of stock at the time of placing an Order.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Order from Cart, Create Order in Store from Cart, and Create Order by Import requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
 *  </ul>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OutOfStockErrorImpl implements OutOfStockError, ModelBase {

    
    private String code;
    
    
    private String message;
    
    
    private Map<String, java.lang.Object> values;
    
    
    private java.util.List<String> lineItems;
    
    
    private java.util.List<String> skus;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OutOfStockErrorImpl(@JsonProperty("message") final String message, @JsonProperty("values") final Map<String, java.lang.Object> values, @JsonProperty("lineItems") final java.util.List<String> lineItems, @JsonProperty("skus") final java.util.List<String> skus) {
        this.message = message;
        this.values = values;
        this.lineItems = lineItems;
        this.skus = skus;
        this.code =  OUT_OF_STOCK;
    }
    /**
     * create empty instance
     */
    public OutOfStockErrorImpl() {
        this.code =  OUT_OF_STOCK;
    }

    /**
     *
     */
    
    public String getCode(){
        return this.code;
    }
    
    /**
     *  <p><code>"Some line items are out of stock at the time of placing the order: $itemSku."</code></p>
     */
    
    public String getMessage(){
        return this.message;
    }
    
    /**
     *  <p>Error-specific additional fields.</p>
     */
    
    public Map<String,java.lang.Object> values() {
        return values;
    }
    
    /**
     *  <p>Unique identifiers of the Line Items that are out of stock.</p>
     */
    
    public java.util.List<String> getLineItems(){
        return this.lineItems;
    }
    
    /**
     *  <p>SKUs of the Line Items that are out of stock.</p>
     */
    
    public java.util.List<String> getSkus(){
        return this.skus;
    }

    
    public void setMessage(final String message){
        this.message = message;
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
    
    
    public void setSkus(final String ...skus){
       this.skus = new ArrayList<>(Arrays.asList(skus));
    }
    
    
    public void setSkus(final java.util.List<String> skus){
       this.skus = skus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OutOfStockErrorImpl that = (OutOfStockErrorImpl) o;
    
        return new EqualsBuilder()
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(lineItems, that.lineItems)
                .append(skus, that.skus)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(code)
            .append(message)
            .append(values)
            .append(lineItems)
            .append(skus)
            .toHashCode();
    }

}
