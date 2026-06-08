
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Pattern targets can be used to model Buy and Get discounts.</p>
 *  <p>Unlike <span>CartDiscountLineItemsTarget</span> and <span>CartDiscountCustomLineItemsTarget</span>, it does not apply to a (Custom) Line Item as a whole, but to individual units of a (Custom) Line Item. The discounts can apply multiple times on the same cart, but each unit can be discounted only once.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountPatternTarget cartDiscountPatternTarget = CartDiscountPatternTarget.builder()
 *             .plusTriggerPattern(triggerPatternBuilder -> triggerPatternBuilder)
 *             .plusTargetPattern(targetPatternBuilder -> targetPatternBuilder)
 *             .selectionMode(SelectionMode.CHEAPEST)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("pattern")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountPatternTargetImpl.class)
public interface CartDiscountPatternTarget extends CartDiscountTarget {

    /**
     * discriminator value for CartDiscountPatternTarget
     */
    String PATTERN = "pattern";

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that trigger a discount application.</p>
     *  <p>Based on the availability of matching units, the <code>triggerPattern</code> can match multiple times, limiting the number of maximum times the discount will be applied. The units matched in the <code>triggerPattern</code> are excluded and not considered for the <code>targetPattern</code>.</p>
     *  <p>To further limit the discount application, set the <code>maxOccurrence</code>.</p>
     * @return triggerPattern
     */
    @NotNull
    @Valid
    @JsonProperty("triggerPattern")
    public List<PatternComponent> getTriggerPattern();

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     *  <p>Based on the availability of matching units and the limits from the <code>triggerPattern</code> or <code>maxOccurrence</code>, the <code>targetPattern</code> can match multiple times.</p>
     *  <p>This array cannot be empty.</p>
     * @return targetPattern
     */
    @NotNull
    @Valid
    @JsonProperty("targetPattern")
    public List<PatternComponent> getTargetPattern();

    /**
     *  <p>Maximum number of times the Discount can apply on a Cart.</p>
     *  <p>If empty or not set, the Discount will apply indefinitely.</p>
     * @return maxOccurrence
     */

    @JsonProperty("maxOccurrence")
    public Integer getMaxOccurrence();

    /**
     *  <p>Determines which of the matching units of (Custom) Line Items are discounted.</p>
     * @return selectionMode
     */
    @NotNull
    @JsonProperty("selectionMode")
    public SelectionMode getSelectionMode();

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that trigger a discount application.</p>
     *  <p>Based on the availability of matching units, the <code>triggerPattern</code> can match multiple times, limiting the number of maximum times the discount will be applied. The units matched in the <code>triggerPattern</code> are excluded and not considered for the <code>targetPattern</code>.</p>
     *  <p>To further limit the discount application, set the <code>maxOccurrence</code>.</p>
     * @param triggerPattern values to be set
     */

    @JsonIgnore
    public void setTriggerPattern(final PatternComponent... triggerPattern);

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that trigger a discount application.</p>
     *  <p>Based on the availability of matching units, the <code>triggerPattern</code> can match multiple times, limiting the number of maximum times the discount will be applied. The units matched in the <code>triggerPattern</code> are excluded and not considered for the <code>targetPattern</code>.</p>
     *  <p>To further limit the discount application, set the <code>maxOccurrence</code>.</p>
     * @param triggerPattern values to be set
     */

    public void setTriggerPattern(final List<PatternComponent> triggerPattern);

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     *  <p>Based on the availability of matching units and the limits from the <code>triggerPattern</code> or <code>maxOccurrence</code>, the <code>targetPattern</code> can match multiple times.</p>
     *  <p>This array cannot be empty.</p>
     * @param targetPattern values to be set
     */

    @JsonIgnore
    public void setTargetPattern(final PatternComponent... targetPattern);

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     *  <p>Based on the availability of matching units and the limits from the <code>triggerPattern</code> or <code>maxOccurrence</code>, the <code>targetPattern</code> can match multiple times.</p>
     *  <p>This array cannot be empty.</p>
     * @param targetPattern values to be set
     */

    public void setTargetPattern(final List<PatternComponent> targetPattern);

    /**
     *  <p>Maximum number of times the Discount can apply on a Cart.</p>
     *  <p>If empty or not set, the Discount will apply indefinitely.</p>
     * @param maxOccurrence value to be set
     */

    public void setMaxOccurrence(final Integer maxOccurrence);

    /**
     *  <p>Determines which of the matching units of (Custom) Line Items are discounted.</p>
     * @param selectionMode value to be set
     */

    public void setSelectionMode(final SelectionMode selectionMode);

    /**
     * factory method
     * @return instance of CartDiscountPatternTarget
     */
    public static CartDiscountPatternTarget of() {
        return new CartDiscountPatternTargetImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountPatternTarget
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountPatternTarget of(final CartDiscountPatternTarget template) {
        CartDiscountPatternTargetImpl instance = new CartDiscountPatternTargetImpl();
        instance.setTriggerPattern(template.getTriggerPattern());
        instance.setTargetPattern(template.getTargetPattern());
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    public CartDiscountPatternTarget copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountPatternTarget
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountPatternTarget deepCopy(@Nullable final CartDiscountPatternTarget template) {
        if (template == null) {
            return null;
        }
        CartDiscountPatternTargetImpl instance = new CartDiscountPatternTargetImpl();
        instance.setTriggerPattern(Optional.ofNullable(template.getTriggerPattern())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart_discount.PatternComponent::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTargetPattern(Optional.ofNullable(template.getTargetPattern())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart_discount.PatternComponent::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setMaxOccurrence(template.getMaxOccurrence());
        instance.setSelectionMode(template.getSelectionMode());
        return instance;
    }

    /**
     * builder factory method for CartDiscountPatternTarget
     * @return builder
     */
    public static CartDiscountPatternTargetBuilder builder() {
        return CartDiscountPatternTargetBuilder.of();
    }

    /**
     * create builder for CartDiscountPatternTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountPatternTargetBuilder builder(final CartDiscountPatternTarget template) {
        return CartDiscountPatternTargetBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountPatternTarget(Function<CartDiscountPatternTarget, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountPatternTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountPatternTarget>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountPatternTarget>";
            }
        };
    }
}
