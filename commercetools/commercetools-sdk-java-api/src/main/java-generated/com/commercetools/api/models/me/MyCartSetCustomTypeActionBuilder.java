
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetCustomTypeAction myCartSetCustomTypeAction = MyCartSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetCustomTypeActionBuilder implements Builder<MyCartSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the Cart with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Cart.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyCartSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Cart with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Cart.</p>
     * @param type value to be set
     * @return Builder
     */

    public MyCartSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Cart.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyCartSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Cart.</p>
     * @param fields value to be set
     * @return Builder
     */

    public MyCartSetCustomTypeActionBuilder fields(
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

    /**
     * builds MyCartSetCustomTypeAction with checking for non-null required values
     * @return MyCartSetCustomTypeAction
     */
    public MyCartSetCustomTypeAction build() {
        return new MyCartSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds MyCartSetCustomTypeAction without checking for non-null required values
     * @return MyCartSetCustomTypeAction
     */
    public MyCartSetCustomTypeAction buildUnchecked() {
        return new MyCartSetCustomTypeActionImpl(type, fields);
    }

    public static MyCartSetCustomTypeActionBuilder of() {
        return new MyCartSetCustomTypeActionBuilder();
    }

    public static MyCartSetCustomTypeActionBuilder of(final MyCartSetCustomTypeAction template) {
        MyCartSetCustomTypeActionBuilder builder = new MyCartSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
