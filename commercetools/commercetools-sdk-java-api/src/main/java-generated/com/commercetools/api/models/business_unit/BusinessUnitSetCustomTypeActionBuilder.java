
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetCustomTypeAction businessUnitSetCustomTypeAction = BusinessUnitSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetCustomTypeActionBuilder implements Builder<BusinessUnitSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the BusinessUnit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the BusinessUnit.</p>
     * @return Builder
     */

    public BusinessUnitSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the BusinessUnit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the BusinessUnit.</p>
     * @param type
     * @return Builder
     */

    public BusinessUnitSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields for the BusinessUnit.</p>
     * @return Builder
     */

    public BusinessUnitSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields for the BusinessUnit.</p>
     * @param fields
     * @return Builder
     */

    public BusinessUnitSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public BusinessUnitSetCustomTypeAction build() {
        return new BusinessUnitSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds BusinessUnitSetCustomTypeAction without checking for non null required values
     */
    public BusinessUnitSetCustomTypeAction buildUnchecked() {
        return new BusinessUnitSetCustomTypeActionImpl(type, fields);
    }

    public static BusinessUnitSetCustomTypeActionBuilder of() {
        return new BusinessUnitSetCustomTypeActionBuilder();
    }

    public static BusinessUnitSetCustomTypeActionBuilder of(final BusinessUnitSetCustomTypeAction template) {
        BusinessUnitSetCustomTypeActionBuilder builder = new BusinessUnitSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
