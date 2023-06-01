package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
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
 *  <p>ResourceIdentifier to a CartDiscount.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartDiscountResourceIdentifierImpl implements CartDiscountResourceIdentifier, ModelBase {

    
    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    
    private String id;
    
    
    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountResourceIdentifierImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.id = id;
        this.key = key;
        this.typeId = ReferenceTypeId.findEnum("cart-discount");
    }
    /**
     * create empty instance
     */
    public CartDiscountResourceIdentifierImpl() {
        this.typeId = ReferenceTypeId.findEnum("cart-discount");
    }

    /**
     *  <p>Type of referenced resource. If given, it must match the expected ReferenceTypeId of the referenced resource.</p>
     */
    
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    /**
     *  <p>Unique identifier of the referenced CartDiscount. Either <code>id</code> or <code>key</code> is required.</p>
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>User-defined unique identifier of the referenced CartDiscount. Either <code>id</code> or <code>key</code> is required.</p>
     */
    
    public String getKey(){
        return this.key;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setKey(final String key){
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartDiscountResourceIdentifierImpl that = (CartDiscountResourceIdentifierImpl) o;
    
        return new EqualsBuilder()
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(key, that.key)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(typeId)
            .append(id)
            .append(key)
            .toHashCode();
    }

}
