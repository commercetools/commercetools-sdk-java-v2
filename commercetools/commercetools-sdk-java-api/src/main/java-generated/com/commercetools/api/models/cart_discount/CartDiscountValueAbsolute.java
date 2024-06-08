
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Discounts the CartDiscountTarget by an absolute amount (not allowed for MultiBuyLineItemsTarget and MultiBuyCustomLineItemsTarget).</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueAbsolute cartDiscountValueAbsolute = CartDiscountValueAbsolute.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueAbsoluteImpl.class)
public interface CartDiscountValueAbsolute extends CartDiscountValue, CartDiscountValueAbsoluteMixin {

    /**
     * discriminator value for CartDiscountValueAbsolute
     */
    String ABSOLUTE = "absolute";

    /**
     *  <p>Cent precision money values in different currencies.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<CentPrecisionMoney> getMoney();

    /**
     *  <p>Cent precision money values in different currencies.</p>
     * @param money values to be set
     */

    @JsonIgnore
    public void setMoney(final CentPrecisionMoney... money);

    /**
     *  <p>Cent precision money values in different currencies.</p>
     * @param money values to be set
     */

    public void setMoney(final List<CentPrecisionMoney> money);

    /**
     * factory method
     * @return instance of CartDiscountValueAbsolute
     */
    public static CartDiscountValueAbsolute of() {
        return new CartDiscountValueAbsoluteImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountValueAbsolute
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountValueAbsolute of(final CartDiscountValueAbsolute template) {
        CartDiscountValueAbsoluteImpl instance = new CartDiscountValueAbsoluteImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountValueAbsolute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValueAbsolute deepCopy(@Nullable final CartDiscountValueAbsolute template) {
        if (template == null) {
            return null;
        }
        CartDiscountValueAbsoluteImpl instance = new CartDiscountValueAbsoluteImpl();
        instance.setMoney(Optional.ofNullable(template.getMoney())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.CentPrecisionMoney::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartDiscountValueAbsolute
     * @return builder
     */
    public static CartDiscountValueAbsoluteBuilder builder() {
        return CartDiscountValueAbsoluteBuilder.of();
    }

    /**
     * create builder for CartDiscountValueAbsolute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueAbsoluteBuilder builder(final CartDiscountValueAbsolute template) {
        return CartDiscountValueAbsoluteBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValueAbsolute(Function<CartDiscountValueAbsolute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueAbsolute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueAbsolute>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueAbsolute>";
            }
        };
    }
}
