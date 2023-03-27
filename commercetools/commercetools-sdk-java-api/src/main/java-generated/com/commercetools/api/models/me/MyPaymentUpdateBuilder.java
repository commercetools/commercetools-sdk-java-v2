
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentUpdate myPaymentUpdate = MyPaymentUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentUpdateBuilder implements Builder<MyPaymentUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.me.MyPaymentUpdateAction> actions;

    /**
     *  <p>Expected version of the Payment on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public MyPaymentUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param actions value to be set
     * @return Builder
     */

    public MyPaymentUpdateBuilder actions(final com.commercetools.api.models.me.MyPaymentUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param actions value to be set
     * @return Builder
     */

    public MyPaymentUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.me.MyPaymentUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param actions value to be set
     * @return Builder
     */

    public MyPaymentUpdateBuilder plusActions(final com.commercetools.api.models.me.MyPaymentUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public MyPaymentUpdateBuilder plusActions(
            Function<com.commercetools.api.models.me.MyPaymentUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyPaymentUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyPaymentUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public MyPaymentUpdateBuilder withActions(
            Function<com.commercetools.api.models.me.MyPaymentUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyPaymentUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyPaymentUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the Payment on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.me.MyPaymentUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds MyPaymentUpdate with checking for non-null required values
     * @return MyPaymentUpdate
     */
    public MyPaymentUpdate build() {
        Objects.requireNonNull(version, MyPaymentUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, MyPaymentUpdate.class + ": actions is missing");
        return new MyPaymentUpdateImpl(version, actions);
    }

    /**
     * builds MyPaymentUpdate without checking for non-null required values
     * @return MyPaymentUpdate
     */
    public MyPaymentUpdate buildUnchecked() {
        return new MyPaymentUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of MyPaymentUpdateBuilder
     * @return builder
     */
    public static MyPaymentUpdateBuilder of() {
        return new MyPaymentUpdateBuilder();
    }

    /**
     * create builder for MyPaymentUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentUpdateBuilder of(final MyPaymentUpdate template) {
        MyPaymentUpdateBuilder builder = new MyPaymentUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
