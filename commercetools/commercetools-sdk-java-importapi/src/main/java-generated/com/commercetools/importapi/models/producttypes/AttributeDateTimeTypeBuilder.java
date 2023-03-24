
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeDateTimeTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeDateTimeType attributeDateTimeType = AttributeDateTimeType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeDateTimeTypeBuilder implements Builder<AttributeDateTimeType> {

    /**
     * builds AttributeDateTimeType with checking for non-null required values
     * @return AttributeDateTimeType
     */
    public AttributeDateTimeType build() {
        return new AttributeDateTimeTypeImpl();
    }

    /**
     * builds AttributeDateTimeType without checking for non-null required values
     * @return AttributeDateTimeType
     */
    public AttributeDateTimeType buildUnchecked() {
        return new AttributeDateTimeTypeImpl();
    }

    public static AttributeDateTimeTypeBuilder of() {
        return new AttributeDateTimeTypeBuilder();
    }

    public static AttributeDateTimeTypeBuilder of(final AttributeDateTimeType template) {
        AttributeDateTimeTypeBuilder builder = new AttributeDateTimeTypeBuilder();
        return builder;
    }

}
