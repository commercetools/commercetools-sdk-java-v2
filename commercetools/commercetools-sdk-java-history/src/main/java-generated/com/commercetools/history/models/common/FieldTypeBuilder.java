
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FieldTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FieldType fieldType = FieldType.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FieldTypeBuilder implements Builder<FieldType> {

    private String name;

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public FieldTypeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     * value of name}
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds FieldType with checking for non-null required values
     * @return FieldType
     */
    public FieldType build() {
        Objects.requireNonNull(name, FieldType.class + ": name is missing");
        return new FieldTypeImpl(name);
    }

    /**
     * builds FieldType without checking for non-null required values
     * @return FieldType
     */
    public FieldType buildUnchecked() {
        return new FieldTypeImpl(name);
    }

    /**
     * factory method for an instance of FieldTypeBuilder
     * @return builder
     */
    public static FieldTypeBuilder of() {
        return new FieldTypeBuilder();
    }

    /**
     * create builder for FieldType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FieldTypeBuilder of(final FieldType template) {
        FieldTypeBuilder builder = new FieldTypeBuilder();
        builder.name = template.getName();
        return builder;
    }

}
