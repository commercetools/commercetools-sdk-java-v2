
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CartDiscountValueRelativeDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueRelativeDraft cartDiscountValueRelativeDraft = CartDiscountValueRelativeDraft.builder()
 *             .permyriad(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("relative")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueRelativeDraftImpl.class)
public interface CartDiscountValueRelativeDraft
        extends CartDiscountValueDraft, io.vrap.rmf.base.client.Draft<CartDiscountValueRelativeDraft> {

    /**
     * discriminator value for CartDiscountValueRelativeDraft
     */
    String RELATIVE = "relative";

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     * @return permyriad
     */
    @NotNull
    @JsonProperty("permyriad")
    public Long getPermyriad();

    /**
     *  <p>Determines how the discount applies when using <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>.</p>
     *  <ul>
     *   <li>If the mode is <code>IndividualApplication</code>, the discounted percentage is applied on each unit's price. The units matching the <code>triggerPattern</code> are not considered.</li>
     *   <li>If the mode is <code>ProportionateDistribution</code> and <code>EvenDistribution</code> the discounted value is calculated from the total value of the units matching the <code>targetPattern</code> and distributed among the units matching the <code>targetPattern</code> or <code>triggerPattern</code>. These modes are allowed only if <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> <code>triggerPattern</code> is non-empty.</li>
     *  </ul>
     * @return applicationMode
     */

    @JsonProperty("applicationMode")
    public DiscountApplicationMode getApplicationMode();

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     * @param permyriad value to be set
     */

    public void setPermyriad(final Long permyriad);

    /**
     *  <p>Determines how the discount applies when using <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>.</p>
     *  <ul>
     *   <li>If the mode is <code>IndividualApplication</code>, the discounted percentage is applied on each unit's price. The units matching the <code>triggerPattern</code> are not considered.</li>
     *   <li>If the mode is <code>ProportionateDistribution</code> and <code>EvenDistribution</code> the discounted value is calculated from the total value of the units matching the <code>targetPattern</code> and distributed among the units matching the <code>targetPattern</code> or <code>triggerPattern</code>. These modes are allowed only if <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> <code>triggerPattern</code> is non-empty.</li>
     *  </ul>
     * @param applicationMode value to be set
     */

    public void setApplicationMode(final DiscountApplicationMode applicationMode);

    /**
     * factory method
     * @return instance of CartDiscountValueRelativeDraft
     */
    public static CartDiscountValueRelativeDraft of() {
        return new CartDiscountValueRelativeDraftImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountValueRelativeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountValueRelativeDraft of(final CartDiscountValueRelativeDraft template) {
        CartDiscountValueRelativeDraftImpl instance = new CartDiscountValueRelativeDraftImpl();
        instance.setPermyriad(template.getPermyriad());
        instance.setApplicationMode(template.getApplicationMode());
        return instance;
    }

    public CartDiscountValueRelativeDraft copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountValueRelativeDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValueRelativeDraft deepCopy(@Nullable final CartDiscountValueRelativeDraft template) {
        if (template == null) {
            return null;
        }
        CartDiscountValueRelativeDraftImpl instance = new CartDiscountValueRelativeDraftImpl();
        instance.setPermyriad(template.getPermyriad());
        instance.setApplicationMode(template.getApplicationMode());
        return instance;
    }

    /**
     * builder factory method for CartDiscountValueRelativeDraft
     * @return builder
     */
    public static CartDiscountValueRelativeDraftBuilder builder() {
        return CartDiscountValueRelativeDraftBuilder.of();
    }

    /**
     * create builder for CartDiscountValueRelativeDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueRelativeDraftBuilder builder(final CartDiscountValueRelativeDraft template) {
        return CartDiscountValueRelativeDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValueRelativeDraft(Function<CartDiscountValueRelativeDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueRelativeDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueRelativeDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueRelativeDraft>";
            }
        };
    }
}
