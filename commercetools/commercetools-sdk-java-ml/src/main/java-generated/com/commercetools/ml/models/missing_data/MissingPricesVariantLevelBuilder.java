
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingPricesVariantLevelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingPricesVariantLevel missingPricesVariantLevel = MissingPricesVariantLevel.builder()
 *             .total(0.3)
 *             .missingPrices(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class MissingPricesVariantLevelBuilder implements Builder<MissingPricesVariantLevel> {

    private Long total;

    private Long missingPrices;

    /**
     *  <p>Number of product variants scanned.</p>
     */

    public MissingPricesVariantLevelBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of product variants missing prices.</p>
     */

    public MissingPricesVariantLevelBuilder missingPrices(final Long missingPrices) {
        this.missingPrices = missingPrices;
        return this;
    }

    public Long getTotal() {
        return this.total;
    }

    public Long getMissingPrices() {
        return this.missingPrices;
    }

    public MissingPricesVariantLevel build() {
        Objects.requireNonNull(total, MissingPricesVariantLevel.class + ": total is missing");
        Objects.requireNonNull(missingPrices, MissingPricesVariantLevel.class + ": missingPrices is missing");
        return new MissingPricesVariantLevelImpl(total, missingPrices);
    }

    /**
     * builds MissingPricesVariantLevel without checking for non null required values
     */
    public MissingPricesVariantLevel buildUnchecked() {
        return new MissingPricesVariantLevelImpl(total, missingPrices);
    }

    public static MissingPricesVariantLevelBuilder of() {
        return new MissingPricesVariantLevelBuilder();
    }

    public static MissingPricesVariantLevelBuilder of(final MissingPricesVariantLevel template) {
        MissingPricesVariantLevelBuilder builder = new MissingPricesVariantLevelBuilder();
        builder.total = template.getTotal();
        builder.missingPrices = template.getMissingPrices();
        return builder;
    }

}
