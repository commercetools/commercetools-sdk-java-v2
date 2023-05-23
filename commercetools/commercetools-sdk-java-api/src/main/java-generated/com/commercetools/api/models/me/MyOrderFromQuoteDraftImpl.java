
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
 *  <p>When creating B2B Orders, the Customer must have the <code>MyOrderFromQuoteDraft</code> Permission.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyOrderFromQuoteDraftImpl implements MyOrderFromQuoteDraft, ModelBase {

    private String id;

    private Long version;

    private Boolean quoteStateToAccepted;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyOrderFromQuoteDraftImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("quoteStateToAccepted") final Boolean quoteStateToAccepted) {
        this.id = id;
        this.version = version;
        this.quoteStateToAccepted = quoteStateToAccepted;
    }

    /**
     * create empty instance
     */
    public MyOrderFromQuoteDraftImpl() {
    }

    /**
     *  <p>Unique identifier of the Quote from which the Order is created.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p><code>version</code> of the Quote from which the Order is created.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Set to <code>true</code>, if the <code>quoteState</code> of the referenced Quote should be set to <code>Accepted</code>.</p>
     */

    public Boolean getQuoteStateToAccepted() {
        return this.quoteStateToAccepted;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setQuoteStateToAccepted(final Boolean quoteStateToAccepted) {
        this.quoteStateToAccepted = quoteStateToAccepted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyOrderFromQuoteDraftImpl that = (MyOrderFromQuoteDraftImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(quoteStateToAccepted, that.quoteStateToAccepted)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(version).append(quoteStateToAccepted).toHashCode();
    }

}
