package com.commercetools.api.models.order;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.order.Order;
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
 * OrderReference
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderReferenceImpl implements OrderReference, ModelBase {

    
    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    
    private String id;
    
    
    private com.commercetools.api.models.order.Order obj;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderReferenceImpl(@JsonProperty("id") final String id, @JsonProperty("obj") final com.commercetools.api.models.order.Order obj) {
        this.id = id;
        this.obj = obj;
        this.typeId = ReferenceTypeId.findEnum("order");
    }
    /**
     * create empty instance
     */
    public OrderReferenceImpl() {
        this.typeId = ReferenceTypeId.findEnum("order");
    }

    /**
     *  <p>Type of referenced resource.</p>
     */
    
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    /**
     *  <p>Unique ID of the referenced resource.</p>
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *
     */
    
    public com.commercetools.api.models.order.Order getObj(){
        return this.obj;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setObj(final com.commercetools.api.models.order.Order obj){
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderReferenceImpl that = (OrderReferenceImpl) o;
    
        return new EqualsBuilder()
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(obj, that.obj)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(typeId)
            .append(id)
            .append(obj)
            .toHashCode();
    }

}
