
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/discount-groups:POST" rel="nofollow">Create DiscountGroup</a> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupCreatedMessagePayloadImpl implements DiscountGroupCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.discount_group.DiscountGroup discountGroup;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountGroupCreatedMessagePayloadImpl(
            @JsonProperty("discountGroup") final com.commercetools.api.models.discount_group.DiscountGroup discountGroup) {
        this.discountGroup = discountGroup;
        this.type = DISCOUNT_GROUP_CREATED;
    }

    /**
     * create empty instance
     */
    public DiscountGroupCreatedMessagePayloadImpl() {
        this.type = DISCOUNT_GROUP_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The DiscountGroup that was created.</p>
     */

    public com.commercetools.api.models.discount_group.DiscountGroup getDiscountGroup() {
        return this.discountGroup;
    }

    public void setDiscountGroup(final com.commercetools.api.models.discount_group.DiscountGroup discountGroup) {
        this.discountGroup = discountGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountGroupCreatedMessagePayloadImpl that = (DiscountGroupCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(discountGroup, that.discountGroup)
                .append(type, that.type)
                .append(discountGroup, that.discountGroup)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(discountGroup).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("discountGroup", discountGroup)
                .build();
    }

    @Override
    public DiscountGroupCreatedMessagePayload copyDeep() {
        return DiscountGroupCreatedMessagePayload.deepCopy(this);
    }
}
