
package com.commercetools.api.models.product_selection;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionResourceIdentifierBuilder implements Builder<ProductSelectionResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public ProductSelectionResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public ProductSelectionResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ProductSelectionResourceIdentifier build() {
        return new ProductSelectionResourceIdentifierImpl(id, key);
    }

    /**
     * builds ProductSelectionResourceIdentifier without checking for non null required values
     */
    public ProductSelectionResourceIdentifier buildUnchecked() {
        return new ProductSelectionResourceIdentifierImpl(id, key);
    }

    public static ProductSelectionResourceIdentifierBuilder of() {
        return new ProductSelectionResourceIdentifierBuilder();
    }

    public static ProductSelectionResourceIdentifierBuilder of(final ProductSelectionResourceIdentifier template) {
        ProductSelectionResourceIdentifierBuilder builder = new ProductSelectionResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
