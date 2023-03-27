
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetCustomTypeAction standalonePriceSetCustomTypeAction = StandalonePriceSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetCustomTypeActionBuilder implements Builder<StandalonePriceSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the StandalonePrice with Custom Fields. If absent, any existing Type and Custom Fields are removed from the StandalonePrice.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public StandalonePriceSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the StandalonePrice with Custom Fields. If absent, any existing Type and Custom Fields are removed from the StandalonePrice.</p>
     * @param type value to be set
     * @return Builder
     */

    public StandalonePriceSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the StandalonePrice.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public StandalonePriceSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the StandalonePrice.</p>
     * @param fields value to be set
     * @return Builder
     */

    public StandalonePriceSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the StandalonePrice with Custom Fields. If absent, any existing Type and Custom Fields are removed from the StandalonePrice.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the StandalonePrice.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds StandalonePriceSetCustomTypeAction with checking for non-null required values
     * @return StandalonePriceSetCustomTypeAction
     */
    public StandalonePriceSetCustomTypeAction build() {
        return new StandalonePriceSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds StandalonePriceSetCustomTypeAction without checking for non-null required values
     * @return StandalonePriceSetCustomTypeAction
     */
    public StandalonePriceSetCustomTypeAction buildUnchecked() {
        return new StandalonePriceSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of StandalonePriceSetCustomTypeActionBuilder
     * @return builder
     */
    public static StandalonePriceSetCustomTypeActionBuilder of() {
        return new StandalonePriceSetCustomTypeActionBuilder();
    }

    /**
     * create builder for StandalonePriceSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetCustomTypeActionBuilder of(final StandalonePriceSetCustomTypeAction template) {
        StandalonePriceSetCustomTypeActionBuilder builder = new StandalonePriceSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
