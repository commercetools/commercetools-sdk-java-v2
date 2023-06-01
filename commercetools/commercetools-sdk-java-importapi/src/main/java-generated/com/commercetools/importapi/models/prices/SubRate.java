package com.commercetools.importapi.models.prices;


import com.commercetools.importapi.models.prices.SubRateImpl;

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
 * SubRate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubRate subRate = SubRate.builder()
 *             .name("{name}")
 *             .amount(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SubRateImpl.class)
public interface SubRate  {


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
    @NotNull
    @JsonProperty("amount")
    public Double getAmount();

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
     * factory method
     * @return instance of SubRate
     */
    public static SubRate of(){
        return new SubRateImpl();
    }
    

    /**
     * factory method to create a shallow copy SubRate
     * @param template instance to be copied
     * @return copy instance
     */
    public static SubRate of(final SubRate template) {
        SubRateImpl instance = new SubRateImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        return instance;
    }

    /**
     * factory method to create a deep copy of SubRate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SubRate deepCopy(@Nullable final SubRate template) {
        if (template == null) {
            return null;
        }
        SubRateImpl instance = new SubRateImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        return instance;
    }

    /**
     * builder factory method for SubRate
     * @return builder
     */
    public static SubRateBuilder builder() {
        return SubRateBuilder.of();
    }
    
    /**
     * create builder for SubRate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubRateBuilder builder(final SubRate template) {
        return SubRateBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSubRate(Function<SubRate, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SubRate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubRate>() {
            @Override
            public String toString() {
                return "TypeReference<SubRate>";
            }
        };
    }
}
