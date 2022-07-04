
package com.commercetools.api.models.me;

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
 * MyQuoteRequestDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyQuoteRequestDraftImpl implements MyQuoteRequestDraft, ModelBase {

    private com.commercetools.api.models.cart.CartResourceIdentifier cart;

    private Long version;

    private String comment;

    @JsonCreator
    MyQuoteRequestDraftImpl(@JsonProperty("cart") final com.commercetools.api.models.cart.CartResourceIdentifier cart,
            @JsonProperty("version") final Long version, @JsonProperty("comment") final String comment) {
        this.cart = cart;
        this.version = version;
        this.comment = comment;
    }

    public MyQuoteRequestDraftImpl() {
    }

    /**
     *  <p>ResourceIdentifier to the Cart from which this quote request is created.</p>
     */

    public com.commercetools.api.models.cart.CartResourceIdentifier getCart() {
        return this.cart;
    }

    /**
     *  <p>Current version of the Cart.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Text message included in the request.</p>
     */

    public String getComment() {
        return this.comment;
    }

    public void setCart(final com.commercetools.api.models.cart.CartResourceIdentifier cart) {
        this.cart = cart;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyQuoteRequestDraftImpl that = (MyQuoteRequestDraftImpl) o;

        return new EqualsBuilder().append(cart, that.cart)
                .append(version, that.version)
                .append(comment, that.comment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(cart).append(version).append(comment).toHashCode();
    }

}
