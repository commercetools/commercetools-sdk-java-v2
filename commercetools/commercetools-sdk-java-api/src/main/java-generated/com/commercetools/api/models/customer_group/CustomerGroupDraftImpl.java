
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerGroupDraftImpl implements CustomerGroupDraft, ModelBase {

    private String key;

    private String groupName;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @JsonCreator
    CustomerGroupDraftImpl(@JsonProperty("key") final String key, @JsonProperty("groupName") final String groupName,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.groupName = groupName;
        this.custom = custom;
    }

    public CustomerGroupDraftImpl() {
    }

    /**
    *  <p>User-defined unique identifier for the Customer Group.
    *  Keys can only contain alphanumeric characters, underscores, and hyphens.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Unique value which must be different from any value used for <code>name</code> in <a href="ctp:api:type:CustomerGroup">CustomerGroup</a> in the Project.
    *  If not, a <code>DuplicateField</code> <a href="/../api/errors#400-bad-request-1">error</a> is thrown.</p>
    */
    public String getGroupName() {
        return this.groupName;
    }

    /**
    *  <p>Custom Fields for the Customer Group.</p>
    */
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setGroupName(final String groupName) {
        this.groupName = groupName;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerGroupDraftImpl that = (CustomerGroupDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(groupName, that.groupName)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(groupName).append(custom).toHashCode();
    }

}
