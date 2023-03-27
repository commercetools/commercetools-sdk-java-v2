
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitContactEmailSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitContactEmailSetMessagePayload businessUnitContactEmailSetMessagePayload = BusinessUnitContactEmailSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitContactEmailSetMessagePayloadBuilder
        implements Builder<BusinessUnitContactEmailSetMessagePayload> {

    @Nullable
    private String contactEmail;

    /**
     *  <p>The contact email that was updated on the Business Unit.</p>
     * @param contactEmail value to be set
     * @return Builder
     */

    public BusinessUnitContactEmailSetMessagePayloadBuilder contactEmail(@Nullable final String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     *  <p>The contact email that was updated on the Business Unit.</p>
     * @return contactEmail
     */

    @Nullable
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     * builds BusinessUnitContactEmailSetMessagePayload with checking for non-null required values
     * @return BusinessUnitContactEmailSetMessagePayload
     */
    public BusinessUnitContactEmailSetMessagePayload build() {
        return new BusinessUnitContactEmailSetMessagePayloadImpl(contactEmail);
    }

    /**
     * builds BusinessUnitContactEmailSetMessagePayload without checking for non-null required values
     * @return BusinessUnitContactEmailSetMessagePayload
     */
    public BusinessUnitContactEmailSetMessagePayload buildUnchecked() {
        return new BusinessUnitContactEmailSetMessagePayloadImpl(contactEmail);
    }

    /**
     * factory method for an instance of BusinessUnitContactEmailSetMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitContactEmailSetMessagePayloadBuilder of() {
        return new BusinessUnitContactEmailSetMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitContactEmailSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitContactEmailSetMessagePayloadBuilder of(
            final BusinessUnitContactEmailSetMessagePayload template) {
        BusinessUnitContactEmailSetMessagePayloadBuilder builder = new BusinessUnitContactEmailSetMessagePayloadBuilder();
        builder.contactEmail = template.getContactEmail();
        return builder;
    }

}
