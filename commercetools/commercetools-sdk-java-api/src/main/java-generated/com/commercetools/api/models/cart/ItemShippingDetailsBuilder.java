
package com.commercetools.api.models.cart;

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

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets;

    private Boolean valid;

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     * @param targets value to be set
     * @return Builder
     */

    public ItemShippingDetailsBuilder targets(final com.commercetools.api.models.cart.ItemShippingTarget... targets) {
        this.targets = new ArrayList<>(Arrays.asList(targets));
        return this;
    }

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     * @param targets value to be set
     * @return Builder
     */

    public ItemShippingDetailsBuilder targets(
            final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets) {
        this.targets = targets;
        return this;
    }

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     * @param targets value to be set
     * @return Builder
     */

    public ItemShippingDetailsBuilder plusTargets(
            final com.commercetools.api.models.cart.ItemShippingTarget... targets) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.addAll(Arrays.asList(targets));
        return this;
    }

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     * @param builder function to build the targets value
     * @return Builder
     */

    public ItemShippingDetailsBuilder plusTargets(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     * @param builder function to build the targets value
     * @return Builder
     */

    public ItemShippingDetailsBuilder withTargets(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTargetBuilder> builder) {
        this.targets = new ArrayList<>();
        this.targets.add(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     * @param builder function to build the targets value
     * @return Builder
     */

    public ItemShippingDetailsBuilder addTargets(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTarget> builder) {
        return plusTargets(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()));
    }

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     * @param builder function to build the targets value
     * @return Builder
     */

    public ItemShippingDetailsBuilder setTargets(
            Function<com.commercetools.api.models.cart.ItemShippingTargetBuilder, com.commercetools.api.models.cart.ItemShippingTarget> builder) {
        return targets(builder.apply(com.commercetools.api.models.cart.ItemShippingTargetBuilder.of()));
    }

    /**
     *  <ul>
     *   <li><code>true</code> if the quantity of Line Items or Custom Line Items is equal to the sum of sub-quantities defined in <code>targets</code>.</li>
     *   <li><code>false</code> if the quantity of Line Items or Custom Line Items is not equal to the sum of sub-quantities defined in <code>targets</code>. Ordering a Cart when the value is <code>false</code> returns an InvalidItemShippingDetails error.</li>
     *  </ul>
     * @param valid value to be set
     * @return Builder
     */

    public ItemShippingDetailsBuilder valid(final Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     *  <p>Holds information on the quantity of Line Items or Custom Line Items and the address it is shipped.</p>
     * @return targets
     */

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargets() {
        return this.targets;
    }

    /**
     *  <ul>
     *   <li><code>true</code> if the quantity of Line Items or Custom Line Items is equal to the sum of sub-quantities defined in <code>targets</code>.</li>
     *   <li><code>false</code> if the quantity of Line Items or Custom Line Items is not equal to the sum of sub-quantities defined in <code>targets</code>. Ordering a Cart when the value is <code>false</code> returns an InvalidItemShippingDetails error.</li>
     *  </ul>
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
