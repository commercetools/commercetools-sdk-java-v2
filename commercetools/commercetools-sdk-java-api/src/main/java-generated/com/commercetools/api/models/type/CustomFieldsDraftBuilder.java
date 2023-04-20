
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
     *  <p><code>id</code> or <code>key</code> of the Type.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CustomFieldsDraftBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p><code>id</code> or <code>key</code> of the Type.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CustomFieldsDraftBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><code>id</code> or <code>key</code> of the Type.</p>
     * @param type value to be set
     * @return Builder
     */

    public CustomFieldsDraftBuilder type(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Object containing the Custom Fields for the customized resource or data type.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CustomFieldsDraftBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Object containing the Custom Fields for the customized resource or data type.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CustomFieldsDraftBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Object containing the Custom Fields for the customized resource or data type.</p>
     * @param fields value to be set
     * @return Builder
     */

    public CustomFieldsDraftBuilder fields(@Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p><code>id</code> or <code>key</code> of the Type.</p>
     * @return type
     */

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Object containing the Custom Fields for the customized resource or data type.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds CustomFieldsDraft with checking for non-null required values
     * @return CustomFieldsDraft
     */
    public CustomFieldsDraft build() {
        Objects.requireNonNull(type, CustomFieldsDraft.class + ": type is missing");
        return new CustomFieldsDraftImpl(type, fields);
    }

    /**
     * builds CustomFieldsDraft without checking for non-null required values
     * @return CustomFieldsDraft
     */
    public CustomFieldsDraft buildUnchecked() {
        return new CustomFieldsDraftImpl(type, fields);
    }

    /**
     * factory method for an instance of CustomFieldsDraftBuilder
     * @return builder
     */
    public static CustomFieldsDraftBuilder of() {
        return new CustomFieldsDraftBuilder();
    }

    /**
     * create builder for CustomFieldsDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldsDraftBuilder of(final CustomFieldsDraft template) {
        CustomFieldsDraftBuilder builder = new CustomFieldsDraftBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
