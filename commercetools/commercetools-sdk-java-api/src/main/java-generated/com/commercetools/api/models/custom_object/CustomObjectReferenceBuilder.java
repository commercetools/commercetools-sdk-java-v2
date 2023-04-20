
package com.commercetools.api.models.custom_object;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomObjectReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomObjectReference customObjectReference = CustomObjectReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomObjectReferenceBuilder implements Builder<CustomObjectReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.custom_object.CustomObject obj;

    /**
     *  <p>Unique identifier of the referenced CustomObject.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomObjectReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded CustomObject. Only present in responses to requests with Reference Expansion for CustomObjects.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public CustomObjectReferenceBuilder obj(
            Function<com.commercetools.api.models.custom_object.CustomObjectBuilder, com.commercetools.api.models.custom_object.CustomObjectBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.custom_object.CustomObjectBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded CustomObject. Only present in responses to requests with Reference Expansion for CustomObjects.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public CustomObjectReferenceBuilder withObj(
            Function<com.commercetools.api.models.custom_object.CustomObjectBuilder, com.commercetools.api.models.custom_object.CustomObject> builder) {
        this.obj = builder.apply(com.commercetools.api.models.custom_object.CustomObjectBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded CustomObject. Only present in responses to requests with Reference Expansion for CustomObjects.</p>
     * @param obj value to be set
     * @return Builder
     */

    public CustomObjectReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.custom_object.CustomObject obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced CustomObject.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded CustomObject. Only present in responses to requests with Reference Expansion for CustomObjects.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.custom_object.CustomObject getObj() {
        return this.obj;
    }

    /**
     * builds CustomObjectReference with checking for non-null required values
     * @return CustomObjectReference
     */
    public CustomObjectReference build() {
        Objects.requireNonNull(id, CustomObjectReference.class + ": id is missing");
        return new CustomObjectReferenceImpl(id, obj);
    }

    /**
     * builds CustomObjectReference without checking for non-null required values
     * @return CustomObjectReference
     */
    public CustomObjectReference buildUnchecked() {
        return new CustomObjectReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of CustomObjectReferenceBuilder
     * @return builder
     */
    public static CustomObjectReferenceBuilder of() {
        return new CustomObjectReferenceBuilder();
    }

    /**
     * create builder for CustomObjectReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomObjectReferenceBuilder of(final CustomObjectReference template) {
        CustomObjectReferenceBuilder builder = new CustomObjectReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
