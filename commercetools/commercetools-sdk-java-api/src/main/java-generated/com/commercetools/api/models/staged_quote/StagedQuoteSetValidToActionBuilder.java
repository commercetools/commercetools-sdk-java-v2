
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
     */

    public StagedQuoteSetValidToActionBuilder validTo(@Nullable final java.time.ZonedDateTime validTo) {
        this.validTo = validTo;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getValidTo() {
        return this.validTo;
    }

    public StagedQuoteSetValidToAction build() {
        return new StagedQuoteSetValidToActionImpl(validTo);
    }

    /**
     * builds StagedQuoteSetValidToAction without checking for non null required values
     */
    public StagedQuoteSetValidToAction buildUnchecked() {
        return new StagedQuoteSetValidToActionImpl(validTo);
    }

    public static StagedQuoteSetValidToActionBuilder of() {
        return new StagedQuoteSetValidToActionBuilder();
    }

    public static StagedQuoteSetValidToActionBuilder of(final StagedQuoteSetValidToAction template) {
        StagedQuoteSetValidToActionBuilder builder = new StagedQuoteSetValidToActionBuilder();
        builder.validTo = template.getValidTo();
        return builder;
    }

}
