
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitUpdate myBusinessUnitUpdate = MyBusinessUnitUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitUpdateBuilder implements Builder<MyBusinessUnitUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.me.MyBusinessUnitUpdateAction> actions;

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public MyBusinessUnitUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param actions value to be set
     * @return Builder
     */

    public MyBusinessUnitUpdateBuilder actions(
            final com.commercetools.api.models.me.MyBusinessUnitUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param actions value to be set
     * @return Builder
     */

    public MyBusinessUnitUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.me.MyBusinessUnitUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param actions value to be set
     * @return Builder
     */

    public MyBusinessUnitUpdateBuilder plusActions(
            final com.commercetools.api.models.me.MyBusinessUnitUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public MyBusinessUnitUpdateBuilder plusActions(
            Function<com.commercetools.api.models.me.MyBusinessUnitUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyBusinessUnitUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyBusinessUnitUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public MyBusinessUnitUpdateBuilder withActions(
            Function<com.commercetools.api.models.me.MyBusinessUnitUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyBusinessUnitUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyBusinessUnitUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the BusinessUnit on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the BusinessUnit.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.me.MyBusinessUnitUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds MyBusinessUnitUpdate with checking for non-null required values
     * @return MyBusinessUnitUpdate
     */
    public MyBusinessUnitUpdate build() {
        Objects.requireNonNull(version, MyBusinessUnitUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, MyBusinessUnitUpdate.class + ": actions is missing");
        return new MyBusinessUnitUpdateImpl(version, actions);
    }

    /**
     * builds MyBusinessUnitUpdate without checking for non-null required values
     * @return MyBusinessUnitUpdate
     */
    public MyBusinessUnitUpdate buildUnchecked() {
        return new MyBusinessUnitUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of MyBusinessUnitUpdateBuilder
     * @return builder
     */
    public static MyBusinessUnitUpdateBuilder of() {
        return new MyBusinessUnitUpdateBuilder();
    }

    /**
     * create builder for MyBusinessUnitUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitUpdateBuilder of(final MyBusinessUnitUpdate template) {
        MyBusinessUnitUpdateBuilder builder = new MyBusinessUnitUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
