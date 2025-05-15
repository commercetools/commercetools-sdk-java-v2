
package com.commercetools.api.models.product_discount;

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
 *  <p>Discounts the Product's Price by a fixed amount, defined by the <code>money</code> field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueAbsolute productDiscountValueAbsolute = ProductDiscountValueAbsolute.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("absolute")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountValueAbsoluteImpl.class)
public interface ProductDiscountValueAbsolute extends ProductDiscountValue {

    /**
     * discriminator value for ProductDiscountValueAbsolute
     */
    String ABSOLUTE = "absolute";

    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @return money
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<CentPrecisionMoney> getMoney();

    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param money values to be set
     */

    @JsonIgnore
    public void setMoney(final CentPrecisionMoney... money);

    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param money values to be set
     */

    public void setMoney(final List<CentPrecisionMoney> money);

    /**
     * factory method
     * @return instance of ProductDiscountValueAbsolute
     */
    public static ProductDiscountValueAbsolute of() {
        return new ProductDiscountValueAbsoluteImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountValueAbsolute
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountValueAbsolute of(final ProductDiscountValueAbsolute template) {
        ProductDiscountValueAbsoluteImpl instance = new ProductDiscountValueAbsoluteImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    public ProductDiscountValueAbsolute copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountValueAbsolute
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountValueAbsolute deepCopy(@Nullable final ProductDiscountValueAbsolute template) {
        if (template == null) {
            return null;
        }
        ProductDiscountValueAbsoluteImpl instance = new ProductDiscountValueAbsoluteImpl();
        instance.setMoney(Optional.ofNullable(template.getMoney())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.CentPrecisionMoney::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductDiscountValueAbsolute
     * @return builder
     */
    public static ProductDiscountValueAbsoluteBuilder builder() {
        return ProductDiscountValueAbsoluteBuilder.of();
    }

    /**
     * create builder for ProductDiscountValueAbsolute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountValueAbsoluteBuilder builder(final ProductDiscountValueAbsolute template) {
        return ProductDiscountValueAbsoluteBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountValueAbsolute(Function<ProductDiscountValueAbsolute, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueAbsolute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueAbsolute>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValueAbsolute>";
            }
        };
    }
}
