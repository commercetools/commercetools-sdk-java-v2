
package com.commercetools.api.models.discount_group;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupUpdate discountGroupUpdate = DiscountGroupUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupUpdateBuilder implements Builder<DiscountGroupUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.discount_group.DiscountGroupUpdateAction> actions;

    /**
     *  <p>Expected version of the DiscountGroup on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public DiscountGroupUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the DiscountGroup.</p>
     * @param actions value to be set
     * @return Builder
     */

    public DiscountGroupUpdateBuilder actions(
            final com.commercetools.api.models.discount_group.DiscountGroupUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the DiscountGroup.</p>
     * @param actions value to be set
     * @return Builder
     */

    public DiscountGroupUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.discount_group.DiscountGroupUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the DiscountGroup.</p>
     * @param actions value to be set
     * @return Builder
     */

    public DiscountGroupUpdateBuilder plusActions(
            final com.commercetools.api.models.discount_group.DiscountGroupUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the DiscountGroup.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public DiscountGroupUpdateBuilder plusActions(
            Function<com.commercetools.api.models.discount_group.DiscountGroupUpdateActionBuilder, Builder<? extends com.commercetools.api.models.discount_group.DiscountGroupUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.discount_group.DiscountGroupUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the DiscountGroup.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public DiscountGroupUpdateBuilder withActions(
            Function<com.commercetools.api.models.discount_group.DiscountGroupUpdateActionBuilder, Builder<? extends com.commercetools.api.models.discount_group.DiscountGroupUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.discount_group.DiscountGroupUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the DiscountGroup on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the DiscountGroup.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.discount_group.DiscountGroupUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds DiscountGroupUpdate with checking for non-null required values
     * @return DiscountGroupUpdate
     */
    public DiscountGroupUpdate build() {
        Objects.requireNonNull(version, DiscountGroupUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, DiscountGroupUpdate.class + ": actions is missing");
        return new DiscountGroupUpdateImpl(version, actions);
    }

    /**
     * builds DiscountGroupUpdate without checking for non-null required values
     * @return DiscountGroupUpdate
     */
    public DiscountGroupUpdate buildUnchecked() {
        return new DiscountGroupUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of DiscountGroupUpdateBuilder
     * @return builder
     */
    public static DiscountGroupUpdateBuilder of() {
        return new DiscountGroupUpdateBuilder();
    }

    /**
     * create builder for DiscountGroupUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupUpdateBuilder of(final DiscountGroupUpdate template) {
        DiscountGroupUpdateBuilder builder = new DiscountGroupUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
