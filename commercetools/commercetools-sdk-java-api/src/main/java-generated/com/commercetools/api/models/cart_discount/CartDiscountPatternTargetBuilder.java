
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountPatternTargetBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountPatternTargetBuilder implements Builder<CartDiscountPatternTarget> {

    private java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> triggerPattern;

    private java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> targetPattern;

    @Nullable
    private Integer maxOccurrence;

    private com.commercetools.api.models.cart_discount.SelectionMode selectionMode;

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that trigger a discount application.</p>
     *  <p>Based on the availability of matching units, the <code>triggerPattern</code> can match multiple times, limiting the number of maximum times the discount will be applied. To further limit the discount application, set the <code>maxOccurrence</code>.</p>
     *  <p>If empty, the Discount will apply indefinitely.</p>
     * @param triggerPattern value to be set
     * @return Builder
     */

    public CartDiscountPatternTargetBuilder triggerPattern(
            final com.commercetools.api.models.cart_discount.PatternComponent... triggerPattern) {
        this.triggerPattern = new ArrayList<>(Arrays.asList(triggerPattern));
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that trigger a discount application.</p>
     *  <p>Based on the availability of matching units, the <code>triggerPattern</code> can match multiple times, limiting the number of maximum times the discount will be applied. To further limit the discount application, set the <code>maxOccurrence</code>.</p>
     *  <p>If empty, the Discount will apply indefinitely.</p>
     * @param triggerPattern value to be set
     * @return Builder
     */

    public CartDiscountPatternTargetBuilder triggerPattern(
            final java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> triggerPattern) {
        this.triggerPattern = triggerPattern;
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that trigger a discount application.</p>
     *  <p>Based on the availability of matching units, the <code>triggerPattern</code> can match multiple times, limiting the number of maximum times the discount will be applied. To further limit the discount application, set the <code>maxOccurrence</code>.</p>
     *  <p>If empty, the Discount will apply indefinitely.</p>
     * @param triggerPattern value to be set
     * @return Builder
     */

    public CartDiscountPatternTargetBuilder plusTriggerPattern(
            final com.commercetools.api.models.cart_discount.PatternComponent... triggerPattern) {
        if (this.triggerPattern == null) {
            this.triggerPattern = new ArrayList<>();
        }
        this.triggerPattern.addAll(Arrays.asList(triggerPattern));
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that trigger a discount application.</p>
     *  <p>Based on the availability of matching units, the <code>triggerPattern</code> can match multiple times, limiting the number of maximum times the discount will be applied. To further limit the discount application, set the <code>maxOccurrence</code>.</p>
     *  <p>If empty, the Discount will apply indefinitely.</p>
     * @param builder function to build the triggerPattern value
     * @return Builder
     */

    public CartDiscountPatternTargetBuilder plusTriggerPattern(
            Function<com.commercetools.api.models.cart_discount.PatternComponentBuilder, Builder<? extends com.commercetools.api.models.cart_discount.PatternComponent>> builder) {
        if (this.triggerPattern == null) {
            this.triggerPattern = new ArrayList<>();
        }
        this.triggerPattern
                .add(builder.apply(com.commercetools.api.models.cart_discount.PatternComponentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that trigger a discount application.</p>
     *  <p>Based on the availability of matching units, the <code>triggerPattern</code> can match multiple times, limiting the number of maximum times the discount will be applied. To further limit the discount application, set the <code>maxOccurrence</code>.</p>
     *  <p>If empty, the Discount will apply indefinitely.</p>
     * @param builder function to build the triggerPattern value
     * @return Builder
     */

    public CartDiscountPatternTargetBuilder withTriggerPattern(
            Function<com.commercetools.api.models.cart_discount.PatternComponentBuilder, Builder<? extends com.commercetools.api.models.cart_discount.PatternComponent>> builder) {
        this.triggerPattern = new ArrayList<>();
        this.triggerPattern
                .add(builder.apply(com.commercetools.api.models.cart_discount.PatternComponentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     *  <p>Based on the availability of matching units and the limits from the <code>triggerPattern</code> or <code>maxOccurrence</code>, the <code>targetPattern</code> can match multiple times.</p>
     *  <p>This array cannot be empty.</p>
     * @param targetPattern value to be set
     * @return Builder
     */

    public CartDiscountPatternTargetBuilder targetPattern(
            final com.commercetools.api.models.cart_discount.PatternComponent... targetPattern) {
        this.targetPattern = new ArrayList<>(Arrays.asList(targetPattern));
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     *  <p>Based on the availability of matching units and the limits from the <code>triggerPattern</code> or <code>maxOccurrence</code>, the <code>targetPattern</code> can match multiple times.</p>
     *  <p>This array cannot be empty.</p>
     * @param targetPattern value to be set
     * @return Builder
     */

    public CartDiscountPatternTargetBuilder targetPattern(
            final java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> targetPattern) {
        this.targetPattern = targetPattern;
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     *  <p>Based on the availability of matching units and the limits from the <code>triggerPattern</code> or <code>maxOccurrence</code>, the <code>targetPattern</code> can match multiple times.</p>
     *  <p>This array cannot be empty.</p>
     * @param targetPattern value to be set
     * @return Builder
     */

    public CartDiscountPatternTargetBuilder plusTargetPattern(
            final com.commercetools.api.models.cart_discount.PatternComponent... targetPattern) {
        if (this.targetPattern == null) {
            this.targetPattern = new ArrayList<>();
        }
        this.targetPattern.addAll(Arrays.asList(targetPattern));
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     *  <p>Based on the availability of matching units and the limits from the <code>triggerPattern</code> or <code>maxOccurrence</code>, the <code>targetPattern</code> can match multiple times.</p>
     *  <p>This array cannot be empty.</p>
     * @param builder function to build the targetPattern value
     * @return Builder
     */

    public CartDiscountPatternTargetBuilder plusTargetPattern(
            Function<com.commercetools.api.models.cart_discount.PatternComponentBuilder, Builder<? extends com.commercetools.api.models.cart_discount.PatternComponent>> builder) {
        if (this.targetPattern == null) {
            this.targetPattern = new ArrayList<>();
        }
        this.targetPattern
                .add(builder.apply(com.commercetools.api.models.cart_discount.PatternComponentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     *  <p>Based on the availability of matching units and the limits from the <code>triggerPattern</code> or <code>maxOccurrence</code>, the <code>targetPattern</code> can match multiple times.</p>
     *  <p>This array cannot be empty.</p>
     * @param builder function to build the targetPattern value
     * @return Builder
     */

    public CartDiscountPatternTargetBuilder withTargetPattern(
            Function<com.commercetools.api.models.cart_discount.PatternComponentBuilder, Builder<? extends com.commercetools.api.models.cart_discount.PatternComponent>> builder) {
        this.targetPattern = new ArrayList<>();
        this.targetPattern
                .add(builder.apply(com.commercetools.api.models.cart_discount.PatternComponentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maximum number of times the Discount can apply on a Cart.</p>
     *  <p>If empty or not set, the Discount will apply indefinitely.</p>
     * @param maxOccurrence value to be set
     * @return Builder
     */

    public CartDiscountPatternTargetBuilder maxOccurrence(@Nullable final Integer maxOccurrence) {
        this.maxOccurrence = maxOccurrence;
        return this;
    }

    /**
     *  <p>Determines which of the matching units of (Custom) Line Items are discounted.</p>
     * @param selectionMode value to be set
     * @return Builder
     */

    public CartDiscountPatternTargetBuilder selectionMode(
            final com.commercetools.api.models.cart_discount.SelectionMode selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that trigger a discount application.</p>
     *  <p>Based on the availability of matching units, the <code>triggerPattern</code> can match multiple times, limiting the number of maximum times the discount will be applied. To further limit the discount application, set the <code>maxOccurrence</code>.</p>
     *  <p>If empty, the Discount will apply indefinitely.</p>
     * @return triggerPattern
     */

    public java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> getTriggerPattern() {
        return this.triggerPattern;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     *  <p>Based on the availability of matching units and the limits from the <code>triggerPattern</code> or <code>maxOccurrence</code>, the <code>targetPattern</code> can match multiple times.</p>
     *  <p>This array cannot be empty.</p>
     * @return targetPattern
     */

    public java.util.List<com.commercetools.api.models.cart_discount.PatternComponent> getTargetPattern() {
        return this.targetPattern;
    }

    /**
     *  <p>Maximum number of times the Discount can apply on a Cart.</p>
     *  <p>If empty or not set, the Discount will apply indefinitely.</p>
     * @return maxOccurrence
     */

    @Nullable
    public Integer getMaxOccurrence() {
        return this.maxOccurrence;
    }

    /**
     *  <p>Determines which of the matching units of (Custom) Line Items are discounted.</p>
     * @return selectionMode
     */

    public com.commercetools.api.models.cart_discount.SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

    /**
     * builds CartDiscountPatternTarget with checking for non-null required values
     * @return CartDiscountPatternTarget
     */
    public CartDiscountPatternTarget build() {
        Objects.requireNonNull(triggerPattern, CartDiscountPatternTarget.class + ": triggerPattern is missing");
        Objects.requireNonNull(targetPattern, CartDiscountPatternTarget.class + ": targetPattern is missing");
        Objects.requireNonNull(selectionMode, CartDiscountPatternTarget.class + ": selectionMode is missing");
        return new CartDiscountPatternTargetImpl(triggerPattern, targetPattern, maxOccurrence, selectionMode);
    }

    /**
     * builds CartDiscountPatternTarget without checking for non-null required values
     * @return CartDiscountPatternTarget
     */
    public CartDiscountPatternTarget buildUnchecked() {
        return new CartDiscountPatternTargetImpl(triggerPattern, targetPattern, maxOccurrence, selectionMode);
    }

    /**
     * factory method for an instance of CartDiscountPatternTargetBuilder
     * @return builder
     */
    public static CartDiscountPatternTargetBuilder of() {
        return new CartDiscountPatternTargetBuilder();
    }

    /**
     * create builder for CartDiscountPatternTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountPatternTargetBuilder of(final CartDiscountPatternTarget template) {
        CartDiscountPatternTargetBuilder builder = new CartDiscountPatternTargetBuilder();
        builder.triggerPattern = template.getTriggerPattern();
        builder.targetPattern = template.getTargetPattern();
        builder.maxOccurrence = template.getMaxOccurrence();
        builder.selectionMode = template.getSelectionMode();
        return builder;
    }

}
