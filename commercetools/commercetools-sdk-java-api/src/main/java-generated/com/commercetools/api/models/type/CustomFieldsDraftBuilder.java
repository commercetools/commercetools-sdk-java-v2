
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldsDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldsDraft customFieldsDraft = CustomFieldsDraft.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldsDraftBuilder implements Builder<CustomFieldsDraft> {

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     <*  <p><code>id</code> or <code>key</code> of the Type.</p>>
     */

    public CustomFieldsDraftBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     <*  <p><code>id</code> or <code>key</code> of the Type.</p>>
     */

    public CustomFieldsDraftBuilder type(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     <*  <p>Object containing the Custom Fields for the customized resource or data type.</p>>
     */

    public CustomFieldsDraftBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Object containing the Custom Fields for the customized resource or data type.</p>>
     */

    public CustomFieldsDraftBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public CustomFieldsDraft build() {
        Objects.requireNonNull(type, CustomFieldsDraft.class + ": type is missing");
        return new CustomFieldsDraftImpl(type, fields);
    }

    /**
     * builds CustomFieldsDraft without checking for non null required values
     */
    public CustomFieldsDraft buildUnchecked() {
        return new CustomFieldsDraftImpl(type, fields);
    }

    public static CustomFieldsDraftBuilder of() {
        return new CustomFieldsDraftBuilder();
    }

    public static CustomFieldsDraftBuilder of(final CustomFieldsDraft template) {
        CustomFieldsDraftBuilder builder = new CustomFieldsDraftBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
