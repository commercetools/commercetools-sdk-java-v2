
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeCoverageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeCoverage attributeCoverage = AttributeCoverage.builder()
 *             .names(0.3)
 *             .values(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class AttributeCoverageBuilder implements Builder<AttributeCoverage> {

    private Double names;

    private Double values;

    /**
     *  <p>The percentage of attributes from the product type defined in the product variant. A value of <code>1.0</code> indicates a product variant contains all attributes defined in the product type.</p>
     */

    public AttributeCoverageBuilder names(final Double names) {
        this.names = names;
        return this;
    }

    /**
     *  <p>Represents the percentage of attributes in the product variant that contain values.</p>
     */

    public AttributeCoverageBuilder values(final Double values) {
        this.values = values;
        return this;
    }

    public Double getNames() {
        return this.names;
    }

    public Double getValues() {
        return this.values;
    }

    public AttributeCoverage build() {
        Objects.requireNonNull(names, AttributeCoverage.class + ": names is missing");
        Objects.requireNonNull(values, AttributeCoverage.class + ": values is missing");
        return new AttributeCoverageImpl(names, values);
    }

    /**
     * builds AttributeCoverage without checking for non null required values
     */
    public AttributeCoverage buildUnchecked() {
        return new AttributeCoverageImpl(names, values);
    }

    public static AttributeCoverageBuilder of() {
        return new AttributeCoverageBuilder();
    }

    public static AttributeCoverageBuilder of(final AttributeCoverage template) {
        AttributeCoverageBuilder builder = new AttributeCoverageBuilder();
        builder.names = template.getNames();
        builder.values = template.getValues();
        return builder;
    }

}
