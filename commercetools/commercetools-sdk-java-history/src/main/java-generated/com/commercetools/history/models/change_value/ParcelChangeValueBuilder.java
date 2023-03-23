
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelChangeValue parcelChangeValue = ParcelChangeValue.builder()
 *             .id("{id}")
 *             .createdAt("{createdAt}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelChangeValueBuilder implements Builder<ParcelChangeValue> {

    private String id;

    private String createdAt;

    /**
     *
     * @param id
     * @return Builder
     */

    public ParcelChangeValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @param createdAt
     * @return Builder
     */

    public ParcelChangeValueBuilder createdAt(final String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public ParcelChangeValue build() {
        Objects.requireNonNull(id, ParcelChangeValue.class + ": id is missing");
        Objects.requireNonNull(createdAt, ParcelChangeValue.class + ": createdAt is missing");
        return new ParcelChangeValueImpl(id, createdAt);
    }

    /**
     * builds ParcelChangeValue without checking for non null required values
     */
    public ParcelChangeValue buildUnchecked() {
        return new ParcelChangeValueImpl(id, createdAt);
    }

    public static ParcelChangeValueBuilder of() {
        return new ParcelChangeValueBuilder();
    }

    public static ParcelChangeValueBuilder of(final ParcelChangeValue template) {
        ParcelChangeValueBuilder builder = new ParcelChangeValueBuilder();
        builder.id = template.getId();
        builder.createdAt = template.getCreatedAt();
        return builder;
    }

}
