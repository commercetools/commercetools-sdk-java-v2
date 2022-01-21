
package com.commercetools.api.models.category;

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
public class CategorySetExternalIdActionImpl implements CategorySetExternalIdAction, ModelBase {

    private String action;

    private String externalId;

    @JsonCreator
    CategorySetExternalIdActionImpl(@JsonProperty("externalId") final String externalId) {
        this.externalId = externalId;
        this.action = SET_EXTERNAL_ID;
    }

    public CategorySetExternalIdActionImpl() {
        this.action = SET_EXTERNAL_ID;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>If not defined, the external ID is unset.</p>
    */
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySetExternalIdActionImpl that = (CategorySetExternalIdActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(externalId, that.externalId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(externalId).toHashCode();
    }

}
