
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyQuoteUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyQuoteUpdate myQuoteUpdate = MyQuoteUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyQuoteUpdateBuilder implements Builder<MyQuoteUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.me.MyQuoteUpdateAction> actions;

    /**
     *  <p>Expected version of the Quote to which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public MyQuoteUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @param actions value to be set
     * @return Builder
     */

    public MyQuoteUpdateBuilder actions(final com.commercetools.api.models.me.MyQuoteUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @param actions value to be set
     * @return Builder
     */

    public MyQuoteUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.me.MyQuoteUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @param actions value to be set
     * @return Builder
     */

    public MyQuoteUpdateBuilder plusActions(final com.commercetools.api.models.me.MyQuoteUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public MyQuoteUpdateBuilder plusActions(
            Function<com.commercetools.api.models.me.MyQuoteUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyQuoteUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyQuoteUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public MyQuoteUpdateBuilder withActions(
            Function<com.commercetools.api.models.me.MyQuoteUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyQuoteUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyQuoteUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the Quote to which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.me.MyQuoteUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds MyQuoteUpdate with checking for non-null required values
     * @return MyQuoteUpdate
     */
    public MyQuoteUpdate build() {
        Objects.requireNonNull(version, MyQuoteUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, MyQuoteUpdate.class + ": actions is missing");
        return new MyQuoteUpdateImpl(version, actions);
    }

    /**
     * builds MyQuoteUpdate without checking for non-null required values
     * @return MyQuoteUpdate
     */
    public MyQuoteUpdate buildUnchecked() {
        return new MyQuoteUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of MyQuoteUpdateBuilder
     * @return builder
     */
    public static MyQuoteUpdateBuilder of() {
        return new MyQuoteUpdateBuilder();
    }

    /**
     * create builder for MyQuoteUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyQuoteUpdateBuilder of(final MyQuoteUpdate template) {
        MyQuoteUpdateBuilder builder = new MyQuoteUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
