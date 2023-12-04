
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartUpdate myCartUpdate = MyCartUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartUpdateBuilder implements Builder<MyCartUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.me.MyCartUpdateAction> actions;

    /**
     *  <p>Expected version of the Cart on which the changes apply. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public MyCartUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param actions value to be set
     * @return Builder
     */

    public MyCartUpdateBuilder actions(final com.commercetools.api.models.me.MyCartUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param actions value to be set
     * @return Builder
     */

    public MyCartUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.me.MyCartUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param actions value to be set
     * @return Builder
     */

    public MyCartUpdateBuilder plusActions(final com.commercetools.api.models.me.MyCartUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public MyCartUpdateBuilder plusActions(
            Function<com.commercetools.api.models.me.MyCartUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyCartUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyCartUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public MyCartUpdateBuilder withActions(
            Function<com.commercetools.api.models.me.MyCartUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyCartUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyCartUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the Cart on which the changes apply. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.me.MyCartUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds MyCartUpdate with checking for non-null required values
     * @return MyCartUpdate
     */
    public MyCartUpdate build() {
        Objects.requireNonNull(version, MyCartUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, MyCartUpdate.class + ": actions is missing");
        return new MyCartUpdateImpl(version, actions);
    }

    /**
     * builds MyCartUpdate without checking for non-null required values
     * @return MyCartUpdate
     */
    public MyCartUpdate buildUnchecked() {
        return new MyCartUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of MyCartUpdateBuilder
     * @return builder
     */
    public static MyCartUpdateBuilder of() {
        return new MyCartUpdateBuilder();
    }

    /**
     * create builder for MyCartUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartUpdateBuilder of(final MyCartUpdate template) {
        MyCartUpdateBuilder builder = new MyCartUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
