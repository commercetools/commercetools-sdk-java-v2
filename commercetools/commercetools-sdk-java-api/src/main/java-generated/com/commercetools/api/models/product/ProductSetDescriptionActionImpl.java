
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetDescriptionActionImpl implements ProductSetDescriptionAction {

    private String action;

    private com.commercetools.api.models.common.LocalizedString description;

    private Boolean staged;

    @JsonCreator
    ProductSetDescriptionActionImpl(
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("staged") final Boolean staged) {
        this.description = description;
        this.staged = staged;
        this.action = SET_DESCRIPTION;
    }

    public ProductSetDescriptionActionImpl() {
        this.action = SET_DESCRIPTION;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
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

        ProductSetDescriptionActionImpl that = (ProductSetDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(description, that.description).append(staged,
            that.staged).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(description).append(staged).toHashCode();
    }

}
