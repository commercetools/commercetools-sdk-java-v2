
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceReference standalonePriceReference = StandalonePriceReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceReferenceBuilder implements Builder<StandalonePriceReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.standalone_price.StandalonePrice obj;

    /**
     *  <p>Unique ID of the referenced resource.</p>
     * @param id value to be set
     * @return Builder
     */

    public StandalonePriceReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded StandalonePrice. Only present in responses to requests with Reference Expansion for StandalonePrice.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public StandalonePriceReferenceBuilder obj(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded StandalonePrice. Only present in responses to requests with Reference Expansion for StandalonePrice.</p>
     * @param obj value to be set
     * @return Builder
     */

    public StandalonePriceReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.standalone_price.StandalonePrice obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.standalone_price.StandalonePrice getObj() {
        return this.obj;
    }

    /**
     * builds StandalonePriceReference with checking for non-null required values
     * @return StandalonePriceReference
     */
    public StandalonePriceReference build() {
        Objects.requireNonNull(id, StandalonePriceReference.class + ": id is missing");
        return new StandalonePriceReferenceImpl(id, obj);
    }

    /**
     * builds StandalonePriceReference without checking for non-null required values
     * @return StandalonePriceReference
     */
    public StandalonePriceReference buildUnchecked() {
        return new StandalonePriceReferenceImpl(id, obj);
    }

    public static StandalonePriceReferenceBuilder of() {
        return new StandalonePriceReferenceBuilder();
    }

    public static StandalonePriceReferenceBuilder of(final StandalonePriceReference template) {
        StandalonePriceReferenceBuilder builder = new StandalonePriceReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
