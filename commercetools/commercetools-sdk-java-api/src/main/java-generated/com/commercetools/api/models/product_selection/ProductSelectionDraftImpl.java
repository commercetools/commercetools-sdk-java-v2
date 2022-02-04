
package com.commercetools.api.models.product_selection;

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
public class ProductSelectionDraftImpl implements ProductSelectionDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    @JsonCreator
    ProductSelectionDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name) {
        this.key = key;
        this.name = name;
    }

    public ProductSelectionDraftImpl() {
    }

    /**
    *  <p>User-defined unique identifier for the Product Selection. You can use <code>key</code> besides <code>ID</code> to reference the Product Selection.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Name of the Product Selection. Not checked for uniqueness, but distinct names are recommended.</p>
    */
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSelectionDraftImpl that = (ProductSelectionDraftImpl) o;

        return new EqualsBuilder().append(key, that.key).append(name, that.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(name).toHashCode();
    }

}
