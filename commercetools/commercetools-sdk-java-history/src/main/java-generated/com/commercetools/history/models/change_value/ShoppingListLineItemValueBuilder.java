
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListLineItemValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListLineItemValue shoppingListLineItemValue = ShoppingListLineItemValue.builder()
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .variantId(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListLineItemValueBuilder implements Builder<ShoppingListLineItemValue> {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private Integer variantId;

    /**
     *  <p><code>id</code> of the ShoppingListLineItem.</p>
     * @param id value to be set
     * @return Builder
     */

    public ShoppingListLineItemValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Name of the corresponding Product the Product Variant belongs to.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ShoppingListLineItemValueBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the corresponding Product the Product Variant belongs to.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public ShoppingListLineItemValueBuilder withName(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the corresponding Product the Product Variant belongs to.</p>
     * @param name value to be set
     * @return Builder
     */

    public ShoppingListLineItemValueBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the ProductVariant the ShoppingListLineItem refers to.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ShoppingListLineItemValueBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p><code>id</code> of the ShoppingListLineItem.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Name of the corresponding Product the Product Variant belongs to.</p>
     * @return name
     */

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the ProductVariant the ShoppingListLineItem refers to.</p>
     * @return variantId
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     * builds ShoppingListLineItemValue with checking for non-null required values
     * @return ShoppingListLineItemValue
     */
    public ShoppingListLineItemValue build() {
        Objects.requireNonNull(id, ShoppingListLineItemValue.class + ": id is missing");
        Objects.requireNonNull(name, ShoppingListLineItemValue.class + ": name is missing");
        Objects.requireNonNull(variantId, ShoppingListLineItemValue.class + ": variantId is missing");
        return new ShoppingListLineItemValueImpl(id, name, variantId);
    }

    /**
     * builds ShoppingListLineItemValue without checking for non-null required values
     * @return ShoppingListLineItemValue
     */
    public ShoppingListLineItemValue buildUnchecked() {
        return new ShoppingListLineItemValueImpl(id, name, variantId);
    }

    /**
     * factory method for an instance of ShoppingListLineItemValueBuilder
     * @return builder
     */
    public static ShoppingListLineItemValueBuilder of() {
        return new ShoppingListLineItemValueBuilder();
    }

    /**
     * create builder for ShoppingListLineItemValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListLineItemValueBuilder of(final ShoppingListLineItemValue template) {
        ShoppingListLineItemValueBuilder builder = new ShoppingListLineItemValueBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.variantId = template.getVariantId();
        return builder;
    }

}
