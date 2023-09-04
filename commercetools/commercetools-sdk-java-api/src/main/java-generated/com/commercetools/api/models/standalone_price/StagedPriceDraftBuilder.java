
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedPriceDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedPriceDraft stagedPriceDraft = StagedPriceDraft.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedPriceDraftBuilder implements Builder<StagedPriceDraft> {

    private com.commercetools.api.models.common.TypedMoneyDraft value;

    /**
     *  <p>Money value for the StagedPriceDraft.</p>
     * @param value value to be set
     * @return Builder
     */

    public StagedPriceDraftBuilder value(final com.commercetools.api.models.common.TypedMoneyDraft value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Money value for the StagedPriceDraft.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public StagedPriceDraftBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyDraftBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoneyDraft>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value for the StagedPriceDraft.</p>
     * @return value
     */

    public com.commercetools.api.models.common.TypedMoneyDraft getValue() {
        return this.value;
    }

    /**
     * builds StagedPriceDraft with checking for non-null required values
     * @return StagedPriceDraft
     */
    public StagedPriceDraft build() {
        Objects.requireNonNull(value, StagedPriceDraft.class + ": value is missing");
        return new StagedPriceDraftImpl(value);
    }

    /**
     * builds StagedPriceDraft without checking for non-null required values
     * @return StagedPriceDraft
     */
    public StagedPriceDraft buildUnchecked() {
        return new StagedPriceDraftImpl(value);
    }

    /**
     * factory method for an instance of StagedPriceDraftBuilder
     * @return builder
     */
    public static StagedPriceDraftBuilder of() {
        return new StagedPriceDraftBuilder();
    }

    /**
     * create builder for StagedPriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedPriceDraftBuilder of(final StagedPriceDraft template) {
        StagedPriceDraftBuilder builder = new StagedPriceDraftBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
