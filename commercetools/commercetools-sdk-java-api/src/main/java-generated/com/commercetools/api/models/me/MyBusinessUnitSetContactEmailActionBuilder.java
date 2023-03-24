
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitSetContactEmailActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitSetContactEmailAction myBusinessUnitSetContactEmailAction = MyBusinessUnitSetContactEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitSetContactEmailActionBuilder implements Builder<MyBusinessUnitSetContactEmailAction> {

    @Nullable
    private String contactEmail;

    /**
     *  <p>Email to set. If <code>contactEmail</code> is absent or <code>null</code>, the existing contact email, if any, will be removed.</p>
     * @param contactEmail value to be set
     * @return Builder
     */

    public MyBusinessUnitSetContactEmailActionBuilder contactEmail(@Nullable final String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    @Nullable
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     * builds MyBusinessUnitSetContactEmailAction with checking for non-null required values
     * @return MyBusinessUnitSetContactEmailAction
     */
    public MyBusinessUnitSetContactEmailAction build() {
        return new MyBusinessUnitSetContactEmailActionImpl(contactEmail);
    }

    /**
     * builds MyBusinessUnitSetContactEmailAction without checking for non-null required values
     * @return MyBusinessUnitSetContactEmailAction
     */
    public MyBusinessUnitSetContactEmailAction buildUnchecked() {
        return new MyBusinessUnitSetContactEmailActionImpl(contactEmail);
    }

    public static MyBusinessUnitSetContactEmailActionBuilder of() {
        return new MyBusinessUnitSetContactEmailActionBuilder();
    }

    public static MyBusinessUnitSetContactEmailActionBuilder of(final MyBusinessUnitSetContactEmailAction template) {
        MyBusinessUnitSetContactEmailActionBuilder builder = new MyBusinessUnitSetContactEmailActionBuilder();
        builder.contactEmail = template.getContactEmail();
        return builder;
    }

}
