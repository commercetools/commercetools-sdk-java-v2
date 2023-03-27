
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeUpdate typeUpdate = TypeUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeUpdateBuilder implements Builder<TypeUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.type.TypeUpdateAction> actions;

    /**
     *  <p>Expected version of the type on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public TypeUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Type.</p>
     * @param actions value to be set
     * @return Builder
     */

    public TypeUpdateBuilder actions(final com.commercetools.api.models.type.TypeUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Type.</p>
     * @param actions value to be set
     * @return Builder
     */

    public TypeUpdateBuilder actions(final java.util.List<com.commercetools.api.models.type.TypeUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Type.</p>
     * @param actions value to be set
     * @return Builder
     */

    public TypeUpdateBuilder plusActions(final com.commercetools.api.models.type.TypeUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Type.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public TypeUpdateBuilder plusActions(
            Function<com.commercetools.api.models.type.TypeUpdateActionBuilder, Builder<? extends com.commercetools.api.models.type.TypeUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.type.TypeUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Type.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public TypeUpdateBuilder withActions(
            Function<com.commercetools.api.models.type.TypeUpdateActionBuilder, Builder<? extends com.commercetools.api.models.type.TypeUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.type.TypeUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the type on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Type.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.type.TypeUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds TypeUpdate with checking for non-null required values
     * @return TypeUpdate
     */
    public TypeUpdate build() {
        Objects.requireNonNull(version, TypeUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, TypeUpdate.class + ": actions is missing");
        return new TypeUpdateImpl(version, actions);
    }

    /**
     * builds TypeUpdate without checking for non-null required values
     * @return TypeUpdate
     */
    public TypeUpdate buildUnchecked() {
        return new TypeUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of TypeUpdateBuilder
     * @return builder
     */
    public static TypeUpdateBuilder of() {
        return new TypeUpdateBuilder();
    }

    /**
     * create builder for TypeUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeUpdateBuilder of(final TypeUpdate template) {
        TypeUpdateBuilder builder = new TypeUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
