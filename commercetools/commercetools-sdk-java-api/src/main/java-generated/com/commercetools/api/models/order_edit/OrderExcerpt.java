
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Excerpt of the Order extracting the total and the taxed price.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderExcerpt orderExcerpt = OrderExcerpt.builder()
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderExcerptImpl.class)
public interface OrderExcerpt {

    /**
     *  <p>Total price of the Order.</p>
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();

    /**
     *  <p>Taxed price of the Order.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();

    /**
     *  <p>Current version of the Order.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Total price of the Order.</p>
     * @param totalPrice value to be set
     */

    public void setTotalPrice(final TypedMoney totalPrice);

    /**
     *  <p>Taxed price of the Order.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedPrice taxedPrice);

    /**
     *  <p>Current version of the Order.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     * factory method
     * @return instance of OrderExcerpt
     */
    public static OrderExcerpt of() {
        return new OrderExcerptImpl();
    }

    /**
     * factory method to create a shallow copy OrderExcerpt
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderExcerpt of(final OrderExcerpt template) {
        OrderExcerptImpl instance = new OrderExcerptImpl();
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setVersion(template.getVersion());
        return instance;
    }

    public OrderExcerpt copyDeep();

    /**
     * factory method to create a deep copy of OrderExcerpt
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderExcerpt deepCopy(@Nullable final OrderExcerpt template) {
        if (template == null) {
            return null;
        }
        OrderExcerptImpl instance = new OrderExcerptImpl();
        instance.setTotalPrice(com.commercetools.api.models.common.TypedMoney.deepCopy(template.getTotalPrice()));
        instance.setTaxedPrice(com.commercetools.api.models.cart.TaxedPrice.deepCopy(template.getTaxedPrice()));
        instance.setVersion(template.getVersion());
        return instance;
    }

    /**
     * builder factory method for OrderExcerpt
     * @return builder
     */
    public static OrderExcerptBuilder builder() {
        return OrderExcerptBuilder.of();
    }

    /**
     * create builder for OrderExcerpt instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderExcerptBuilder builder(final OrderExcerpt template) {
        return OrderExcerptBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderExcerpt(Function<OrderExcerpt, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderExcerpt> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderExcerpt>() {
            @Override
            public String toString() {
                return "TypeReference<OrderExcerpt>";
            }
        };
    }
}
