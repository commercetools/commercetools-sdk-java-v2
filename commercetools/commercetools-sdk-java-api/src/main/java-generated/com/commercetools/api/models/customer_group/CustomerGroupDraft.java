package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.type.CustomFields;
import com.commercetools.api.models.customer_group.CustomerGroupDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerGroupDraftImpl.class)
public interface CustomerGroupDraft  {

    /**
    *  <p>User-specific unique identifier for the customer group.</p>
    */
    
    @JsonProperty("key")
    public String getKey();
    
    @NotNull
    @JsonProperty("groupName")
    public String getGroupName();
    
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setKey(final String key);
    
    public void setGroupName(final String groupName);
    
    public void setCustom(final CustomFields custom);

    public static CustomerGroupDraftImpl of(){
        return new CustomerGroupDraftImpl();
    }
    

    public static CustomerGroupDraftImpl of(final CustomerGroupDraft template) {
        CustomerGroupDraftImpl instance = new CustomerGroupDraftImpl();
        instance.setKey(template.getKey());
        instance.setGroupName(template.getGroupName());
        instance.setCustom(template.getCustom());
        return instance;
    }

    default <T extends Accessor<CustomerGroupDraft>> T withCustomerGroupDraft(Function<CustomerGroupDraft, T> helper) {
        return helper.apply(this);
    }
}
