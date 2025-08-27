
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupIsActiveSetMessagePayloadImpl implements DiscountGroupIsActiveSetMessagePayload, ModelBase {

    private String type;

    private Boolean isActive;

    private Boolean oldIsActive;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountGroupIsActiveSetMessagePayloadImpl(@JsonProperty("isActive") final Boolean isActive,
            @JsonProperty("oldIsActive") final Boolean oldIsActive) {
        this.isActive = isActive;
        this.oldIsActive = oldIsActive;
        this.type = DISCOUNT_GROUP_IS_ACTIVE_SET;
    }

    /**
     * create empty instance
     */
    public DiscountGroupIsActiveSetMessagePayloadImpl() {
        this.type = DISCOUNT_GROUP_IS_ACTIVE_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     *  <p><code>isActive</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroup" rel="nofollow">DiscountGroup</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action.</p>
     */

    public Boolean getOldIsActive() {
        return this.oldIsActive;
    }

    public void setIsActive(final Boolean isActive) {
        this.isActive = isActive;
    }

    public void setOldIsActive(final Boolean oldIsActive) {
        this.oldIsActive = oldIsActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountGroupIsActiveSetMessagePayloadImpl that = (DiscountGroupIsActiveSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(isActive, that.isActive)
                .append(oldIsActive, that.oldIsActive)
                .append(type, that.type)
                .append(isActive, that.isActive)
                .append(oldIsActive, that.oldIsActive)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(isActive).append(oldIsActive).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("isActive", isActive)
                .append("oldIsActive", oldIsActive)
                .build();
    }

    @Override
    public DiscountGroupIsActiveSetMessagePayload copyDeep() {
        return DiscountGroupIsActiveSetMessagePayload.deepCopy(this);
    }
}
