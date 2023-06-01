package com.commercetools.history.models.common;

import com.commercetools.history.models.common.DiscountedLineItemPrice;
import com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityImpl;

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
 * DiscountedLineItemPriceForQuantity
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPriceForQuantity discountedLineItemPriceForQuantity = DiscountedLineItemPriceForQuantity.builder()
 *             .quantity(1)
 *             .discountedPrice(discountedPriceBuilder -> discountedPriceBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = DiscountedLineItemPriceForQuantityImpl.class)
public interface DiscountedLineItemPriceForQuantity  {


    /**
     *
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();
    /**
     *
     * @return discountedPrice
     */
    @NotNull
    @Valid
    @JsonProperty("discountedPrice")
    public DiscountedLineItemPrice getDiscountedPrice();

    /**
     * set quantity
     * @param quantity value to be set
     */
    
    public void setQuantity(final Integer quantity);
    
    
    /**
     * set discountedPrice
     * @param discountedPrice value to be set
     */
    
    public void setDiscountedPrice(final DiscountedLineItemPrice discountedPrice);
    

    /**
     * factory method
     * @return instance of DiscountedLineItemPriceForQuantity
     */
    public static DiscountedLineItemPriceForQuantity of(){
        return new DiscountedLineItemPriceForQuantityImpl();
    }
    

    /**
     * factory method to create a shallow copy DiscountedLineItemPriceForQuantity
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountedLineItemPriceForQuantity of(final DiscountedLineItemPriceForQuantity template) {
        DiscountedLineItemPriceForQuantityImpl instance = new DiscountedLineItemPriceForQuantityImpl();
        instance.setQuantity(template.getQuantity());
        instance.setDiscountedPrice(template.getDiscountedPrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountedLineItemPriceForQuantity
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountedLineItemPriceForQuantity deepCopy(@Nullable final DiscountedLineItemPriceForQuantity template) {
        if (template == null) {
            return null;
        }
        DiscountedLineItemPriceForQuantityImpl instance = new DiscountedLineItemPriceForQuantityImpl();
        instance.setQuantity(template.getQuantity());
        instance.setDiscountedPrice(com.commercetools.history.models.common.DiscountedLineItemPrice.deepCopy(template.getDiscountedPrice()));
        return instance;
    }

    /**
     * builder factory method for DiscountedLineItemPriceForQuantity
     * @return builder
     */
    public static DiscountedLineItemPriceForQuantityBuilder builder() {
        return DiscountedLineItemPriceForQuantityBuilder.of();
    }
    
    /**
     * create builder for DiscountedLineItemPriceForQuantity instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPriceForQuantityBuilder builder(final DiscountedLineItemPriceForQuantity template) {
        return DiscountedLineItemPriceForQuantityBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountedLineItemPriceForQuantity(Function<DiscountedLineItemPriceForQuantity, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPriceForQuantity> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPriceForQuantity>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedLineItemPriceForQuantity>";
            }
        };
    }
}
