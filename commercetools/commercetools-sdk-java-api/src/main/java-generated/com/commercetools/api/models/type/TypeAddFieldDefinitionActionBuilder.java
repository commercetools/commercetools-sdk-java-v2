
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeAddFieldDefinitionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeAddFieldDefinitionAction typeAddFieldDefinitionAction = TypeAddFieldDefinitionAction.builder()
 *             .fieldDefinition(fieldDefinitionBuilder -> fieldDefinitionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeAddFieldDefinitionActionBuilder implements Builder<TypeAddFieldDefinitionAction> {

    private com.commercetools.api.models.type.FieldDefinition fieldDefinition;

    /**
     *  <p>Value to append to the array.</p>
     * @return Builder
     */

    public TypeAddFieldDefinitionActionBuilder fieldDefinition(
            Function<com.commercetools.api.models.type.FieldDefinitionBuilder, com.commercetools.api.models.type.FieldDefinitionBuilder> builder) {
        this.fieldDefinition = builder.apply(com.commercetools.api.models.type.FieldDefinitionBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to append to the array.</p>
     * @param fieldDefinition
     * @return Builder
     */

    public TypeAddFieldDefinitionActionBuilder fieldDefinition(
            final com.commercetools.api.models.type.FieldDefinition fieldDefinition) {
        this.fieldDefinition = fieldDefinition;
        return this;
    }

    public com.commercetools.api.models.type.FieldDefinition getFieldDefinition() {
        return this.fieldDefinition;
    }

    public TypeAddFieldDefinitionAction build() {
        Objects.requireNonNull(fieldDefinition, TypeAddFieldDefinitionAction.class + ": fieldDefinition is missing");
        return new TypeAddFieldDefinitionActionImpl(fieldDefinition);
    }

    /**
     * builds TypeAddFieldDefinitionAction without checking for non null required values
     */
    public TypeAddFieldDefinitionAction buildUnchecked() {
        return new TypeAddFieldDefinitionActionImpl(fieldDefinition);
    }

    public static TypeAddFieldDefinitionActionBuilder of() {
        return new TypeAddFieldDefinitionActionBuilder();
    }

    public static TypeAddFieldDefinitionActionBuilder of(final TypeAddFieldDefinitionAction template) {
        TypeAddFieldDefinitionActionBuilder builder = new TypeAddFieldDefinitionActionBuilder();
        builder.fieldDefinition = template.getFieldDefinition();
        return builder;
    }

}
