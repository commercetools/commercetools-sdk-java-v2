package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.CartDiscountKeyReference;
import com.commercetools.importapi.models.common.CartKeyReference;
import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.CustomObjectKeyReference;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.CustomerKeyReference;
import com.commercetools.importapi.models.common.DiscountCodeKeyReference;
import com.commercetools.importapi.models.common.OrderKeyReference;
import com.commercetools.importapi.models.common.PaymentKeyReference;
import com.commercetools.importapi.models.common.PriceKeyReference;
import com.commercetools.importapi.models.common.ProductDiscountKeyReference;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ShippingMethodKeyReference;
import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.common.StoreKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.common.TypeKeyReference;
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
 *  <p>References a resource by key.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class KeyReferenceImpl implements KeyReference, ModelBase {

    
    private String key;
    
    
    private com.commercetools.importapi.models.common.ReferenceType typeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    KeyReferenceImpl(@JsonProperty("key") final String key, @JsonProperty("typeId") final com.commercetools.importapi.models.common.ReferenceType typeId) {
        this.key = key;
        this.typeId = typeId;
    }
    /**
     * create empty instance
     */
    public KeyReferenceImpl() {
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
    
        KeyReferenceImpl that = (KeyReferenceImpl) o;
    
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
