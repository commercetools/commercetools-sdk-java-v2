
package com.commercetools.api.models.subscription;

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
 *  <p>All payloads for the <a href="https://docs.commercetools.com/apis/ctp:api:type:PlatformFormat" rel="nofollow">PlatformFormat</a> share these common fields.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionNotificationImpl implements SubscriptionNotification, ModelBase {

    private String notificationType;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SubscriptionNotificationImpl(@JsonProperty("notificationType") final String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * create empty instance
     */
    public SubscriptionNotificationImpl() {
    }

    /**
     *  <p>Identifies the payload.</p>
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SubscriptionNotificationImpl that = (SubscriptionNotificationImpl) o;

        return new EqualsBuilder().append(notificationType, that.notificationType)
                .append(notificationType, that.notificationType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(notificationType).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("notificationType", notificationType)
                .build();
    }

    @Override
    public SubscriptionNotification copyDeep() {
        return SubscriptionNotification.deepCopy(this);
    }
}
