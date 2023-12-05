
package com.commercetools.api.models.staged_quote;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.common.ReferenceTypeId;
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
 *  <p>ResourceIdentifier to a StagedQuote.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteResourceIdentifierImpl implements StagedQuoteResourceIdentifier, ModelBase {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String id;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedQuoteResourceIdentifierImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.id = id;
        this.key = key;
        this.typeId = ReferenceTypeId.findEnum("staged-quote");
    }

    /**
     * create empty instance
     */
    public StagedQuoteResourceIdentifierImpl() {
        this.typeId = ReferenceTypeId.findEnum("staged-quote");
    }

    /**
     *  <p>Type of referenced resource. If given, it must match the expected ReferenceTypeId of the referenced resource.</p>
     */

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>Unique identifier of the referenced resource. Required if <code>key</code> is absent.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource. Required if <code>id</code> is absent.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedQuoteResourceIdentifierImpl that = (StagedQuoteResourceIdentifierImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId)
                .append(id, that.id)
                .append(key, that.key)
                .append(typeId, that.typeId)
                .append(id, that.id)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).append(key).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("typeId", typeId)
                .append("id", id)
                .append("key", key)
                .build();
    }

}
