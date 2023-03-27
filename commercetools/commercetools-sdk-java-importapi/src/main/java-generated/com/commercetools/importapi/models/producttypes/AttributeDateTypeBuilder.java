
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDateTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDateType attributeDateType = AttributeDateType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeDateTypeBuilder implements Builder<AttributeDateType> {

    /**
     * builds AttributeDateType with checking for non-null required values
     * @return AttributeDateType
     */
    public AttributeDateType build() {
        return new AttributeDateTypeImpl();
    }

    /**
     * builds AttributeDateType without checking for non-null required values
     * @return AttributeDateType
     */
    public AttributeDateType buildUnchecked() {
        return new AttributeDateTypeImpl();
    }

    /**
     * factory method for an instance of AttributeDateTypeBuilder
     * @return builder
     */
    public static AttributeDateTypeBuilder of() {
        return new AttributeDateTypeBuilder();
    }

    /**
     * create builder for AttributeDateType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeDateTypeBuilder of(final AttributeDateType template) {
        AttributeDateTypeBuilder builder = new AttributeDateTypeBuilder();
        return builder;
    }

}
