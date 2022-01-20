
package com.commercetools.api.models.subscription;

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
public class ChangeSubscriptionImpl implements ChangeSubscription, ModelBase {

    private String resourceTypeId;

    @JsonCreator
    ChangeSubscriptionImpl(@JsonProperty("resourceTypeId") final String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    public ChangeSubscriptionImpl() {
    }

    public String getResourceTypeId() {
        return this.resourceTypeId;
    }

    public void setResourceTypeId(final String resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeSubscriptionImpl that = (ChangeSubscriptionImpl) o;

        return new EqualsBuilder().append(resourceTypeId, that.resourceTypeId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(resourceTypeId).toHashCode();
    }

}
