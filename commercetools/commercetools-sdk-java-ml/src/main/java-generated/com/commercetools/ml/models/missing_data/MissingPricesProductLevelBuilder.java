
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingPricesProductLevelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingPricesProductLevel missingPricesProductLevel = MissingPricesProductLevel.builder()
 *             .total(0.3)
 *             .missingPrices(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingPricesProductLevelBuilder implements Builder<MissingPricesProductLevel> {

    private Long total;

    private Long missingPrices;

    /**
     <*  <p>Number of products scanned.</p>>
     */

    public MissingPricesProductLevelBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     <*  <p>Number of products missing prices.</p>>
     */

    public MissingPricesProductLevelBuilder missingPrices(final Long missingPrices) {
        this.missingPrices = missingPrices;
        return this;
    }

    public Long getTotal() {
        return this.total;
    }

    public Long getMissingPrices() {
        return this.missingPrices;
    }

    public MissingPricesProductLevel build() {
        Objects.requireNonNull(total, MissingPricesProductLevel.class + ": total is missing");
        Objects.requireNonNull(missingPrices, MissingPricesProductLevel.class + ": missingPrices is missing");
        return new MissingPricesProductLevelImpl(total, missingPrices);
    }

    /**
     * builds MissingPricesProductLevel without checking for non null required values
     */
    public MissingPricesProductLevel buildUnchecked() {
        return new MissingPricesProductLevelImpl(total, missingPrices);
    }

    public static MissingPricesProductLevelBuilder of() {
        return new MissingPricesProductLevelBuilder();
    }

    public static MissingPricesProductLevelBuilder of(final MissingPricesProductLevel template) {
        MissingPricesProductLevelBuilder builder = new MissingPricesProductLevelBuilder();
        builder.total = template.getTotal();
        builder.missingPrices = template.getMissingPrices();
        return builder;
    }

}
