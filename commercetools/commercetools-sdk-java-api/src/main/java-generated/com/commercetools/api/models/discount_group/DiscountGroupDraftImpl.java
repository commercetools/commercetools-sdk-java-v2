
package com.commercetools.api.models.discount_group;

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
 * DiscountGroupDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupDraftImpl implements DiscountGroupDraft, ModelBase {

    private com.commercetools.api.models.common.LocalizedString name;

    private String key;

    private com.commercetools.api.models.common.LocalizedString description;

    private String sortOrder;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountGroupDraftImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("key") final String key,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("sortOrder") final String sortOrder) {
        this.name = name;
        this.key = key;
        this.description = description;
        this.sortOrder = sortOrder;
    }

    /**
     * create empty instance
     */
    public DiscountGroupDraftImpl() {
    }

    /**
     *  <p>Name of the DiscountGroup.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined unique identifier for the DiscountGroup.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Description for the DiscountGroup.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscount from the DiscountGroup will be applied; a CartDiscount with a higher value will be prioritized.</p>
     *  <p>The sort order must be unique among all DiscountGroups and CartDiscounts.</p>
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setSortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountGroupDraftImpl that = (DiscountGroupDraftImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(key, that.key)
                .append(description, that.description)
                .append(sortOrder, that.sortOrder)
                .append(name, that.name)
                .append(key, that.key)
                .append(description, that.description)
                .append(sortOrder, that.sortOrder)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(key).append(description).append(sortOrder).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("key", key)
                .append("description", description)
                .append("sortOrder", sortOrder)
                .build();
    }

    @Override
    public DiscountGroupDraft copyDeep() {
        return DiscountGroupDraft.deepCopy(this);
    }
}
