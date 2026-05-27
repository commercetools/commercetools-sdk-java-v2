
package com.commercetools.api.models.extension;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionReference extensionReference = ExtensionReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionReferenceBuilder implements Builder<ExtensionReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.extension.Extension obj;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public ExtensionReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Extension. Only present in responses to requests with <span>Reference Expansion</span> for Extensions.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public ExtensionReferenceBuilder obj(
            Function<com.commercetools.api.models.extension.ExtensionBuilder, com.commercetools.api.models.extension.ExtensionBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.extension.ExtensionBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Extension. Only present in responses to requests with <span>Reference Expansion</span> for Extensions.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public ExtensionReferenceBuilder withObj(
            Function<com.commercetools.api.models.extension.ExtensionBuilder, com.commercetools.api.models.extension.Extension> builder) {
        this.obj = builder.apply(com.commercetools.api.models.extension.ExtensionBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Extension. Only present in responses to requests with <span>Reference Expansion</span> for Extensions.</p>
     * @param obj value to be set
     * @return Builder
     */

    public ExtensionReferenceBuilder obj(@Nullable final com.commercetools.api.models.extension.Extension obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Extension" rel="nofollow">Extension</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded Extension. Only present in responses to requests with <span>Reference Expansion</span> for Extensions.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.extension.Extension getObj() {
        return this.obj;
    }

    /**
     * builds ExtensionReference with checking for non-null required values
     * @return ExtensionReference
     */
    public ExtensionReference build() {
        Objects.requireNonNull(id, ExtensionReference.class + ": id is missing");
        return new ExtensionReferenceImpl(id, obj);
    }

    /**
     * builds ExtensionReference without checking for non-null required values
     * @return ExtensionReference
     */
    public ExtensionReference buildUnchecked() {
        return new ExtensionReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of ExtensionReferenceBuilder
     * @return builder
     */
    public static ExtensionReferenceBuilder of() {
        return new ExtensionReferenceBuilder();
    }

    /**
     * create builder for ExtensionReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionReferenceBuilder of(final ExtensionReference template) {
        ExtensionReferenceBuilder builder = new ExtensionReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
