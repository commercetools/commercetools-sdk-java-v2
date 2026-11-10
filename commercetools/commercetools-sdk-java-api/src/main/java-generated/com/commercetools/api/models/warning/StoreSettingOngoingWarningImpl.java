
package com.commercetools.api.models.warning;

import java.time.*;
import java.util.*;

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
 *  <p>Contained in responses to an <span>Update Category</span> request with response status code <code>202 Accepted</code>. This is the case if the request contains a <a href="https://docs.commercetools.com/apis/ctp:api:type:CategorySetStoresWithDescendantsAction" rel="nofollow">Set Stores with Descendants</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryAddStoreWithDescendantsAction" rel="nofollow">Add Store with Descendants</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryRemoveStoreWithDescendantsAction" rel="nofollow">Remove Store with Descendants</a> update action. Indicates that the API is still applying the Store change to the Category and its descendant Categories.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSettingOngoingWarningImpl implements StoreSettingOngoingWarning, ModelBase {

    private String code;

    private String message;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StoreSettingOngoingWarningImpl(@JsonProperty("message") final String message) {
        this.message = message;
        this.code = STORE_SETTING_ONGOING;
    }

    /**
     * create empty instance
     */
    public StoreSettingOngoingWarningImpl() {
        this.code = STORE_SETTING_ONGOING;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"The store setting is still ongoing."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StoreSettingOngoingWarningImpl that = (StoreSettingOngoingWarningImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(code, that.code)
                .append(message, that.message)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .build();
    }

    @Override
    public StoreSettingOngoingWarning copyDeep() {
        return StoreSettingOngoingWarning.deepCopy(this);
    }
}
