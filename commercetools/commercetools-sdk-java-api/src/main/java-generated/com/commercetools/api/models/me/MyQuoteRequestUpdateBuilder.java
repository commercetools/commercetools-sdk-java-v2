
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteRequestUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteRequestUpdate myQuoteRequestUpdate = MyQuoteRequestUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyQuoteRequestUpdateBuilder implements Builder<MyQuoteRequestUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.me.MyQuoteRequestUpdateAction> actions;

    /**
     * set the value to the version
     * @param version value to be set
     * @return Builder
     */

    public MyQuoteRequestUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     * set values to the actions
     * @param actions value to be set
     * @return Builder
     */

    public MyQuoteRequestUpdateBuilder actions(
            final com.commercetools.api.models.me.MyQuoteRequestUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     * set value to the actions
     * @param actions value to be set
     * @return Builder
     */

    public MyQuoteRequestUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.me.MyQuoteRequestUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * add values to the actions
     * @param actions value to be set
     * @return Builder
     */

    public MyQuoteRequestUpdateBuilder plusActions(
            final com.commercetools.api.models.me.MyQuoteRequestUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     * add a value to the actions using the builder function
     * @param builder function to build the actions value
     * @return Builder
     */

    public MyQuoteRequestUpdateBuilder plusActions(
            Function<com.commercetools.api.models.me.MyQuoteRequestUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyQuoteRequestUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyQuoteRequestUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the actions using the builder function
     * @param builder function to build the actions value
     * @return Builder
     */

    public MyQuoteRequestUpdateBuilder withActions(
            Function<com.commercetools.api.models.me.MyQuoteRequestUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyQuoteRequestUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyQuoteRequestUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     * value of version}
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * value of actions}
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.me.MyQuoteRequestUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds MyQuoteRequestUpdate with checking for non-null required values
     * @return MyQuoteRequestUpdate
     */
    public MyQuoteRequestUpdate build() {
        Objects.requireNonNull(version, MyQuoteRequestUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, MyQuoteRequestUpdate.class + ": actions is missing");
        return new MyQuoteRequestUpdateImpl(version, actions);
    }

    /**
     * builds MyQuoteRequestUpdate without checking for non-null required values
     * @return MyQuoteRequestUpdate
     */
    public MyQuoteRequestUpdate buildUnchecked() {
        return new MyQuoteRequestUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of MyQuoteRequestUpdateBuilder
     * @return builder
     */
    public static MyQuoteRequestUpdateBuilder of() {
        return new MyQuoteRequestUpdateBuilder();
    }

    /**
     * create builder for MyQuoteRequestUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyQuoteRequestUpdateBuilder of(final MyQuoteRequestUpdate template) {
        MyQuoteRequestUpdateBuilder builder = new MyQuoteRequestUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
