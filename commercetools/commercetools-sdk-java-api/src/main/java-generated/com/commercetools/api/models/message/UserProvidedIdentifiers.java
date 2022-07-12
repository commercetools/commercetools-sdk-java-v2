
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * UserProvidedIdentifiers
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UserProvidedIdentifiers userProvidedIdentifiers = UserProvidedIdentifiers.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UserProvidedIdentifiersImpl.class)
public interface UserProvidedIdentifiers {

    /**
     *  <p>User-provided unique identifier of the resource.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *
     */

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     *
     */

    @JsonProperty("customerNumber")
    public String getCustomerNumber();

    /**
     *
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>Custom Objects are grouped into containers, which can be used like namespaces. Within a given container, a user-defined key can be used to uniquely identify resources.</p>
     */
    @Valid
    @JsonProperty("containerAndKey")
    public ContainerAndKey getContainerAndKey();

    public void setKey(final String key);

    public void setExternalId(final String externalId);

    public void setOrderNumber(final String orderNumber);

    public void setCustomerNumber(final String customerNumber);

    public void setSku(final String sku);

    public void setSlug(final LocalizedString slug);

    public void setContainerAndKey(final ContainerAndKey containerAndKey);

    public static UserProvidedIdentifiers of() {
        return new UserProvidedIdentifiersImpl();
    }

    public static UserProvidedIdentifiers of(final UserProvidedIdentifiers template) {
        UserProvidedIdentifiersImpl instance = new UserProvidedIdentifiersImpl();
        instance.setKey(template.getKey());
        instance.setExternalId(template.getExternalId());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setCustomerNumber(template.getCustomerNumber());
        instance.setSku(template.getSku());
        instance.setSlug(template.getSlug());
        instance.setContainerAndKey(template.getContainerAndKey());
        return instance;
    }

    public static UserProvidedIdentifiersBuilder builder() {
        return UserProvidedIdentifiersBuilder.of();
    }

    public static UserProvidedIdentifiersBuilder builder(final UserProvidedIdentifiers template) {
        return UserProvidedIdentifiersBuilder.of(template);
    }

    default <T> T withUserProvidedIdentifiers(Function<UserProvidedIdentifiers, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<UserProvidedIdentifiers> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UserProvidedIdentifiers>() {
            @Override
            public String toString() {
                return "TypeReference<UserProvidedIdentifiers>";
            }
        };
    }
}
