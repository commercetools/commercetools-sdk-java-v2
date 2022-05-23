
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldSetTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldSetType customFieldSetType = CustomFieldSetType.builder()
 *             .elementType(elementTypeBuilder -> elementTypeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldSetTypeBuilder implements Builder<CustomFieldSetType> {

    private com.commercetools.api.models.type.FieldType elementType;

    /**
     <*  <p>Field type of the elements in the set.</p>>
     */

    public CustomFieldSetTypeBuilder elementType(final com.commercetools.api.models.type.FieldType elementType) {
        this.elementType = elementType;
        return this;
    }

    /**
     <*  <p>Field type of the elements in the set.</p>>
     */

    public CustomFieldSetTypeBuilder elementType(
            Function<com.commercetools.api.models.type.FieldTypeBuilder, Builder<? extends com.commercetools.api.models.type.FieldType>> builder) {
        this.elementType = builder.apply(com.commercetools.api.models.type.FieldTypeBuilder.of()).build();
        return this;
    }

    public com.commercetools.api.models.type.FieldType getElementType() {
        return this.elementType;
    }

    public CustomFieldSetType build() {
        Objects.requireNonNull(elementType, CustomFieldSetType.class + ": elementType is missing");
        return new CustomFieldSetTypeImpl(elementType);
    }

    /**
     * builds CustomFieldSetType without checking for non null required values
     */
    public CustomFieldSetType buildUnchecked() {
        return new CustomFieldSetTypeImpl(elementType);
    }

    public static CustomFieldSetTypeBuilder of() {
        return new CustomFieldSetTypeBuilder();
    }

    public static CustomFieldSetTypeBuilder of(final CustomFieldSetType template) {
        CustomFieldSetTypeBuilder builder = new CustomFieldSetTypeBuilder();
        builder.elementType = template.getElementType();
        return builder;
    }

}
