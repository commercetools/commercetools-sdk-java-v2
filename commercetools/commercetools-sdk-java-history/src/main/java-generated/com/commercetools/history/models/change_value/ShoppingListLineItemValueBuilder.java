
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListLineItemValueBuilder implements Builder<ShoppingListLineItemValue> {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private Integer variantId;

    public ShoppingListLineItemValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ShoppingListLineItemValueBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ShoppingListLineItemValueBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public ShoppingListLineItemValueBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public ShoppingListLineItemValue build() {
        Objects.requireNonNull(id, ShoppingListLineItemValue.class + ": id is missing");
        Objects.requireNonNull(name, ShoppingListLineItemValue.class + ": name is missing");
        Objects.requireNonNull(variantId, ShoppingListLineItemValue.class + ": variantId is missing");
        return new ShoppingListLineItemValueImpl(id, name, variantId);
    }

    /**
     * builds ShoppingListLineItemValue without checking for non null required values
     */
    public ShoppingListLineItemValue buildUnchecked() {
        return new ShoppingListLineItemValueImpl(id, name, variantId);
    }

    public static ShoppingListLineItemValueBuilder of() {
        return new ShoppingListLineItemValueBuilder();
    }

    public static ShoppingListLineItemValueBuilder of(final ShoppingListLineItemValue template) {
        ShoppingListLineItemValueBuilder builder = new ShoppingListLineItemValueBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.variantId = template.getVariantId();
        return builder;
    }

}
