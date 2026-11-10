
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantUpdate variantUpdate = VariantUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantUpdateBuilder implements Builder<VariantUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.variant.VariantUpdateAction> actions;

    /**
     *  <p>Expected version of the Variant on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public VariantUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Variant.</p>
     * @param actions value to be set
     * @return Builder
     */

    public VariantUpdateBuilder actions(final com.commercetools.api.models.variant.VariantUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Variant.</p>
     * @param actions value to be set
     * @return Builder
     */

    public VariantUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.variant.VariantUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Variant.</p>
     * @param actions value to be set
     * @return Builder
     */

    public VariantUpdateBuilder plusActions(final com.commercetools.api.models.variant.VariantUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Variant.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public VariantUpdateBuilder plusActions(
            Function<com.commercetools.api.models.variant.VariantUpdateActionBuilder, Builder<? extends com.commercetools.api.models.variant.VariantUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.variant.VariantUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Variant.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public VariantUpdateBuilder withActions(
            Function<com.commercetools.api.models.variant.VariantUpdateActionBuilder, Builder<? extends com.commercetools.api.models.variant.VariantUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.variant.VariantUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the Variant on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Variant.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.variant.VariantUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds VariantUpdate with checking for non-null required values
     * @return VariantUpdate
     */
    public VariantUpdate build() {
        Objects.requireNonNull(version, VariantUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, VariantUpdate.class + ": actions is missing");
        return new VariantUpdateImpl(version, actions);
    }

    /**
     * builds VariantUpdate without checking for non-null required values
     * @return VariantUpdate
     */
    public VariantUpdate buildUnchecked() {
        return new VariantUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of VariantUpdateBuilder
     * @return builder
     */
    public static VariantUpdateBuilder of() {
        return new VariantUpdateBuilder();
    }

    /**
     * create builder for VariantUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantUpdateBuilder of(final VariantUpdate template) {
        VariantUpdateBuilder builder = new VariantUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
