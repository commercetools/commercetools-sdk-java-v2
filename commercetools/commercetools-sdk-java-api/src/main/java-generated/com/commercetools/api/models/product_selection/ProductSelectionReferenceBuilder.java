
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionReference productSelectionReference = ProductSelectionReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionReferenceBuilder implements Builder<ProductSelectionReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductSelection obj;

    /**
     <*  <p>Unique identifier of the referenced ProductSelection.</p>>
     */

    public ProductSelectionReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     <*  <p>Contains the representation of the expanded ProductSelection. Only present in responses to requests with Reference Expansion for ProductSelections.</p>>
     */

    public ProductSelectionReferenceBuilder obj(
            Function<com.commercetools.api.models.product_selection.ProductSelectionBuilder, com.commercetools.api.models.product_selection.ProductSelectionBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.product_selection.ProductSelectionBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Contains the representation of the expanded ProductSelection. Only present in responses to requests with Reference Expansion for ProductSelections.</p>>
     */

    public ProductSelectionReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.product_selection.ProductSelection obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.product_selection.ProductSelection getObj() {
        return this.obj;
    }

    public ProductSelectionReference build() {
        Objects.requireNonNull(id, ProductSelectionReference.class + ": id is missing");
        return new ProductSelectionReferenceImpl(id, obj);
    }

    /**
     * builds ProductSelectionReference without checking for non null required values
     */
    public ProductSelectionReference buildUnchecked() {
        return new ProductSelectionReferenceImpl(id, obj);
    }

    public static ProductSelectionReferenceBuilder of() {
        return new ProductSelectionReferenceBuilder();
    }

    public static ProductSelectionReferenceBuilder of(final ProductSelectionReference template) {
        ProductSelectionReferenceBuilder builder = new ProductSelectionReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
