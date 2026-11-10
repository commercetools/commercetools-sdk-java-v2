
package com.commercetools.api.models.error;

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
 *  <p>Returned when attempting to create or update a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> with a Line Item whose quantity exceeds the <code>maxCartQuantity</code> limit defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> for that Line Item's SKU.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemQuantityAboveLimitErrorImpl implements LineItemQuantityAboveLimitError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private Integer quantity;

    private Integer maxCartQuantity;

    private String lineItem;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LineItemQuantityAboveLimitErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("quantity") final Integer quantity,
            @JsonProperty("maxCartQuantity") final Integer maxCartQuantity,
            @JsonProperty("lineItem") final String lineItem) {
        this.message = message;
        this.values = values;
        this.quantity = quantity;
        this.maxCartQuantity = maxCartQuantity;
        this.lineItem = lineItem;
        this.code = LINE_ITEM_QUANTITY_ABOVE_LIMIT;
    }

    /**
     * create empty instance
     */
    public LineItemQuantityAboveLimitErrorImpl() {
        this.code = LINE_ITEM_QUANTITY_ABOVE_LIMIT;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Quantity '$quantity' greater than maximum '$maxCartQuantity'."</code></p>
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
     *  <p>The quantity that was requested.</p>
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>The maximum quantity allowed for this Line Item.</p>
     */

    public Integer getMaxCartQuantity() {
        return this.maxCartQuantity;
    }

    /**
     *  <p>Reference to the Line Item that caused the error.</p>
     */

    public String getLineItem() {
        return this.lineItem;
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

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public void setMaxCartQuantity(final Integer maxCartQuantity) {
        this.maxCartQuantity = maxCartQuantity;
    }

    public void setLineItem(final String lineItem) {
        this.lineItem = lineItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LineItemQuantityAboveLimitErrorImpl that = (LineItemQuantityAboveLimitErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(quantity, that.quantity)
                .append(maxCartQuantity, that.maxCartQuantity)
                .append(lineItem, that.lineItem)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(quantity, that.quantity)
                .append(maxCartQuantity, that.maxCartQuantity)
                .append(lineItem, that.lineItem)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(quantity)
                .append(maxCartQuantity)
                .append(lineItem)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("quantity", quantity)
                .append("maxCartQuantity", maxCartQuantity)
                .append("lineItem", lineItem)
                .build();
    }

    @Override
    public LineItemQuantityAboveLimitError copyDeep() {
        return LineItemQuantityAboveLimitError.deepCopy(this);
    }
}
