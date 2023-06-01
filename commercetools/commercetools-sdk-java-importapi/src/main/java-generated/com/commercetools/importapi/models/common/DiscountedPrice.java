package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.ProductDiscountKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.common.DiscountedPriceImpl;

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
 * DiscountedPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedPrice discountedPrice = DiscountedPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .discount(discountBuilder -> discountBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = DiscountedPriceImpl.class)
public interface DiscountedPrice  {


    /**
     *
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();
    /**
     *  <p>Reference to a ProductDiscount.</p>
     * @return discount
     */
    @NotNull
    @Valid
    @JsonProperty("discount")
    public ProductDiscountKeyReference getDiscount();

    /**
     * set value
     * @param value value to be set
     */
    
    public void setValue(final TypedMoney value);
    
    
    /**
     *  <p>Reference to a ProductDiscount.</p>
     * @param discount value to be set
     */
    
    public void setDiscount(final ProductDiscountKeyReference discount);
    

    /**
     * factory method
     * @return instance of DiscountedPrice
     */
    public static DiscountedPrice of(){
        return new DiscountedPriceImpl();
    }
    

    /**
     * factory method to create a shallow copy DiscountedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountedPrice of(final DiscountedPrice template) {
        DiscountedPriceImpl instance = new DiscountedPriceImpl();
        instance.setValue(template.getValue());
        instance.setDiscount(template.getDiscount());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountedPrice
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountedPrice deepCopy(@Nullable final DiscountedPrice template) {
        if (template == null) {
            return null;
        }
        DiscountedPriceImpl instance = new DiscountedPriceImpl();
        instance.setValue(com.commercetools.importapi.models.common.TypedMoney.deepCopy(template.getValue()));
        instance.setDiscount(com.commercetools.importapi.models.common.ProductDiscountKeyReference.deepCopy(template.getDiscount()));
        return instance;
    }

    /**
     * builder factory method for DiscountedPrice
     * @return builder
     */
    public static DiscountedPriceBuilder builder() {
        return DiscountedPriceBuilder.of();
    }
    
    /**
     * create builder for DiscountedPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedPriceBuilder builder(final DiscountedPrice template) {
        return DiscountedPriceBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountedPrice(Function<DiscountedPrice, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedPrice>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedPrice>";
            }
        };
    }
}
