
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerGroupDraftImpl.class)
public interface CustomerGroupDraft extends com.commercetools.api.models.CustomizableDraft<CustomerGroupDraft> {

    /**
    *  <p>User-defined unique identifier for the Customer Group.</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Unique value which must be different from any value used for <code>name</code> in <a href="ctp:api:type:CustomerGroup">CustomerGroup</a> in the Project.
    *  If not, a <code>DuplicateField</code> <a href="/../api/errors#400-bad-request-1">error</a> is thrown.</p>
    */
    @NotNull
    @JsonProperty("groupName")
    public String getGroupName();

    /**
    *  <p>Custom Fields for the Customer Group.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setKey(final String key);

    public void setGroupName(final String groupName);

    public void setCustom(final CustomFieldsDraft custom);

    public static CustomerGroupDraft of() {
        return new CustomerGroupDraftImpl();
    }

    public static CustomerGroupDraft of(final CustomerGroupDraft template) {
        CustomerGroupDraftImpl instance = new CustomerGroupDraftImpl();
        instance.setKey(template.getKey());
        instance.setGroupName(template.getGroupName());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static CustomerGroupDraftBuilder builder() {
        return CustomerGroupDraftBuilder.of();
    }

    public static CustomerGroupDraftBuilder builder(final CustomerGroupDraft template) {
        return CustomerGroupDraftBuilder.of(template);
    }

    default <T> T withCustomerGroupDraft(Function<CustomerGroupDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupDraft>";
            }
        };
    }
}
