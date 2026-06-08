
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>TextLineItems are Line Items that use text values instead of references to Products.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TextLineItemImpl implements TextLineItem, ModelBase {

    private java.time.ZonedDateTime addedAt;

    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.common.LocalizedString description;

    private String id;

    private String key;

    private com.commercetools.api.models.common.LocalizedString name;

    private Long quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TextLineItemImpl(@JsonProperty("addedAt") final java.time.ZonedDateTime addedAt,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description,
            @JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name,
            @JsonProperty("quantity") final Long quantity) {
        this.addedAt = addedAt;
        this.custom = custom;
        this.description = description;
        this.id = id;
        this.key = key;
        this.name = name;
        this.quantity = quantity;
    }

    /**
     * create empty instance
     */
    public TextLineItemImpl() {
    }

    /**
     *  <p>Date and time (UTC) the TextLineItem was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     */

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    /**
     *  <p>Custom Fields of the TextLineItem.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Description of the TextLineItem.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Unique identifier of the TextLineItem.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined identifier of the TextLineItem. It is unique per <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the TextLineItem.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Number of entries in the TextLineItem.</p>
     */

    public Long getQuantity() {
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

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TextLineItemImpl that = (TextLineItemImpl) o;

        return new EqualsBuilder().append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .append(description, that.description)
                .append(id, that.id)
                .append(key, that.key)
                .append(name, that.name)
                .append(quantity, that.quantity)
                .append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .append(description, that.description)
                .append(id, that.id)
                .append(key, that.key)
                .append(name, that.name)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(addedAt)
                .append(custom)
                .append(description)
                .append(id)
                .append(key)
                .append(name)
                .append(quantity)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("addedAt", addedAt)
                .append("custom", custom)
                .append("description", description)
                .append("id", id)
                .append("key", key)
                .append("name", name)
                .append("quantity", quantity)
                .build();
    }

    @Override
    public TextLineItem copyDeep() {
        return TextLineItem.deepCopy(this);
    }
}
