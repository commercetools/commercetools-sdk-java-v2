
package com.commercetools.api.models.shopping_list;

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
public class ShoppingListSetAnonymousIdActionImpl implements ShoppingListSetAnonymousIdAction, ModelBase {

    private String action;

    private String anonymousId;

    @JsonCreator
    ShoppingListSetAnonymousIdActionImpl(@JsonProperty("anonymousId") final String anonymousId) {
        this.anonymousId = anonymousId;
        this.action = SET_ANONYMOUS_ID;
    }

    public ShoppingListSetAnonymousIdActionImpl() {
        this.action = SET_ANONYMOUS_ID;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Anonymous ID of the anonymous customer that this shopping list belongs to.
    *  If this field is not set any existing <code>anonymousId</code> is removed.</p>
    */
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListSetAnonymousIdActionImpl that = (ShoppingListSetAnonymousIdActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(anonymousId, that.anonymousId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(anonymousId).toHashCode();
    }

}
