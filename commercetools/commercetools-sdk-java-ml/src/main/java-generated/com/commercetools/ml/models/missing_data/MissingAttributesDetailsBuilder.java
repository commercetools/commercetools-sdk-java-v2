
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   MissingAttributesDetails missingAttributesDetails = MissingAttributesDetails.builder()
           .total(0.3)
           .missingAttributeNames(0.3)
           .missingAttributeValues(0.3)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingAttributesDetailsBuilder implements Builder<MissingAttributesDetails> {

    private Integer total;

    private Integer missingAttributeNames;

    private Integer missingAttributeValues;

    /**
     *  <p>Number of products scanned.</p>
     */

    public MissingAttributesDetailsBuilder total(final Integer total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of products missing attribute names.</p>
     */

    public MissingAttributesDetailsBuilder missingAttributeNames(final Integer missingAttributeNames) {
        this.missingAttributeNames = missingAttributeNames;
        return this;
    }

    /**
     *  <p>Number of products missing attribute values.</p>
     */

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
