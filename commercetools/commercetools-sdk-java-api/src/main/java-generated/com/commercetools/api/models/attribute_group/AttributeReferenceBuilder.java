
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
     *  <p>The Attribute's <code>name</code> as given in its AttributeDefinition.</p>
     * @param key value to be set
     * @return Builder
     */

    public AttributeReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The Attribute's <code>name</code> as given in its AttributeDefinition.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds AttributeReference with checking for non-null required values
     * @return AttributeReference
     */
    public AttributeReference build() {
        Objects.requireNonNull(key, AttributeReference.class + ": key is missing");
        return new AttributeReferenceImpl(key);
    }

    /**
     * builds AttributeReference without checking for non-null required values
     * @return AttributeReference
     */
    public AttributeReference buildUnchecked() {
        return new AttributeReferenceImpl(key);
    }

    /**
     * factory method for an instance of AttributeReferenceBuilder
     * @return builder
     */
    public static AttributeReferenceBuilder of() {
        return new AttributeReferenceBuilder();
    }

    /**
     * create builder for AttributeReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeReferenceBuilder of(final AttributeReference template) {
        AttributeReferenceBuilder builder = new AttributeReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
