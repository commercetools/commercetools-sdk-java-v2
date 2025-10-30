
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFields customFields = CustomFields.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .fields(fieldsBuilder -> fieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldsBuilder implements Builder<CustomFields> {

    private com.commercetools.history.models.common.TypeReference type;

    private com.commercetools.history.models.common.FieldContainer fields;

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that holds the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinitions</a> for the Custom Fields.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CustomFieldsBuilder type(
            Function<com.commercetools.history.models.common.TypeReferenceBuilder, com.commercetools.history.models.common.TypeReferenceBuilder> builder) {
        this.type = builder.apply(com.commercetools.history.models.common.TypeReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that holds the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinitions</a> for the Custom Fields.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CustomFieldsBuilder withType(
            Function<com.commercetools.history.models.common.TypeReferenceBuilder, com.commercetools.history.models.common.TypeReference> builder) {
        this.type = builder.apply(com.commercetools.history.models.common.TypeReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that holds the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinitions</a> for the Custom Fields.</p>
     * @param type value to be set
     * @return Builder
     */

    public CustomFieldsBuilder type(final com.commercetools.history.models.common.TypeReference type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Object containing the Custom Fields for the <span>customized resource or data type</span>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CustomFieldsBuilder fields(
            Function<com.commercetools.history.models.common.FieldContainerBuilder, com.commercetools.history.models.common.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.history.models.common.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Object containing the Custom Fields for the <span>customized resource or data type</span>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CustomFieldsBuilder withFields(
            Function<com.commercetools.history.models.common.FieldContainerBuilder, com.commercetools.history.models.common.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.history.models.common.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Object containing the Custom Fields for the <span>customized resource or data type</span>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public CustomFieldsBuilder fields(final com.commercetools.history.models.common.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that holds the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinitions</a> for the Custom Fields.</p>
     * @return type
     */

    public com.commercetools.history.models.common.TypeReference getType() {
        return this.type;
    }

    /**
     *  <p>Object containing the Custom Fields for the <span>customized resource or data type</span>.</p>
     * @return fields
     */

    public com.commercetools.history.models.common.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds CustomFields with checking for non-null required values
     * @return CustomFields
     */
    public CustomFields build() {
        Objects.requireNonNull(type, CustomFields.class + ": type is missing");
        Objects.requireNonNull(fields, CustomFields.class + ": fields is missing");
        return new CustomFieldsImpl(type, fields);
    }

    /**
     * builds CustomFields without checking for non-null required values
     * @return CustomFields
     */
    public CustomFields buildUnchecked() {
        return new CustomFieldsImpl(type, fields);
    }

    /**
     * factory method for an instance of CustomFieldsBuilder
     * @return builder
     */
    public static CustomFieldsBuilder of() {
        return new CustomFieldsBuilder();
    }

    /**
     * create builder for CustomFields instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomFieldsBuilder of(final CustomFields template) {
        CustomFieldsBuilder builder = new CustomFieldsBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
