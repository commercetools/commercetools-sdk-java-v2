package com.commercetools.api.models.standalone_price;

import com.commercetools.api.models.common.DiscountedPriceDraft;
import com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction;
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
 *  <p>Discounts a Standalone Price. The referenced ProductDiscount in the discounted field must be of type external, active, and its predicate must match the referenced Price. Produces the StandalonePriceExternalDiscountSet Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StandalonePriceSetDiscountedPriceActionImpl implements StandalonePriceSetDiscountedPriceAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.common.DiscountedPriceDraft discounted;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceSetDiscountedPriceActionImpl(@JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPriceDraft discounted) {
        this.discounted = discounted;
        this.action =  SET_DISCOUNTED_PRICE;
    }
    /**
     * create empty instance
     */
    public StandalonePriceSetDiscountedPriceActionImpl() {
        this.action =  SET_DISCOUNTED_PRICE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    
    public com.commercetools.api.models.common.DiscountedPriceDraft getDiscounted(){
        return this.discounted;
    }

    
    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPriceDraft discounted){
        this.discounted = discounted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StandalonePriceSetDiscountedPriceActionImpl that = (StandalonePriceSetDiscountedPriceActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(discounted, that.discounted)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(discounted)
            .toHashCode();
    }

}
