
package com.commercetools.api.models.staged_quote;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteChangeStagedQuoteStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteChangeStagedQuoteStateAction stagedQuoteChangeStagedQuoteStateAction = StagedQuoteChangeStagedQuoteStateAction.builder()
 *             .stagedQuoteState(StagedQuoteState.IN_PROGRESS)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteChangeStagedQuoteStateActionBuilder
        implements Builder<StagedQuoteChangeStagedQuoteStateAction> {

    private com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState;

    /**
     *  <p>New state to be set for the Staged Quote.</p>
     * @param stagedQuoteState value to be set
     * @return Builder
     */

    public StagedQuoteChangeStagedQuoteStateActionBuilder stagedQuoteState(
            final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
        return this;
    }

    public com.commercetools.api.models.staged_quote.StagedQuoteState getStagedQuoteState() {
        return this.stagedQuoteState;
    }

    /**
     * builds StagedQuoteChangeStagedQuoteStateAction with checking for non-null required values
     * @return StagedQuoteChangeStagedQuoteStateAction
     */
    public StagedQuoteChangeStagedQuoteStateAction build() {
        Objects.requireNonNull(stagedQuoteState,
            StagedQuoteChangeStagedQuoteStateAction.class + ": stagedQuoteState is missing");
        return new StagedQuoteChangeStagedQuoteStateActionImpl(stagedQuoteState);
    }

    /**
     * builds StagedQuoteChangeStagedQuoteStateAction without checking for non-null required values
     * @return StagedQuoteChangeStagedQuoteStateAction
     */
    public StagedQuoteChangeStagedQuoteStateAction buildUnchecked() {
        return new StagedQuoteChangeStagedQuoteStateActionImpl(stagedQuoteState);
    }

    public static StagedQuoteChangeStagedQuoteStateActionBuilder of() {
        return new StagedQuoteChangeStagedQuoteStateActionBuilder();
    }

    public static StagedQuoteChangeStagedQuoteStateActionBuilder of(
            final StagedQuoteChangeStagedQuoteStateAction template) {
        StagedQuoteChangeStagedQuoteStateActionBuilder builder = new StagedQuoteChangeStagedQuoteStateActionBuilder();
        builder.stagedQuoteState = template.getStagedQuoteState();
        return builder;
    }

}
