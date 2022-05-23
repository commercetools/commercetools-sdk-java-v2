
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   StoreSetCustomTypeAction storeSetCustomTypeAction = StoreSetCustomTypeAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetCustomTypeActionBuilder implements Builder<StoreSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the Store with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Store.</p>
     */

    public StoreSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Store with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Store.</p>
     */

    public StoreSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Store.</p>
     */

    public StoreSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Store.</p>
     */

    public StoreSetCustomTypeActionBuilder fields(
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

    public StoreSetCustomTypeAction build() {
        return new StoreSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds StoreSetCustomTypeAction without checking for non null required values
     */
    public StoreSetCustomTypeAction buildUnchecked() {
        return new StoreSetCustomTypeActionImpl(type, fields);
    }

    public static StoreSetCustomTypeActionBuilder of() {
        return new StoreSetCustomTypeActionBuilder();
    }

    public static StoreSetCustomTypeActionBuilder of(final StoreSetCustomTypeAction template) {
        StoreSetCustomTypeActionBuilder builder = new StoreSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
