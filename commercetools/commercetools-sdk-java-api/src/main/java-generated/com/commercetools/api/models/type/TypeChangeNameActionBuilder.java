
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeNameAction typeChangeNameAction = TypeChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeChangeNameActionBuilder implements Builder<TypeChangeNameAction> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public TypeChangeNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public TypeChangeNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public TypeChangeNameAction build() {
        Objects.requireNonNull(name, TypeChangeNameAction.class + ": name is missing");
        return new TypeChangeNameActionImpl(name);
    }

    /**
     * builds TypeChangeNameAction without checking for non null required values
     */
    public TypeChangeNameAction buildUnchecked() {
        return new TypeChangeNameActionImpl(name);
    }

    public static TypeChangeNameActionBuilder of() {
        return new TypeChangeNameActionBuilder();
    }

    public static TypeChangeNameActionBuilder of(final TypeChangeNameAction template) {
        TypeChangeNameActionBuilder builder = new TypeChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
