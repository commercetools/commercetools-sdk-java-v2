
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupDraft customerGroupDraft = CustomerGroupDraft.builder()
 *             .groupName("{groupName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupDraftImpl.class)
public interface CustomerGroupDraft extends com.commercetools.api.models.CustomizableDraft<CustomerGroupDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<CustomerGroupDraft> {

    /**
     *  <p>User-defined unique identifier for the CustomerGroup.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique value which must be different from any value used for <code>name</code> in CustomerGroup in the Project. If not, a DuplicateField error is returned.</p>
     * @return groupName
     */
    @NotNull
    @JsonProperty("groupName")
    public String getGroupName();

    /**
     *  <p>Custom Fields for the CustomerGroup.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined unique identifier for the CustomerGroup.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Unique value which must be different from any value used for <code>name</code> in CustomerGroup in the Project. If not, a DuplicateField error is returned.</p>
     * @param groupName value to be set
     */

    public void setGroupName(final String groupName);

    /**
     *  <p>Custom Fields for the CustomerGroup.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of CustomerGroupDraft
     */
    public static CustomerGroupDraft of() {
        return new CustomerGroupDraftImpl();
    }

    /**
     * factory method to copy an instance of CustomerGroupDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupDraft of(final CustomerGroupDraft template) {
        CustomerGroupDraftImpl instance = new CustomerGroupDraftImpl();
        instance.setKey(template.getKey());
        instance.setGroupName(template.getGroupName());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupDraft
     * @return builder
     */
    public static CustomerGroupDraftBuilder builder() {
        return CustomerGroupDraftBuilder.of();
    }

    /**
     * create builder for CustomerGroupDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupDraftBuilder builder(final CustomerGroupDraft template) {
        return CustomerGroupDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupDraft(Function<CustomerGroupDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupDraft>";
            }
        };
    }
}
