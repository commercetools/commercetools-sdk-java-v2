
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeCoverageBuilder implements Builder<AttributeCoverage> {

    private Double names;

    private Double values;

    public AttributeCoverageBuilder names(final Double names) {
        this.names = names;
        return this;
    }

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
