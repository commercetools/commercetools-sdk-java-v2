
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * HitBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Hit hit = Hit.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class HitBuilder implements Builder<Hit> {

    private String id;

    private Long version;

    @Nullable
    private Double relevance;

    /**
     *  <p>Unique identifier of the Order.</p>
     * @param id value to be set
     * @return Builder
     */

    public HitBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Order.</p>
     * @param version value to be set
     * @return Builder
     */

    public HitBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>The higher the value is, the more relevant the hit is for the search request.</p>
     * @param relevance value to be set
     * @return Builder
     */

    public HitBuilder relevance(@Nullable final Double relevance) {
        this.relevance = relevance;
        return this;
    }

    /**
     *  <p>Unique identifier of the Order.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Order.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>The higher the value is, the more relevant the hit is for the search request.</p>
     * @return relevance
     */

    @Nullable
    public Double getRelevance() {
        return this.relevance;
    }

    /**
     * builds Hit with checking for non-null required values
     * @return Hit
     */
    public Hit build() {
        Objects.requireNonNull(id, Hit.class + ": id is missing");
        Objects.requireNonNull(version, Hit.class + ": version is missing");
        return new HitImpl(id, version, relevance);
    }

    /**
     * builds Hit without checking for non-null required values
     * @return Hit
     */
    public Hit buildUnchecked() {
        return new HitImpl(id, version, relevance);
    }

    /**
     * factory method for an instance of HitBuilder
     * @return builder
     */
    public static HitBuilder of() {
        return new HitBuilder();
    }

    /**
     * create builder for Hit instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static HitBuilder of(final Hit template) {
        HitBuilder builder = new HitBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.relevance = template.getRelevance();
        return builder;
    }

}
