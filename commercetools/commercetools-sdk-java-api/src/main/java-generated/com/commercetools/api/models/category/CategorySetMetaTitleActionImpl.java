
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetMetaTitleActionImpl implements CategorySetMetaTitleAction {

    private String action;

    private com.commercetools.api.models.common.LocalizedString metaTitle;

    @JsonCreator
    CategorySetMetaTitleActionImpl(
            @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        this.action = SET_META_TITLE;
    }

    public CategorySetMetaTitleActionImpl() {
        this.action = SET_META_TITLE;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    public void setMetaTitle(final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySetMetaTitleActionImpl that = (CategorySetMetaTitleActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(metaTitle, that.metaTitle).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(metaTitle).toHashCode();
    }

}
