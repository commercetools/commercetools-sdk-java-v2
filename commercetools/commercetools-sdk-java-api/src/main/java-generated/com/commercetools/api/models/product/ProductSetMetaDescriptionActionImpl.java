
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetMetaDescriptionActionImpl implements ProductSetMetaDescriptionAction {

    private String action;

    private com.commercetools.api.models.common.LocalizedString metaDescription;

    private Boolean staged;

    @JsonCreator
    ProductSetMetaDescriptionActionImpl(
            @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription,
            @JsonProperty("staged") final Boolean staged) {
        this.metaDescription = metaDescription;
        this.staged = staged;
        this.action = ProductSetMetaDescriptionAction.SET_META_DESCRIPTION;
    }

    public ProductSetMetaDescriptionActionImpl() {
        this.action = ProductSetMetaDescriptionAction.SET_META_DESCRIPTION;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

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

        return new EqualsBuilder().append(action, that.action).append(metaDescription, that.metaDescription).append(
            staged, that.staged).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(metaDescription).append(staged).toHashCode();
    }

}
