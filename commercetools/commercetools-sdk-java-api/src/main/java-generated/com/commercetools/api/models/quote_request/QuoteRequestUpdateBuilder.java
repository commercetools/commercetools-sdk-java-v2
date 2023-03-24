
package com.commercetools.api.models.quote_request;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestUpdate quoteRequestUpdate = QuoteRequestUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestUpdateBuilder implements Builder<QuoteRequestUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.quote_request.QuoteRequestUpdateAction> actions;

    /**
     *  <p>Expected version of the QuoteRequest to which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public QuoteRequestUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the QuoteRequest.</p>
     * @param actions value to be set
     * @return Builder
     */

    public QuoteRequestUpdateBuilder actions(
            final com.commercetools.api.models.quote_request.QuoteRequestUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the QuoteRequest.</p>
     * @param actions value to be set
     * @return Builder
     */

    public QuoteRequestUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.quote_request.QuoteRequestUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the QuoteRequest.</p>
     * @param actions value to be set
     * @return Builder
     */

    public QuoteRequestUpdateBuilder plusActions(
            final com.commercetools.api.models.quote_request.QuoteRequestUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the QuoteRequest.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public QuoteRequestUpdateBuilder plusActions(
            Function<com.commercetools.api.models.quote_request.QuoteRequestUpdateActionBuilder, Builder<? extends com.commercetools.api.models.quote_request.QuoteRequestUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.quote_request.QuoteRequestUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the QuoteRequest.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public QuoteRequestUpdateBuilder withActions(
            Function<com.commercetools.api.models.quote_request.QuoteRequestUpdateActionBuilder, Builder<? extends com.commercetools.api.models.quote_request.QuoteRequestUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.quote_request.QuoteRequestUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.quote_request.QuoteRequestUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds QuoteRequestUpdate with checking for non-null required values
     * @return QuoteRequestUpdate
     */
    public QuoteRequestUpdate build() {
        Objects.requireNonNull(version, QuoteRequestUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, QuoteRequestUpdate.class + ": actions is missing");
        return new QuoteRequestUpdateImpl(version, actions);
    }

    /**
     * builds QuoteRequestUpdate without checking for non-null required values
     * @return QuoteRequestUpdate
     */
    public QuoteRequestUpdate buildUnchecked() {
        return new QuoteRequestUpdateImpl(version, actions);
    }

    public static QuoteRequestUpdateBuilder of() {
        return new QuoteRequestUpdateBuilder();
    }

    public static QuoteRequestUpdateBuilder of(final QuoteRequestUpdate template) {
        QuoteRequestUpdateBuilder builder = new QuoteRequestUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
