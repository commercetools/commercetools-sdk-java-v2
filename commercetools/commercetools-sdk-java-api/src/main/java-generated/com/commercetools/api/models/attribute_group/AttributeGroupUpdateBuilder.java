
package com.commercetools.api.models.attribute_group;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupUpdate attributeGroupUpdate = AttributeGroupUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeGroupUpdateBuilder implements Builder<AttributeGroupUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction> actions;

    /**
     *  <p>Expected version of the AttributeGroup on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public AttributeGroupUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the AttributeGroup.</p>
     * @param actions value to be set
     * @return Builder
     */

    public AttributeGroupUpdateBuilder actions(
            final com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the AttributeGroup.</p>
     * @param actions value to be set
     * @return Builder
     */

    public AttributeGroupUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the AttributeGroup.</p>
     * @param actions value to be set
     * @return Builder
     */

    public AttributeGroupUpdateBuilder plusActions(
            final com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the AttributeGroup.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public AttributeGroupUpdateBuilder plusActions(
            Function<com.commercetools.api.models.attribute_group.AttributeGroupUpdateActionBuilder, Builder<? extends com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.attribute_group.AttributeGroupUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the AttributeGroup.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public AttributeGroupUpdateBuilder withActions(
            Function<com.commercetools.api.models.attribute_group.AttributeGroupUpdateActionBuilder, Builder<? extends com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.attribute_group.AttributeGroupUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the AttributeGroup on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the AttributeGroup.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.attribute_group.AttributeGroupUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds AttributeGroupUpdate with checking for non-null required values
     * @return AttributeGroupUpdate
     */
    public AttributeGroupUpdate build() {
        Objects.requireNonNull(version, AttributeGroupUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, AttributeGroupUpdate.class + ": actions is missing");
        return new AttributeGroupUpdateImpl(version, actions);
    }

    /**
     * builds AttributeGroupUpdate without checking for non-null required values
     * @return AttributeGroupUpdate
     */
    public AttributeGroupUpdate buildUnchecked() {
        return new AttributeGroupUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of AttributeGroupUpdateBuilder
     * @return builder
     */
    public static AttributeGroupUpdateBuilder of() {
        return new AttributeGroupUpdateBuilder();
    }

    /**
     * create builder for AttributeGroupUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeGroupUpdateBuilder of(final AttributeGroupUpdate template) {
        AttributeGroupUpdateBuilder builder = new AttributeGroupUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
