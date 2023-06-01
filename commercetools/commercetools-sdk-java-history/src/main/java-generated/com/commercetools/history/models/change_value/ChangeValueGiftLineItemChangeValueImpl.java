package com.commercetools.history.models.change_value;

import com.commercetools.history.models.change_value.ChangeValueChangeValue;
import com.commercetools.history.models.common.Reference;
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
 *  <p>Shape of the value for cart discounts gift line item value.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeValueGiftLineItemChangeValueImpl implements ChangeValueGiftLineItemChangeValue, ModelBase {

    
    private String type;
    
    
    private com.commercetools.history.models.common.Reference product;
    
    
    private Integer variantId;
    
    
    private com.commercetools.history.models.common.Reference supplyChannel;
    
    
    private com.commercetools.history.models.common.Reference distributionChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeValueGiftLineItemChangeValueImpl(@JsonProperty("product") final com.commercetools.history.models.common.Reference product, @JsonProperty("variantId") final Integer variantId, @JsonProperty("supplyChannel") final com.commercetools.history.models.common.Reference supplyChannel, @JsonProperty("distributionChannel") final com.commercetools.history.models.common.Reference distributionChannel) {
        this.product = product;
        this.variantId = variantId;
        this.supplyChannel = supplyChannel;
        this.distributionChannel = distributionChannel;
        this.type =  GIFT_LINE_ITEM;
    }
    /**
     * create empty instance
     */
    public ChangeValueGiftLineItemChangeValueImpl() {
        this.type =  GIFT_LINE_ITEM;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Reference getProduct(){
        return this.product;
    }
    
    /**
     *
     */
    
    public Integer getVariantId(){
        return this.variantId;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Reference getSupplyChannel(){
        return this.supplyChannel;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Reference getDistributionChannel(){
        return this.distributionChannel;
    }

    
    public void setProduct(final com.commercetools.history.models.common.Reference product){
        this.product = product;
    }
    
    
    public void setVariantId(final Integer variantId){
        this.variantId = variantId;
    }
    
    
    public void setSupplyChannel(final com.commercetools.history.models.common.Reference supplyChannel){
        this.supplyChannel = supplyChannel;
    }
    
    
    public void setDistributionChannel(final com.commercetools.history.models.common.Reference distributionChannel){
        this.distributionChannel = distributionChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeValueGiftLineItemChangeValueImpl that = (ChangeValueGiftLineItemChangeValueImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(product, that.product)
                .append(variantId, that.variantId)
                .append(supplyChannel, that.supplyChannel)
                .append(distributionChannel, that.distributionChannel)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(product)
            .append(variantId)
            .append(supplyChannel)
            .append(distributionChannel)
            .toHashCode();
    }

}
