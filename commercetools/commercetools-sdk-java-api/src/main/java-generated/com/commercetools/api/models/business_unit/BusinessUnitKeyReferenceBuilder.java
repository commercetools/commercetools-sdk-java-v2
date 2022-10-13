
package com.commercetools.api.models.business_unit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitKeyReference businessUnitKeyReference = BusinessUnitKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitKeyReferenceBuilder implements Builder<BusinessUnitKeyReference> {

    private String key;

    /**
     *  <p>Unique and immutable key of the referenced BusinessUnit.</p>
     */

    public BusinessUnitKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public BusinessUnitKeyReference build() {
        Objects.requireNonNull(key, BusinessUnitKeyReference.class + ": key is missing");
        return new BusinessUnitKeyReferenceImpl(key);
    }

    /**
     * builds BusinessUnitKeyReference without checking for non null required values
     */
    public BusinessUnitKeyReference buildUnchecked() {
        return new BusinessUnitKeyReferenceImpl(key);
    }

    public static BusinessUnitKeyReferenceBuilder of() {
        return new BusinessUnitKeyReferenceBuilder();
    }

    public static BusinessUnitKeyReferenceBuilder of(final BusinessUnitKeyReference template) {
        BusinessUnitKeyReferenceBuilder builder = new BusinessUnitKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
