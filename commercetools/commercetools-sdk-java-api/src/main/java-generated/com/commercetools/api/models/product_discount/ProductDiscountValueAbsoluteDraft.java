
package com.commercetools.api.models.product_discount;

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
 *  <p>Discounts the Product Price by a fixed amount, defined by the <code>money</code> field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueAbsoluteDraft productDiscountValueAbsoluteDraft = ProductDiscountValueAbsoluteDraft.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountValueAbsoluteDraftImpl.class)
public interface ProductDiscountValueAbsoluteDraft
        extends ProductDiscountValueDraft, io.vrap.rmf.base.client.Draft<ProductDiscountValueAbsoluteDraft> {

    /**
     * discriminator value for ProductDiscountValueAbsoluteDraft
     */
    String ABSOLUTE = "absolute";

    /**
     *  <p>Money values in different currencies. An absolute Product Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<Money> getMoney();

    /**
     *  <p>Money values in different currencies. An absolute Product Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     * @param money values to be set
     */

    @JsonIgnore
    public void setMoney(final Money... money);

    /**
     *  <p>Money values in different currencies. An absolute Product Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an InvalidOperation error.</p>
     * @param money values to be set
     */

    public void setMoney(final List<Money> money);

    /**
     * factory method
     * @return instance of ProductDiscountValueAbsoluteDraft
     */
    public static ProductDiscountValueAbsoluteDraft of() {
        return new ProductDiscountValueAbsoluteDraftImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountValueAbsoluteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountValueAbsoluteDraft of(final ProductDiscountValueAbsoluteDraft template) {
        ProductDiscountValueAbsoluteDraftImpl instance = new ProductDiscountValueAbsoluteDraftImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductDiscountValueAbsoluteDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountValueAbsoluteDraft deepCopy(
            @Nullable final ProductDiscountValueAbsoluteDraft template) {
        if (template == null) {
            return null;
        }
        ProductDiscountValueAbsoluteDraftImpl instance = new ProductDiscountValueAbsoluteDraftImpl();
        instance.setMoney(Optional.ofNullable(template.getMoney())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Money::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductDiscountValueAbsoluteDraft
     * @return builder
     */
    public static ProductDiscountValueAbsoluteDraftBuilder builder() {
        return ProductDiscountValueAbsoluteDraftBuilder.of();
    }

    /**
     * create builder for ProductDiscountValueAbsoluteDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountValueAbsoluteDraftBuilder builder(final ProductDiscountValueAbsoluteDraft template) {
        return ProductDiscountValueAbsoluteDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountValueAbsoluteDraft(Function<ProductDiscountValueAbsoluteDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueAbsoluteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueAbsoluteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValueAbsoluteDraft>";
            }
        };
    }
}
