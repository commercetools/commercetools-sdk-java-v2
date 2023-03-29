
package com.commercetools.api.models.me;

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
 *     MyBusinessUnitSetContactEmailAction myBusinessUnitSetContactEmailAction = MyBusinessUnitSetContactEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitSetContactEmailActionImpl.class)
public interface MyBusinessUnitSetContactEmailAction extends MyBusinessUnitUpdateAction {

    /**
     * discriminator value for MyBusinessUnitSetContactEmailAction
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
     * @return instance of MyBusinessUnitSetContactEmailAction
     */
    public static MyBusinessUnitSetContactEmailAction of() {
        return new MyBusinessUnitSetContactEmailActionImpl();
    }

    /**
     * factory method to create a shallow copy MyBusinessUnitSetContactEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyBusinessUnitSetContactEmailAction of(final MyBusinessUnitSetContactEmailAction template) {
        MyBusinessUnitSetContactEmailActionImpl instance = new MyBusinessUnitSetContactEmailActionImpl();
        instance.setContactEmail(template.getContactEmail());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyBusinessUnitSetContactEmailAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitSetContactEmailAction deepCopy(
            @Nullable final MyBusinessUnitSetContactEmailAction template) {
        if (template == null) {
            return null;
        }
        MyBusinessUnitSetContactEmailActionImpl instance = new MyBusinessUnitSetContactEmailActionImpl();
        instance.setContactEmail(template.getContactEmail());
        return instance;
    }

    /**
     * builder factory method for MyBusinessUnitSetContactEmailAction
     * @return builder
     */
    public static MyBusinessUnitSetContactEmailActionBuilder builder() {
        return MyBusinessUnitSetContactEmailActionBuilder.of();
    }

    /**
     * create builder for MyBusinessUnitSetContactEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyBusinessUnitSetContactEmailActionBuilder builder(
            final MyBusinessUnitSetContactEmailAction template) {
        return MyBusinessUnitSetContactEmailActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitSetContactEmailAction(Function<MyBusinessUnitSetContactEmailAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetContactEmailAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitSetContactEmailAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitSetContactEmailAction>";
            }
        };
    }
}
