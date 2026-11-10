
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
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public ParcelChangeValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Parcel was created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ParcelChangeValueBuilder createdAt(final String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Date and time (UTC) the Parcel was created.</p>
     * @return createdAt
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * builds ParcelChangeValue with checking for non-null required values
     * @return ParcelChangeValue
     */
    public ParcelChangeValue build() {
        Objects.requireNonNull(id, ParcelChangeValue.class + ": id is missing");
        Objects.requireNonNull(createdAt, ParcelChangeValue.class + ": createdAt is missing");
        return new ParcelChangeValueImpl(id, createdAt);
    }

    /**
     * builds ParcelChangeValue without checking for non-null required values
     * @return ParcelChangeValue
     */
    public ParcelChangeValue buildUnchecked() {
        return new ParcelChangeValueImpl(id, createdAt);
    }

    /**
     * factory method for an instance of ParcelChangeValueBuilder
     * @return builder
     */
    public static ParcelChangeValueBuilder of() {
        return new ParcelChangeValueBuilder();
    }

    /**
     * create builder for ParcelChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelChangeValueBuilder of(final ParcelChangeValue template) {
        ParcelChangeValueBuilder builder = new ParcelChangeValueBuilder();
        builder.id = template.getId();
        builder.createdAt = template.getCreatedAt();
        return builder;
    }

}
