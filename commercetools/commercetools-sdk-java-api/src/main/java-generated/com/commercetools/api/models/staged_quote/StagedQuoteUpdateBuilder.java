
package com.commercetools.api.models.staged_quote;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteUpdate stagedQuoteUpdate = StagedQuoteUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteUpdateBuilder implements Builder<StagedQuoteUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction> actions;

    /**
     *
     */

    public StagedQuoteUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *
     */

    public StagedQuoteUpdateBuilder actions(
            final com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *
     */

    public StagedQuoteUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *
     */

    public StagedQuoteUpdateBuilder plusActions(
            final com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *
     */

    public StagedQuoteUpdateBuilder plusActions(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionBuilder, Builder<? extends com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public StagedQuoteUpdateBuilder withActions(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionBuilder, Builder<? extends com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction> getActions() {
        return this.actions;
    }

    public StagedQuoteUpdate build() {
        Objects.requireNonNull(version, StagedQuoteUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, StagedQuoteUpdate.class + ": actions is missing");
        return new StagedQuoteUpdateImpl(version, actions);
    }

    /**
     * builds StagedQuoteUpdate without checking for non null required values
     */
    public StagedQuoteUpdate buildUnchecked() {
        return new StagedQuoteUpdateImpl(version, actions);
    }

    public static StagedQuoteUpdateBuilder of() {
        return new StagedQuoteUpdateBuilder();
    }

    public static StagedQuoteUpdateBuilder of(final StagedQuoteUpdate template) {
        StagedQuoteUpdateBuilder builder = new StagedQuoteUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
