package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.prices.SubRate;
import com.commercetools.importapi.models.orders.ExternalTaxRateDraftImpl;

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
 * ExternalTaxRateDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalTaxRateDraft externalTaxRateDraft = ExternalTaxRateDraft.builder()
 *             .name("{name}")
 *             .country("{country}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ExternalTaxRateDraftImpl.class)
public interface ExternalTaxRateDraft extends io.vrap.rmf.base.client.Draft<ExternalTaxRateDraft> {


    /**
     *
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *
     * @return amount
     */
    
    @JsonProperty("amount")
    public Double getAmount();
    /**
     *
     * @return country
     */
    @NotNull
    @JsonProperty("country")
    public String getCountry();
    /**
     *
     * @return state
     */
    
    @JsonProperty("state")
    public String getState();
    /**
     *
     * @return subRates
     */
    @Valid
    @JsonProperty("subRates")
    public List<SubRate> getSubRates();
    /**
     *
     * @return includedInPrice
     */
    
    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();

    /**
     * set name
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     * set amount
     * @param amount value to be set
     */
    
    public void setAmount(final Double amount);
    
    
    /**
     * set country
     * @param country value to be set
     */
    
    public void setCountry(final String country);
    
    
    /**
     * set state
     * @param state value to be set
     */
    
    public void setState(final String state);
    
    
    /**
     * set subRates
     * @param subRates values to be set
     */
    
    @JsonIgnore
    public void setSubRates(final SubRate ...subRates);
    /**
     * set subRates
     * @param subRates values to be set
     */
    
    public void setSubRates(final List<SubRate> subRates);
    
    /**
     * set includedInPrice
     * @param includedInPrice value to be set
     */
    
    public void setIncludedInPrice(final Boolean includedInPrice);
    

    /**
     * factory method
     * @return instance of ExternalTaxRateDraft
     */
    public static ExternalTaxRateDraft of(){
        return new ExternalTaxRateDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy ExternalTaxRateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExternalTaxRateDraft of(final ExternalTaxRateDraft template) {
        ExternalTaxRateDraftImpl instance = new ExternalTaxRateDraftImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(template.getSubRates());
        instance.setIncludedInPrice(template.getIncludedInPrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of ExternalTaxRateDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExternalTaxRateDraft deepCopy(@Nullable final ExternalTaxRateDraft template) {
        if (template == null) {
            return null;
        }
        ExternalTaxRateDraftImpl instance = new ExternalTaxRateDraftImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(Optional.ofNullable(template.getSubRates())
                .map(t -> t.stream().map(com.commercetools.importapi.models.prices.SubRate::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setIncludedInPrice(template.getIncludedInPrice());
        return instance;
    }

    /**
     * builder factory method for ExternalTaxRateDraft
     * @return builder
     */
    public static ExternalTaxRateDraftBuilder builder() {
        return ExternalTaxRateDraftBuilder.of();
    }
    
    /**
     * create builder for ExternalTaxRateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExternalTaxRateDraftBuilder builder(final ExternalTaxRateDraft template) {
        return ExternalTaxRateDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExternalTaxRateDraft(Function<ExternalTaxRateDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExternalTaxRateDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExternalTaxRateDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ExternalTaxRateDraft>";
            }
        };
    }
}
