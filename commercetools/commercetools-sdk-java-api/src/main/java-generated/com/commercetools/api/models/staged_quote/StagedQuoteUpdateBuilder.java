
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
     *  <p>Expected version of the StagedQuote to which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public StagedQuoteUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the StagedQuote.</p>
     * @param actions value to be set
     * @return Builder
     */

    public StagedQuoteUpdateBuilder actions(
            final com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the StagedQuote.</p>
     * @param actions value to be set
     * @return Builder
     */

    public StagedQuoteUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the StagedQuote.</p>
     * @param actions value to be set
     * @return Builder
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
     *  <p>Update actions to be performed on the StagedQuote.</p>
     * @param builder function to build the actions value
     * @return Builder
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
     *  <p>Update actions to be performed on the StagedQuote.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public StagedQuoteUpdateBuilder withActions(
            Function<com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionBuilder, Builder<? extends com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.staged_quote.StagedQuoteUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Expected version of the StagedQuote to which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the StagedQuote.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds StagedQuoteUpdate with checking for non-null required values
     * @return StagedQuoteUpdate
     */
    public StagedQuoteUpdate build() {
        Objects.requireNonNull(version, StagedQuoteUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, StagedQuoteUpdate.class + ": actions is missing");
        return new StagedQuoteUpdateImpl(version, actions);
    }

    /**
     * builds StagedQuoteUpdate without checking for non-null required values
     * @return StagedQuoteUpdate
     */
    public StagedQuoteUpdate buildUnchecked() {
        return new StagedQuoteUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of StagedQuoteUpdateBuilder
     * @return builder
     */
    public static StagedQuoteUpdateBuilder of() {
        return new StagedQuoteUpdateBuilder();
    }

    /**
     * create builder for StagedQuoteUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteUpdateBuilder of(final StagedQuoteUpdate template) {
        StagedQuoteUpdateBuilder builder = new StagedQuoteUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
