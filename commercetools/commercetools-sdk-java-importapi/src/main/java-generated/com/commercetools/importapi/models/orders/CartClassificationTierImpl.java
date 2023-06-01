package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.orders.ShippingRatePriceTier;
import com.commercetools.importapi.models.orders.ShippingRateTierType;
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
 * CartClassificationTier
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartClassificationTierImpl implements CartClassificationTier, ModelBase {

    
    private com.commercetools.importapi.models.orders.ShippingRateTierType type;
    
    
    private String value;
    
    
    private com.commercetools.importapi.models.common.Money price;
    
    
    private java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers;
    
    
    private Boolean isMatching;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartClassificationTierImpl(@JsonProperty("value") final String value, @JsonProperty("price") final com.commercetools.importapi.models.common.Money price, @JsonProperty("tiers") final java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers, @JsonProperty("isMatching") final Boolean isMatching) {
        this.value = value;
        this.price = price;
        this.tiers = tiers;
        this.isMatching = isMatching;
        this.type = ShippingRateTierType.findEnum("CartClassification");
    }
    /**
     * create empty instance
     */
    public CartClassificationTierImpl() {
        this.type = ShippingRateTierType.findEnum("CartClassification");
    }

    /**
     *
     */
    
    public com.commercetools.importapi.models.orders.ShippingRateTierType getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public String getValue(){
        return this.value;
    }
    
    /**
     *
     */
    
    public com.commercetools.importapi.models.common.Money getPrice(){
        return this.price;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> getTiers(){
        return this.tiers;
    }
    
    /**
     *
     */
    
    public Boolean getIsMatching(){
        return this.isMatching;
    }

    
    public void setValue(final String value){
        this.value = value;
    }
    
    
    public void setPrice(final com.commercetools.importapi.models.common.Money price){
        this.price = price;
    }
    
    
    public void setTiers(final com.commercetools.importapi.models.orders.ShippingRatePriceTier ...tiers){
       this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }
    
    
    public void setTiers(final java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers){
       this.tiers = tiers;
    }
    
    
    public void setIsMatching(final Boolean isMatching){
        this.isMatching = isMatching;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CartClassificationTierImpl that = (CartClassificationTierImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(value, that.value)
                .append(price, that.price)
                .append(tiers, that.tiers)
                .append(isMatching, that.isMatching)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(value)
            .append(price)
            .append(tiers)
            .append(isMatching)
            .toHashCode();
    }

}
