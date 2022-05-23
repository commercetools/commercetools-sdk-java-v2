
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingPricesProductCountBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingPricesProductCount missingPricesProductCount = MissingPricesProductCount.builder()
 *             .total(0.3)
 *             .missingPrices(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingPricesProductCountBuilder implements Builder<MissingPricesProductCount> {

    private Long total;

    private Long missingPrices;

    /**
     <>
     */

    public MissingPricesProductCountBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     <>
     */

    public MissingPricesProductCountBuilder missingPrices(final Long missingPrices) {
        this.missingPrices = missingPrices;
        return this;
    }

    public Long getTotal() {
        return this.total;
    }

    public Long getMissingPrices() {
        return this.missingPrices;
    }

    public MissingPricesProductCount build() {
        Objects.requireNonNull(total, MissingPricesProductCount.class + ": total is missing");
        Objects.requireNonNull(missingPrices, MissingPricesProductCount.class + ": missingPrices is missing");
        return new MissingPricesProductCountImpl(total, missingPrices);
    }

    /**
     * builds MissingPricesProductCount without checking for non null required values
     */
    public MissingPricesProductCount buildUnchecked() {
        return new MissingPricesProductCountImpl(total, missingPrices);
    }

    public static MissingPricesProductCountBuilder of() {
        return new MissingPricesProductCountBuilder();
    }

    public static MissingPricesProductCountBuilder of(final MissingPricesProductCount template) {
        MissingPricesProductCountBuilder builder = new MissingPricesProductCountBuilder();
        builder.total = template.getTotal();
        builder.missingPrices = template.getMissingPrices();
        return builder;
    }

}
