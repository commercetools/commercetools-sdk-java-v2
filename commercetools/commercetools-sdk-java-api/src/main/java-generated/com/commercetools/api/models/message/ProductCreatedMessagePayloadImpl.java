package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductProjection;
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
 *  <p>Generated after a successful Create Product request.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductCreatedMessagePayloadImpl implements ProductCreatedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.product.ProductProjection productProjection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductCreatedMessagePayloadImpl(@JsonProperty("productProjection") final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
        this.type =  PRODUCT_CREATED;
    }
    /**
     * create empty instance
     */
    public ProductCreatedMessagePayloadImpl() {
        this.type =  PRODUCT_CREATED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>The staged Product Projection of the Product at the time of creation.</p>
     */
    
    public com.commercetools.api.models.product.ProductProjection getProductProjection(){
        return this.productProjection;
    }

    
    public void setProductProjection(final com.commercetools.api.models.product.ProductProjection productProjection){
        this.productProjection = productProjection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductCreatedMessagePayloadImpl that = (ProductCreatedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(productProjection, that.productProjection)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(productProjection)
            .toHashCode();
    }

}
