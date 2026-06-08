
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CartDiscountValueAbsoluteDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueAbsoluteDraft cartDiscountValueAbsoluteDraft = CartDiscountValueAbsoluteDraft.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("absolute")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueAbsoluteDraftImpl.class)
public interface CartDiscountValueAbsoluteDraft
        extends CartDiscountValueDraft, io.vrap.rmf.base.client.Draft<CartDiscountValueAbsoluteDraft> {

    /**
     * discriminator value for CartDiscountValueAbsoluteDraft
     */
    String ABSOLUTE = "absolute";

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<Money> getMoney();

    /**
     *  <p>Determines how the discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountLineItemsTarget" rel="nofollow">CartDiscountLineItemTarget</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemTarget</a>.</p>
     *  <p>If not set, the default behavior is <code>ProportionateDistribution</code>.</p>
     * @return applicationMode
     */

    @JsonProperty("applicationMode")
    public DiscountApplicationMode getApplicationMode();

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param money values to be set
     */

    @JsonIgnore
    public void setMoney(final Money... money);

    /**
     *  <p>Money values in different currencies. An absolute Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param money values to be set
     */

    public void setMoney(final List<Money> money);

    /**
     *  <p>Determines how the discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountLineItemsTarget" rel="nofollow">CartDiscountLineItemTarget</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemTarget</a>.</p>
     *  <p>If not set, the default behavior is <code>ProportionateDistribution</code>.</p>
     * @param applicationMode value to be set
     */

    public void setApplicationMode(final DiscountApplicationMode applicationMode);

    /**
     * factory method
     * @return instance of CartDiscountValueAbsoluteDraft
     */
    public static CartDiscountValueAbsoluteDraft of() {
        return new CartDiscountValueAbsoluteDraftImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountValueAbsoluteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountValueAbsoluteDraft of(final CartDiscountValueAbsoluteDraft template) {
        CartDiscountValueAbsoluteDraftImpl instance = new CartDiscountValueAbsoluteDraftImpl();
        instance.setMoney(template.getMoney());
        instance.setApplicationMode(template.getApplicationMode());
        return instance;
    }

    public CartDiscountValueAbsoluteDraft copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountValueAbsoluteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValueAbsoluteDraft deepCopy(@Nullable final CartDiscountValueAbsoluteDraft template) {
        if (template == null) {
            return null;
        }
        CartDiscountValueAbsoluteDraftImpl instance = new CartDiscountValueAbsoluteDraftImpl();
        instance.setMoney(Optional.ofNullable(template.getMoney())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Money::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setApplicationMode(template.getApplicationMode());
        return instance;
    }

    /**
     * builder factory method for CartDiscountValueAbsoluteDraft
     * @return builder
     */
    public static CartDiscountValueAbsoluteDraftBuilder builder() {
        return CartDiscountValueAbsoluteDraftBuilder.of();
    }

    /**
     * create builder for CartDiscountValueAbsoluteDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueAbsoluteDraftBuilder builder(final CartDiscountValueAbsoluteDraft template) {
        return CartDiscountValueAbsoluteDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValueAbsoluteDraft(Function<CartDiscountValueAbsoluteDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueAbsoluteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueAbsoluteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueAbsoluteDraft>";
            }
        };
    }
}
