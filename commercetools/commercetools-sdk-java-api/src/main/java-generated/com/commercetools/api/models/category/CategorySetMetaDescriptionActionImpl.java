
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
public class CategorySetMetaDescriptionActionImpl implements CategorySetMetaDescriptionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString metaDescription;

    @JsonCreator
    CategorySetMetaDescriptionActionImpl(
            @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
        this.action = SET_META_DESCRIPTION;
    }

    public CategorySetMetaDescriptionActionImpl() {
        this.action = SET_META_DESCRIPTION;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    public void setMetaDescription(final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySetMetaDescriptionActionImpl that = (CategorySetMetaDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(metaDescription, that.metaDescription).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(metaDescription).toHashCode();
    }

}
