
package com.commercetools.api.models.business_unit;

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
 *     BusinessUnitSetContactEmailAction businessUnitSetContactEmailAction = BusinessUnitSetContactEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetContactEmailActionImpl.class)
public interface BusinessUnitSetContactEmailAction extends BusinessUnitUpdateAction {

    String SET_CONTACT_EMAIL = "setContactEmail";

    /**
     *  <p>Email to set. If <code>contactEmail</code> is absent or <code>null</code>, the existing contact email, if any, will be removed.</p>
     * @return contactEmail
     */

    @JsonProperty("contactEmail")
    public String getContactEmail();

    public void setContactEmail(final String contactEmail);

    public static BusinessUnitSetContactEmailAction of() {
        return new BusinessUnitSetContactEmailActionImpl();
    }

    public static BusinessUnitSetContactEmailAction of(final BusinessUnitSetContactEmailAction template) {
        BusinessUnitSetContactEmailActionImpl instance = new BusinessUnitSetContactEmailActionImpl();
        instance.setContactEmail(template.getContactEmail());
        return instance;
    }

    public static BusinessUnitSetContactEmailActionBuilder builder() {
        return BusinessUnitSetContactEmailActionBuilder.of();
    }

    public static BusinessUnitSetContactEmailActionBuilder builder(final BusinessUnitSetContactEmailAction template) {
        return BusinessUnitSetContactEmailActionBuilder.of(template);
    }

    default <T> T withBusinessUnitSetContactEmailAction(Function<BusinessUnitSetContactEmailAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetContactEmailAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetContactEmailAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetContactEmailAction>";
            }
        };
    }
}
