
package com.commercetools.api.models.staged_quote;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteSetValidToActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteSetValidToAction stagedQuoteSetValidToAction = StagedQuoteSetValidToAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteSetValidToActionBuilder implements Builder<StagedQuoteSetValidToAction> {

    @Nullable
    private java.time.ZonedDateTime validTo;

    /**
     *  <p>If <code>validTo</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     * @param validTo value to be set
     * @return Builder
     */

    public StagedQuoteSetValidToActionBuilder validTo(@Nullable final java.time.ZonedDateTime validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     *  <p>If <code>validTo</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
     * @return validTo
     */

    @Nullable
    public java.time.ZonedDateTime getValidTo() {
        return this.validTo;
    }

    /**
     * builds StagedQuoteSetValidToAction with checking for non-null required values
     * @return StagedQuoteSetValidToAction
     */
    public StagedQuoteSetValidToAction build() {
        return new StagedQuoteSetValidToActionImpl(validTo);
    }

    /**
     * builds StagedQuoteSetValidToAction without checking for non-null required values
     * @return StagedQuoteSetValidToAction
     */
    public StagedQuoteSetValidToAction buildUnchecked() {
        return new StagedQuoteSetValidToActionImpl(validTo);
    }

    /**
     * factory method for an instance of StagedQuoteSetValidToActionBuilder
     * @return builder
     */
    public static StagedQuoteSetValidToActionBuilder of() {
        return new StagedQuoteSetValidToActionBuilder();
    }

    /**
     * create builder for StagedQuoteSetValidToAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteSetValidToActionBuilder of(final StagedQuoteSetValidToAction template) {
        StagedQuoteSetValidToActionBuilder builder = new StagedQuoteSetValidToActionBuilder();
        builder.validTo = template.getValidTo();
        return builder;
    }

}
