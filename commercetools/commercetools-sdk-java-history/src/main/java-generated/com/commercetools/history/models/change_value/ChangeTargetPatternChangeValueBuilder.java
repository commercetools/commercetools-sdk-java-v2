
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTargetPatternChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetPatternChangeValue changeTargetPatternChangeValue = ChangeTargetPatternChangeValue.builder()
 *             .plusTriggerPattern(triggerPatternBuilder -> triggerPatternBuilder)
 *             .plusTargetPattern(targetPatternBuilder -> targetPatternBuilder)
 *             .selectionMode(SelectionMode.CHEAPEST)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTargetPatternChangeValueBuilder implements Builder<ChangeTargetPatternChangeValue> {

    private java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> triggerPattern;

    private java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> targetPattern;

    @Nullable
    private Integer maxOccurrence;

    private com.commercetools.history.models.common.SelectionMode selectionMode;

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that triggered the discount application.</p>
     * @param triggerPattern value to be set
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder triggerPattern(
            final com.commercetools.history.models.cart_discount.PatternComponent... triggerPattern) {
        this.triggerPattern = new ArrayList<>(Arrays.asList(triggerPattern));
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that triggered the discount application.</p>
     * @param triggerPattern value to be set
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder triggerPattern(
            final java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> triggerPattern) {
        this.triggerPattern = triggerPattern;
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that triggered the discount application.</p>
     * @param triggerPattern value to be set
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder plusTriggerPattern(
            final com.commercetools.history.models.cart_discount.PatternComponent... triggerPattern) {
        if (this.triggerPattern == null) {
            this.triggerPattern = new ArrayList<>();
        }
        this.triggerPattern.addAll(Arrays.asList(triggerPattern));
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that triggered the discount application.</p>
     * @param builder function to build the triggerPattern value
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder plusTriggerPattern(
            Function<com.commercetools.history.models.cart_discount.PatternComponentBuilder, com.commercetools.history.models.cart_discount.PatternComponentBuilder> builder) {
        if (this.triggerPattern == null) {
            this.triggerPattern = new ArrayList<>();
        }
        this.triggerPattern.add(
            builder.apply(com.commercetools.history.models.cart_discount.PatternComponentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that triggered the discount application.</p>
     * @param builder function to build the triggerPattern value
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder withTriggerPattern(
            Function<com.commercetools.history.models.cart_discount.PatternComponentBuilder, com.commercetools.history.models.cart_discount.PatternComponentBuilder> builder) {
        this.triggerPattern = new ArrayList<>();
        this.triggerPattern.add(
            builder.apply(com.commercetools.history.models.cart_discount.PatternComponentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that triggered the discount application.</p>
     * @param builder function to build the triggerPattern value
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder addTriggerPattern(
            Function<com.commercetools.history.models.cart_discount.PatternComponentBuilder, com.commercetools.history.models.cart_discount.PatternComponent> builder) {
        return plusTriggerPattern(
            builder.apply(com.commercetools.history.models.cart_discount.PatternComponentBuilder.of()));
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that triggered the discount application.</p>
     * @param builder function to build the triggerPattern value
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder setTriggerPattern(
            Function<com.commercetools.history.models.cart_discount.PatternComponentBuilder, com.commercetools.history.models.cart_discount.PatternComponent> builder) {
        return triggerPattern(
            builder.apply(com.commercetools.history.models.cart_discount.PatternComponentBuilder.of()));
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     * @param targetPattern value to be set
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder targetPattern(
            final com.commercetools.history.models.cart_discount.PatternComponent... targetPattern) {
        this.targetPattern = new ArrayList<>(Arrays.asList(targetPattern));
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     * @param targetPattern value to be set
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder targetPattern(
            final java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> targetPattern) {
        this.targetPattern = targetPattern;
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     * @param targetPattern value to be set
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder plusTargetPattern(
            final com.commercetools.history.models.cart_discount.PatternComponent... targetPattern) {
        if (this.targetPattern == null) {
            this.targetPattern = new ArrayList<>();
        }
        this.targetPattern.addAll(Arrays.asList(targetPattern));
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     * @param builder function to build the targetPattern value
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder plusTargetPattern(
            Function<com.commercetools.history.models.cart_discount.PatternComponentBuilder, com.commercetools.history.models.cart_discount.PatternComponentBuilder> builder) {
        if (this.targetPattern == null) {
            this.targetPattern = new ArrayList<>();
        }
        this.targetPattern.add(
            builder.apply(com.commercetools.history.models.cart_discount.PatternComponentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     * @param builder function to build the targetPattern value
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder withTargetPattern(
            Function<com.commercetools.history.models.cart_discount.PatternComponentBuilder, com.commercetools.history.models.cart_discount.PatternComponentBuilder> builder) {
        this.targetPattern = new ArrayList<>();
        this.targetPattern.add(
            builder.apply(com.commercetools.history.models.cart_discount.PatternComponentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     * @param builder function to build the targetPattern value
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder addTargetPattern(
            Function<com.commercetools.history.models.cart_discount.PatternComponentBuilder, com.commercetools.history.models.cart_discount.PatternComponent> builder) {
        return plusTargetPattern(
            builder.apply(com.commercetools.history.models.cart_discount.PatternComponentBuilder.of()));
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     * @param builder function to build the targetPattern value
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder setTargetPattern(
            Function<com.commercetools.history.models.cart_discount.PatternComponentBuilder, com.commercetools.history.models.cart_discount.PatternComponent> builder) {
        return targetPattern(
            builder.apply(com.commercetools.history.models.cart_discount.PatternComponentBuilder.of()));
    }

    /**
     *  <p>Maximum number of times the Discount applies on a Cart.</p>
     *  <p>If empty, the Discount applies indefinitely.</p>
     * @param maxOccurrence value to be set
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder maxOccurrence(@Nullable final Integer maxOccurrence) {
        this.maxOccurrence = maxOccurrence;
        return this;
    }

    /**
     *  <p>Indicates which of the matching units of (Custom) Line Items were discounted.</p>
     * @param selectionMode value to be set
     * @return Builder
     */

    public ChangeTargetPatternChangeValueBuilder selectionMode(
            final com.commercetools.history.models.common.SelectionMode selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart that triggered the discount application.</p>
     * @return triggerPattern
     */

    public java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> getTriggerPattern() {
        return this.triggerPattern;
    }

    /**
     *  <p>Defines the set of units of (Custom) Line Items in a Cart on which the Discount is applied.</p>
     * @return targetPattern
     */

    public java.util.List<com.commercetools.history.models.cart_discount.PatternComponent> getTargetPattern() {
        return this.targetPattern;
    }

    /**
     *  <p>Maximum number of times the Discount applies on a Cart.</p>
     *  <p>If empty, the Discount applies indefinitely.</p>
     * @return maxOccurrence
     */

    @Nullable
    public Integer getMaxOccurrence() {
        return this.maxOccurrence;
    }

    /**
     *  <p>Indicates which of the matching units of (Custom) Line Items were discounted.</p>
     * @return selectionMode
     */

    public com.commercetools.history.models.common.SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

    /**
     * builds ChangeTargetPatternChangeValue with checking for non-null required values
     * @return ChangeTargetPatternChangeValue
     */
    public ChangeTargetPatternChangeValue build() {
        Objects.requireNonNull(triggerPattern, ChangeTargetPatternChangeValue.class + ": triggerPattern is missing");
        Objects.requireNonNull(targetPattern, ChangeTargetPatternChangeValue.class + ": targetPattern is missing");
        Objects.requireNonNull(selectionMode, ChangeTargetPatternChangeValue.class + ": selectionMode is missing");
        return new ChangeTargetPatternChangeValueImpl(triggerPattern, targetPattern, maxOccurrence, selectionMode);
    }

    /**
     * builds ChangeTargetPatternChangeValue without checking for non-null required values
     * @return ChangeTargetPatternChangeValue
     */
    public ChangeTargetPatternChangeValue buildUnchecked() {
        return new ChangeTargetPatternChangeValueImpl(triggerPattern, targetPattern, maxOccurrence, selectionMode);
    }

    /**
     * factory method for an instance of ChangeTargetPatternChangeValueBuilder
     * @return builder
     */
    public static ChangeTargetPatternChangeValueBuilder of() {
        return new ChangeTargetPatternChangeValueBuilder();
    }

    /**
     * create builder for ChangeTargetPatternChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetPatternChangeValueBuilder of(final ChangeTargetPatternChangeValue template) {
        ChangeTargetPatternChangeValueBuilder builder = new ChangeTargetPatternChangeValueBuilder();
        builder.triggerPattern = template.getTriggerPattern();
        builder.targetPattern = template.getTargetPattern();
        builder.maxOccurrence = template.getMaxOccurrence();
        builder.selectionMode = template.getSelectionMode();
        return builder;
    }

}
