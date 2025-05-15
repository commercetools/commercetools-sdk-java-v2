
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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
@io.vrap.rmf.base.client.utils.json.SubType("setContactEmail")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetContactEmailActionImpl.class)
public interface BusinessUnitSetContactEmailAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitSetContactEmailAction
     */
    String SET_CONTACT_EMAIL = "setContactEmail";

    /**
     *  <p>Email to set. If <code>contactEmail</code> is absent or <code>null</code>, the existing contact email, if any, will be removed.</p>
     * @return contactEmail
     */

    @JsonProperty("contactEmail")
    public String getContactEmail();

    /**
     *  <p>Email to set. If <code>contactEmail</code> is absent or <code>null</code>, the existing contact email, if any, will be removed.</p>
     * @param contactEmail value to be set
     */

    public void setContactEmail(final String contactEmail);

    /**
     * factory method
     * @return instance of BusinessUnitSetContactEmailAction
     */
    public static BusinessUnitSetContactEmailAction of() {
        return new BusinessUnitSetContactEmailActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitSetContactEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSetContactEmailAction of(final BusinessUnitSetContactEmailAction template) {
        BusinessUnitSetContactEmailActionImpl instance = new BusinessUnitSetContactEmailActionImpl();
        instance.setContactEmail(template.getContactEmail());
        return instance;
    }

    public BusinessUnitSetContactEmailAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitSetContactEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitSetContactEmailAction deepCopy(
            @Nullable final BusinessUnitSetContactEmailAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitSetContactEmailActionImpl instance = new BusinessUnitSetContactEmailActionImpl();
        instance.setContactEmail(template.getContactEmail());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSetContactEmailAction
     * @return builder
     */
    public static BusinessUnitSetContactEmailActionBuilder builder() {
        return BusinessUnitSetContactEmailActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitSetContactEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetContactEmailActionBuilder builder(final BusinessUnitSetContactEmailAction template) {
        return BusinessUnitSetContactEmailActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSetContactEmailAction(Function<BusinessUnitSetContactEmailAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetContactEmailAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetContactEmailAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetContactEmailAction>";
            }
        };
    }
}
