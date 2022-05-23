
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   Hit hit = Hit.builder()
           .id("{id}")
           .version(0.3)
           .relevance(0.3)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class HitBuilder implements Builder<Hit> {

    private String id;

    private Long version;

    private Double relevance;

    /**
     *  <p>Platform-generated unique identifier of the Order.</p>
     */

    public HitBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Order.</p>
     */

    public HitBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>The higher the value is, the more relevant the hit is for the search request.</p>
     */

    public HitBuilder relevance(final Double relevance) {
        this.relevance = relevance;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public Double getRelevance() {
        return this.relevance;
    }

    public Hit build() {
        Objects.requireNonNull(id, Hit.class + ": id is missing");
        Objects.requireNonNull(version, Hit.class + ": version is missing");
        Objects.requireNonNull(relevance, Hit.class + ": relevance is missing");
        return new HitImpl(id, version, relevance);
    }

    /**
     * builds Hit without checking for non null required values
     */
    public Hit buildUnchecked() {
        return new HitImpl(id, version, relevance);
    }

    public static HitBuilder of() {
        return new HitBuilder();
    }

    public static HitBuilder of(final Hit template) {
        HitBuilder builder = new HitBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.relevance = template.getRelevance();
        return builder;
    }

}
