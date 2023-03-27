
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeMoneyTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeMoneyType attributeMoneyType = AttributeMoneyType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeMoneyTypeBuilder implements Builder<AttributeMoneyType> {

    /**
     * builds AttributeMoneyType with checking for non-null required values
     * @return AttributeMoneyType
     */
    public AttributeMoneyType build() {
        return new AttributeMoneyTypeImpl();
    }

    /**
     * builds AttributeMoneyType without checking for non-null required values
     * @return AttributeMoneyType
     */
    public AttributeMoneyType buildUnchecked() {
        return new AttributeMoneyTypeImpl();
    }

    /**
     * factory method for an instance of AttributeMoneyTypeBuilder
     * @return builder
     */
    public static AttributeMoneyTypeBuilder of() {
        return new AttributeMoneyTypeBuilder();
    }

    /**
     * create builder for AttributeMoneyType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeMoneyTypeBuilder of(final AttributeMoneyType template) {
        AttributeMoneyTypeBuilder builder = new AttributeMoneyTypeBuilder();
        return builder;
    }

}
