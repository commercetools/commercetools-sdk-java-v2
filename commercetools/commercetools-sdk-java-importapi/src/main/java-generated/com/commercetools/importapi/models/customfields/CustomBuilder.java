
package com.commercetools.importapi.models.customfields;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Custom custom = Custom.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomBuilder implements Builder<Custom> {

    private com.commercetools.importapi.models.common.TypeKeyReference type;

    @Nullable
    private com.commercetools.importapi.models.customfields.FieldContainer fields;

    /**
     *  <p>The Type that provides the field definitions for this object. If the referenced Type does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Type is created.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CustomBuilder type(
            Function<com.commercetools.importapi.models.common.TypeKeyReferenceBuilder, com.commercetools.importapi.models.common.TypeKeyReferenceBuilder> builder) {
        this.type = builder.apply(com.commercetools.importapi.models.common.TypeKeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Type that provides the field definitions for this object. If the referenced Type does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Type is created.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CustomBuilder withType(
            Function<com.commercetools.importapi.models.common.TypeKeyReferenceBuilder, com.commercetools.importapi.models.common.TypeKeyReference> builder) {
        this.type = builder.apply(com.commercetools.importapi.models.common.TypeKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>The Type that provides the field definitions for this object. If the referenced Type does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Type is created.</p>
     * @param type value to be set
     * @return Builder
     */

    public CustomBuilder type(final com.commercetools.importapi.models.common.TypeKeyReference type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>The Custom Fields of this object.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CustomBuilder fields(
            Function<com.commercetools.importapi.models.customfields.FieldContainerBuilder, com.commercetools.importapi.models.customfields.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.importapi.models.customfields.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Custom Fields of this object.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CustomBuilder withFields(
            Function<com.commercetools.importapi.models.customfields.FieldContainerBuilder, com.commercetools.importapi.models.customfields.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.importapi.models.customfields.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>The Custom Fields of this object.</p>
     * @param fields value to be set
     * @return Builder
     */

    public CustomBuilder fields(@Nullable final com.commercetools.importapi.models.customfields.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>The Type that provides the field definitions for this object. If the referenced Type does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced Type is created.</p>
     * @return type
     */

    public com.commercetools.importapi.models.common.TypeKeyReference getType() {
        return this.type;
    }

    /**
     *  <p>The Custom Fields of this object.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.importapi.models.customfields.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds Custom with checking for non-null required values
     * @return Custom
     */
    public Custom build() {
        Objects.requireNonNull(type, Custom.class + ": type is missing");
        return new CustomImpl(type, fields);
    }

    /**
     * builds Custom without checking for non-null required values
     * @return Custom
     */
    public Custom buildUnchecked() {
        return new CustomImpl(type, fields);
    }

    /**
     * factory method for an instance of CustomBuilder
     * @return builder
     */
    public static CustomBuilder of() {
        return new CustomBuilder();
    }

    /**
     * create builder for Custom instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomBuilder of(final Custom template) {
        CustomBuilder builder = new CustomBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
