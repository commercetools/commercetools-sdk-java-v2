
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ItemShippingDetailsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ItemShippingDetails itemShippingDetails = ItemShippingDetails.builder()
 *             .plusTargets(targetsBuilder -> targetsBuilder)
 *             .valid(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ItemShippingDetailsBuilder implements Builder<ItemShippingDetails> {

    private java.util.List<com.commercetools.history.models.common.ItemShippingTarget> targets;

    private Boolean valid;

    /**
     * set values to the targets
     * @param targets value to be set
     * @return Builder
     */

    public ItemShippingDetailsBuilder targets(
            final com.commercetools.history.models.common.ItemShippingTarget... targets) {
        this.targets = new ArrayList<>(Arrays.asList(targets));
        return this;
    }

    /**
     * set value to the targets
     * @param targets value to be set
     * @return Builder
     */

    public ItemShippingDetailsBuilder targets(
            final java.util.List<com.commercetools.history.models.common.ItemShippingTarget> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * add values to the targets
     * @param targets value to be set
     * @return Builder
     */

    public ItemShippingDetailsBuilder plusTargets(
            final com.commercetools.history.models.common.ItemShippingTarget... targets) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.addAll(Arrays.asList(targets));
        return this;
    }

    /**
     * add the value to the targets using the builder function
     * @param builder function to build the targets value
     * @return Builder
     */

    public ItemShippingDetailsBuilder plusTargets(
            Function<com.commercetools.history.models.common.ItemShippingTargetBuilder, com.commercetools.history.models.common.ItemShippingTargetBuilder> builder) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(builder.apply(com.commercetools.history.models.common.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the targets using the builder function
     * @param builder function to build the targets value
     * @return Builder
     */

    public ItemShippingDetailsBuilder withTargets(
            Function<com.commercetools.history.models.common.ItemShippingTargetBuilder, com.commercetools.history.models.common.ItemShippingTargetBuilder> builder) {
        this.targets = new ArrayList<>();
        this.targets.add(builder.apply(com.commercetools.history.models.common.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the targets using the builder function
     * @param builder function to build the targets value
     * @return Builder
     */

    public ItemShippingDetailsBuilder addTargets(
            Function<com.commercetools.history.models.common.ItemShippingTargetBuilder, com.commercetools.history.models.common.ItemShippingTarget> builder) {
        return plusTargets(builder.apply(com.commercetools.history.models.common.ItemShippingTargetBuilder.of()));
    }

    /**
     * set the value to the targets using the builder function
     * @param builder function to build the targets value
     * @return Builder
     */

    public ItemShippingDetailsBuilder setTargets(
            Function<com.commercetools.history.models.common.ItemShippingTargetBuilder, com.commercetools.history.models.common.ItemShippingTarget> builder) {
        return targets(builder.apply(com.commercetools.history.models.common.ItemShippingTargetBuilder.of()));
    }

    /**
     *  <p>true if the quantity of the (custom) line item is equal to the sum of the sub-quantities in <code>targets</code>, <code>false</code> otherwise. A cart cannot be ordered when the value is <code>false</code>. The error InvalidItemShippingDetails will be triggered.</p>
     * @param valid value to be set
     * @return Builder
     */

    public ItemShippingDetailsBuilder valid(final Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     * value of targets}
     * @return targets
     */

    public java.util.List<com.commercetools.history.models.common.ItemShippingTarget> getTargets() {
        return this.targets;
    }

    /**
     *  <p>true if the quantity of the (custom) line item is equal to the sum of the sub-quantities in <code>targets</code>, <code>false</code> otherwise. A cart cannot be ordered when the value is <code>false</code>. The error InvalidItemShippingDetails will be triggered.</p>
     * @return valid
     */

    public Boolean getValid() {
        return this.valid;
    }

    /**
     * builds ItemShippingDetails with checking for non-null required values
     * @return ItemShippingDetails
     */
    public ItemShippingDetails build() {
        Objects.requireNonNull(targets, ItemShippingDetails.class + ": targets is missing");
        Objects.requireNonNull(valid, ItemShippingDetails.class + ": valid is missing");
        return new ItemShippingDetailsImpl(targets, valid);
    }

    /**
     * builds ItemShippingDetails without checking for non-null required values
     * @return ItemShippingDetails
     */
    public ItemShippingDetails buildUnchecked() {
        return new ItemShippingDetailsImpl(targets, valid);
    }

    /**
     * factory method for an instance of ItemShippingDetailsBuilder
     * @return builder
     */
    public static ItemShippingDetailsBuilder of() {
        return new ItemShippingDetailsBuilder();
    }

    /**
     * create builder for ItemShippingDetails instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ItemShippingDetailsBuilder of(final ItemShippingDetails template) {
        ItemShippingDetailsBuilder builder = new ItemShippingDetailsBuilder();
        builder.targets = template.getTargets();
        builder.valid = template.getValid();
        return builder;
    }

}
