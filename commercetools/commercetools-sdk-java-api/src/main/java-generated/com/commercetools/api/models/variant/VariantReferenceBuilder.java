
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantReference variantReference = VariantReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantReferenceBuilder implements Builder<VariantReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.variant.Variant obj;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public VariantReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Variant. Only present in responses to requests with <span>Reference Expansion</span> for Variants.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public VariantReferenceBuilder obj(
            Function<com.commercetools.api.models.variant.VariantBuilder, com.commercetools.api.models.variant.VariantBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.variant.VariantBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Variant. Only present in responses to requests with <span>Reference Expansion</span> for Variants.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public VariantReferenceBuilder withObj(
            Function<com.commercetools.api.models.variant.VariantBuilder, com.commercetools.api.models.variant.Variant> builder) {
        this.obj = builder.apply(com.commercetools.api.models.variant.VariantBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Variant. Only present in responses to requests with <span>Reference Expansion</span> for Variants.</p>
     * @param obj value to be set
     * @return Builder
     */

    public VariantReferenceBuilder obj(@Nullable final com.commercetools.api.models.variant.Variant obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variant</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded Variant. Only present in responses to requests with <span>Reference Expansion</span> for Variants.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.variant.Variant getObj() {
        return this.obj;
    }

    /**
     * builds VariantReference with checking for non-null required values
     * @return VariantReference
     */
    public VariantReference build() {
        Objects.requireNonNull(id, VariantReference.class + ": id is missing");
        return new VariantReferenceImpl(id, obj);
    }

    /**
     * builds VariantReference without checking for non-null required values
     * @return VariantReference
     */
    public VariantReference buildUnchecked() {
        return new VariantReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of VariantReferenceBuilder
     * @return builder
     */
    public static VariantReferenceBuilder of() {
        return new VariantReferenceBuilder();
    }

    /**
     * create builder for VariantReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantReferenceBuilder of(final VariantReference template) {
        VariantReferenceBuilder builder = new VariantReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
