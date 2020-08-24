package com.commercetools.importer.models.orders;

import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.orders.ShippingRatePriceTier;
import com.commercetools.importer.models.orders.ShippingRateTierType;
import com.commercetools.importer.models.orders.CartClassificationTier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartClassificationTierBuilder {

    
    private String value;
    
    
    private com.commercetools.importer.models.common.Money price;
    
    
    private java.util.List<com.commercetools.importer.models.orders.ShippingRatePriceTier> tiers;
    
    @Nullable
    private Boolean isMatching;

    public CartClassificationTierBuilder value( final String value) {
        this.value = value;
        return this;
    }
    
    public CartClassificationTierBuilder price( final com.commercetools.importer.models.common.Money price) {
        this.price = price;
        return this;
    }
    
    public CartClassificationTierBuilder tiers( final java.util.List<com.commercetools.importer.models.orders.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }
    
    public CartClassificationTierBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }

    
    public String getValue(){
        return this.value;
    }
    
    
    public com.commercetools.importer.models.common.Money getPrice(){
        return this.price;
    }
    
    
    public java.util.List<com.commercetools.importer.models.orders.ShippingRatePriceTier> getTiers(){
        return this.tiers;
    }
    
    @Nullable
    public Boolean getIsMatching(){
        return this.isMatching;
    }

    public CartClassificationTier build() {
        return new CartClassificationTierImpl(value, price, tiers, isMatching);
    }

    public static CartClassificationTierBuilder of() {
        return new CartClassificationTierBuilder();
    }

    public static CartClassificationTierBuilder of(final CartClassificationTier template) {
        CartClassificationTierBuilder builder = new CartClassificationTierBuilder();
        builder.value = template.getValue();
        builder.price = template.getPrice();
        builder.tiers = template.getTiers();
        builder.isMatching = template.getIsMatching();
        return builder;
    }

}
