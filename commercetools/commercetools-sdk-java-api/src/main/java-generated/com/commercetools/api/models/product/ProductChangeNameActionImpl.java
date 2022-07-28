
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ProductChangeNameAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductChangeNameActionImpl implements ProductChangeNameAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString name;

    private Boolean staged;

    @JsonCreator
    ProductChangeNameActionImpl(@JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("staged") final Boolean staged) {
        this.name = name;
        this.staged = staged;
        this.action = CHANGE_NAME;
    }

    public ProductChangeNameActionImpl() {
        this.action = CHANGE_NAME;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Must not be empty.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>name</code> is updated. If <code>false</code>, both the current and staged <code>name</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductChangeNameActionImpl that = (ProductChangeNameActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(name, that.name)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).append(staged).toHashCode();
    }

}
