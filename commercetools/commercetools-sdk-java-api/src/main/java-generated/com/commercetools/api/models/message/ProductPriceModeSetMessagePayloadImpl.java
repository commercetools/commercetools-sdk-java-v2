package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductPriceModeEnum;
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
 *  <p>Generated after a successful Set PriceMode update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductPriceModeSetMessagePayloadImpl implements ProductPriceModeSetMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.product.ProductPriceModeEnum to;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceModeSetMessagePayloadImpl(@JsonProperty("to") final com.commercetools.api.models.product.ProductPriceModeEnum to) {
        this.to = to;
        this.type =  PRODUCT_PRICE_MODE_SET;
    }
    /**
     * create empty instance
     */
    public ProductPriceModeSetMessagePayloadImpl() {
        this.type =  PRODUCT_PRICE_MODE_SET;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>The PriceMode that was set.</p>
     */
    
    public com.commercetools.api.models.product.ProductPriceModeEnum getTo(){
        return this.to;
    }

    
    public void setTo(final com.commercetools.api.models.product.ProductPriceModeEnum to){
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductPriceModeSetMessagePayloadImpl that = (ProductPriceModeSetMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(to, that.to)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(to)
            .toHashCode();
    }

}
