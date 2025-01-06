
package com.commercetools.history.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PatternComponentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PatternComponent patternComponent = PatternComponent.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PatternComponentBuilder implements Builder<PatternComponent> {

    private String type;

    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */

    public PatternComponentBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     * value of type}
     * @return type
     */

    public String getType() {
        return this.type;
    }

    /**
     * builds PatternComponent with checking for non-null required values
     * @return PatternComponent
     */
    public PatternComponent build() {
        Objects.requireNonNull(type, PatternComponent.class + ": type is missing");
        return new PatternComponentImpl(type);
    }

    /**
     * builds PatternComponent without checking for non-null required values
     * @return PatternComponent
     */
    public PatternComponent buildUnchecked() {
        return new PatternComponentImpl(type);
    }

    /**
     * factory method for an instance of PatternComponentBuilder
     * @return builder
     */
    public static PatternComponentBuilder of() {
        return new PatternComponentBuilder();
    }

    /**
     * create builder for PatternComponent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PatternComponentBuilder of(final PatternComponent template) {
        PatternComponentBuilder builder = new PatternComponentBuilder();
        builder.type = template.getType();
        return builder;
    }

}
