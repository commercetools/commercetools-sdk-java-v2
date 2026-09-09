
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned by a <span>/responses</span> request when the underlying <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> was created but the <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a> could not be created from it, for example because the Cart has no verified Customer.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentQuoteRequestCreationFailedErrorImpl implements AgentQuoteRequestCreationFailedError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private String cartId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AgentQuoteRequestCreationFailedErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("cartId") final String cartId) {
        this.message = message;
        this.values = values;
        this.cartId = cartId;
        this.code = QUOTE_REQUEST_CREATION_FAILED;
    }

    /**
     * create empty instance
     */
    public AgentQuoteRequestCreationFailedErrorImpl() {
        this.code = QUOTE_REQUEST_CREATION_FAILED;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Plain text description of the error.</p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p><code>id</code> of the orphaned Cart, for retry or cleanup.</p>
     */

    public String getCartId() {
        return this.cartId;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setCartId(final String cartId) {
        this.cartId = cartId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AgentQuoteRequestCreationFailedErrorImpl that = (AgentQuoteRequestCreationFailedErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(cartId, that.cartId)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(cartId, that.cartId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(values).append(cartId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("cartId", cartId)
                .build();
    }

    @Override
    public AgentQuoteRequestCreationFailedError copyDeep() {
        return AgentQuoteRequestCreationFailedError.deepCopy(this);
    }
}
