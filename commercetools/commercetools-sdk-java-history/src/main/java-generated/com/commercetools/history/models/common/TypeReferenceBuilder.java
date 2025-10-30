
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeReference typeReference = TypeReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TypeReferenceBuilder implements Builder<TypeReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public TypeReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds TypeReference with checking for non-null required values
     * @return TypeReference
     */
    public TypeReference build() {
        Objects.requireNonNull(id, TypeReference.class + ": id is missing");
        return new TypeReferenceImpl(id);
    }

    /**
     * builds TypeReference without checking for non-null required values
     * @return TypeReference
     */
    public TypeReference buildUnchecked() {
        return new TypeReferenceImpl(id);
    }

    /**
     * factory method for an instance of TypeReferenceBuilder
     * @return builder
     */
    public static TypeReferenceBuilder of() {
        return new TypeReferenceBuilder();
    }

    /**
     * create builder for TypeReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeReferenceBuilder of(final TypeReference template) {
        TypeReferenceBuilder builder = new TypeReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
