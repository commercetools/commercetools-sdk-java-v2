
package com.commercetools.api.models.quote;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteUpdate quoteUpdate = QuoteUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteUpdateBuilder implements Builder<QuoteUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.quote.QuoteUpdateAction> actions;

    /**
     *  <p>Expected version of the Quote to which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version
     * @return Builder
     */

    public QuoteUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @param actions
     * @return Builder
     */

    public QuoteUpdateBuilder actions(final com.commercetools.api.models.quote.QuoteUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @param actions
     * @return Builder
     */

    public QuoteUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.quote.QuoteUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @param actions
     * @return Builder
     */

    public QuoteUpdateBuilder plusActions(final com.commercetools.api.models.quote.QuoteUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @return Builder
     */

    public QuoteUpdateBuilder plusActions(
            Function<com.commercetools.api.models.quote.QuoteUpdateActionBuilder, Builder<? extends com.commercetools.api.models.quote.QuoteUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.quote.QuoteUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the Quote.</p>
     * @return Builder
     */

    public QuoteUpdateBuilder withActions(
            Function<com.commercetools.api.models.quote.QuoteUpdateActionBuilder, Builder<? extends com.commercetools.api.models.quote.QuoteUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.quote.QuoteUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.quote.QuoteUpdateAction> getActions() {
        return this.actions;
    }

    public QuoteUpdate build() {
        Objects.requireNonNull(version, QuoteUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, QuoteUpdate.class + ": actions is missing");
        return new QuoteUpdateImpl(version, actions);
    }

    /**
     * builds QuoteUpdate without checking for non null required values
     */
    public QuoteUpdate buildUnchecked() {
        return new QuoteUpdateImpl(version, actions);
    }

    public static QuoteUpdateBuilder of() {
        return new QuoteUpdateBuilder();
    }

    public static QuoteUpdateBuilder of(final QuoteUpdate template) {
        QuoteUpdateBuilder builder = new QuoteUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
