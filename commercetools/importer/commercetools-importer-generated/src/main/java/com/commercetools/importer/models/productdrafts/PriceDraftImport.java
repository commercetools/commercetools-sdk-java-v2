package com.commercetools.importer.models.productdrafts;

import com.commercetools.importer.models.common.ChannelKeyReference;
import com.commercetools.importer.models.common.CustomerGroupKeyReference;
import com.commercetools.importer.models.common.DiscountedPrice;
import com.commercetools.importer.models.common.Money;
import com.commercetools.importer.models.common.PriceTier;
import com.commercetools.importer.models.customfields.Custom;
import java.time.ZonedDateTime;
import com.commercetools.importer.models.productdrafts.PriceDraftImportImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PriceDraftImportImpl.class)
public interface PriceDraftImport  {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();
    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    
    @JsonProperty("country")
    public String getCountry();
    /**
    *  <p>References a customer group by its key.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();
    /**
    *  <p>References a channel by its key.</p>
    */
    @Valid
    @JsonProperty("channel")
    public ChannelKeyReference getChannel();
    
    
    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();
    
    
    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();
    /**
    *  <p>The custom fields for this category.</p>
    */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();
    /**
    *  <p>Sets a discounted price from an external service.</p>
    */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();
    /**
    *  <p>The tiered prices for this price.</p>
    */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();

    public void setValue(final Money value);
    
    public void setCountry(final String country);
    
    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);
    
    public void setChannel(final ChannelKeyReference channel);
    
    public void setValidFrom(final ZonedDateTime validFrom);
    
    public void setValidUntil(final ZonedDateTime validUntil);
    
    public void setCustom(final Custom custom);
    
    public void setDiscounted(final DiscountedPrice discounted);
    
    public void setTiers(final List<PriceTier> tiers);

    public static PriceDraftImportImpl of(){
        return new PriceDraftImportImpl();
    }
    

    public static PriceDraftImportImpl of(final PriceDraftImport template) {
        PriceDraftImportImpl instance = new PriceDraftImportImpl();
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setCustom(template.getCustom());
        instance.setDiscounted(template.getDiscounted());
        instance.setTiers(template.getTiers());
        return instance;
    }

}
