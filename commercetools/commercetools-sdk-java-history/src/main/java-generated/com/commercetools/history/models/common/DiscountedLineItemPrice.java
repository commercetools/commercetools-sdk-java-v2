
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedLineItemPrice
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPrice discountedLineItemPrice = DiscountedLineItemPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .plusIncludedDiscounts(includedDiscountsBuilder -> includedDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountedLineItemPriceImpl.class)
public interface DiscountedLineItemPrice {

    /**
     *
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
     *
     * @return includedDiscounts
     */
    @NotNull
    @Valid
    @JsonProperty("includedDiscounts")
    public List<DiscountedLineItemPortion> getIncludedDiscounts();

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final Money value);

    /**
     * set includedDiscounts
     * @param includedDiscounts values to be set
     */

    @JsonIgnore
    public void setIncludedDiscounts(final DiscountedLineItemPortion... includedDiscounts);

    /**
     * set includedDiscounts
     * @param includedDiscounts values to be set
     */

    public void setIncludedDiscounts(final List<DiscountedLineItemPortion> includedDiscounts);

    /**
     * factory method
     * @return instance of DiscountedLineItemPrice
     */
    public static DiscountedLineItemPrice of() {
        return new DiscountedLineItemPriceImpl();
    }

    /**
     * factory method to copy an instance of DiscountedLineItemPrice
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountedLineItemPrice of(final DiscountedLineItemPrice template) {
        DiscountedLineItemPriceImpl instance = new DiscountedLineItemPriceImpl();
        instance.setValue(template.getValue());
        instance.setIncludedDiscounts(template.getIncludedDiscounts());
        return instance;
    }

    /**
     * builder factory method for DiscountedLineItemPrice
     * @return builder
     */
    public static DiscountedLineItemPriceBuilder builder() {
        return DiscountedLineItemPriceBuilder.of();
    }

    /**
     * create builder for DiscountedLineItemPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPriceBuilder builder(final DiscountedLineItemPrice template) {
        return DiscountedLineItemPriceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountedLineItemPrice(Function<DiscountedLineItemPrice, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPrice> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPrice>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedLineItemPrice>";
            }
        };
    }
}
