
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeType attributeType = AttributeType.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeTypeBuilder implements Builder<AttributeType> {

    private String name;

    /**
     <>
     */

    public AttributeTypeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public AttributeType build() {
        Objects.requireNonNull(name, AttributeType.class + ": name is missing");
        return new AttributeTypeImpl(name);
    }

    /**
     * builds AttributeType without checking for non null required values
     */
    public AttributeType buildUnchecked() {
        return new AttributeTypeImpl(name);
    }

    public static AttributeTypeBuilder of() {
        return new AttributeTypeBuilder();
    }

    public static AttributeTypeBuilder of(final AttributeType template) {
        AttributeTypeBuilder builder = new AttributeTypeBuilder();
        builder.name = template.getName();
        return builder;
    }

}
