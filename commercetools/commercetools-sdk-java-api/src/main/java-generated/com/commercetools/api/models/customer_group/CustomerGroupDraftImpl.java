
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * CustomerGroupDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupDraftImpl implements CustomerGroupDraft, ModelBase {

    private String key;

    private String groupName;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerGroupDraftImpl(@JsonProperty("key") final String key, @JsonProperty("groupName") final String groupName,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.groupName = groupName;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public CustomerGroupDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the CustomerGroup.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Unique value which must be different from any value used for <code>name</code> in <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> in the Project. If not, a <a href="https://docs.commercetools.com/apis/ctp:api:type:DuplicateFieldError" rel="nofollow">DuplicateField</a> error is returned.</p>
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     *  <p>Custom Fields for the CustomerGroup.</p>
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
                .append(key, that.key)
                .append(groupName, that.groupName)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(groupName).append(custom).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("groupName", groupName)
                .append("custom", custom)
                .build();
    }

    @Override
    public CustomerGroupDraft copyDeep() {
        return CustomerGroupDraft.deepCopy(this);
    }
}
