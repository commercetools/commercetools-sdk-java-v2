
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

    @Nullable
    private com.commercetools.api.models.type.Type obj;

    /**
     *  <p>Unique identifier of the referenced Type.</p>
     * @param id
     * @return Builder
     */

    public TypeReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Type. Only present in responses to requests with Reference Expansion for Types.</p>
     * @return Builder
     */

    public TypeReferenceBuilder obj(
            Function<com.commercetools.api.models.type.TypeBuilder, com.commercetools.api.models.type.TypeBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.type.TypeBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Type. Only present in responses to requests with Reference Expansion for Types.</p>
     * @param obj
     * @return Builder
     */

    public TypeReferenceBuilder obj(@Nullable final com.commercetools.api.models.type.Type obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.type.Type getObj() {
        return this.obj;
    }

    public TypeReference build() {
        Objects.requireNonNull(id, TypeReference.class + ": id is missing");
        return new TypeReferenceImpl(id, obj);
    }

    /**
     * builds TypeReference without checking for non null required values
     */
    public TypeReference buildUnchecked() {
        return new TypeReferenceImpl(id, obj);
    }

    public static TypeReferenceBuilder of() {
        return new TypeReferenceBuilder();
    }

    public static TypeReferenceBuilder of(final TypeReference template) {
        TypeReferenceBuilder builder = new TypeReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
