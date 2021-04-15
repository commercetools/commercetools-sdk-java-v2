
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListSetSlugActionImpl implements ShoppingListSetSlugAction {

    private String action;

    private com.commercetools.api.models.common.LocalizedString slug;

    @JsonCreator
    ShoppingListSetSlugActionImpl(
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        this.action = SET_SLUG;
    }

    public ShoppingListSetSlugActionImpl() {
        this.action = SET_SLUG;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListSetSlugActionImpl that = (ShoppingListSetSlugActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(slug, that.slug).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(slug).toHashCode();
    }

}
