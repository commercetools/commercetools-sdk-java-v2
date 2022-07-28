
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
 * ProductSetMetaDescriptionAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetMetaDescriptionActionImpl implements ProductSetMetaDescriptionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString metaDescription;

    private Boolean staged;

    @JsonCreator
    ProductSetMetaDescriptionActionImpl(
            @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription,
            @JsonProperty("staged") final Boolean staged) {
        this.metaDescription = metaDescription;
        this.staged = staged;
        this.action = SET_META_DESCRIPTION;
    }

    public ProductSetMetaDescriptionActionImpl() {
        this.action = SET_META_DESCRIPTION;
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

    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>metaDescription</code> is updated. If <code>false</code>, both the current and staged <code>metaDescription</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setMetaDescription(final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
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

        ProductSetMetaDescriptionActionImpl that = (ProductSetMetaDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(metaDescription, that.metaDescription)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(metaDescription).append(staged).toHashCode();
    }

}
