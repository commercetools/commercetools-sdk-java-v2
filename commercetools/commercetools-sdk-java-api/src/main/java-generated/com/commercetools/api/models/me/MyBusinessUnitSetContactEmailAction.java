
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the contact email on a Business Unit generates a BusinessUnitContactEmailSet Message.</p>
 *
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
@JsonDeserialize(as = MyBusinessUnitSetContactEmailActionImpl.class)
public interface MyBusinessUnitSetContactEmailAction extends MyBusinessUnitUpdateAction {

    String SET_CONTACT_EMAIL = "setContactEmail";

    /**
     *  <p>Email to set. If <code>contactEmail</code> is absent or <code>null</code>, the existing contact email, if any, will be removed.</p>
     * @return contactEmail
     */

    @JsonProperty("contactEmail")
    public String getContactEmail();

    public void setContactEmail(final String contactEmail);

    public static MyBusinessUnitSetContactEmailAction of() {
        return new MyBusinessUnitSetContactEmailActionImpl();
    }

    public static MyBusinessUnitSetContactEmailAction of(final MyBusinessUnitSetContactEmailAction template) {
        MyBusinessUnitSetContactEmailActionImpl instance = new MyBusinessUnitSetContactEmailActionImpl();
        instance.setContactEmail(template.getContactEmail());
        return instance;
    }

    public static MyBusinessUnitSetContactEmailActionBuilder builder() {
        return MyBusinessUnitSetContactEmailActionBuilder.of();
    }

    public static MyBusinessUnitSetContactEmailActionBuilder builder(
            final MyBusinessUnitSetContactEmailAction template) {
        return MyBusinessUnitSetContactEmailActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitSetContactEmailAction(Function<MyBusinessUnitSetContactEmailAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetContactEmailAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetContactEmailAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitSetContactEmailAction>";
            }
        };
    }
}
