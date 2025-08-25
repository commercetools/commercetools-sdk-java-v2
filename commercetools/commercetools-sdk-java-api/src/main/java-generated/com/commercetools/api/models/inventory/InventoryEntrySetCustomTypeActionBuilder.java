
package com.commercetools.api.models.inventory;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetCustomTypeAction inventoryEntrySetCustomTypeAction = InventoryEntrySetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetCustomTypeActionBuilder implements Builder<InventoryEntrySetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the InventoryEntry with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the InventoryEntry.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public InventoryEntrySetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the InventoryEntry with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the InventoryEntry.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public InventoryEntrySetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the InventoryEntry with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the InventoryEntry.</p>
     * @param type value to be set
     * @return Builder
     */

    public InventoryEntrySetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the InventoryEntry.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public InventoryEntrySetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the InventoryEntry.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public InventoryEntrySetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the InventoryEntry.</p>
     * @param fields value to be set
     * @return Builder
     */

    public InventoryEntrySetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the InventoryEntry with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the InventoryEntry.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the InventoryEntry.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds InventoryEntrySetCustomTypeAction with checking for non-null required values
     * @return InventoryEntrySetCustomTypeAction
     */
    public InventoryEntrySetCustomTypeAction build() {
        return new InventoryEntrySetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds InventoryEntrySetCustomTypeAction without checking for non-null required values
     * @return InventoryEntrySetCustomTypeAction
     */
    public InventoryEntrySetCustomTypeAction buildUnchecked() {
        return new InventoryEntrySetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of InventoryEntrySetCustomTypeActionBuilder
     * @return builder
     */
    public static InventoryEntrySetCustomTypeActionBuilder of() {
        return new InventoryEntrySetCustomTypeActionBuilder();
    }

    /**
     * create builder for InventoryEntrySetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetCustomTypeActionBuilder of(final InventoryEntrySetCustomTypeAction template) {
        InventoryEntrySetCustomTypeActionBuilder builder = new InventoryEntrySetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
