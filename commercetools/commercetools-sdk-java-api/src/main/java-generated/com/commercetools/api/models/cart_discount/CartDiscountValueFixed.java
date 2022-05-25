
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the DiscountedLineItemPrice of the CartDiscountLineItemsTarget or CartDiscountCustomLineItemsTarget to the value specified in the <code>money</code> field, if it is lower than the current Line Item price for the same currency. If the Line Item price is already discounted to a price equal to or lower than the respective price in the <code>money</code> field, this Discount is not applied.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueFixed cartDiscountValueFixed = CartDiscountValueFixed.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueFixedImpl.class)
public interface CartDiscountValueFixed extends CartDiscountValue {

    String FIXED = "fixed";

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<CentPrecisionMoney> getMoney();

    @JsonIgnore
    public void setMoney(final CentPrecisionMoney... money);

    public void setMoney(final List<CentPrecisionMoney> money);

    public static CartDiscountValueFixed of() {
        return new CartDiscountValueFixedImpl();
    }

    public static CartDiscountValueFixed of(final CartDiscountValueFixed template) {
        CartDiscountValueFixedImpl instance = new CartDiscountValueFixedImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    public static CartDiscountValueFixedBuilder builder() {
        return CartDiscountValueFixedBuilder.of();
    }

    public static CartDiscountValueFixedBuilder builder(final CartDiscountValueFixed template) {
        return CartDiscountValueFixedBuilder.of(template);
    }

    default <T> T withCartDiscountValueFixed(Function<CartDiscountValueFixed, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueFixed> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueFixed>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueFixed>";
            }
        };
    }
}
