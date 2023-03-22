
package com.commercetools.api.models.attribute_group;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeReference attributeReference = AttributeReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeReferenceBuilder implements Builder<AttributeReference> {

    private String key;

    /**
     *  <p>Key of the attribute.</p>
     * @param key
     * @return Builder
     */

    public AttributeReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public AttributeReference build() {
        Objects.requireNonNull(key, AttributeReference.class + ": key is missing");
        return new AttributeReferenceImpl(key);
    }

    /**
     * builds AttributeReference without checking for non null required values
     */
    public AttributeReference buildUnchecked() {
        return new AttributeReferenceImpl(key);
    }

    public static AttributeReferenceBuilder of() {
        return new AttributeReferenceBuilder();
    }

    public static AttributeReferenceBuilder of(final AttributeReference template) {
        AttributeReferenceBuilder builder = new AttributeReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
