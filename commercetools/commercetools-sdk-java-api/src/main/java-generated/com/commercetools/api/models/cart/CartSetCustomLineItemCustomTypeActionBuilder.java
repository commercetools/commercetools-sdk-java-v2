
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CartSetCustomLineItemCustomTypeAction cartSetCustomLineItemCustomTypeAction = CartSetCustomLineItemCustomTypeAction.builder()
           .customLineItemId("{customLineItemId}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomLineItemCustomTypeActionBuilder implements Builder<CartSetCustomLineItemCustomTypeAction> {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public CartSetCustomLineItemCustomTypeActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the CustomLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
     */

    public CartSetCustomLineItemCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the CustomLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
     */

    public CartSetCustomLineItemCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomLineItem.</p>
     */

    public CartSetCustomLineItemCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomLineItem.</p>
     */

    public CartSetCustomLineItemCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public CartSetCustomLineItemCustomTypeAction build() {
        Objects.requireNonNull(customLineItemId,
            CartSetCustomLineItemCustomTypeAction.class + ": customLineItemId is missing");
        return new CartSetCustomLineItemCustomTypeActionImpl(customLineItemId, type, fields);
    }

    /**
     * builds CartSetCustomLineItemCustomTypeAction without checking for non null required values
     */
    public CartSetCustomLineItemCustomTypeAction buildUnchecked() {
        return new CartSetCustomLineItemCustomTypeActionImpl(customLineItemId, type, fields);
    }

    public static CartSetCustomLineItemCustomTypeActionBuilder of() {
        return new CartSetCustomLineItemCustomTypeActionBuilder();
    }

    public static CartSetCustomLineItemCustomTypeActionBuilder of(
            final CartSetCustomLineItemCustomTypeAction template) {
        CartSetCustomLineItemCustomTypeActionBuilder builder = new CartSetCustomLineItemCustomTypeActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
