
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldMoneyTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldMoneyType customFieldMoneyType = CustomFieldMoneyType.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldMoneyTypeBuilder implements Builder<CustomFieldMoneyType> {

    public CustomFieldMoneyType build() {
        return new CustomFieldMoneyTypeImpl();
    }

    /**
     * builds CustomFieldMoneyType without checking for non null required values
     */
    public CustomFieldMoneyType buildUnchecked() {
        return new CustomFieldMoneyTypeImpl();
    }

    public static CustomFieldMoneyTypeBuilder of() {
        return new CustomFieldMoneyTypeBuilder();
    }

    public static CustomFieldMoneyTypeBuilder of(final CustomFieldMoneyType template) {
        CustomFieldMoneyTypeBuilder builder = new CustomFieldMoneyTypeBuilder();
        return builder;
    }

}
