
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * MyQuoteRequestDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyQuoteRequestDraftImpl implements MyQuoteRequestDraft, ModelBase {

    private String cartId;

    private Long cartVersion;

    private String comment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyQuoteRequestDraftImpl(@JsonProperty("cartId") final String cartId,
            @JsonProperty("cartVersion") final Long cartVersion, @JsonProperty("comment") final String comment) {
        this.cartId = cartId;
        this.cartVersion = cartVersion;
        this.comment = comment;
    }

    /**
     * create empty instance
     */
    public MyQuoteRequestDraftImpl() {
    }

    /**
     *  <p><code>id</code> of the Cart from which the Quote Request is created. Carts with Discount Codes and Carts with <code>Multiple</code> ShippingMode are not supported. The Cart must have a <code>shippingAddress</code> defined, otherwise an InvalidOperation error is returned when creating a Quote Request.</p>
     */

    public String getCartId() {
        return this.cartId;
    }

    /**
     *  <p>Current version of the Cart.</p>
     */

    public Long getCartVersion() {
        return this.cartVersion;
    }

    /**
     *  <p>Message from the Buyer included in the Quote Request.</p>
     */

    public String getComment() {
        return this.comment;
    }

    public void setCartId(final String cartId) {
        this.cartId = cartId;
    }

    public void setCartVersion(final Long cartVersion) {
        this.cartVersion = cartVersion;
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

        return new EqualsBuilder().append(cartId, that.cartId)
                .append(cartVersion, that.cartVersion)
                .append(comment, that.comment)
                .append(cartId, that.cartId)
                .append(cartVersion, that.cartVersion)
                .append(comment, that.comment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(cartId).append(cartVersion).append(comment).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("cartId", cartId)
                .append("cartVersion", cartVersion)
                .append("comment", comment)
                .build();
    }

    @Override
    public MyQuoteRequestDraft copyDeep() {
        return MyQuoteRequestDraft.deepCopy(this);
    }
}
