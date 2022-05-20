
package com.commercetools.api.models.product_type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductTypeResourceIdentifierBuilder implements Builder<ProductTypeResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
    *  <p>Platform-generated unique identifier of the referenced ProductType. Either <code>id</code> or <code>key</code> is required.</p>
    */

    public ProductTypeResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
    *  <p>User-defined unique identifier of the referenced ProductType. Either <code>id</code> or <code>key</code> is required.</p>
    */

    public ProductTypeResourceIdentifierBuilder key(@Nullable final String key) {
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

    public ProductTypeResourceIdentifier build() {
        return new ProductTypeResourceIdentifierImpl(id, key);
    }

    /**
     * builds ProductTypeResourceIdentifier without checking for non null required values
     */
    public ProductTypeResourceIdentifier buildUnchecked() {
        return new ProductTypeResourceIdentifierImpl(id, key);
    }

    public static ProductTypeResourceIdentifierBuilder of() {
        return new ProductTypeResourceIdentifierBuilder();
    }

    public static ProductTypeResourceIdentifierBuilder of(final ProductTypeResourceIdentifier template) {
        ProductTypeResourceIdentifierBuilder builder = new ProductTypeResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
