
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer.CustomerReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Present on resources modified after 1 February 2019 except for events not tracked.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LastModifiedBy lastModifiedBy = LastModifiedBy.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LastModifiedByImpl.class)
public interface LastModifiedBy extends ClientLogging {

    /**
     <*  <p><code>id</code> of the APIClient which modified the resource.</p>>
     */

    @JsonProperty("clientId")
    public String getClientId();

    /**
     <*  <p>External user ID provided by <code>X-External-User-ID</code> HTTP Header.</p>>
     */

    @JsonProperty("externalUserId")
    public String getExternalUserId();

    /**
     <*  <p>Indicates the Customer who modified the resource using a token from the password flow.</p>>
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     <*  <p>Indicates the anonymous session during which the resource was modified.</p>>
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    public void setClientId(final String clientId);

    public void setExternalUserId(final String externalUserId);

    public void setCustomer(final CustomerReference customer);

    public void setAnonymousId(final String anonymousId);

    public static LastModifiedBy of() {
        return new LastModifiedByImpl();
    }

    public static LastModifiedBy of(final LastModifiedBy template) {
        LastModifiedByImpl instance = new LastModifiedByImpl();
        instance.setClientId(template.getClientId());
        instance.setExternalUserId(template.getExternalUserId());
        instance.setCustomer(template.getCustomer());
        instance.setAnonymousId(template.getAnonymousId());
        return instance;
    }

    public static LastModifiedByBuilder builder() {
        return LastModifiedByBuilder.of();
    }

    public static LastModifiedByBuilder builder(final LastModifiedBy template) {
        return LastModifiedByBuilder.of(template);
    }

    default <T> T withLastModifiedBy(Function<LastModifiedBy, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LastModifiedBy> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LastModifiedBy>() {
            @Override
            public String toString() {
                return "TypeReference<LastModifiedBy>";
            }
        };
    }
}
