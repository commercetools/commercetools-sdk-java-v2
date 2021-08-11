
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingAttributesDetailsBuilder implements Builder<MissingAttributesDetails> {

    private Integer total;

    private Integer missingAttributeNames;

    private Integer missingAttributeValues;

    public MissingAttributesDetailsBuilder total(final Integer total) {
        this.total = total;
        return this;
    }

    public MissingAttributesDetailsBuilder missingAttributeNames(final Integer missingAttributeNames) {
        this.missingAttributeNames = missingAttributeNames;
        return this;
    }

    public MissingAttributesDetailsBuilder missingAttributeValues(final Integer missingAttributeValues) {
        this.missingAttributeValues = missingAttributeValues;
        return this;
    }

    public Integer getTotal() {
        return this.total;
    }

    public Integer getMissingAttributeNames() {
        return this.missingAttributeNames;
    }

    public Integer getMissingAttributeValues() {
        return this.missingAttributeValues;
    }

    public MissingAttributesDetails build() {
        Objects.requireNonNull(total, MissingAttributesDetails.class + ": total is missing");
        Objects.requireNonNull(missingAttributeNames,
            MissingAttributesDetails.class + ": missingAttributeNames is missing");
        Objects.requireNonNull(missingAttributeValues,
            MissingAttributesDetails.class + ": missingAttributeValues is missing");
        return new MissingAttributesDetailsImpl(total, missingAttributeNames, missingAttributeValues);
    }

    /**
     * builds MissingAttributesDetails without checking for non null required values
     */
    public MissingAttributesDetails buildUnchecked() {
        return new MissingAttributesDetailsImpl(total, missingAttributeNames, missingAttributeValues);
    }

    public static MissingAttributesDetailsBuilder of() {
        return new MissingAttributesDetailsBuilder();
    }

    public static MissingAttributesDetailsBuilder of(final MissingAttributesDetails template) {
        MissingAttributesDetailsBuilder builder = new MissingAttributesDetailsBuilder();
        builder.total = template.getTotal();
        builder.missingAttributeNames = template.getMissingAttributeNames();
        builder.missingAttributeValues = template.getMissingAttributeValues();
        return builder;
    }

}
