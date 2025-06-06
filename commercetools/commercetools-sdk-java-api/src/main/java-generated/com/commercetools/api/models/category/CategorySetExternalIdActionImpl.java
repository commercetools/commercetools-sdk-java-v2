
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>This update action sets a new ID that can be used as an additional identifier for external systems like customer relationship management (CRM) or enterprise resource planning (ERP).</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetExternalIdActionImpl implements CategorySetExternalIdAction, ModelBase {

    private String action;

    private String externalId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategorySetExternalIdActionImpl(@JsonProperty("externalId") final String externalId) {
        this.externalId = externalId;
        this.action = SET_EXTERNAL_ID;
    }

    /**
     * create empty instance
     */
    public CategorySetExternalIdActionImpl() {
        this.action = SET_EXTERNAL_ID;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
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

        return new EqualsBuilder().append(action, that.action)
                .append(externalId, that.externalId)
                .append(action, that.action)
                .append(externalId, that.externalId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(externalId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("externalId", externalId)
                .build();
    }

    @Override
    public CategorySetExternalIdAction copyDeep() {
        return CategorySetExternalIdAction.deepCopy(this);
    }
}
