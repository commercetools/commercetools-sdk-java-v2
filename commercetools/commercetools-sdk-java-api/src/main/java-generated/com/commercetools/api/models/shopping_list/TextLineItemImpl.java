
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
public final class TextLineItemImpl implements TextLineItem {

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.common.LocalizedString description;

    private String id;

    private com.commercetools.api.models.common.LocalizedString name;

    private Integer quantity;

    @JsonCreator
    TextLineItemImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("id") final String id,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("quantity") final Integer quantity) {
        this.addedAt = addedAt;
        this.custom = custom;
        this.description = description;
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public TextLineItemImpl() {
    }

    /**
    *  <p>When the text line item was added to the shopping list.</p>
    */
    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
    *  <p>The unique ID of this TextLineItem.</p>
    */
    public String getId() {
        return this.id;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setAddedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TextLineItemImpl that = (TextLineItemImpl) o;

        return new EqualsBuilder().append(addedAt, that.addedAt).append(custom, that.custom).append(description,
            that.description).append(id, that.id).append(name, that.name).append(quantity, that.quantity).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(addedAt).append(custom).append(description).append(id).append(
            name).append(quantity).toHashCode();
    }

}
