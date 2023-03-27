
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitSetCustomTypeAction myBusinessUnitSetCustomTypeAction = MyBusinessUnitSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitSetCustomTypeActionBuilder implements Builder<MyBusinessUnitSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the BusinessUnit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the BusinessUnit.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyBusinessUnitSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the BusinessUnit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the BusinessUnit.</p>
     * @param type value to be set
     * @return Builder
     */

    public MyBusinessUnitSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields for the BusinessUnit.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyBusinessUnitSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields for the BusinessUnit.</p>
     * @param fields value to be set
     * @return Builder
     */

    public MyBusinessUnitSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the BusinessUnit with Custom Fields. If absent, any existing Type and Custom Fields are removed from the BusinessUnit.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields for the BusinessUnit.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds MyBusinessUnitSetCustomTypeAction with checking for non-null required values
     * @return MyBusinessUnitSetCustomTypeAction
     */
    public MyBusinessUnitSetCustomTypeAction build() {
        return new MyBusinessUnitSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds MyBusinessUnitSetCustomTypeAction without checking for non-null required values
     * @return MyBusinessUnitSetCustomTypeAction
     */
    public MyBusinessUnitSetCustomTypeAction buildUnchecked() {
        return new MyBusinessUnitSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of MyBusinessUnitSetCustomTypeActionBuilder
     * @return builder
     */
    public static MyBusinessUnitSetCustomTypeActionBuilder of() {
        return new MyBusinessUnitSetCustomTypeActionBuilder();
    }

    /**
     * create builder for MyBusinessUnitSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitSetCustomTypeActionBuilder of(final MyBusinessUnitSetCustomTypeAction template) {
        MyBusinessUnitSetCustomTypeActionBuilder builder = new MyBusinessUnitSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
