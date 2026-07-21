
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
 *  <p>Returned when one of the following conditions occurs:</p>
 *  <ul>
 *   <li>A Customer reference (for example, <code>associates[*].customer</code> or <code>inheritedAssociates[*].customer</code>) is expanded on the <span>My Business Unit</span> endpoint.</li>
 *   <li>A <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a> cannot be modified due to missing permissions for its assigned <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a>.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UnauthorizedErrorImpl implements UnauthorizedError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private java.util.List<String> storesWithoutPermission;

    /**
     * create instance with all properties
     */
    @JsonCreator
    UnauthorizedErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("storesWithoutPermission") final java.util.List<String> storesWithoutPermission) {
        this.message = message;
        this.values = values;
        this.storesWithoutPermission = storesWithoutPermission;
        this.code = UNAUTHORIZED;
    }

    /**
     * create empty instance
     */
    public UnauthorizedErrorImpl() {
        this.code = UNAUTHORIZED;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"Customer reference expansion not permitted on my business unit"</code> or <code>"Not allowed to edit this CartDiscount."</code></p>
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
     *  <p>Keys of <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for which the required permission to modify is missing.</p>
     *  <p>This field is returned only for <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a>.</p>
     */

    public java.util.List<String> getStoresWithoutPermission() {
        return this.storesWithoutPermission;
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

    public void setStoresWithoutPermission(final String... storesWithoutPermission) {
        this.storesWithoutPermission = new ArrayList<>(Arrays.asList(storesWithoutPermission));
    }

    public void setStoresWithoutPermission(final java.util.List<String> storesWithoutPermission) {
        this.storesWithoutPermission = storesWithoutPermission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        UnauthorizedErrorImpl that = (UnauthorizedErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(storesWithoutPermission, that.storesWithoutPermission)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(storesWithoutPermission, that.storesWithoutPermission)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(storesWithoutPermission)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("storesWithoutPermission", storesWithoutPermission)
                .build();
    }

    @Override
    public UnauthorizedError copyDeep() {
        return UnauthorizedError.deepCopy(this);
    }
}
