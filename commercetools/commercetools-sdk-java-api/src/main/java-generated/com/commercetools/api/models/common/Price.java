package com.commercetools.api.models.common;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.PriceTier;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.common.PriceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>The representation for prices embedded in LineItems and in ProductVariants when the ProductPriceMode is <code>Embedded</code>. For the <code>Standalone</code> ProductPriceMode refer to StandalonePrice.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Price price = Price.builder()
 *             .id("{id}")
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = PriceImpl.class)
public interface Price extends com.commercetools.api.models.Customizable<Price>, com.commercetools.api.models.WithKey {


    /**
     *  <p>Unique identifier of this Price.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();
    /**
     *  <p>User-defined identifier of the Price. It is unique per ProductVariant.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();
    /**
     *  <p>Money value of this Price.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();
    /**
     *  <p>Country for which this Price is valid.</p>
     * @return country
     */
    
    @JsonProperty("country")
    public String getCountry();
    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();
    /**
     *  <p><code>ProductDistribution</code> Channel for which this Price is valid.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelReference getChannel();
    /**
     *  <p>Date and time from which this Price is valid.</p>
     * @return validFrom
     */
    
    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();
    /**
     *  <p>Date and time until this Price is valid. Prices that are no longer valid are not automatically removed, but they can be removed if necessary.</p>
     * @return validUntil
     */
    
    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();
    /**
     *  <p>Is set if a ProductDiscount has been applied. If set, the API uses the DiscountedPrice value for the Line Item Price selection. When a relative discount has been applied and the fraction part of the DiscountedPrice <code>value</code> is 0.5, the <code>value</code> is rounded in favor of the customer with half-down rounding.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();
    /**
     *  <p>Present if different Prices for certain LineItem quantities have been specified.</p>
     * @return tiers
     */
    @Valid
    @JsonProperty("tiers")
    public List<PriceTier> getTiers();
    /**
     *  <p>Custom Fields defined for the Price.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique identifier of this Price.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     *  <p>User-defined identifier of the Price. It is unique per ProductVariant.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    
    
    /**
     *  <p>Money value of this Price.</p>
     * @param value value to be set
     */
    
    public void setValue(final TypedMoney value);
    
    
    /**
     *  <p>Country for which this Price is valid.</p>
     * @param country value to be set
     */
    
    public void setCountry(final String country);
    
    
    /**
     *  <p>CustomerGroup for which this Price is valid.</p>
     * @param customerGroup value to be set
     */
    
    public void setCustomerGroup(final CustomerGroupReference customerGroup);
    
    
    /**
     *  <p><code>ProductDistribution</code> Channel for which this Price is valid.</p>
     * @param channel value to be set
     */
    
    public void setChannel(final ChannelReference channel);
    
    
    /**
     *  <p>Date and time from which this Price is valid.</p>
     * @param validFrom value to be set
     */
    
    public void setValidFrom(final ZonedDateTime validFrom);
    
    
    /**
     *  <p>Date and time until this Price is valid. Prices that are no longer valid are not automatically removed, but they can be removed if necessary.</p>
     * @param validUntil value to be set
     */
    
    public void setValidUntil(final ZonedDateTime validUntil);
    
    
    /**
     *  <p>Is set if a ProductDiscount has been applied. If set, the API uses the DiscountedPrice value for the Line Item Price selection. When a relative discount has been applied and the fraction part of the DiscountedPrice <code>value</code> is 0.5, the <code>value</code> is rounded in favor of the customer with half-down rounding.</p>
     * @param discounted value to be set
     */
    
    public void setDiscounted(final DiscountedPrice discounted);
    
    
    /**
     *  <p>Present if different Prices for certain LineItem quantities have been specified.</p>
     * @param tiers values to be set
     */
    
    @JsonIgnore
    public void setTiers(final PriceTier ...tiers);
    /**
     *  <p>Present if different Prices for certain LineItem quantities have been specified.</p>
     * @param tiers values to be set
     */
    
    public void setTiers(final List<PriceTier> tiers);
    
    /**
     *  <p>Custom Fields defined for the Price.</p>
     * @param custom value to be set
     */
    
    public void setCustom(final CustomFields custom);
    

    /**
     * factory method
     * @return instance of Price
     */
    public static Price of(){
        return new PriceImpl();
    }
    

    /**
     * factory method to create a shallow copy Price
     * @param template instance to be copied
     * @return copy instance
     */
    public static Price of(final Price template) {
        PriceImpl instance = new PriceImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setValue(template.getValue());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setDiscounted(template.getDiscounted());
        instance.setTiers(template.getTiers());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of Price
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Price deepCopy(@Nullable final Price template) {
        if (template == null) {
            return null;
        }
        PriceImpl instance = new PriceImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setValue(com.commercetools.api.models.common.TypedMoney.deepCopy(template.getValue()));
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setChannel(com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getChannel()));
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        instance.setDiscounted(com.commercetools.api.models.common.DiscountedPrice.deepCopy(template.getDiscounted()));
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream().map(com.commercetools.api.models.common.PriceTier::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for Price
     * @return builder
     */
    public static PriceBuilder builder() {
        return PriceBuilder.of();
    }
    
    /**
     * create builder for Price instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceBuilder builder(final Price template) {
        return PriceBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPrice(Function<Price, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Price> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Price>() {
            @Override
            public String toString() {
                return "TypeReference<Price>";
            }
        };
    }
}
