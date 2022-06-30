
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
     *
     */

    public MyQuoteRequestUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *
     */

    public MyQuoteRequestUpdateBuilder actions(
            final com.commercetools.api.models.me.MyQuoteRequestUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *
     */

    public MyQuoteRequestUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.me.MyQuoteRequestUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *
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
     *
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
     *
     */

    public MyQuoteRequestUpdateBuilder withActions(
            Function<com.commercetools.api.models.me.MyQuoteRequestUpdateActionBuilder, Builder<? extends com.commercetools.api.models.me.MyQuoteRequestUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.me.MyQuoteRequestUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.me.MyQuoteRequestUpdateAction> getActions() {
        return this.actions;
    }

    public MyQuoteRequestUpdate build() {
        Objects.requireNonNull(version, MyQuoteRequestUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, MyQuoteRequestUpdate.class + ": actions is missing");
        return new MyQuoteRequestUpdateImpl(version, actions);
    }

    /**
     * builds MyQuoteRequestUpdate without checking for non null required values
     */
    public MyQuoteRequestUpdate buildUnchecked() {
        return new MyQuoteRequestUpdateImpl(version, actions);
    }

    public static MyQuoteRequestUpdateBuilder of() {
        return new MyQuoteRequestUpdateBuilder();
    }

    public static MyQuoteRequestUpdateBuilder of(final MyQuoteRequestUpdate template) {
        MyQuoteRequestUpdateBuilder builder = new MyQuoteRequestUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
