
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationReference applicationReference = ApplicationReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicationReferenceBuilder implements Builder<ApplicationReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced Application.</p>
     * @param id value to be set
     * @return Builder
     */

    public ApplicationReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced Application.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds ApplicationReference with checking for non-null required values
     * @return ApplicationReference
     */
    public ApplicationReference build() {
        Objects.requireNonNull(id, ApplicationReference.class + ": id is missing");
        return new ApplicationReferenceImpl(id);
    }

    /**
     * builds ApplicationReference without checking for non-null required values
     * @return ApplicationReference
     */
    public ApplicationReference buildUnchecked() {
        return new ApplicationReferenceImpl(id);
    }

    /**
     * factory method for an instance of ApplicationReferenceBuilder
     * @return builder
     */
    public static ApplicationReferenceBuilder of() {
        return new ApplicationReferenceBuilder();
    }

    /**
     * create builder for ApplicationReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationReferenceBuilder of(final ApplicationReference template) {
        ApplicationReferenceBuilder builder = new ApplicationReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
