package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
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
 *  <p>References a shipping method by key.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingMethodKeyReferenceImpl implements ShippingMethodKeyReference, ModelBase {

    
    private String key;
    
    
    private com.commercetools.importapi.models.common.ReferenceType typeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodKeyReferenceImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.typeId = ReferenceType.findEnum("shipping-method");
    }
    /**
     * create empty instance
     */
    public ShippingMethodKeyReferenceImpl() {
        this.typeId = ReferenceType.findEnum("shipping-method");
    }

    /**
     *
     */
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>The type of the referenced resource.</p>
     */
    
    public com.commercetools.importapi.models.common.ReferenceType getTypeId(){
        return this.typeId;
    }

    
    public void setKey(final String key){
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShippingMethodKeyReferenceImpl that = (ShippingMethodKeyReferenceImpl) o;
    
        return new EqualsBuilder()
                .append(key, that.key)
                .append(typeId, that.typeId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(key)
            .append(typeId)
            .toHashCode();
    }

}
