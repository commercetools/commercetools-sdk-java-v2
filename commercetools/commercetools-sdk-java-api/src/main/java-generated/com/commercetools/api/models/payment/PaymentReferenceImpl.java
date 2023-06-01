package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.payment.Payment;
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
 *  <p>Reference to a Payment.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentReferenceImpl implements PaymentReference, ModelBase {

    
    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    
    private String id;
    
    
    private com.commercetools.api.models.payment.Payment obj;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentReferenceImpl(@JsonProperty("id") final String id, @JsonProperty("obj") final com.commercetools.api.models.payment.Payment obj) {
        this.id = id;
        this.obj = obj;
        this.typeId = ReferenceTypeId.findEnum("payment");
    }
    /**
     * create empty instance
     */
    public PaymentReferenceImpl() {
        this.typeId = ReferenceTypeId.findEnum("payment");
    }

    /**
     *  <p>Type of referenced resource.</p>
     */
    
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    /**
     *  <p>Unique identifier of the referenced Payment.</p>
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Contains the representation of the expanded Payment. Only present in responses to requests with Reference Expansion for Payments.</p>
     */
    
    public com.commercetools.api.models.payment.Payment getObj(){
        return this.obj;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setObj(final com.commercetools.api.models.payment.Payment obj){
        this.obj = obj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        PaymentReferenceImpl that = (PaymentReferenceImpl) o;
    
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
