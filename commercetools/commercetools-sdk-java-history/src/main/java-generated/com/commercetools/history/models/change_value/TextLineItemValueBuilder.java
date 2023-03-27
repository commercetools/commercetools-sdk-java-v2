
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TextLineItemValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TextLineItemValue textLineItemValue = TextLineItemValue.builder()
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TextLineItemValueBuilder implements Builder<TextLineItemValue> {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    /**
     * set the value to the id
     * @param id value to be set
     * @return Builder
     */

    public TextLineItemValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the name using the builder function
     * @param builder function to build the name value
     * @return Builder
     */

    public TextLineItemValueBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public TextLineItemValueBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     * value of id}
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * value of name}
     * @return name
     */

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds TextLineItemValue with checking for non-null required values
     * @return TextLineItemValue
     */
    public TextLineItemValue build() {
        Objects.requireNonNull(id, TextLineItemValue.class + ": id is missing");
        Objects.requireNonNull(name, TextLineItemValue.class + ": name is missing");
        return new TextLineItemValueImpl(id, name);
    }

    /**
     * builds TextLineItemValue without checking for non-null required values
     * @return TextLineItemValue
     */
    public TextLineItemValue buildUnchecked() {
        return new TextLineItemValueImpl(id, name);
    }

    /**
     * factory method for an instance of TextLineItemValueBuilder
     * @return builder
     */
    public static TextLineItemValueBuilder of() {
        return new TextLineItemValueBuilder();
    }

    /**
     * create builder for TextLineItemValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TextLineItemValueBuilder of(final TextLineItemValue template) {
        TextLineItemValueBuilder builder = new TextLineItemValueBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        return builder;
    }

}
